package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;

import javax.swing.*;

import com.sist.dao.MemberDAO;
import com.sist.temp.EmpDAO;
public class ClientMain extends JFrame implements ActionListener{
	CardLayout card = new CardLayout();
	LoginPanel lp = new LoginPanel();
	ControllPanel cp = new ControllPanel();
	MainPanel mp = new MainPanel();
	
	public ClientMain() {
		setLayout(card); 
		add("LOGIN",lp);
		add("MP",mp);
		
		
		setSize(960,700);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // x 버튼 막아버리고 취소버튼으로만 종료 가능하게
		
		lp.loginBtn.addActionListener(this);//로그인
		lp.joinBtn.addActionListener(this);// 회원가입
		lp.cancelBtn.addActionListener(this);// 종료
		
		
	}
	public static void main(String[] args) { 
		new ClientMain();
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			
		}catch(Exception ex) {}
		new ClientMain();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lp.cancelBtn) {
			dispose(); // window 메모리 해제
			System.exit(0); //프로그램 종료
		}
		else if(e.getSource() == lp.loginBtn) {
			// 1. 입력한 사번과 이름을 가지고 온다
			try {
				String id = lp.tf.getText();
				if (id.length()< 1) {
					JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
					lp.tf.requestFocus();
					return;
				}
				String pwd = String.valueOf(lp.pf.getPassword());
				if (pwd.length()< 1) {
					JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
					lp.pf.requestFocus();
					return;
				}
				// 오라클 연결
				MemberDAO dao = MemberDAO.newInstance();
				String result = dao.memberLogin(id, pwd); //대문자 이름이라 
//																					소문자로 입력해도 대문자로 받아오게 
//																						toUpperCase 사용
//				웹에서는 자바 스크립트로 처리한다 
				
				if(result.equals("NO ID")) {
					//사번이 없는 경우
					JOptionPane.showMessageDialog(this, "아이디 존재하지 않습니다");
					lp.tf.setText("");
					lp.pf.setText("");
					lp.tf.requestFocus();
				}
				else if (result.equals("NO PWD")) {
					//이름이 틀린경우
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
					lp.pf.setText("");
					lp.pf.requestFocus();
				}
				else {
					//로그인
					//
					System.out.println("로그인 완료!");
					card.show(getContentPane(),"MP"); // 화면 변경
				}
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "사번은 정수여야 합니다");
				return; // 메소드 종료
			}
		}
	}
}
