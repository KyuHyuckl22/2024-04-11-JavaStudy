package com.sist.client;
import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel{
	Image back;
	JLabel idla,pwla;
	JTextField tf;
	JPasswordField pf;
	JButton loginBtn, joinBtn, cancelBtn;
	
	public LoginPanel() {
		back = Toolkit.getDefaultToolkit().getImage("C:\\project\\image.jpg");
		
		idla=new JLabel("아이디",JLabel.RIGHT);
		pwla=new JLabel("비밀번호",JLabel.RIGHT);
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		loginBtn = new JButton("로그인");
		joinBtn = new JButton("회원가입");
		cancelBtn = new JButton("취소");
		
		setLayout(null);
		idla.setBounds(650, 530, 80, 30);
		tf.setBounds(735, 530, 180, 30);
		add(idla); add(tf);
		
		pwla.setBounds(650, 570, 80, 30);
		pf.setBounds(735, 570, 180, 30);
		add(pwla); add(pf);
		
//		버튼들 한번에 묶어버리기
		JPanel p=new JPanel();
		p.add(loginBtn);
		p.add(joinBtn);
		p.add(cancelBtn);
		p.setOpaque(false); // 불투명 모드에 false 를 주면 투명모드가 됨
		p.setBounds(673, 615, 265, 35); 
		add(p);
		

		
		
		
	}
	
// 스킨 입힐때 사용
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0,getWidth(),getHeight(),this);

	}
	
}
