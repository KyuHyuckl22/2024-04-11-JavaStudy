/*
 * 사칙연산 => 연산을 한번만 수행 ==> 다중조건문
 * 
 */
import java.util.Scanner;
public class 제어문_조건문_9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//사용변수
		int num1,num2;  //num1,2 를 int를 저장하는 공간 이라고 지정
		char op=' ';
		
		System.out.print("첫번째 정수입력 : ");
		num1=scan.nextInt(); //변수=> 한개의 데이터를 저장하는 공간
		System.out.print("연산자 입력(+,-,*,/)");
		op=scan.next().charAt(0);
		System.out.println("두번째 정수입력 :");
		num2=scan.nextInt();
		
		if(op=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));//true->문장수행후 종료
		}//     | false->다음문장 수행
		else if(op=='-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));//true->문장수행후 종료
		}//		| false->다음문장 수행
		else if(op=='*') {
			System.out.println(num1+"*"+num2+"="+(num1*num2));//true->문장수행후 종료
		}//		| false->다음문장 수행
		else if(op=='/') {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			else {
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}			
		}//		해당 조건이 없을때
		else {
			System.out.println("잘못된 연산자 입니다");
		} 
			
		
		
	}
}
