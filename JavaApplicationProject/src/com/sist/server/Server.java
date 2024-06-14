package com.sist.server;
import java.util.*;
import java.io.*;
import java.net.*;
import com.sist.dao.*;
/*
 *   server
 *   	1. 접속을 받는 클래스 => 접속을 받아서 클라이언트 정보 저장
 *   								 ------------  IP , PORT (연결)
 *   								IP 는 전화번호 , PORT 는 전화선
 *   								--------------------------- 이 두가지를 갖고있는게 전화기
 *   									IP 와 PORT 를 갖고있는건 소켓 이라고 한다     
 *      2. 접속된 클라이언트 마다 통신담당 클래스
 *         ------------ 따로 제작 => 한번에 제작해서 여러개가 동시에 수행하게 만듦 ==> 쓰레드
 *      
 *     	=> 자바 : 두개 쓰레드     => 시분할 
 *    			main / gc   
 *     
 */
public class Server implements Runnable {
	// 접속 담당 => 교환 소켓
/*	
 * 	1. ServerSokcet 을 생성
 * 	   ------------
 * 		bind ==> 연결  ==> 전화기 개통
 * 						  ------------ 전화 / 전화선 매칭
 * 				bind ( ip , port )
 * 		listen ==> 대기 상태
 * 	2. 대기중에 클라이언트 접속
 * 	   ------------------
 * 		accept() => 사용자 정보를 수집 후 메모리에 저장
 * 					-------- 사용자 정보와 Thread 매칭 후 통신을 할 수있게 만들어주는 상태
 * 	3. 종료 요청시에는 
 * 		Thread 종료
 */
/*
 *   조별 결정 사항 : 서버 컴퓨터, 연결선(숫자) => 0 ~ 65535
 *   									-------------  0~1023 사용중
 */
	private ServerSocket ss; // 접속을 받는 클래스
	private final int PORT = 11010;
	// 클라이언트의 정보 저장 => IP , PORT , id , name , set
//									  --- => Oracle 에서 정보를 가지고 온다
	private Vector<Client> waitVc = new Vector<Client>();
	public Server() { 
		try {
			ss = new ServerSocket(PORT); // 개통
			System.out.println("Server Start. . .");
			// 클라이언트 접속을 대기
			// default 는 50명 
			// TomCat 이 서버 => Web Server (50명)
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	// 접속시에 클라이언트 정보 확인 => 정보 저장 
	// Thread 가 동작하는 메소드 
	public void run() {
		try {
			while(true) {
//				접속이 된 경우
				Socket s = ss.accept(); //접속자의 IP 를 받아서 저장
//				Socket -> 클라이언트의 정보가 들어가 있다 ( ip, port )
/*
 *   서버 : ServerSocket => port : 고정
 *   클라이언트 : Socket => port 자동 설정
 */
/*				System.out.println("접속 IP : "+s.getInetAddress().getHostAddress());
				System.out.println("포트 번호 : "+s.getPort()); 
				OutputStream out = s.getOutputStream();
//				s 가 클라이언트                     byte 로 전송해줘야 하기때문에 getBytes 를 이용해서 보내줌
				out.write("서버에 접속되었습니다! \n".getBytes());
*/
				Client client = new Client(s);
				waitVc.add(client); // 정보 저장
				client.start(); // 클라이언트와 통신을 시작
			}
		}catch (Exception ex) {}
	}
	public static void main(String[] args) {
		Server server = new Server();
		new Thread();
	}
/*	
    통신담당 
	프로그램 안에서 여러개의 프로그램을 동시에 수행하게 만드는것이 쓰레드
	하나의 프로그램 == 프로세스
	프로세스 안에는 여러개의 쓰레드가 동시 수행
	Server 가 가지고 있는 모든 변수 / 메소드를 사용할 수 있다
	한개의 컴퓨터에서 Server 는 1개만 동작이 가능하다
	Server 프로그램은 고정 IP를 가지고 있어야 한다
*/
	class Client extends Thread {
		String id;
		Socket s; //while 에 있는 s 와 연동이 되어야함
		OutputStream out; // 클라이언트 전송
		BufferedReader in; // 클라이언트 요청 받기
		public Client(Socket s) {
			try {
				this.s=s;
				out = s.getOutputStream();
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch (Exception ex) {}
		}
		//통신 역할
		public void run() {
			try {
				while(true) {
//					1. 클라이언트 요청을 받는다
					String msg = in.readLine();
					System.out.println("Client => "+msg);
					
//					2. 서버에서 응답을 시작한다
					for(Client client : waitVc) { // 접속한 모든 사람에게 보내라
						client.out.write((msg+"\n").getBytes());
					}
				}
			}catch(Exception ex) {}
		}
	}
}
