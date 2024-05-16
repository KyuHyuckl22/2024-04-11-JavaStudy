package com.sist.main3;
/* 
 *  블록을 열고 닫기만해도 구현이 된거다
 *  aaa(); 만 구현하고 상속을 내리고 그후 수정을 하게되면 다른것들도 다 오류 
 */
abstract class A{
	public abstract void aaa();
	public abstract void bbb(); // 모든 클래스가 구현해야 하는 부분
//	B,D 클래스에만 구현을 하고싶을때 ==> C랑 E는 구현하고싶지 않을때
	public void ccc() {
		
	}
	public void ddd() {} // 프로젝트 구현이 끝난다음에 추가하는 기능이 있는 경우 => 구현된 메소드를 만들어서 처리
	// 필요한 클래스에서만 오버라이딩이 가능
	/*
	 * 추상클래스를 보완
	 * ------------- 인터페이스
	 *   1. 다중 상속이 가능
	 *   2. 모든 메소드가 추상메소드
	 *   3. 모든 변수는 상수 
	 *   --------------- 1. 변경 => 구현이 된 메소드가 존재
	 * 
	 */
}
class B extends A{

	@Override
	public void aaa() {
	}

	@Override
	public void bbb() {
	}
	
}
class C extends A{

	@Override
	public void aaa() {
	}

	@Override
	public void bbb() {
	}
	
}
class D extends A{

	@Override
	public void aaa() {
	}

	@Override
	public void bbb() {
	}
	
}
class E extends A{

	@Override
	public void aaa() {
	}

	@Override
	public void bbb() {
	}
	
}
public class MainClass {

	public static void main(String[] args) {

	}

}
