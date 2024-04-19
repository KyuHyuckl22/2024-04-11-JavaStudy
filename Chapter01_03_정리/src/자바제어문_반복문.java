/*
 *   반복문 => 중복을 제거할때 많이 사용
 *   ----> 같은역할을 하는 => 메서드
 *   
 *   for : 반복 횟수가 지정된경우
 *   --------- 웹 (Back-End 는 ==> while문 , Front-End => for) 
 *   
 *   반복문 ==> 1. 반복횟수 확인
 *   			
 *   
 */
import java.util.Scanner;
public class 자바제어문_반복문 {

	public static void main(String[] args) {
		int num1,num2;
		int gop=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 :");
		num1=scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2=scan.nextInt();
		int i=0;
		
		for( i=num1;i<=num2;i++)
		{
			gop*=i;
		}
			System.out.println(gop);
			
	}
}


