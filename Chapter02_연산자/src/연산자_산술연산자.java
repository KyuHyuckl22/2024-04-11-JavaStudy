/*
 *		() : 최우선 순위 연산자
 *		순위 : * , / , % , + , - 
 *		5+5*10 => 55
 *		(5+5)*10 => 100
 *		 
 * 
 */
import java.util.*; //자바에서 지원하는 라이브러리를 읽어온다
public class 연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의로 변수 지정  int a = 100
		// 변수 선안
		int num1,num2; // 이 상태에서 사용시 오류발생 => 변수는 초기화(값지정)가 필요
		// 초기화
		Random r=new Random();
		//임의의 수를 추출
		num1=r.nextInt(101); // 0~100 까지 사이의 정수 추출 => 마지막 제외
		num2=r.nextInt(101); // 101을 지정하면 100 까지 추출
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		// + 
		int plus=num1+num2;
		System.out.println("plus = " +(num1+num2));
		//순서 확인하기 ↘️
//		System.out.println(5+5*10); //55
//		System.out.println((5+5)*10); //100
//		
		int minus=num1-num2;
		System.out.println("minus = "+ minus);
		
		int gop=num1*num2;
		System.out.println("gop = "+ gop + "\n");
		
		int a=10;
		int b=3;
		
		System.out.printf("%.2f%n", a/(double)b); // 3
		//int => double로 변경 (double)변수명
		//값이 있는 경우 => .0
		System.out.println(a%b); // 1
		System.out.println(a%-b); // 1
		System.out.println(-a%b); // -1
		System.out.println(-a%b); // -1   앞 부호를 따라감.
		
		
	}

}
