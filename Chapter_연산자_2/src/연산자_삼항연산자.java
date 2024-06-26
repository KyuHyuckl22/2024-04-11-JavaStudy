/*
 * 	연산자
 * 		단항연산자
 * 			=증감연산자 (++ , --)
 * 			  전치 / 후치
 * 			  --------------무조건 1씩 증가
 * 			  int a=10;
 * 			  a++; ========> a에 1을 증가
 * 			  ++a; ========> a에 1을 증가
 * 			  ----------------------------------	
 * 			  연산자가 2개이상 있는 경우에는 다름
 * 			  a++; : 다른 연산을 수행하고 나중에 증가
 * 			  ++a; : 먼저 증가한 후에 다른 연산을 수행
 * 			  예)
 * 				int a=10;
 * 				int b=a++;
 * 					---       >>a대입을 먼저 
 * 					   --     >>a에 1을 증가
 * 				=> b=a
 * 				=> a+1
 * 				a=11 , b=10
 *   		  예2)
 *   			int a=10;
 *   			int b=++a;
 *   				  ---      >>a에 1을 증가
 *   				---		   >>대입
 *  			a=11 , b=11
 *  
 *  			
 *  			=> 대입 / 증가
 *  				a++ => 대입 / 증가
 *  				++a => 증가 / 대입
 *  				-----------------
 *  				=> ++ , -- 변수값 자체가 변경
 *  						   -------------
 *  					a++(++a) ==> a=a+1 ==> a+=1
 *  					a--(--a) ==> a=a-1 ==> a-=1
 *  					------------------------------>동일한 연산
 * 			=부정연산자 (!) => boolean으로만 사용이 가능
 * 						 => true를 false로 , false를 true로
 * 						 => 조건문 , 반복문 (제어문에서 주로 사용)
 * 							boolean bCheck=false;
 * 							!bCheck => true
 * 							!(6==7)
 * 							=> 예약일 => !예약조건
 * 			=형변환연산자 ((데이터형))
 * 			 -------------------
 * 				형변환 : byte / char / int / long / float / double
 * 					  -------------------------------------------
 * 					(int)문자 => 정수
 * 					(double)정수 => 실수
 * 					(int)실수 => 정수
 * 	 				(char)정수 => 문자
 * 					1) 묵시적 형변환 => 자동 형변환
 * 						작은 데이터형 -> 큰데이터형 (연산처리시 / 값 대입시)
 * 						ex)
 * 							int i='A'; 	
 * 								  ----- 65변경   ==> i=65 : 'A'(char) => 자동으로int변경
 * 						ex2)	
 *                          double d=10;
 * 									 ---
 * 									 int==> d=10.0 : 10(double) => 자동으로double변경
 * 						ex3)
 * 							10+10.5
 * 							--
 * 							10.0
 * 							---------10.0+10.5 : 연산처리는 같은 데이터형끼리만 연산이 가능
 * 							때문에 int형 10 이 double형 10.0으로 자동변환후 연산
 * 					2) 강제 형변환 
 * 						큰데이터형->작은데이터형
 * 						ex)
 * 						  int a=10.5; >>자동으로 형변환이 되지 않음
 * 						  int a=(int)10.5;
 * 								 --------
 * 	 								10
 * 						  a=10  =>실수를 정수로 변경 (소수점을 지운다)
 * 
 * 					            데이터형의 크기 확인 
 * 							<------------강제 형변환
 * 					byet < char < int < long < float < double
 * 							자동 형변환------------>
 *					***연산시 주의점
 *						1. 데이터형
 *						2. 프로그램에 필요한 데이터형이 무엇인지 확인하기
 * 		이항연산자  (연산대상 : 피연산자 => 2개)
 * 			=산술연산자 (+,-,*,/,%)
 * 			 + : 
 * 				일반 산술 (덧셈)
 * 					=>10+10=20
 * 				문자열 결합
 * 					=> "Hello " + "Java"  ==> "Hello Java" => 데이터저장 , 크롤링
 * 			 / : 
 * 				0으로 나눌수 없다 : 조건, 예외처리
 * 				정수/정수=정수  =>파이썬 , 자바스크립트 , 오라클 => 정수/정수=실수
 * 			 % : 배수구하기 , 조건 에 많이쓰임 
 * 				부호가 왼쪽 부호가 남는다
 * 				+%+  =>+
 * 				-%-  =>-
 * 				-%+  =>-
 * 				+%-  =>+
 * 				ex)
 * 					짝수 => a%2==0
 * 					홀수 => a%2!=0  ,  a%2==1
 * 					배수 => a%3==0    3의배수
 * 						   a%7==0    7의배수
 * 						   a%8==0    8의배수			
 * 			=비교연산자 (==,!=,<,>,<=,>=)
 * 				== : 같다 (JavaScript : ===, 오라클 : =)
 * 				!= : 같지않다
 * 				<  : 작다
 * 				>  : 크다
 * 				<= : 작거나 같다  
 * 				>= : 크거나 같다
 * 				**** 문자/숫자 (정수,실수) : 문자열은 비교가 안된다
 * 									    equals() , !equals , compare()
 * 										String => 클래스형
 * 			=논리연산자 ( && , || )
 * 				&& : 범위 포함
 * 				(조건)&&(조건)
 * 				----   ---- 조건 2개가 true일경우에 true 나머지는 false
 * 				
 * 				|| : 
 * 				(조건)||(조건)
 * 				----   ---- 조건중 1개 이상이 true일때 true
 * 
 * 				***효율적인 연산 (최적화 연산)
 * 				&& =>앞에 있는 조건이 false => 뒤에있는 연산은 하지 않는다
 * 						-----------false일 확률이 많은것
 * 				|| =>앞에 있는 조건이 true  => 뒤에있는 연산은 하지 않는다
 * 			 프로그램
 * 				1) 기본 문법
 * 				   --------변수 / 데이터형 / 연산자 / 제어문
 * 				2) 묶는 연습
 * 					------- 데이터 묶음 (배열/클래스)
 * 					------- 명령문 묶음 (메소드)
 * 					-------------------------------+(클래스)
 * 					=> 데이터형 / 액션 (기능처리)
 * 					------------------------------------패키지
 * 				3) 재사용을 중심
 * 				4) 퍼포먼트 중심 (속도)=>최적화	
 * 		
 * 			 => 자바는 무조건 (true/false)
 * 				true : 0, 0.0 이 아닌수
 * 				false : 0, 0.0
 * 			 => C / C++ / Python / JavaScript => 숫자
 * 		  	-------------------------->if(조건) => true/false
 * 			=대입연산자 (= , += , -=)
 * 			 	= 대입연산자  (가장 후순위)
 * 					int a=10
 * 					a=10+10
 * 					   ---  > 계산된 결과를 a에 대입
 * 				= 복합대입연산자 (연산자가 두개)
 *					+=
 *					--/++ => 1개 감소 / 1개 증가
 *					+=/-= => 여러개 증가 / 여러개 감소 
 * 					---
 * 					ex) int a=10;
 * 						a+=10      ==>  a=20
 * 					
 * 		삼항연산자 ==>if ~ else ==> 소스가 길거나 많을때 주로 사용(주로 HTML)
 * 			=(조건)?값1:값2
 *			  ---
 *			  결과값 : true =>값1
 *					 false=>값2
 *			  예)
 *				int a=10;
 *				a%2==0? "짝수":"홀수"
 *				------
 *				true => "짝수"
 *
 *
 *
 */
public class 연산자_삼항연산자 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*100)+1;
		System.out.println("num= "+num);
		System.out.println(num%2==0?"짝수":"홀수");
		
		
	}

}
