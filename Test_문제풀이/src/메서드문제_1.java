import java.util.Scanner;
import java.util.*;
/*
 *   valueOf  ==> 모든 데이터형을 문자열로 변환
 * 
 *   메소드  ===> 전체 소스를 분리해서 작업 (분업화)
 *     1) 형식
 *        리턴형 메소드명 (매개변수)  ==> 선언부 (원형)
 *        ---- 존재 여부 ------  매개변수와 리턴형의 존재 여부
 *        {
 *           => 구현
 *           return 값; => void일 경우 생략이 가능함
 *        }
 *     2) 유형 
 *        리턴형 매개변수
 *         o     x
 *         o     o 
 *         x     x 
 *         x     o
 *     3) 구현
 *        { 
 *           구현 => 연산자 / 제어문 
 *        }
 *     4) 호출
 *        1- 리턴형이 있는 경우 : 데이터형 변수=메소드명()
 *        2- 리턴형이 없는 경우 : 메소드명()
 *        
 *        --------------------------
 *        매개변수 => 메소드(값,값,값 ...)
 *        ** 메소드 호출시마다 => 처음부터 수행
 *        ** 객체지향의 3대요소
 *           --------------- 변수, 메소드, 생성자
 *                           ---  ----  ----
 *        ** 클래스는 1개 기능만 가지고 있다
 *                 ------ 세분화 : 메소드
 *                 ex) class 예약  =======> 웹 프로그램에 조립
 *                     {
 *                         1. 맛집 목록 출력
 *                         2. 맛집 클릭시에 예약일 출력
 *                         3. 예약일 클릭시 예약 가능 시간
 *                         4. 시간 => 인원수
 *                         5. 예약 버튼 활성화
 *                     }
 */
public class 메서드문제_1 {
//	1번문제 - 1부터 10까지 출력하는 메소드를 구현하라
//	        리턴형 x     매개변수 x
	static void mun1() {
		for(int i=1; i<=10; i++ ) {
			System.out.print(i+" ");
		}
	}
	
//	2번문제 - 1부터 10까지 합을 구하는 메소드를 구현하라
//	        리턴형 o    매개변수 x      합을구해서 넘겨줘야한다 리턴형은 o 1~10 으로 정해져 있기 때문에 매개변수는 없다
	static int mun2() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}

		return sum;  // 값 = 리턴형에 사용되는 데이터형이 동일
		
	}
	
//	3번문제 - 1부터 N 까지 합을 구하는 메소드를 구현하라
//	        리턴형 o  매개변수 o 
	static int mun3(int n) {  // 정해져 있지 않은 사용자의 요청값에 따라 달라지기 때문에 매개변수를 정해준다
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
		return sum;
	}
	
//	4번문제 - 두 정수의 나눗셈 결과를 구하는 메소드를 구현하라(실수)
//	       리턴형 o   매개변수 o 
	static double mun4(int a, int b) {
		
		double d=0.0;
		try
		{
			d=a/(double)b; // 정상수행 했을때
		}catch(Exception e) // 오류가 발생했을때. 그래서 catch!
		{
			System.out.println("0으롷 나눌 수 없습니다!");
		}
		return a/(double)b;
	}
	
//	5번문제 - 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하라
	static String mun5(String str) {
		
		return str.toUpperCase();
	}
	
//	6번문제 - 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하라
	
	static void mun6(String msg) {
		if(msg.length()%2!=0) { //좌우대칭을 만들기 위해선 문자의 갯수가 짝수여야 하기때문에   2!=0
			System.out.println("잘못된 입력입니다");
			return; //메소드를 종료할때, 원하는 위치에서 return 사용이 가능하다
		}
		boolean bCheck=true; 
		for(int i=0; i<msg.length()/2; i++) {     // 위에서 문자를 반으로 자름.
			char c1=msg.charAt(i);
			char c2=msg.charAt(msg.length()-1-i); // ab | ba 가 들어왔다면
			if(c1!=c2) {
				bCheck=false;
				break;
			}
		}	
		if(bCheck==true)
			System.out.println("좌우대칭이 맞습니다.");
		else
			System.out.println("좌우대칭이 아닙니다");
		
		
	}
//	7번문제 - 문자열을 거꾸로 뒤집는 프로그램을 구현하라
	static void mun7(String msg) {
	for(int i=msg.length()-1; i>=0; i--) {
		System.out.print(msg.charAt(i));
	}
		
	}
//	8번문제 - 학점을 구하는 메소드를 구현하시오
	static char mun8(int score) {
		char c=' ';
		switch(score / 10)
		{
		case 10 : case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		
		}
		return c;
	}
	
//	9번문제 - 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
//	static boolean isYear(int year) {
//		boolean bCheck=false;
//		if((year%4==0 && year%100!=0) || (year%400==0))
//			bCheck=true;
//		else
//			bCheck=false;
//		return year;
//	}
//	10번문제 - 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
	
//	11번문제 - 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
	
//	12번문제 - 3의 배수를 판별하는 메소드를 구현하시오
	
//	13번문제 - 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
	
//	14번문제 - 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 수를 출력하는 프로그램을 작성하라
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		mun1();
		System.out.println();
//		리턴형이 있는 경우에는 넘어오는 값을 적어줘야함
		int sum=mun2();
		System.out.println(sum);
		System.out.println();
		
		mun3(0);
		
		System.out.println();
		System.out.print("정수를 입력하세요 : ");
		int num1=scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num2=scan.nextInt();
		double res=mun4(num1, num2);
		System.out.println("res="+res);
		System.out.println();
		
		System.out.print("문자열 입력 : ");
		String str=scan.next();
//		String res1=mun5(str);
		
		System.out.println();
		
//		mun6(str);
		
		System.out.println();
		
//		mun7(str);
		
		mun8(85);
		System.out.println();
		
//		boolean bCheck=isYear(2024);
//		if(bCheck==true) System.out.println("윤년");
//		else System.out.println("윤년이 아닙니다");
	}

}
