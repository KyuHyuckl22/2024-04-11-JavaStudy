/*
 * 		+
 * 		----
 * 		1) 산술연산자 (더하기 연산자)
 * 			10+10=20
 * 		2) 문자열 결합
 * 			"7"+7 => "77"
 * 			7+"7" => "77"
 * 			7+7+"7" => 147
 * 			---
 * 			14  + "7"
 * 
 * 			7+"7"+7+7 => 7777  문자열이 붙은것 뒤는 다 문자열로 인식이된다
 * 			7+"7"+7*7 => 7749  *가 우선순위기 때문에 49 먼저 계산되고 문자열로 인식됨
 * 					
 * 			/ => 정수 / 정수 = 정수
 * 			% => 나머지는 왼쪽 부호를 따라간다
 * 			** 같은 데이터형끼리 연산이 된다
 * 			int + long = long
 * 			double + int = double
 * 			double + double = double
 * 			최종 결과값은 가장 큰 데이터형을 결과값으로 처리된다
 * 
 * 
 */

import javax.xml.transform.Source;

public class 연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c='A';
		int i = 10;
		System.out.println(c+i); // 75
		
		//double + int => double
		double d=10.5;
		System.out.println(d+i); // 20.5
		
		byte b1=10;
		byte b2=20;
		int b3=b1+b2; // int이하 데이터형의 연산결과는 int
		System.out.println(b3); // 30
		
		//char + char = int
		
		char c1='A'; //65
		char c2='B'; //66
		int c3= c1+c2;
		System.out.println(c3); //65+66 
		
		// char + byte + double + float => double
		char d1='A';
		byte d2=100;
		double d3=10.5;
		float d4=10.5f;
		System.out.println(d1+d2+d3+d4);
		// int + long + float => float
		int e1=100;
		long e2=100L;
		float e3=10.5f;
		System.out.println(e1+e2+e3);
				
		// byte < char < int < long < float < double
		// 자동변경 => 데이터형이 다른 경우
		
		

	}

}
