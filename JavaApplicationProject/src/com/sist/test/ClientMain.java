package com.sist.test;
import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import com.sist.dao.*;
import com.sist.commons.*;

import java.awt.*;
import java.awt.event.*;
public class ClientMain extends JFrame implements ActionListener,Runnable,MouseListener{
	CardLayout card = new CardLayout();
	Login login = new Login();
	WaitRoom wr = new WaitRoom();
	MemberDAO dao;
	
//	네트워크 관련 
	Socket s; // 통신 기기 
//	서버로 전송하는 클래스
	OutputStream out; // 이벤트 발생시 => 버튼 , 마우스클릭 ... 등
//	서버에서 값을 읽어오는 클래스
	BufferedReader in; //자동화 처리 => Thread 
	
	String myId;
	int selRow = -1;
	public ClientMain() {
//		여기있는 순서대로 뜨는거임
		dao = MemberDAO.newInstance();
		setLayout(card);
		add("LOGIN",login);
		add("WR",wr);
		setSize(800,600);
		setVisible(true);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		wr.tf.addActionListener(this); //enter키 처리
		wr.b6.addActionListener(this); // 나가기
		
		wr.table2.addMouseListener(this);
		wr.b4.addActionListener(this);// 정보 보기 버튼
	}
	public static void main(String[] args) {
		new ClientMain();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login.b2) {
			dispose();
			System.exit(0);
		}
		else if (e.getSource() == login.b1) {
			
			String id = login.tf.getText(); // 적은거 읽어오기
			if(id.length()<1) {
				login.tf.requestFocus();
				return;
			}
			String pwd
			
			= String.valueOf(login.pf.getPassword());
			
			if(pwd.length() <1) {
				login.tf.requestFocus();
				return;
			}
			String result = dao.memberLogin(id, pwd);
			if(result.equals("NO ID")) {
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
				
			}
			else if (result.equals("NOPWD")) {
				JOptionPane.showMessageDialog(this, "비밀번호 오류");
				login.pf.setText("");
				login.pf.requestFocus();
				
			}
		else {	
				// 서버와 연결
				try {
					s = new Socket("192.168.0.102",11010);
					in = new BufferedReader(new InputStreamReader(s.getInputStream()));
					out = s.getOutputStream();
//					서버와 연결 완료
//					서버로 로그인 요청
					out.write((Function.LOGIN+"|"+id+"\n").getBytes());
				} catch(Exception ex) {}
				
				new Thread(this).start();
			}
			
					
		}
		else if(e.getSource() == wr.tf) { // 대기실 채팅
			//1. 입력값 가지고 오기
			String msg=wr.tf.getText();
			if(msg.length()<1)
				return;
			
			//2. 서버로 입력값 전송하기
			try {
				out.write((Function.CHAT + "|" + msg + "\n").getBytes()); // out 서버와 연결된 상태
			}catch(Exception ex) {}
			wr.tf.setText(""); //채팅창을 비워주는 상태
			wr.tf.requestFocus();
		}
		else if (e.getSource() == wr.b6) {
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		else if (e.getSource() == wr.b4) {
			if(selRow == -1) {
				JOptionPane.showMessageDialog(this, "정보를 볼 대상을 선택하세요");
				return;
			}
			String yid = wr.model2.getValueAt(selRow, 0).toString();
			try {
				out.write((Function.INFO+"|"+yid+"\n").getBytes());
			}catch(Exception ex ) {}
			selRow = -1;
		}
			
	}
	// client(요청) => server(응답) => client(응답 출력)
	// 요청시 이벤트 발생  
	// 클릭, 엔터 . . . 
	// 서버의 응답값을 처리
	@Override
	public void run() {
		while(true) {
			try {
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol) {
				case Function.LOGIN:{
					String[] data = {
						st.nextToken(),	
						st.nextToken(),
						st.nextToken(),	
						st.nextToken(),	
						st.nextToken()	
					};
					wr.model2.addRow(data);
				}break;
				case Function.MYLOG:{
					myId = st.nextToken();
					String name = st.nextToken();
					setTitle(name+"님의 채팅창");
					card.show(getContentPane(), "WR"); //대기실 창 이동
				}break;
				case Function.CHAT:{
					wr.ta.append(st.nextToken()+"\n");
					wr.bar.setValue(wr.bar.getMaximum());
				}
				case Function.EXIT : {
		               String mid = st.nextToken();
		               for (int i = 0; i < wr.model2.getRowCount(); i++) {
		                  String ids = wr.model2.getValueAt(i, 0).toString();
		                  if (mid.equals(ids)) {
		                     wr.model2.removeRow(i);
		                     
		                  }
		                  
		               }
		            
				}break;
				case Function.MYEXIT : {
					dispose();
					System.exit(0);
				} break;
				case Function.INFO: {
					String info = "이름 :"+st.nextToken()+"\n"
								+"성별 : "+st.nextToken()+"\n"
								+"주소 : "+st.nextToken()+"\n"
								+"이메일 : "+st.nextToken()+"\n"
								+"전화 : "+st.nextToken()+"\n"
								+"소개 : "+st.nextToken();
					JOptionPane.showMessageDialog(this, info);
								
				}
				}
			}catch(Exception ex) {}
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == wr.table2) {
			if(e.getClickCount() == 2) {
				int row = wr.table2.getSelectedRow();
				selRow = row;
				
				String id = wr.model2.getValueAt(row, 0).toString();
				if(id.equals(myId)) {
					wr.b3.setEnabled(false);
					wr.b4.setEnabled(false);
					wr.b5.setEnabled(false);
				}
				else {
					wr.b3.setEnabled(true);
					wr.b4.setEnabled(true);
					wr.b5.setEnabled(true);
				}
				
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}
