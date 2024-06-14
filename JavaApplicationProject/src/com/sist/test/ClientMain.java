package com.sist.test;
import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import com.sist.dao.*;
import com.sist.commons.*;

import java.awt.*;
import java.awt.event.*;
public class ClientMain extends JFrame implements ActionListener,Runnable{
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
			
/*			String id = login.tf.getText(); // 적은거 읽어오기
			if(id.length()<1) {
				login.tf.requestFocus();
				return;
			}
			String pwd = String.valueOf(login.pf.getPassword());
			
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
		else {*/	
				// 서버와 연결
				try {
					s = new Socket("192.168.0.125",11010);
					in = new BufferedReader(new InputStreamReader(s.getInputStream()));
					out = s.getOutputStream();
//					서버와 연결 완료
//					서버로 로그인 요청
					out.write((Function.LOGIN+"|도우너\n").getBytes());
				} catch(Exception ex) {}
				
				new Thread(this).start();
//			}
			
					
		}
		
			
	}
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
				case Function.MYLOGIN:{
					String id = st.nextToken();
					String name = st.nextToken();
					setTitle(name+"님의 채팅창");
					card.show(getContentPane(), "WR"); //대기실 창 이동
				}break;
				case Function.CHAT:{
					wr.ta.append(st.nextToken()+"\n");
				}
				}
			}catch(Exception ex) {}
		}
	}
}
