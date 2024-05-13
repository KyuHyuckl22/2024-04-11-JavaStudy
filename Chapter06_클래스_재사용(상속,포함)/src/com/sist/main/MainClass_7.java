package com.sist.main;

import java.util.Scanner;

/*   5장 객체지향 프로그램 시작
 *     => 변수 설정
 *     => 저장할 내용이 여러개 => new 인스턴스 변수
 *       한개 저장 => static
 *     => 메소드 형식 ~ 처리과정
 *       ---- 연산자 / 제어문
 *     => 초기화 : 생성자, ststic {}
 *   194p
 *     상속 => 재사용
 *     => 변경 ( 오버라이딩)
 *     => 상속 받았을때 호출되는 과정
 *     => 메모리 할당 (상위, 하위)
 *     => 형변환
 *    ------------------------ 상속 과정
 *    7장 : 추상클래스 / 인터페이스  => 상속 기반 (다중 상속) 
 *    8장 : 예외처리 	
 *         ------ 
 *    ------------------------ 자바 기본 문법
 *    9장 ~ 마지막 : 라이브러리 => 조립
 *    ---------- 컬렉션
 *    
 *    ** 오라클 연동 / JSP / Spring / Spring-Boot    <-- [실무]
 *    MyBatis / JPA   Back-End 는 Java 기반
 *    ------------------------------------------- 자바기반 
 *    Java / JavaScript / Spring 
 *    ---------------------------
 *    
 *    상속
 *      => 멤버변수, 메소드
 *                  | 변경
 *     => 상속 확장된 클래스
 *            ----- extends
 *     => 형식
 *       class A extends B => 단일 상속, 재사용
 *     => 단일상속
 *     
 *       동물         남자는 인간이다
 *        |          인간은 동물이다 
 *       인간         | => 이다 (is-a)
 *        |
 *     |-----|       아래로 갈수록 구체화
 *    남자    여자  
 *    
 *               나무
 *                |
 *              -----
 *             |     |
 *           침엽수   활엽수
 *          __|__   __|__
 *          |   |   |   |  ...    위로 올라갈수록 공통점이 많이 존재 => 상속을 내리는 클래스는 클래스마다 공통점을 가지고 있다
 *                                                            ---------------------------------------
 *                                                            | 확장
 *   201p = 단일상속
 *          A          A       A      B
 *        __|__        |      --      --
 *       |     |       |        |_____|      
 *       B     C       B           |
 *                                 C  => 다중 상속 (클래스에는 존재하지 않는다 => 인터페이스)
 *   201p => 확장
 *           --- 변경해서 사용 => 오버라이딩(변수 오버라이딩, 메소드 오버라이딩)
 *           --- 추가 
 *        
 *                    추가                         변경(수정)
 *                    ---                         ---
 *                    오버로딩                      오버라이딩
 *      ----------------------------------------------------
 *       상태          같은 클래스 에서만            상속이 된 상태
 *                    ------------             ----------
 *                                             **
 *      ----------------------------------------------------
 *       메소드명         동일                         동일  
 *      ----------------------------------------------------
 *       매개변수       갯수/데이터형이                  갯수/데이터형이
 *                     달라야한다                     동일해야 한다
 *      ----------------------------------------------------
 *       리턴형          관계 없다                      동일
 *      ----------------------------------------------------
 *       접근지정어       관계 없다                  축소하지 못한다
 *                                              확대는 가능하다
 *      ----------------------------------------------------
 *       접근 지정어
 *                            <---- 축소
 *            private < default < protected < public
 *                            ----> 확대
 *      ----------------------------------------------------
 *      class A
 *      {
 *        void display(){}
 *      }
 *      
 *      => void display(){}
 *      => protected void display(){}
 *      => public void display(){}
 *      => 잘모르는 경우 => public
 *      
 *      
 *    
 */
//변수 오버라이딩
//Parent => 메모리 할당 ==> Fhild 가 메모리 할당
class Parent {
	String name;
	int age;
//	메모리에 저장이 되어있어야 상속받는 애들이 가져다 사용하는것
	public Parent() {
		name="홍길동";
		age=25;
		System.out.println("Parent클래스 메모리 할당");
	}
}
class Child extends Parent {
	public Child() {
		this.name="박문수";  
		this.age=30;
		super.name="심청이";
		super.age=15;
		System.out.println("Child클래스 메모리 할당!");
	}
}
class KKK {
	public void display() {
		System.out.println("CCC:display()call..");
	}
}
class AAA {
	public void display() {
		System.out.println("AAA:display()call..");
	}
}
class BBB {
	public void display() {
		System.out.println("AAA:display()call..");
	}
}
class CCC {
	public void display() {
		System.out.println("AAA:display()call..");
	}
}
class DDD {
	public void display() {
		System.out.println("AAA:display()call..");
	}
}
public class MainClass_7 {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println();
		System.out.println();
		/*Scanner scan=new Scanner(System.in);
		System.out.println("AAA(1),BBB(2),CCC(3),DDD(4)");
		int no=scan.nextInt();
		
		KKK k=null;  // 상속받은 모든 클래스를 상위 클래스를 이용해서 한번에 제어
		// 데이터가 여러개 => [] => 배열명으로 이용
		// 클래스가 여러개일때는 => 상속을 받아서 상위클래스를 이용해서 제어
		switch(no) {
		case 1:
			k=new AAA();
			break;
		case 2:
			k=new BBB();
			break;
		
		case 3:
			k=new CCC();
			break;
	
		case 4:
			k=new DDD();
			break;
		}
		k.display();
//		if(no==1) {
//			AAA a=new AAA();
//			a.display();
//		}
//		else if(no==2) {
//			BBB a=new AAA();
//			a.display();
//		}
//		else if(no==3) {
//			CCC a=new AAA();
//			a.display();
//		}
//		else if(no==4) {
//			DDD a=new AAA();
//			a.display();
//		}*/
/*
 *   프로그램은 여러개를 가지고 제어하면 어렵다
 *   int a,b,c,d,e,f,g,h,i,j,k,m
 *   int[] arr-new int[12];
 *   
 *   
 *   
 *   
 */

	}

}
