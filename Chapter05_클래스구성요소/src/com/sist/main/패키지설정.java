package com.sist.main;
import java.util.*; // util => 여러개의 클래스를 사용 => Scanner / Calendar
import static java.lang.Math.random; // static 클래스를 사용하면 Math를 사용하지 않아도 random을 사용할 수 있다
import static java.lang.Math.max;
import static java.lang.Math.min;
/*
 *  
 * 
 */
public class 패키지설정 {

	public static void main(String[] args) {
		int a=(int)(random()*100)+1;
		int b=(int)(random()*100)+1;
		System.out.println("최대값: "+max(a,b));
		System.out.println("최소값: "+min(a,b));
	}

}
