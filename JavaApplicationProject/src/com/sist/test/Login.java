package com.sist.test;
import java.awt.*; // 윈도우 툴킷 . 윈도우와 관련된 라이브러리 모음집
import javax.swing.*; 
public class Login extends JPanel{
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	public Login() {
		la1 = new JLabel("ID",JLabel.RIGHT);
		la2 = new JLabel("PassWord",JLabel.RIGHT);
		
		tf = new JTextField();
		pf = new JPasswordField();
		
		JPanel p = new JPanel();
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		p.add(b1); p.add(b2);
		
		setLayout(null);
		
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(95, 15, 150, 30);
		add(la1); add(tf);
		
		la2.setBounds(10, 50, 80, 30);
		pf.setBounds(95, 50, 150, 30);
		add(la2); add(pf);
		
		p.setBounds(10, 85, 235, 35);
		add(p);
	}
	
}
