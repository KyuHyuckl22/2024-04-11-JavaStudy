package com.sist.main;
/*
 *  메소드 오버라이딩  ==> 204p => 가장 많이 사용
 */
class Music {
	int count = 10;
	public void list() {
		System.out.println("목록 출력");
	}
	public void detail() {
		System.out.println("상세보기");
	}
	public void find() {
		System.out.println("뮤직 검색");
	}
}

class Genie extends Music{
	int musiccount = 200;
	@Override
	public void list() {
		System.out.println("Genie뮤직에서 목록 출력");
		super.list();
	}

	@Override
	public void detail() {
		System.out.println("Genie뮤직에서 상세보기");
		super.detail();
	}

	@Override
	public void find() {
		System.out.println("Genie뮤직에서 검색");
		super.find();
	}
//	목록 출력
//	상세보기
//	검색
	
}
class Melon extends Music {
//	목록 출력
//	상세보기
//	검색	
	@Override
	public void list() {
		System.out.println("Melon뮤직에서 목록 출력");
		super.list();
	}

	@Override
	public void detail() {
		System.out.println("Melon뮤직에서 상세보기");
		super.detail();
	}

	@Override
	public void find() {
		System.out.println("Melon뮤직에서 검색");
		super.find();
	}
}
class Mnet extends Music{
//	목록 출력
//	상세보기
//	검색	
	@Override
	public void list() {
		System.out.println("Mnet뮤직에서 목록 출력");
		super.list();
	}

	@Override
	public void detail() {
		System.out.println("Mnet뮤직에서 상세보기");
		super.detail();
	}

	@Override
	public void find() {
		System.out.println("Mnet뮤직에서 검색");
		super.find();
	}
}
public class MainClass_8 {
//  유사한 클래스를 여러개 모아서1개 객체로 제어할때 쓰는 형식이 ==> 상속
/*
 *  상속을 받는 경우
 *  
 *  변수  : 선언하는 클래스명
 *  메소드 : 생성자에 따라
 *  생성자 => 상속의 제외조건
 *  
 *  class A
 *  class B extends A
 *  
 *  A a=new B()  변수: A   메소드: B
 *  A a=new A()  변수: A   메소드: A 
 *  B b=new B()  변수: B   메소드: B  ***가장 많이 사용
 *  B b=new A() ---> 오류 ==> A가 상속을 내려주는 클래스로 ==> Super 를 Sub에 넣을 수 없다 넣기위해서는 형변환 필요
 *                          B보다 크기가 더 크다.     
 *  
 */
	public static void main(String[] args) {
		System.out.println("==== 지니뮤직 ====");
		Music m=new Genie();
//		Genie g=new Genie(); << 가장 많이 쓰는 자기 자신거를 가져다 쓰는 경우 
		// 메소드 호출 => 생성자
		m.detail();
		m.list();
		m.find();
		System.out.println("==== 멜론 ====");
		m=new Melon();
		// 메소드 호출 => 생성자 덮어써버리기!
		m.detail();
		m.list();
		m.find();
		System.out.println("==== 엠넷 ====");
		m=new Mnet();
		m.detail();
		m.list();
		m.find();
	}
//     하나로 여러개를 만드는것: 상속
//	어디에 사용할 수 있을까.
/*
 * 데이터가 여러개 : 배열
 * 클래스가 여러개 : 상속
 * 누가 한개의 이름으로 제어를 할 수 있느냐. 이렇게 하면 데이터를 하나로 사용하는거라 데이터 누수를 막을 수 있다 	
 */
}
