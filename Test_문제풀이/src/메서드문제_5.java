/*
 *  
 */
import java.util.*;
public class 메서드문제_5 {
//  년도 입력 메소드
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력 : ");
		return scan.nextInt();
	}
//	윤년처리
	static void isYear(int year) {
		if((year%4==0 && year%100!=0) || (year%400==0))
			System.out.println(year+" 년도는 윤년입니다");
		else
			System.out.println(year+" 년도는 윤년이 아닙니다");
	}
	
	public static void main(String[] args) {
		int year=input();
//		Scanner scan=new Scanner(System.in); // => System.in -> 키보드 입력값 / System.out -> 화면출력
//		                                            inputStream               outputStream
//		System.in 을 이용해서 키보드 입력값을 가지고 올 수 있다. 하지만 모든 문자를 정수형으로 가져오기 때문에 Scanner 를 사용한다
//		클래스 => 키보드 입력 받아서 메모리에 저장
//		System.out.print("년도 입력 : ");
//		int year=scan.nextInt();
		//////////////////////////입력부분/////////////////////////////
//		if((year%4==0 && year%100!=0) || (year%400==0))
//			System.out.println(year+" 년도는 윤년입니다");
//		else
//			System.out.println(year+" 년도는 윤년이 아닙니다");
		isYear(year);
		
	}
}
