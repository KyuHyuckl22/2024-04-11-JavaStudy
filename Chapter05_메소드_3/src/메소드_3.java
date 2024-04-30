/*
 *    => 사용자가 년 월 일을 전송하면 => 출력
 *    => 받아서 출력할것이냐 / 메소드 출력할 것이냐  선택은 프로그래머가
 */
import java.util.*;
//	사용 목적 재사용 / 반복제거

public class 메소드_3 {
//	리턴형 없이
	static void print(int year, int month, int day) {
		System.out.println(year+"년도"+month+"월"+day+"일");
	}
//  반복제거
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+ "입력 : ");
		return scan.nextInt();
	}
	
	public static void main(String[] args) {
		
//		System.out.print("년도 입력 : ");
//		int year=scan.nextInt();
//		
//		System.out.print("월 입력 : ");
//		int month=scan.nextInt();
//		
//		System.out.print("일 입력 : ");
//		int day=scan.nextInt();
//		
//		print(year, month, day);
		int year=input("년도");
		int month=input("월");
		int day=input("일");
		print(year, month, day );
	}
}
