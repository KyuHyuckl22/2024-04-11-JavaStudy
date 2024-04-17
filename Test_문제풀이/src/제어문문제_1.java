/*
 *  1) Scanner 클래스를 이요하여 한개의 정수를 입력받아 양수인지 음수인지 판별하여 출력하라
 *  => if~else : 경우수 두개이면
 *  	if(양수라면)
 *  	{
 *  		조건 true => 처리문장
 *  	}
 *  	else(양수가 아니라면)
 *  	{
 *  		조건 false => 처리문장
 *  	}
 *  
 */
import java.util.Scanner;
public class 제어문문제_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.print("정수입력:");
		a=scan.nextInt();
		if(a>=0) {
			System.out.println(a+"는(은) 양수 입니다");
		}
		else {
			System.out.println(a+"는(은) 음수 입니다");
		}
			
	}
}
