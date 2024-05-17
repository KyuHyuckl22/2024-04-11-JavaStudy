package com.sist.main4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class 게시판목록 extends JFrame {
    JLabel titleLa = new JLabel("게시판", JLabel.CENTER);
    JLabel pageLa = new JLabel("0 page / 0 pages");
    JButton b1, b2, b3; // 새글, 이전, 다음 버튼
    JTable table; // 테이블 모양
    DefaultTableModel model; // 데이터 관리

    // 초기화, 화면 UI => 생성자에서 처리
    public 게시판목록() {
        b1 = new JButton("새글");
        b2 = new JButton("이전");
        b3 = new JButton("다음");
        String[] col = {"번호", "제목", "이름", "작성일", "조회수"};
        String[][] row = new String[0][5];
        model = new DefaultTableModel(row, col);
        table = new JTable(model);
        JScrollPane js = new JScrollPane(table);

        // 배치
        setLayout(null); // null = 직접 배치하겠다
        titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
        titleLa.setBounds(10, 15, 500, 40);
        add(titleLa); // JFrame에 추가

        b1.setBounds(10, 60, 100, 30);
        add(b1);

        js.setBounds(10, 95, 500, 380);
        add(js);

        JPanel p = new JPanel();
        p.add(b2);
        p.add(pageLa);
        p.add(b3);

        p.setBounds(10, 480, 520, 35);
        add(p);

        setSize(550, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new 게시판목록(); // BoardListPanel 인스턴스를 생성하여 JFrame 초기화
    }
}
