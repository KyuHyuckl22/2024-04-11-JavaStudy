/*
 * 문자를 받아서 => 대문자 / 소문자 / 숫자 / 기타... 
 * 		=> 대문자를 받고 맞다면 출력으로 빠져나가야 하니 다중조건문 사용
 * 
 */
import java.util.Scanner;
public class 제어문_조건문_10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력 : ");
		char c=scan.next().charAt(0); //문자 하나를 받아올 경우
		// 조건문=> 형식이 중요하다
		// 조건문=> 조건을 걸줄 알아야 한다
		// 범위 => &&
		// 비교연산자 : == , != , < , > , <= , >=
		if(c>='A' && c<='Z') { //대문자 조건 , 대문자 A~Z 사이에 있다면
			System.out.println(c+"는(은) 대문자 입니다");
		}// char => 연산시에 정수형으로 변경
		else if(c>='a' && c<='z') { // 소문자 조건 , 소문자 a~z 사이에 있다면
			System.out.println(c+"는(은) 소문자 입니다");
		}
		else if(c>='0' && c<='9'){//숫자 조건 , 숫자 0~9 사이에 있다면
			System.out.println(c+"는(은) 숫자 입니다");
		}
		else { // 알파벳(x) , 숫자(x) => 한글 / 특수문자
			System.out.println("알파벳 또는 숫자가 아닙니다.");			
		}
		
		// 난수 => 0,1,2 =>
		/*
		 *   if(num==-)
		 *   else if(num==1)   이렇게 값이 고정되고 다른 숫자가 나올수가 없다면
		 *   else if(num==2)   else 는 생략이 가능하다
		 */
		
		
		
		
	}
}
