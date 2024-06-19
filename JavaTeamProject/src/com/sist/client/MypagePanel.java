package com.sist.client;


import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MypagePanel extends JPanel {

    JLabel namela, idla, introla, tablela;
    JTextField nametf, idtf;
    JTextArea introta;
    JButton b1, b2;
    JTable table;
    ControllPanel cp;
    
    
    public MypagePanel(ControllPanel cp) {

        setLayout(null);

        this.cp=cp;
        
        // 사용자 정보 입력 필드 및 레이블 추가
        namela = new JLabel("이름 : ");
        namela.setBounds(180, 30, 80, 40);
        add(namela);

        nametf = new JTextField();
        nametf.setBounds(250, 30, 866, 40);
        nametf.setEnabled(false); // 이름 필드 수정 불가능하게 설정
        add(nametf);

        idla = new JLabel("아이디 : ");
        idla.setBounds(180, 95, 80, 40);
        add(idla);

        idtf = new JTextField();
        idtf.setBounds(250, 95, 866, 40);
        idtf.setEnabled(false); // 아이디 필드 수정 불가능하게 설정
        add(idtf);

        introla = new JLabel("소개 : ");
        introla.setBounds(180, 180, 80, 30);
        add(introla);

        introta = new JTextArea();
        JScrollPane introScroll = new JScrollPane(introta);
        introScroll.setBounds(250, 180, 866, 200);
        add(introScroll);

        tablela = new JLabel("예약 정보 : ");
        tablela.setBounds(180, 400, 80, 30);
        add(tablela);
        
        table = new JTable();
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(250, 400, 866, 250);
        add(tableScroll);

        b1 = new JButton("");
        b1.setBounds(250, 620, 100, 30);
        add(b1);

        b2 = new JButton("저장");
        b2.setBounds(633, 660, 100, 30);
        add(b2);

        setSize(1366, 768);
        setVisible(true);

    }

}
