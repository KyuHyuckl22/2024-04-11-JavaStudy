package com.sist.commons;
import java.util.*;
import java.awt.*;
import java.net.*;
import javax.swing.*;
//  https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87864/87864_320.jpg
public class MainClass extends JFrame{
	JLabel la;
	public MainClass() {
		setLayout(null);
		la = new JLabel();
		la.setBounds(30, 50, 300, 250);
		add(la);
		try {
			URL url = new URL("https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87864/87864_320.jpg");
			Image img = ImageChange.getImage(new ImageIcon(), 300, 450); // 이미지를 이 크기에 맞추기 
			la.setIcon(new ImageIcon(img));
		}catch(Exception ex) {}
		setSize(370,350);
		setVisible(true);
				
	
	}

	public static void main(String[] args) {
		new MainClass();
	}

}
