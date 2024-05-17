package com.sist.client;
// b4
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BoardListPanel extends JPanel implements ActionListener {
	
	public NewPost np= new NewPost();
    JLabel titleLa = new JLabel("게시판", JLabel.CENTER);
    JLabel pageLa = new JLabel("0 page / 0 pages");
    JButton b1, b2, b3; // 새글, 이전, 다음 버튼
    JTable table; // 테이블 모양
    DefaultTableModel model; // 데이터 관리
    

    // 초기화, 화면 UI => 생성자에서 처리
    public BoardListPanel() {
    	
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
        titleLa.setBounds(10, 15, 770, 40);
        add(titleLa); // JFrame에 추가

        b1.setBounds(10, 60, 100, 30);
        add(b1);

        js.setBounds(10, 95, 770, 380);
        add(js);

        JPanel p = new JPanel();
        p.add(b2);
        p.add(pageLa);
        p.add(b3);

        p.setBounds(10, 480, 770, 35);
        add(p);
        
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
       // 클릭된 버튼에 따라 다른 동작을 수행합니다.
 	   if(b1 == e.getSource()) {
 		  
 	   }
    }

    
    public static void main(String[] args) {
        new BoardListPanel(); // BoardListPanel 인스턴스를 생성하여 JFrame 초기화
    }

    
}
