/*
 * 	자바에서 제공하는 제어문 : 필요한 내용만 출력 , 반복수행 , 반복제어
 * 						------------    -----
 * 							|			  |       | 종료 , 제외
 *							|			  |		 break continue		
 *							| 			for , while , do~while
 * 						조건문 , 선택문 (다중조건문과 동일)
 * 												
 * ------------------- 연산자 + 제어문 = 메소드
 * 	1)조건문 : 사용빈도가 가장 많다
 * 	  => 단일 조건문 : 검색 => 검색어 입력여부확인 , 상세보기
 * 			형식)*** 조건문 : true || false 가 나오게 만들어야 한다
 * 						  ---------------------
 * 							|부정연산자 (!)
 * 							|비교연산자 (==,!=,<,>,<=,>=)
 * 							|논리연산자 (&&,||)
 * 				if(조건문)
 * 				{
 * 					조건이 true 일때만 수행 => false면 스킵
 * 				}
 * 	  => 선택 조건문 : true 일때와 false 를 나눠서 처리
 * 			=> 로그인 (로그인 된 경우 / 로그인이 안된 경우)
 * 						true		  false
 * 			=> ID중복체크 (중복이 없는경우 / 중복이 안된 상태)
 * 							true		false
 * 			형식)
 * 				if(조건문)   => ex) 로그인이 된 상태 => main 화면으로 이동
 * 				{
 * 					조건이 true 일때 처리
 * 				}		
 * 				else		=> ex) 로그인이 안된 상태 => id혹은 pw 확인 메세지 전송
 * 				{
 * 					조건이 false 일때 처리
 * 				}
 * 	  => 다중 조건문 : 조건 여러개 => 한개만 수행
 * 					=> 메뉴 클릭할때 ->웹 , 키보드 키값제어 ->게임
 *화면변경 , 종료 , 새로고침 ..<--------
 * 			형식)
 * 				if(조건문)
 * 				{
 * 					조건문 true 일때 처리문장 수행 => 종료
 * 				}	false 일때	
 * 						↓
 * 				else if(조건문)
 * 				{
 * 					조건문 true 일때 처리문장 수행 => 종료
 * 				}	false 일때
 * 						↓
 * 				else if(조건문)
 * 				{
 * 					조건문 true 일때 처리문장 수행 => 종료
 * 				}	false 일때
 * 						↓
 * 				...
 * 				else
 * 				{
 * 					해당 조건이 없는 경우에 수행 => 생략이 가능
 * 				}
 *	=>선택문 : 다중조건문을 단순화 => 웹에서는 거의 사용 빈도가 없음
 *							  ----------------------->화면이동(JSP) => Spring
 *													=> Front(Router)
 *													=> 간결하다 => 게임(키보드값)
 *		*** 웹 => if / if~else / for / while
 *			=> 기본 : 데이터베이스 : SQL (80%) => 취업
 *		: 한개의 값이 있는 경우 => 선택문
 *		: 범위가 있는 경우 => 다중 조건문 
 *		  score>=90 && score<=100 ===> 10개 
 *		HTML/CSS/JavaScript => 화면 UI => Vue , React , Next
 *			  |
 *			Java : 데이터 처리 (요청처리)
 *			  |
 *			Oracle : 데이터를 저장하는 공간 => 데이터베이스(영구적)
 *			-------------------------------- AWS(paas)=> Linux 
 * 선택문 형식) switch(정수,문자,문자열) 만 들어갈 수 있다. 실수 X
 * 			switch(문자 +,-,/,*)
 * 				{
 * 					case '+' : 문자중에 +가 들어온 경우
 * 						처리문장
 * 						break;   => 처리후에 종료
 * 					case '-' : 문자중에 -가 들어온 경우
 * 						break;   => 처리후에 종료
 * 					...
 * 					...
 * 					default:=> case에 없는 데이터가 있는 경우 => 다중조건문 else
 * 					 처리문장
 * 				}
 * 			
 *		=> 같은 처리     100/10 ==> 10 9 8 7 ...   9도 10도 A 를 줘야할때
 *			switch(정수)
 *				{
 *					case 10:
 *						A
 *						break;
 *					case 9:
 *						A
 *						break;
 *				}  				 		X
 *			switch(정수)
 *				{
 *					case 10:
 *					case  9:  
 *						A
 *						break;
 *				}     =>break가 없는 경우도 있다.
 *					break가 없는 경우 => 밑에 있는 break까지 수행
 *
 */
import java.util.Scanner;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		char op=scan.next().charAt(0);
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		// ^ 사용자 입력 요청
		/*
		 *  문자==> ' '
		 *  문자열==>" "
		 */
		// 결과값 출력
		switch(op)
		{
			case '+':
				//처리문장
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break; //문장을 수행하고 종료
			case '-': //case 하나씩 수행할때는 break를 사용해야함
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case '/':
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다!");
				else
					System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
			//연산자가 잘못 들어왔을 경우 
			// default 는 생략이 가능
			default:
				System.out.println("잘못된 연산자입니다!");
				//마지막은 break 사용할 수 있고 , 사용하지 않을 수 있다
			//***case 에 등록되는 값이 중복되면 오류가 발생한다
			//***case 에 등록되는 데이터가 일치해야 한다 => case '10n+' 불가	
		}
		
	}
}
