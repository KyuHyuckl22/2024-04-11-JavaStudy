package com.sist.client;
import java.awt.GridLayout;

import javax.swing.*;
//	홈버튼  검색버튼 채팅 게시판 뉴스검색 ...
public class MenuPanel extends JPanel{
	
	public JButton b1,b2,b3,b4,b5,b6;
//	초기화한 후 배치
	public MenuPanel() {// 생성자 생성
		setLayout(new GridLayout(1,6)); //같은 크기의 버튼을 만들때 GridLayout 사용. 1줄에 6개 (1,6)
		b1=new JButton("로그인");
		b2=new JButton("홈");
		b3=new JButton("검색");
		b4=new JButton("게시판");
		b5=new JButton("채팅");		
		b6=new JButton("나가기");
//		추가
		add(b1); add(b2); add(b3); add(b4); add(b5); add(b6);  //얘는 단독으로 띄울 수 없기때문에
	}                                                         // 클라이언트 메인에 띄운다
	public static void main(String[] args) {
		
	}
}
