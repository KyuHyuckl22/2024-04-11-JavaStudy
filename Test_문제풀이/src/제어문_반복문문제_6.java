/*
 * 한 개의 정수를 입력받아 1부터 입력받은 정수까지의 합을 출력하라
 * 합에 대한 변수가 필요
 */
import java.util.Scanner;
public class 제어문_반복문문제_6 {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
	
		int num=scan.nextInt();

		for(int i=1;i<=num;i++)
		{
			sum+=i;			
		}
		
		System.out.println("0~"+num+"까지의 합:"+sum);
	}
}
