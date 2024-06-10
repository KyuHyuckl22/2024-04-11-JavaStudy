package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuPanel extends JPanel{
	JButton homeBtn, findBtn, boardBtn, chatBtn, newsBtn, exitBtn;
	public MenuPanel() {
		setLayout(new GridLayout(1,6)); // 한 줄에 6개를 넣는다
		homeBtn = new JButton("홈");
		findBtn = new JButton("맛집검색");
		boardBtn = new JButton("커뮤니티");
		chatBtn = new JButton("실시간 채팅");
		newsBtn = new JButton("뉴스검색");
		exitBtn = new JButton("나가기");
		
		add(homeBtn);
		add(findBtn);
		add(boardBtn);
		add(chatBtn);
		add(newsBtn);
		add(exitBtn);
	}
}
