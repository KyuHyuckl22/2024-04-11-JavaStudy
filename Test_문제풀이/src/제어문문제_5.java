/*
 *  5) 100점 만점으로 성적을 입력받아 90~100이면 A , 80~89면 B , 70~79면 C , 60~69면 D ,
 *     60점 미만이면 F를 출력하라 (if사용)
 *     if => 단독 수행문장 => if마다 조건을 검색 
 *     			=> 전체 범위 설정
 *     
 */
import java.util.Scanner;
public class 제어문문제_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("정수 입력: ");
		a=scan.nextInt();
		
		if(a>=90 && a<=100) {
			System.out.println("A학점입니다");
		}
		if(a>=80 && a<90) {
			System.out.println("B학점입니다");
		}
		if(a>=70 && a<80) {
			System.out.println("C학점입니다");
		}
		if(a>=60 && a<70) {
			System.out.println("D학점입니다");
		}
		if(a<60) {
			System.out.println("F학점입니다");
		}
		if(a>100) {
			System.out.println("잘못 입력하셨습니다");
		}
	}
}
