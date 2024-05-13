package com.sist.main;
/* 
 *   자바 ==> 오라클 ==> HTML/CSS ==> JavaScript ==> JSP ==> Spring ==> Python ==> AWS         // 누구나 다 하는 구간
 *   --------------------------------------------------------------------------------
 *                                     |                  |            |                    // 우리가 더 해서 승부봐야하는
 *                                   Ajax              MyBatis     Spring-Boot              // 것들
 *                                   Vue                 JPA      
 *                                   React          String-Security
 *                                   
 *   전공  /  신기술
 *   => 자격증 (정처기, 산업기사)
 *   => 외국어 (우대)
 *   ------------------------
 *   서울권 4년제 
 *                       ----------------------- 현재  이력서  합격  근황 ---------------------------
 *                        
 *   상속
 *   ---- 재사용, 단일상속
 *   예외조건 : 생성자, 초기화 블록, static
 *                           ------ 공통으로 사용
 *                           
 *   메모리 저장시    ----------------- 
 *                   -- 변수 --
 *                   -- 메소드 --
 *                -----------------    
 *                
 *                ==================
 *                   ---super---
 *                    변수 / 메소드
 *                   -----------
 *                   --- this ---
 *                     변수 / 메소드
 *                   ------------
 *                ==================    
 *                
 *        class A
 *        {
 *          int a,b,c,d,e,f;             
 *        }
 *        class B extends A
 *        {
 *          //int a,b,c,d,e,f; => 소스 간결해진다
 *          int k;
 *          => 기능을 변경 => 메소드(오버라이딩)
 *        }
 *        => 실행 속도가 느려진다
 *        => 상속에서 소스를 볼 수 없기때문에 가독성이 떨어진다
 *        => 제약조건이 많다
 *        => 결함성이 높아진다
 *        -------------------------------------------상속을 사용하지 않는다(Spring)
 *        => 상속 보다 포함   을 더 많이 사용한다
 *                           
 */
import javax.swing.*;
/*
 *   상속을 내리는 클래스 : super 클래스, base 클래스, 부모클래스, 상위 클래스
 *   상속을 받 는 클래스 : sub 클래스, 파생 클래스, 자식 클래스, 하위 클래스
 */
class Super {
	int a;
	int b;
}
class Sub extends Super{
//	a,b
	int c;
}
public class MainClass_4 /*extends JFrame*/ { // 상속받는 방법 1
	JFrame f=new JFrame(); // 상속받는 방법 2
	
//	public MainClass_4() {  //상속받는 방법 1
//		setSize(500,500);
//		setVisible(true);
//	public MainClass_4() { // 상속받는 방법 2
//		f.setSize(500,500);
//		f.setVisible(true);
//	}

	public static void main(String[] args) {
//		new MainClass_4();
		Super su=new Super();
		System.out.println(su.a);
		System.out.println(su.b);
		Sub sub=new Sub();
		System.out.println(sub.a);
		System.out.println(sub.b);
		System.out.println(sub.c);
/*    	Super su=new Sub();  -> 큰거에서 작은거로 상속. 가능
 *  
 * 		Sub sub=new Super();  -> 작은거에서 큰거로 상속. 불가
 * 		Sub sub=(Sub)new Super();  -> 작은거에서 큰거로 상속, 형변환으로 상속이 가능하게 만들수 있음
 *      
 *      생성할때 클래스를 잘 봐야 한다
 *      클래스에 따라 접근 변수가 달라진다.
 *      인터페이스 => 상위클래스로 처리 => 형변환이 많이 일어난다
 */
/*     class 댓글게시판
 *     {
 *       글쓰기()
 *       상세보기()
 *       검색()
 *       수정()
 *     }
 *     class 댓글게시판
 *     {
 *       글쓰기()
 *       상세보기()
 *       검색()
 *       수정()
 *       추가()
 *       삭제()
 *     }
 *     class 댓글게시판
 *     {
 *       글쓰기()
 *       상세보기()
 *       검색()
 *       수정()
 *       추가()
 *       삭제()
 *       파일 업로드()
 *     }
 * 		게시판 하나에 3000 줄정도라고 치고 이렇게 하나 하나 변할때마다 새로 해서 3번의 수정 총 9천줄을 코딩할것인가
 *      3000 줄 코딩 후 상속 받아서 500 줄만에 끝내고 3500 줄 정도의 코딩을 할 것인가?      
 */
		/*     class 댓글게시판 
		 *     {
		 *       글쓰기()
		 *       상세보기()
		 *       검색()
		 *       수정()
		 *     }
		 *     class 댓글게시판 extends 게시판
		 *     {
		 *       댓글()
		 *     }
		 *     class 댓글게시판 extends 게시판
		 *     {
		 *       삭제()
		 *       파일 업로드()
		 *     }
         */     
	}

}
