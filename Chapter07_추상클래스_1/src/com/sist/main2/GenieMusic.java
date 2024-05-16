package com.sist.main2;
/*
 *   객체생성 
 *   ------
 *   클래스명 객체명 = new 클래스명 ()
 *   -----
 *     => 다른 클래스에 접근이 불가능
 *      
 *   class A {
 *     int a, b;
 *     public void aaa(){}
 *   }
 *   
 *   Class B {
 *     int c;
 *     public void bbb(){}
 *   }
 *   
 *   A aa=new A();
 *    - a,v,aaa() 만 접근이 가능
 *    
 *   B bb=new B();
 *    - c,bbb() 만 접근이 가능
 *    
 *    Class B extends A{
 *     int c;
 *     public void bbb(){}
 *     
 *   }
 *     상속받은 내용 접근이 가능 => a,b,aaa() 
 *     상속을 내린 클래스는 본인이 가지고있는 변수, 메소드만 접근이 가능 
 *      A 는 A 만 접근이 가능하고 B는 A 의 상속을 받았기 때문에 B와 A 둘다 접근이 가능
 *      
 *   A cc=new B()
 *           ---> 메소드만 변경이 된다
 *           ---> aaa() 를 B가 가지고있는 aaa()로 덮어쓴다
 *    - a,b,aaa()
 *           ---> B 가 가지고 있는 메소드 호출
 */
public class GenieMusic extends MusicSystem{

	@Override
	public void init() {
	}

	@Override
	public void find(String tile) {
	}

	@Override
	public void list() {
	}

	@Override
	public void detail(int mno) {
	}
	
}
