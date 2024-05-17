package com.sist.main3;
interface A {
	public void aaa();
}
interface B {
	public void bbb();
}
// 다중 상속 = ' , ' 로 구분
// 클래스는 단일 상속만 가능
/*
 *   자신의 클래스 = 자신의 생성자()
 *   상위클래스 = 하위클래스 생성자()
 *   
 *   class A 
 *   class B extends A
 *   
 *   A a=new A() => 불가능 -> 인터페이스나 추상클래스는 미완성 클래스라 메모리 할당이 불가능하다 
 *   A c=new B()=>..
 *   B b=new B()
 *   B c=new B()
 *   
 *   interface A
 *   class Bimplements A
 *   
 */
class C implements A,B {

	@Override
	public void bbb() {
		System.out.println("C : bbb() call");
	}

	@Override
	public void aaa() {
		System.out.println("C : aaa() call");
	}
	
}
/* 
 *  상속을 받은 경우 
 *  -------------
 *  1. 변수 ==================> 클래스 선언
 *  2. 메소드 =================> 생성자 => 메소드를 덮어쓴다
 *  
 *  class A {
 *    int a,b;
 *    public void aaa(){}
 *  }
 *  A aa= new A();
 *  ↓        ↓
 *  변수     메소드   결정되는 부분 
 *  
 *  class B {
 *    int c;
 *    public void bbb(){}
 *  }
 *  B bb= new B();
 *  
 *  Class C extends A {
 *    -----------------
 *    int a,b;
 *    public void aaa(){}
 *    ----------------- 상속
 *    int d;
 *    public void ddd(){}
 *  }
 *  C c=new C(); ==> C 가 가지고 있는 모든 내용 a,b,aaa(),d,ddd() 사용가능
 *  A a=new C(); ==> aaa() 는 c가 가지고 있는 aaa()를 사용한다 (ddd()는 사용이 안된다) 
 *  ---  
 *  ↓
 *  A가 갖고있는  이라는 뜻
 *  
 *   
 *  interface A {
 *    void aaa();
 *  }
 *  
 *  interface B {
 *    void bbb();
 *  }
 *  
 *  class C implements A,B
 *          --------------- implements 또한 상속
 *  {
 *    aaa()
 *    bbb()        
 *  }
 *  
 *   A a=new C() => a.aaa()
 *   
 *   B b=new C() => b.bbb()
 *   
 *   C c=new C() => c.aaa()  다중상속일 경우
 *                  c.bbb()
 *   A a; => 제어가 가능한건 a가 가지고있는 변수, 메소드만
 *   B b; => b가 가지고있는 변수 , 메소드만
 *   
 */
public class 인터페이스_1 {

	public static void main(String[] args) {
		A a=new C(); // => aaa() 호출이 가능
		a.aaa();
		
		
		B b=new C(); // => bbb() 호출이 가능
		b.bbb();
//		  다중상속 시에는 상속받은 클래스 이용 => 모든 메소드를 가지고 있기 때문에 ..
		C c=new C(); // => aaa(), bbb() 둘다 호출 가능
		c.aaa(); c.bbb();
	}

}
