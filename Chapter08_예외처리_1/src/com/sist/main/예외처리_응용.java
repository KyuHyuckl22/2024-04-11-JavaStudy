package com.sist.main;
/*
 * Up, Down Game
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   // interface
import java.security.MessageDigest;
public class 예외처리_응용 extends JFrame implements ActionListener{
//	예외처리_응용 => 윈도우를 확장 => 상속(단일 상속 기본)
	JTextField tf;
	JButton b1,b2;
	JLabel la=new JLabel("",JLabel.CENTER); 
//	클래스 => 변수 (객체) => 변수로 사용할수 있는것들 ( 기본형, 배열, 클래스) => 멤버변수로 사용이 가능하다
//	초기화, 화면UI, 서버연결 할때 ==> 주로 생성자에서 처리
//	전체변수 
	int com;  // 난수
	int user; // 입력값
//	메소드 2개이상에 사용 => 멤버변수 => 1. 입력값을 받는 경우, 2. 비교시에 사용
//	메소드 한개에서만 사용 => 지역변수
//	처리는 입력 => 엔터시 => 입력값을 받는다, 비교 => 결과값 출력
	public 예외처리_응용() {
		tf=new JTextField();
		b1=new JButton("시작");
		b2=new JButton("종료");
		
//		배치
		setLayout(null);
		tf.setBounds(10,15,150,30);
		tf.setEnabled(false);  // 비활성화 시켜놓기  시작버튼을 눌러야 활성화 되게끔
//		윈도우에 추가
		add(tf);
		b1.setBounds(165, 15, 100, 30);
		add(b1);
		b2.setBounds(270, 15, 100, 30);
		add(b2);
		
		la.setBounds(10, 55, 360, 30);
		add(la);
//		윈도우 크기
		setSize(400,135);
		setVisible(true);

//		버튼클릭을 위해서는 등록을해야 메소드를 자동 호출
		b1.addActionListener(this);  //actionPerformed => 어디 있는지  -> 이 클래스 안에 있다 'this'(자신이 가지고 있는 객체)
		b2.addActionListener(this);
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
//		생성자 호출
		new 예외처리_응용();
	}
	public void getRand() {
		com=(int)(Math.random()*100)+1;
	}
	public void compare() {
		if(com>user) {
			la.setText(" UP!!");
			tf.setText("");
			tf.requestFocus();
		}
		else if (com<user) {
			la.setText(" Down!!");
			tf.setText("");
			tf.requestFocus();
		}
		else {
			int no =JOptionPane.showConfirmDialog(this,"종료","종료할까요?",
													JOptionPane.YES_NO_OPTION);
			if (no == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
			else {
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true);
				la.setText("");
			}
		}
		
	}
//	예외처리는 에러가 발생시 종료하는 목적이 아니라 => 프로그램을 정상상태로 유지하는 역할을 
//	예외처리는 클래스 블록에서는 사용할 수 없다
//	사용 가능한 위치는 초기화블록, 메소드, 생성자에서만 사용이 가능하다
//      ↓ 버튼이나 JTextField 처리 (엔터) => 고정.   구현을 할 수 없어서 선언만 해서 넘겨준다 인터페이스는 구현이 안되니 프로그램에 맞게 구현해서 써라~
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			System.exit(0);
//			JOptionPane.showMessageDialog(this, "게임을 종료합니다!");
		}
		else if(e.getSource()==b1) {
			getRand();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다!");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if (e.getSource()==tf) { //입력 후에 엔터라면
			String no=tf.getText(); // 입력값을 읽어온다
			try {
				user=Integer.parseInt(no);
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다~");
				tf.setText("");
				tf.requestFocus();
//				다시 처음으로 동작하게 시키기 
				return; // 메소드에서 return 을 사용하면 종료가 된다.
			}
//			메소드는 return 이 있는 곳에서 종료한다 (하지만 항상 마지막 줄에 있는것은 아니다)
//			비교
			compare();
		}
	}

}
