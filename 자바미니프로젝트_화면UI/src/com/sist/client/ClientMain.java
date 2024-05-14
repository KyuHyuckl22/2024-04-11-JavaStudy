package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
public class ClientMain extends JFrame implements ActionListener{
	public MenuPanel mp=new MenuPanel();
	public ControllerPanel cp=new ControllerPanel();
	public ClientMain() {
		setLayout(null);
		mp.setBounds(150, 15, 600, 50);  // menu 패널
		add(mp);
		cp.setBounds(45, 70, 670, 450);
		add(cp);
		
//		North , South , West , East , Center => BorderLayout (JFrame)
//		add("North",mp); // 배치 동서남북
		
//		윈도우 크기
		setSize(800,600);
		setVisible(true);
		
//		윈도우 고정
		setResizable(false);
		
//		x버틴 클릭 메모리 회수 => 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mp.b1.addActionListener(this); // b1버튼을 클릭하면 => actionPerformed 를 호출해라 라는뜻
		mp.b2.addActionListener(this); 
		mp.b6.addActionListener(this);  // 
	}
	public static void main(String[] args) {
		new ClientMain();
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		}catch(Exception ex) {}
	}
	
	@Override   
	public void actionPerformed(ActionEvent e) {
		if(mp.b1==e.getSource()) { // b1 버튼이 눌렸다면
			cp.card.show(cp, "HOME");
		}
		else if(mp.b2==e.getSource()) { // b2 버튼이 눌렸다면
			cp.card.show(cp, "FIND");
		}
		else if(mp.b6==e.getSource()) { // b6 버튼이 눌렸다면
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
			System.exit(0);
		}
	}
}
