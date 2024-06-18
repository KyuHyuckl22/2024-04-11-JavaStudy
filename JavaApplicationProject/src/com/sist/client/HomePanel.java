package com.sist.client;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import org.w3c.dom.events.MouseEvent;

import com.sist.commons.*;
import com.sist.dao.GoodsDAO;
import com.sist.dao.GoodsVO;

import java.util.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class HomePanel extends JPanel implements ActionListener,MouseListener{
	JPanel pan = new JPanel(); // 12개 이미지 출력
	JButton b1, b2; // 이전, 다음 버튼
	JLabel la = new JLabel("0 page / 0 pages");
	JLabel[] imgs = new JLabel[12];
			
	int curpage = 1; // 현재 페이지
	int totalpage = 0; // 총 페이지
	// 데이터 베이스 연결 
	GoodsDAO dao;
	// 초기화
	ControllPanel cp;
	public HomePanel(ControllPanel cp) {
		this.cp=cp;
		dao = GoodsDAO.newInstance();
		pan.setLayout(new GridLayout(3,4,5,5));
		
		setLayout(new BorderLayout());
		add("Center",pan);
		b1 = new JButton("이전");
		b2 = new JButton("다음");
		
		JPanel p = new JPanel();
		p.add(b1); p.add(la); p.add(b2);
		add("South",p);
		print();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	private void print () {
		totalpage = dao.goodsTotalPage();
		ArrayList<GoodsVO> list = dao.goodsListData(curpage);
		for(int i=0; i<list.size(); i++){
			GoodsVO vo = list.get(i);
			try {
				URL url = new URL(vo.getGoods_poster());
				//  이미지 크기 축소
				Image img = ImageChange.getImage(new ImageIcon(url), 240,200);
				imgs[i] = new JLabel(new ImageIcon(img));
				imgs[i].setToolTipText(vo.getGoods_name()+"^"+vo.getNo());// 마우스를 가져다 대면 말풍선 도움말을 주는것
				pan.add(imgs[i]);
				imgs[i].addMouseListener(this);
			}catch(Exception ex) {}
			
			la.setText(curpage+"page / "+totalpage+" pages ");
			
		}
		
	}
	public void init() {
		for(int i=0; i<imgs.length;i++) {
			imgs[i]=new JLabel();
		}
		pan.removeAll();
		pan.validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			if(curpage>1) {
				curpage--;
				init();
				print();
			}
		}
		else if (e.getSource() == b2) {
			if(curpage<totalpage) {
				curpage++;
				init();
				print();
			}
		}
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		for(int i=0; i<imgs.length; i++){
			if(e.getSource() == imgs[i]) {
				if(e.getClickCount() == 2) { // 2번 클릭했을때
					String no = imgs[i].getToolTipText();
					no = no.substring(no.lastIndexOf("^")+1);
					cp.dp.print(Integer.parseInt(no));
					cp.card.show(cp,"DP");
					
				}
			}
		}
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) { // 가져다 댔을때
		for(int i=0; i<imgs.length; i++){
			if(e.getSource() == imgs[i]) {
				imgs[i].setBorder(new LineBorder(Color.red,3));
			}
		}
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) { // 마우스를 뗐을때
		for(int i=0; i<imgs.length; i++){
			if(e.getSource() == imgs[i]) {
				imgs[i].setBorder(null);
			}
		}
	}



}














