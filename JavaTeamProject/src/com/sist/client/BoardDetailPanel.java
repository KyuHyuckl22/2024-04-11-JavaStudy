
package com.sist.client;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import java.awt.event.*;
import com.sist.dao.*;

public class BoardDetailPanel extends JPanel implements ActionListener{
	JLabel titleLa, nameLa, noLa, subLa, dayLa, hitLa;
	JLabel name, no, sub, day, hit;
	JTextArea ta;
	JButton b1, b2, b3; // 1. 수정 2. 삭제 3. 목록
	ControllPanel cp;
	BoardDAO dao;
	public BoardDetailPanel(ControllPanel cp) {

		this.cp = cp;
		dao = BoardDAO.newInstance();
		
		titleLa = new JLabel("게시판", JLabel.CENTER);// <table>
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 30)); // <h3></h3>
		setLayout(null);
		titleLa.setBounds(120, 15, 900, 50);
		add(titleLa);
		




		nameLa = new JLabel("이름", JLabel.CENTER);
		nameLa.setOpaque(true);
		//nameLa.setBackground(Color.orange);
		//nameLa.setBorder(new LineBorder(new Color(255,135,82)));
		nameLa.setBounds(120, 110, 80, 30);
		//nameLa.setBounds(120, 110, 80, 30);
		//nameLa.setBounds(120, 110, 80, 30);
		name = new JLabel("", JLabel.CENTER);
		name.setBounds(215, 110, 120, 30);
		add(nameLa);
		add(name);

		hitLa = new JLabel("조회수", JLabel.CENTER);
		hitLa.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		hitLa.setOpaque(true);
		hitLa.setBounds(615,110,80,30);
		//hitLa.setBackground(Color.orange);
		//hitLa.setBorder(new LineBorder(new Color(255,135,82)));
		//hitLa.setBounds(330, 110, 80, 30);
		hitLa.setOpaque(true);
		
		hit = new JLabel("", JLabel.CENTER);
		hit.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		hit.setBounds(700, 110, 200, 30);
		add(hitLa);
		add(hit);

		subLa = new JLabel("제목", JLabel.CENTER);
		subLa.setBounds(120, 145, 80, 30);
		subLa.setOpaque(true);
		subLa.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		//subLa.setBackground(Color.orange);
		subLa.setBorder(new LineBorder(new Color(229,255,195),2));
		sub = new JLabel("");
		sub.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		sub.setBounds(205, 145, 400, 30);
		sub.setOpaque(true);
		sub.setBackground(new Color(229,255,195));
		sub.setBorder(new LineBorder(new Color(229,255,195)));
		add(subLa);
		add(sub);

		dayLa = new JLabel("작성일", JLabel.CENTER);
		dayLa.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		dayLa.setOpaque(true);
		//dayLa.setBackground(Color.orange);
		//dayLa.setBorder(new LineBorder(new Color(255,135,82)));
		dayLa.setBounds(615, 145, 80, 30);
		//dayLa.setBounds(330, 145, 80, 30);
		day = new JLabel("", JLabel.CENTER);
		day.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		day.setBounds(700, 145, 120, 30);
		//day.setBounds(415, 145, 200, 30);
		add(dayLa);
		add(day);
		
		noLa = new JLabel("번호", JLabel.CENTER);
		noLa.setOpaque(true);
		//noLa.setBackground(Color.orange);
		//noLa.setBorder(new LineBorder(new Color(255,135,82)));
		noLa.setBounds(855, 145,80,30);
		//noLa.setBounds(120, 75, 80, 30);
		no = new JLabel("", JLabel.CENTER);
		no.setBounds(945,145,80,30) ;
		//no.setBounds(205, 75, 120, 30);
		add(noLa); add(no);
		
		ta = new JTextArea();
		ta.setEditable(false); // 비활성화
		ta.setBounds(120, 200, 900, 415); //
		add(ta);

		JPanel p = new JPanel();
		b1 = new JButton("수정");
		b2 = new JButton("삭제");
		b3 = new JButton("목록");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		p.setBounds(120, 620, 900, 35);
		
		add(p);
		
		b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
		
	
	}
	public void print(int no) {
	      BoardVO vo = dao.boardDetailData(no);
	      this.no.setText(String.valueOf(vo.getNo()));
	      name.setText(vo.getName());
	      sub.setText(vo.getSubject());
	      hit.setText(String.valueOf(vo.getHit()));
	      day.setText(vo.getRegdate().toString());
	      ta.setText(vo.getContent());
	   }
	@Override
	   public void actionPerformed(ActionEvent e) {
	      if(e.getSource() == b3) {
	         cp.card.show(cp, "LIST");
	      } else if (e.getSource() == b2) {
	         cp.bdelp.pf.setText("");
	         cp.bdelp.no=Integer.parseInt(no.getText());
	         cp.card.show(cp, "DELETE");
	      } else if (e.getSource() == b1) {
	    	  
	    	  BoardVO vo = dao.boardUpdateData(Integer.parseInt(no.getText()));
	    	  
	    	  cp.bup.no = vo.getNo();
	    	  cp.bup.nameTf.setText(vo.getName());
	    	  cp.bup.subTf.setText(vo.getSubject());
	    	  cp.bup.ta.setText(vo.getContent());
	          cp.card.show(cp, "UPDATE");
	      }
	   }

	   
}
