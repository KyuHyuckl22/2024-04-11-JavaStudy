/*
 *   사용자로부터 2개의 정수를 받아서 결과값을 전송해주는 프로그램 ==> 계산기
 *   
 */
import java.util.*;

public class 메소드_계산기 {
	static int add(int a,int b) {   // 사용자 요청문장
		return a+b;                 // 처리문장
	}
//	사용자 요청값이 무엇인가 를 알아야 그것에 대한 처리결과를 보내줄것인지
//	처리 결과값 ==> 리턴형
//	리턴형은 1개만 사용이 가능
	/*
	 *        데이터 첨부
	 *     ----| |----
	 *     |         |
	 *     |   처 리  | ==> {구현부}
	 *     |         |
	 *     -------||--
	 *           결과값 도출 => 리턴형
	 *   ex)
	 *      과일 ====> 믹서기   ====> 즙       
	 *     매개변수     매소드        결과값(리턴형)
	 *     
	 *   ex) GPT
	 *      사용자 입력 ====> 구글링 / 데이터 만들기 ===> 화면
	 *     매개변수           메소드 (구현)           결과값 
	 *   ------------------------------------------------
	 *    1. 사용자가 보내주는 값? 어떤 값을 받을지 (int, double, boolean ..)
	 *    2. 처리 방법  ==> {구현부}    
	 *     => 변수 / 연산자 / 제어문 ===> 명령문
	 *                               ---
	 *                               명령문의 집합         
	 *    3. 어떤 결과값을 도출  ==> 리턴형
	 *   -------------------------------------------------
	 *   | 소스를 구분 => 기능별 분리 => 알아보기가 쉽다 , 오류시에 메소드만 찾는다
	 *                                        필요시에 변경이 가능
	 *   | 재사용이 가능하다 
	 *   | 게임을 다시 시작할 수 있다
	 *   | 메소드는 호출시마다 => 처음부터 다시구동
	 *   | 결과값이 많은 경우
	 *     ------------------> 배열을 사용한다
	 *     => 리턴형 => 배열, 정수, 실수, 문자열, 문자, 논리, 클래스
	 *        int[] method()
	 *        int method()
	 *        double method()
	 *        String method()
	 *        char method()
	 *        boolean method()
	 *        Sawon method() ====아직 사용해보지 않음
	 *     => 매개변수 => 배열, 정수, 실수, 문자열, 문자, 논리, 클래스
	 *                  ---------------------------
	 *                  기본형
	 *     => 리턴형과 매개변수의 차이점
	 *         1개    여러개   보낼 수 있음
	 *      -> 매개변수의 문제
	 *          갯수를 모르는 경우가 있다
	 *       ex) 회원가입시 필수 입력사항 외에 입력을 안해도 되는
	 *           -------------------------------------> 이런 경우에 가변 매개변수를 사용한다   
	 *                                                           --------- ( ... ) 
	 *                        									 |함수나 메서드가 임의의 개수의 매개변수를 받을 수 있는 기능
	 */
	static int minus(int a, int b) {
		return a-b;
	}
	static int gop(int a, int b) {
		return a*b;
	}
	static String div(int a, int b) {
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다!";
		else 
			result=String.valueOf(a/b);
		return result;
	}
	static void process() {  // process 를 호출하면 계산기를 사용할 수 있지만, main 메서드 안에 적어놓으면 호출할 수 없다
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1=scan.nextInt();
		System.out.print("연산자 입력 ( +, -, *, / ) : ");
		char op=scan.next().charAt(0);
		System.out.print("두번째 정수 입력 : ");
		int num2=scan.nextInt();
		
		
		switch(op) {
		case '+' :
			System.out.printf("%d + %d = %d\n", num1, num2, add(num1,num2));
			break;
		case '-' :
			System.out.printf("%d - %d = %d\n", num1, num2, minus(num1,num2));
			break;
		case '*' :
			System.out.printf("%d * %d = %d\n", num1, num2, gop(num1,num2));
			break;
		case '/' :
			System.out.println(div(num1,num2));
			break;
		}
	}

	public static void main(String[] args) {
		process();
//		연결만 해준다.
//		Object는 모든 데이터형을 받을 수 있다
//    ex)
		 Object i=10;
		 i = "";
		 i = 'A';
		 i = 10.5d;
//		 ... 등 Object는 모든 데이터형을 받을수 있는 가장큰 클래스
	}
}
