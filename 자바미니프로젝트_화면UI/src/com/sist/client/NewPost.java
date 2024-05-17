package com.sist.client;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewPost extends JPanel implements ActionListener {
    public JLabel la1, la2;
    public JTextField tf1, tf2;
    public JButton b1, b2;

    public NewPost() {
//        setTitle("새 글");

        la1 = new JLabel("제목");
        la2 = new JLabel("내용");

        tf1 = new JTextField();
        tf2 = new JTextField();

        b1 = new JButton("저장");
        b2 = new JButton("삭제");
        
        // 버튼에 ActionListener 등록
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);
        la1.setBounds(20, 15, 80, 30);
        tf1.setBounds(100, 15, 600, 30);
        add(la1);
        add(tf1);

        la2.setBounds(20, 180, 80, 30);
        tf2.setBounds(100, 70, 600, 350);
        add(la2);
        add(tf2);

        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        p.setBounds(230, 450, 290, 35);
        add(p);

        setSize(800, 530);
        setVisible(true);
    }


    // 버튼 클릭 이벤트 처리
    public void actionPerformed(ActionEvent e) {
        if (b2 == e.getSource()) {         
            JOptionPane.showMessageDialog(this, "삭제되었습니다");
            System.exit(0);
        }
    }
}
