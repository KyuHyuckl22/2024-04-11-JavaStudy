package com.sist.client;

import java.awt.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
	JButton homeBtn, findBtn, boardBtn, chatBtn, newsBtn, myBtn, exitBtn;

	public MenuPanel() {
		setLayout(new GridLayout(7, 1, 5, 10));
		
		homeBtn = new JButton("홈"); // 1명
		findBtn = new JButton("맛집검색"); // 1명
		boardBtn = new JButton("커뮤니티"); // 1명
		chatBtn = new JButton("실시간 채팅"); // 2명
		newsBtn = new JButton("뉴스 검색"); // 1명
		myBtn = new JButton("마이 페이지");
		exitBtn = new JButton("나가기");

		add(homeBtn);
		add(findBtn);
		add(boardBtn);
		add(chatBtn);
		add(newsBtn);
		add(myBtn);
		add(exitBtn);
	}
}