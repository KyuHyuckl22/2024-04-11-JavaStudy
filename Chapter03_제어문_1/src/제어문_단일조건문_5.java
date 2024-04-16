/*
 * 4칙연산 프로그램 + , - , * , /
 * 변수 3개 필요 
 * 
 */

import java.util.Scanner;

public class 제어문_단일조건문_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		char op;
		System.out.print("첫번째 정수입력 : ");
		num1=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/) : ");
		op=scan.next().charAt(0);
		
		System.out.print("두번째 정수입력 : ");
		num2=scan.nextInt();
		
		// == 숫자 (정수,실수) , 문자 
		if(op=='+')
		{
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		if(op=='-')
		{
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		if(op=='*')
		{
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		if(op=='/')
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			if(num2!=0)
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
		/*
		 * 코딩테스트에서 이렇게 짜면 틀렸다.
		 * 이유는 0으로 나누면 오류가 나지만
		 * 오류처리를 하지 않았기 때문.
		 * 코딩테스트 문제는 쉬운데 애러처리를 해줘야 한다.
		 * 
		 */
		
	}
}
