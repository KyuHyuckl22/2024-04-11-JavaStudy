package com.sist.main;
/*
 *  추상클래스의 단점
 *  상속을 내리는 클래스 => 상속을 받을 수 없다
 */
// 긁어오기  MainClass2 
//        com.sist.Main 
        /*
         *        
         *        
         */
        
abstract class AAA {
	int a;
	public abstract void aaa();
	public void bbb() {
		
	}
}

class BBB extends AAA {
	int b;
	public void ccc() {
		
	}
	@Override
	public void aaa() {
	}
}
public class 추상클래스_단점 {

}
