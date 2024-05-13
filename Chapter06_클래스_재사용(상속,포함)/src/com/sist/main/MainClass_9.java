package com.sist.main;
class Movie {
	void display() {}
}
class MegaBox extends Movie{
//	int display() {}  => 리턴형이 동일해야 함
//	void display(){} 가 내려와있음 안보이지만
	int display(int a) {
		return 10;
//	오버로딩 => 상속받은게 아니라 다른 메소드 선언
	}
//	protected void display() {}
//	public void display() {}
/*
 *   1. 상속 => 저증의 (메소드 내용을 변경해서 사용)
 *   2. 메소드명 동일하다
 *   3. 매개변수가 동일 (매개변수가 다르면 같은 메소드가 아니다 => 오버로딩)(매개변수가 동일 = 오버라이딩)
 *   4. 리턴형이 동일하다
 *   5. 접근지정어가 동일, 확대가 되어야 한다
 *   
 *   private < default => protected < public
 *            --------
 *  
 *  라이브러리 => 오버라이딩
 *    ---------------> 한국 IT 개발에 잘 맞지 않는다
 *  상속이 여러개 있는 경우에는 가장 큰클래스를 ㅏㅓ
 *   		
 */
	
}
public class MainClass_9 {

	public static void main(String[] args) {

	}

}
