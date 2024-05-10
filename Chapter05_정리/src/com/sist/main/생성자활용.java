package com.sist.main;
import javax.swing.*;
public class 생성자활용 {
//	JFrame frame=new JFrame();
//	public 생성자활용() {
//		frame.setSize(800, 600);
//		frame.setVisible(true);
//	}
	JFrame frame;
	public 생성자활용(String title) {
		frame=new JFrame(title);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// 생성자
		new 생성자활용("Music"); // 창에 뜨는 이름이 Music 으로 나옴
	}

}
