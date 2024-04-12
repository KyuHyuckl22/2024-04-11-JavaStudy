/*
 * 		byte , char , int , long , float , double
 * 		기타 : boolean
 * 
 * 		1. 데이터형의 크기    
 * 			byte < char < int < long < float < double     
 * 			=> 크기의 기준 : 수 표현의 갯수  *정수보다 실수가 더 크다*
 * 			
 * 			int a = 10L; => X
 * 			----   ----
 * 			 4       8 
 * 									(왼쪽이 오른쪽보다 크거나 같아야한다)
 * 			long a = 10; => ㅇ 	    ( 왼쪽 >= 오른쪽)
 * 			----    ----
 * 			 8       4
 * 
 * 			int a = 'A'  => ㅇ       (char 는 연산을 하면 정수로 바뀌어서 들어간다. '65')
 * 			----	----
 * 			
 * 			char c = 65;  ==> A 가 된다	
 * 		    
 * 			byte + byte = int
 * 			char + char = int     int 이하는 더하면 int가 나옴
 * 			int + double = double   작은거 + 큰거 = 큰걸 따라감
 * 			float + double = double 
 */

import java.awt.Button;

import javax.management.BadAttributeValueExpException;

public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 'A';
		System.out.println(a); // int 형으로 들어가면 출력값도 int => 65
		char c=65;
		System.out.println(c); // char 형으로 들어가면 출력값도 char => A
		double d='A';
		System.out.println(d); // double 형으로 들어가면 출력값도 double => 65.0
		
//		데이터 형 들은 언제든 자동 형 변환이 가능하다.
//		강제로도 형 변환이 가능하다. =>  (int)'A'
//		형 변환의 종류는 Upcasting / Downcasting  이 있다.
//		             큰거로 변환     작은거로 변환
		
		byte b1=10;
		byte b2=110;
		byte b3=(byte)(b1+b2); // (byte) 를 붙이지 않으면 int로 변환되서 errr 
		

	}

}
