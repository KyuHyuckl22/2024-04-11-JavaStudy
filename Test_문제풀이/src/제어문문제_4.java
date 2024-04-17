/*
 *  년도를 입력받아 윤년인지 아닌지를 판별하는 방법을 if~else 문으로 사용하라
 *  윤년 계산법
 *  4년마다
 *  100년마다 제외
 *  400년 마다
 */
import java.util.Scanner;
public class 제어문문제_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("년도입력:");
		int a;
		a=scan.nextInt();
		//처리 ==>> 윤년 조건 기억하기
		
		if(a%4==0 && a%100!=0 || a%400==0)
			System.out.println(a+"년도는 윤년 입니다");
		else {
			System.out.println(a+"년도는 윤년이 아닙니다");
		}
	}
}
