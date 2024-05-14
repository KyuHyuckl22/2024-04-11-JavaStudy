package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControllerPanel extends JPanel{
	public CardLayout card=new CardLayout(); //CardLayout 은 패널들을 다 묶어서 갖고있다가
    // 요청이 들어왔을때 그거에 맞는 패널들을 보여주는것
	public HomePanel hp=new HomePanel();
	public FindPanel fp=new FindPanel();
	public ControllerPanel() {
		setLayout(card);
		add("FIND",fp);
		add("HOME",hp);
	}

	public static void main(String[] args) {
		
	}
}
