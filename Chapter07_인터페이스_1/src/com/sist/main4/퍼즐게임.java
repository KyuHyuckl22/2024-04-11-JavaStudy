package com.sist.main4;

import javax.swing.*;
import javax.swing.text.Highlighter.Highlight;

import java.awt.*;
import java.awt.event.*;

// 1. 윈도우 상속을 받아야 한다.
// 2. 인터페이스 상속을 받아야 한다.
/*
 *   인터페이스 상속
 *   -------------- 이벤트
 *   1.   JButton, JRadioButton, JMenu, JTextField
 *      => click 했을 때 처리         => Enter 했을 때 처리.
 *      ----------------------------------------
 *         => ActionListener : actionPerformed()
 *   2.   MouseListener
 *         => mouseClicked / mousePressed / mouseReleased / mouseExited / mouseEntered
 *   3. KeyListener
 *      => keyTyped / keyPressed / keyReleased
 *      
 */
public class 퍼즐게임 extends JFrame implements ActionListener {
   /*
    *   1. 기본 초기화
    *      default 값으로 초기화되는 것.
    *      int = 0, double = 0.0, boolean = false, 모든 class = null
    *   
    *   2. 명시적인 초기화 => 먼저 고려한 후 가능하지 않다면 초기화 블럭이나 생성자를 이용한다.
    */
   JButton[] btns = new JButton[9];
   JLabel la = new JLabel("퍼즐 게임");         // 명시적인 초기화
   JButton b1, b2;
   
   // 생성자 초기화를 합니다.
   public 퍼즐게임() {
      // 초기화와 동시에 => 화면 UI   
      b1 = new JButton("시작");
      b2 = new JButton("종료");
      
      JPanel pan = new JPanel();
      pan.setLayout(new GridLayout(3, 3, 5, 5));
      //                     위 아래 좌 우
      for (int i = 0; i < btns.length; i++) {
         btns[i] = new JButton(String.valueOf(i + 1));   // 윈도우, 네트워크, 웹은 데이터가 없다 => String
         pan.add(btns[i]);
      }
      
      JPanel p = new JPanel();
      p.add(b1);
      p.add(b2);
      
      setLayout(null);
      
      la.setFont(new Font("맑은 고딕", Font.BOLD, 35));
      la.setBounds(10, 15, 450, 40);
      add(la);   // 윈도우에 첨부
      
      pan.setBounds(10, 65, 450, 330);
      add(pan);
      
      p.setBounds(10, 400, 450, 35);
      add(p);
      
      setSize(500, 500);
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new 퍼즐게임();
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }

}