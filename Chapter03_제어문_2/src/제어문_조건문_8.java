/*
 *  숫자를 입력을 받아서 => 3의 배수 , 5의 배수 , 7의 배수 인지 확인하기 
 *  if문 조건이 여러개일때 동시에 수행해야할때 단일조건문 을 사용해야한다
 *  3의배수도 되고 5의 배수도 될수 있기때문에
 *  다중조건문 을 사용하게되면 3의배수 라고 하나를 수행하고 빠져나가기 때문이다
 *  
 *  조건 여러개를 동시에 수행=> 단일 조건문
 *  조건 1개만 수행 => 다중 조건문
 *  
 */
import java.util.Scanner;
public class 제어문_조건문_8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num=scan.nextInt();
		
		if(num%3==0) {//3의배수
			System.out.println(num+"는(은) 3의배수 입니다");
		}
		if(num%5==0) {//5의배수
			System.out.println(num+"는(은) 5의배수 입니다");
		}
		if(num%7==0) {//3의배수
			System.out.println(num+"는(은) 7의배수 입니다");
		}
		else {
			System.out.println("3배수도,5의배수도,7의배수도 아닙니다");
		}
		
		
	}
}
