package com.sist.main;
class A {
	public A() {
		System.out.println("메모리에 저장");
	}
//	메모리 해제
//  소멸자 함수
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("메모리 해제");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		A a=new A();
		a=null; // 방전 => 객체가 null이면 사용할 수 없다
		System.gc(); //null값이나 사용하지 않는거
//		 가비지 컬렉션으로 바로 이동
	}

}
