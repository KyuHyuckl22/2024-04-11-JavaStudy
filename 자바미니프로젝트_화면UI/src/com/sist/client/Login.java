package com.sist.client;
/*
 *   윈도우  (컨테이너)
 *    |
 * ***= JFrame : 기본 윈도우 (최소화, 최대화, 닫기버튼) 
 *    = JWindow : 타이틀바가 없다 (이클립스 실행시 타이틀바 없이 화면 중앙에 뜨는 창) 명칭 : 다이얼로그창
 * ***= JPanel : 단독수행이 불가능 => JFrame, JWindow 위에 나와야 함 => 화면 변경할때 사용하는것
 *    = JDialog : 검색어를 입력하세요..
 *   컴포넌트
 *     |
 *    버튼
 *      => 메뉴 JMenu
 *      => 버튼 JButton, 라디오 : JRadioButton, 체크 : JCheckBox 
 *        <input type = button>
 *        <input type = radio>
 *        <input type = checkbox>
 *    입력창 
 *      => 한줄 : JTextField, JPasswordField
 *             <input type = text> <input type=password>
 *      => 여러줄 입력 : JTextArea
 *    라벨 
 *      => JLabel
 *    테이블 
 *      => JTable
 *    트리
 *      =>JTree
 *    
 *    배치
 *      = BorderLayout
 *      = FlowLayout   ㅡ 자로 배치할때
 *      = GridLayout   계산기 숫자
 *      = CardLayout
 *      = 사용자 정의 => 직접 배치
 *      
 *      -----------------------------------
 *      1. JFrame 상속
 *      2. 필요한 컴포넌트를 포함
 *      3. 생성자  =  화면UI 
 *           초기화 -> 배치
 *           
 *           //BernsteinLookAndFeel
 *           
 *           => 라벨 2
 *           => JTextField
 *           => JPasswordField
 *           => Jbutton 2
 */
import javax.swing.*; //javafx

public class Login extends JFrame {
//  포함클래스
/*  모든 멤버변수는 private 이 아니다 => 라이브러리는 public으로 설정하는게 편함
 * 
 */
	public JLabel la1,la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1,b2;
//	모양을 어떻게 잡을건지 필요한거 먼저 올려놓고 시작해야한다
//	초기화 ==> 화면 배치 ==> 생성자    다른 클래스와 연결하기 위해서는 public 을 사용해야함
	public Login() {
		setTitle("로그인"); // 타이틀 바에 뜨는거 바꾸기
		
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
//		배치
//		사용자 정의
		setLayout(null); // ==> BorderLayout 을 갖고있어서 우리가 직접 배치하는게 좋음
		la1.setBounds(20, 15, 80, 30);
		tf.setBounds(100, 15, 200, 30);
//		윈도우에 추가
		add(la1);
		add(tf);
		
		la2.setBounds(20, 60, 80, 30);
		pf.setBounds(100, 60, 200, 30);
//		윈도우에 추가
		add(la2);
		add(pf);
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2); //가운데 정렬
		p.setBounds(10, 100, 290, 35);
		
		add(p);
		
//		윈도우 크기 결정
		setSize(350, 190);
//		출력여부 확인 true면 보여주고 false면 안보여줌
		setVisible(true);
		
	}
	public static void main(String[] args) {
//		윈도우 스킨끼기
//		한번만 해주면 나머지는 다 바뀜 메인에다가 한번만 해주면 끝
		

		
//		생성자 호출
		new Login();
	}

}
