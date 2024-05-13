package com.sist.main;
/*
 *  1. 객체지향 프로그램 => 규칙(권장사항)
 *    1) 기존의 프로그램을 쉽게 제작, 활용 이 목적
 *       -------------------
 *        1- 코드의 재사용(개발이 빠르다) => 상속, 포함
 *                                   ---  ---
 *                                    |    |
 *                                    |   기존의 기능을 있는 그대로 사용(오버로딩) -> has-a
 *                                   기존의 기능을 변경해서 재사용(오버라이딩) -> is-a
 *        2- 코드관리가 용이하다 => 구조화 프로그램 (프로그램을 관련된 사항끼리 나눠서 작업) => 메소드
 *        3- 이미 사용중인 프로그램을 변경
 *           ---------------> (이미 상용화된 프로그램)을 사용하기 때문에 신뢰성이 높다
 *        4- 보안 => 데이터를 보호  하는것을 캡슐화 라고 한다
 *        ** 객체지향의 3대 특성 : 캡슐화 => 변수관련 => private 변수 / 메소드를 이용해서 접근하는 방식
 *                            상속 => 재사용 기법
 *                            다형성 => 오버로딩 / 오버라이딩 => 유지보수와 관련되어있다(기능변경 = 메소드관련)
 *        ** 단점 : 상속을 사용하면 결합성이 높고, 제약조건이 많이 존재, 메모리가 커진다, 속도가  늦다 => 가급적 사용하지 않는다
 *                => 단일상속을 사용하기 때문에 상속 자체자 비교적 간단하다
 *                => 상속 기호 : extends => 기존의 클래스를 확장해서 사용한다
 *                  Ex)
 *                    class A
 *                    class B extends A
 *                         --         --
 *                         |           | 상속을 내리는 클래스 -private  - 생성자
 *                         |상속받는 클래스                  -static   - 초기화 블록   이 4개를 제외하고 나머지는 상속이 가능하다
 *        ** 상속을 내린 클래스 (상위, 부모, 베이스 클래스) 는 상속받은 클래스의 변수, 메소드에 접근이 안된다
 *        ** 상속을 받은 클래스는 상속내린 클래스에 접근이 가능
 *           -------------  ------------
 *           |                  |
 *           |                 자신의 객체만 가지고 있다 -> this
 *          자신의 객체, 상위 클래스 객체
 *            this       super
 *        ** 모든 클래스는 자신의 객체를 가지고 있다 => this
 *        ** static 메소드나 static 초기화 블록에서는
 *        ** new 를 이용해서 객체 생성시에 => this 가 생성 
 *           --- JVM에 의해서 자동생성   
 *                
 * 
 */
public class MainClass_1 {
	private int num;  //heap 에 저장
	public MainClass_1() {
		System.out.println("this 라는 자신의 객체가 생성");
		System.out.println("this= "+this);
	}
	public void numData(int num) { // stack 에 저장
//		적용되는 우선순위 => 지역변수와 매개변수가 우선순위, 없다면 멤버변수를 찾는다
		System.out.println("num="+num);
//		                          지역변수 or 매개변수
//		멤버변수를 사용할때는 this.변수명
		System.out.println("this.num="+this.num);
//		this가 구분자 => 멤버변수
//		색상 => 밤색 (지역변수, 매개변수)
//		      파랑색 (멤버변수) 
//		      파랑색 (static) => 필기체
		this.num=num;
		System.out.println("this.num="+this.num);
//		매개변수와 멤버변수의 충돌이 많이 때문에 구분자로 this 를 사용해야한다
//		class 에있는 변수를 제어하는것이 this
	}
	public void display() {
		System.out.println("this= " +this);
	}
	public static void aaa() {
//		System.out.println("this="+this); // static 은 모든 객체가 공통으로 사용하기 때문에 this를 사용할 수 없다
	}
	public static void main(String[] args) {
//		객체 생성
		MainClass_1 m=new MainClass_1();
//		this=m   => JVM(가상머신)이 자동으로 객체 주소를 대입
		System.out.println("m="+m);
		m.numData(100);
		MainClass_1 m1=new MainClass_1();
//		this=m1
		System.out.println("m1="+m);  // 객체 생성시 마다 this 가 생성이 된다 => 자신의 클래스 객체를 나타내준다
//		                                 ---------------- this 인지 super 인지 잘 구분해야한다
//		                                               자신의 객체  / 상위 객체
	}

}
