package com.sist.main;
/*
 *   상속
 *     => 사용자 정의 클래스는 상속으로 사용을 잘 안함
 *     => 라이브러리 클래스 상속을 많이 받는다
 *     => 단일 상속
 *       => 상위클래스는 가급적인 공통기반을 모아서 처리
 *         class 사람 => 재사용
 *           |
 *      extend  사람
 *       ---------------
 *       |    |    |    |
 *     회사원  학생  교직원  교수
 *     
 *     => 메모리에 저장
 *       상위 클래스 = 하위 클래스
 *       상위 클래스 = 상위 클래스
 *       하위 클래스 = 하위 클래스   // 크기가 같은 경우는 상관이 없지만
 *       하위 클래스 = (하위)상위 클래스  // 작은거-> 큰거 로 상속할때는 꼭 형변환이 필요하다
 *     => 클래스 크기는 상속이 있어야 가능
 *        -------------
 *        상속 내리는 클래스 -> 상속 받는 클래스
 *        = 선언되는 클래스 : 변수
 *        = 생성자 : 메소드 지정
 *      
 *      
 *     class Super
 *     {
 *       int a=10;
 *       int b=20;
 *       public void display()
 *       {
 *         sout("Sub:display() Call ..")
 *       }
 *     }
 *     
 *     class Sub extends Super
 *     {
 *       int a=100;
 *       int b=200;
 *       public void display()
 *       {
 *         sout("Sub:display() Call ..")
 *       }
 *     }
 *     
 *     super sup=new Super(); sup => a=10, b=20, Super : display() call..
 *     Sub sub=new Sub();  sub=>  a=100,b=200, Sub:display() call..
 *     
 *     Super sup2=new sub()
 *     -----      ----------
 *    a=10,b=20     sub:display
 * 
 */
class A
{
	int a=10;
	int c=20;
	public void display()
	{
		System.out.println("A:display() Call...");
	}
}
// 사람 
class B extends A implements Cloneable
{
	
	int a=100;
	int c=200;
	public void display()
	{
		System.out.println("B:display() Call...");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
// A aa=new B() ==> (X)
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A aa=new A();
        System.out.println(aa.a);
        System.out.println(aa.c);
        aa.display();
        
        System.out.println("=====================");
        // 가장 많이 사용 
        B bb=new B();
        System.out.println(bb.a);
        System.out.println(bb.c);
        bb.display();
        try {
			B kk=(B)bb.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("=====================");
        // 2번 
        A cc=new B();
        System.out.println(cc.a);//10
        System.out.println(cc.c);//20
        // 상위 = 하위  => 변수 (상위)
        cc.display();//new B() => B가 가지고 있는 메소드 
        
        System.out.println("=====================");
        B dd=(B)cc;
        // 라이브러리 => 형변환 
        System.out.println(dd.a);
        System.out.println(dd.c);
        dd.display();//B 
        
        
        
	}

}