package com.sist.user;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class BoardList extends JPanel {
	JButton inBtn, prevBtn, nextBtn;
	JLabel pageLa, titleLa;
	JTable table;
	DefaultTableModel model;
	TableColumn column;

	public BoardList() {
		inBtn = new JButton("새글"); // <input type=button value ="새글">
		prevBtn = new JButton("이전");
		nextBtn = new JButton("다음");
		pageLa = new JLabel("0 page / 0pages"); // <label>0page / 0 pages</label>
		titleLa = new JLabel("게시판", JLabel.CENTER);// <table>
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 30)); // <h3></h3>

		String[] col = { "번호", "제목", "이름", "작성일", "조회수" };// <tr><th></th> ....</tr>
		String[][] row = new String[0][5]; // 한 줄에 5개 데이터를 첨부
		model = new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {

				return false;
				// 익명의 클래스 => 포함 클래스 => 상속 없이 오버라이딩 할때 사용
//			 										클릭하면 편집기로 바뀌기 때문에 편집 방지 프로그램을 만들어 줘야 함.
//			
			}
		};
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		for (int i = 0; i < col.length; i++) {
			column = table.getColumnModel().getColumn(i);
			if (i == 0) {
				column.setPreferredWidth(50);
			} else if (i == 1) {
				column.setPreferredWidth(350);
			} else if (i == 2) {
				column.setPreferredWidth(100);
			} else if (i == 3) {
				column.setPreferredWidth(150);
			} else if (i == 4) {
				column.setPreferredWidth(50);
			}
		}
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(30);
		table.getTableHeader().setBackground(Color.pink);

//		배치
		setLayout(null);
		titleLa.setBounds(10, 15, 620, 50);
		add(titleLa);
		inBtn.setBounds(10, 70, 100, 30);
		add(inBtn);
		js.setBounds(10, 110, 600, 330);
		add(js);

		JPanel p = new JPanel();
		p.add(prevBtn);
		p.add(pageLa);
		p.add(nextBtn);

		p.setBounds(10, 450, 600, 35);
		add(p);
	}

}
