package com.sist.test;
import java.util.*;
import java.awt.DisplayMode;
import java.io.*;
import java.net.*;

import com.sist.commons.Function;
import com.sist.dao.*;

public class Server implements Runnable{
//	접속 담당자가 필요 
	private ServerSocket ss;
//	PORT => 0 ~ 66535 
	private final int PORT = 11010;
	private MemberDAO dao;
//	저장 공간 (접속자 저장공간)
	private Vector<Client> waitVc = new Vector<Client>();
	public Server() {
		// 시작과 동시에 서버 구동
		try {
			ss = new ServerSocket(PORT);
			dao = MemberDAO.newInstance(); //데이터베이스
			System.out.println("Server Start . . . ");
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start(); // run 호출
	}
//	접속시에 접속자 정보를 저장 => 접속자마다 통신이 따로 수행되게 해야함
//	                        이때 사용하는게 Thread
	@Override
	public void run() {
//		접속시에 처리
		while(true) {
			try {
				Socket s = ss.accept(); // 접속이된 경우에만 호출
//				s = 클라이언트 정보가 들어가 있음 IP,PORT =>  전화로 치면 발신자 정보가 들어온다
				Client client = new Client(s);
				// 통신을 시작
				client.start();
			}catch(Exception ex) {}
		}
	}
	
/*
 * 		클래스의 종류
 *          = 추상 클래스
 *          = 보완 => 인터페이스
 *          = 내부 클래스
 *            ---------------클래스 메모리 할당 없이 모든 변수, 메소드 에 접근이 가능
 *            1) 멤버 클래스
 *            	class A 
 *              {
 *              	데이터
 *              	class B
 *                  {
 *                  	A가 가지고 있는 모든 데이터를 공유
 *                  }
 *              }
 *            2) 익명의 클래스 : 스프링에서 주로 출몰 , 데이터 분석시 자주 사용
 *                 => 상속 없이 오버라이딩이 가능하게 만드는 프로그램 => 생성자에서 메소드 변경, 메소드 추가
 *                 
 */
//	통신
	class Client extends Thread {
		Socket s; // 클라이언트와 통신할 수 있게 만들어 주기
		OutputStream out; // 클라이언트에게 전송
		BufferedReader in; //클라이언트로 부터 요청값 받기
//		개인 정보
		String id, name, sex, pos, admin;
		
		public Client(Socket s) {
//			변수 초기화
			try {
				this.s = s;
				out = s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//				네트워크 전송 => 1 byte 로 전송
//				값을 받는 경우는 => 2 byte 로 받는다
//				1 byte 를 2byte 로 받는 클래스 : 필터스트림
//				InputStreamreader
			}catch(Exception ex) {}
			
		}
//		통신을 시작한다
		public void run() { // 클라이언트 마다 따로 동작 => 쓰레드 사용
			while(true) {
				try {
					String msg=in.readLine();
					StringTokenizer st = new StringTokenizer(msg,"|");
					// 100 id
					int protocol = Integer.parseInt(st.nextToken());
					switch(protocol){
						case  Function.LOGIN:{ // 로그인요청
							// ID 를 받는다
							id = st.nextToken();
							// 정보
							MemberVO vo = dao.memberInfo(id);
							name = vo.getName();
							sex = vo.getSex();
							pos = "대기실";
							admin = vo.getAdmin();
							
							// 이미접속된 회원에게 지금 접속한 회원의 정보를 전송
							messageAll(Function.LOGIN+"|"+id
									+"|"+name+"|"+sex+"|"+pos+"|"+admin);
							messageAll(Function.CHAT+"|[♬ 알림]"+name+"님이 입장하셨습니다");
							// 서버에 저장
							waitVc.add(this);
							
							//1. 창 갱신
							messageTo(Function.MYLOG+"|"+id+"|"+name); // login --> waitroom 으로 변경
							//2. 이미 접속된 회원의 모든정보를 받는다
							for(Client client:waitVc) {
								messageTo(Function.LOGIN + "|"
										+client.id+"|"
										+client.name+"|"
										+client.sex+"|"
										+client.pos+"|"
										+client.admin);
							}
							//3. 개설된 방정보
							
						} break;
/*
 *    로그인  을 하게되면
 *    ---- 
 *    로그인을 하는사람	=> Mylog  
 *    로그인이 되어있는 사람  => login
 *    
 *    나가기를 했을때 마찬가지로
 *    남아있는 사람  => exit
 *    실제 나가는 사람 => my exit
 *    
 *    Client / Server (웹)
 *    	 |        |
 *    Slave		Master
 *    
 *    Server => Client 에 지시를 내린다
 *    Client => Server 에서 지시를 받아서 동작
 */
						case Function.EXIT: {// 나가기요청 exit.jsp 
							messageAll(Function.EXIT+"|"+id);// 테이블에서 제거
							messageAll(Function.CHAT+"|[♬ 알림]"+name+"님이 퇴장하셨습니다");
							// 남아있는 사람 처리
							
							// 실제 나가는 사람 처리
							for(Client client : waitVc) {
								if (client.id.equals(id)) {
									messageTo(Function.MYEXIT+"|"); // 윈도우창 종료
									waitVc.remove(client);
									in.close();
									out.close();
								}
							}
						} break;
						case Function.CHAT: {// 채팅요청
							String message = st.nextToken();
							messageAll(Function.CHAT+"|["
									+name+ "]"+message);
						} break;
						/*
						 *  클라이언트 : 요청 / 응답 출력
						 *  		---- <a> , <input type=button> , <from>
						 *  		---- html / css
						 *  
						 *  서버 : 요청받기
						 *  응답하기 - HttpServletRequest
						 *  저장하기 - HttpServleresponse
						 *  ---------
						 *  수정기능	|
						 *  삭제기능	| - > JDBC (오라클 연동)
						 *  찾기기능	|
						 *  -----------------이 기능들을 다 갖고있는것 = 자바 라이브러리 
						 */
						case Function.INFO: {
							String yid = st.nextToken();
							MemberVO vo = dao.memberInfo2(yid);
							messageTo(Function.INFO+"|"
									+vo.getName()+"|"
									+vo.getSex()+"|"
									+vo.getAddr1()+"|"
									+vo.getEmail()+"|"
									+vo.getPhone()+"|"
									+vo.getContent());
							
						}
						break;
						
							
					}
					
				}catch(Exception ex) {}
			}
			
		}
//		접속자 전체로 전송
		public synchronized void messageAll(String msg) { 
//			   synchronized ==> 동기화
			
			try {
				for(Client client:waitVc) {
					client.messageTo(msg);
				}
			}catch(Exception ex) {}
		}

			

//		접속자 에게만 전송
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
//		
		
	}
}
