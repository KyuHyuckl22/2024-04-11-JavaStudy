/*
 * 	if ~ else
 * => if 정상수행문장
 * => else 오류처리, 잘못된 입력일 경우
 *  
 */
// 사칙연산 => 연산자를 잘못입력한 경우 --- 처리
import java.util.Scanner;
public class 제어문_조건문_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		char op=' ';
		System.out.print("첫번째 정수 입력:");
		num1=scan.nextInt();
		System.out.print("연산자 입력 (+,-,*,/):");
		op=scan.next().charAt(0); //문자1개 받는 경우
		System.out.print("두번째 정수 입력:");
		num2=scan.nextInt();
		
		if(op=='+'||op=='-'||op=='*'||op=='/')
		{
			//정상수행
			//printf  는 서식이 지정된 출력을 하는데 사용된다 => 명령프롬프트 => 문법상
//			서식 => 출력 형식을 만드는것
//			%d = 정수값
//			%f = 실수값  %0.2f (소수점2자리까지 출력)  %0.1 (소수점1자리까지 출력)
//			%c = 문자
//			%s = 문자열
			if(op=='+')
				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			if(op=='-')
				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			if(op=='*')
				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			if(op=='/')
			{
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다");
				else
					System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			}
		}
		else
		{
			System.out.println("잘못된 연산자 입니다");
		}
	}
}
