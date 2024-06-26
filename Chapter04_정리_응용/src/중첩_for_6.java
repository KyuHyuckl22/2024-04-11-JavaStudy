/*
 * 
 *    1. 중복없는 난수 응용ver.
 *    ---------------------
 *    숫자 야구 게임
 *    ----------
 *    1. 난수 3개 발생  ex) 3 6 9
 *    2. 사용자 입력
 *       사용자가 7 8 9 
 *    3. 힌트
 *       같은 자리일때 S  
 *       다른 자리일때 B
 *       
 */
import java.util.Arrays;
import java.util.Scanner;
/*
 *     2장  /  3장  /  4장  /  5장
 *      |      |       -----------> 묶음
 *    연산자    제어문
 *    
 *    1. 묶음
 *       변수 여러개를 묶어서 관리
 *       변수 여러개 => 제어문 사용이 어렵다  
 *       변수가 여러개 일 때에는 평문을 사용한다 --> 단점=> 소스량이 많아진다
 *       그렇다면 배열을 사용한다
 *       배열 => 이름이 1개 구분자는 인덱스 (0번부터 순차적)
 *       **배열은 변수가 3개 이상일때 잡는다**
 *           **3개일때도 사용 용도가 같을 경우
 *                학생1 의     << 0  학생2..학생100
 *           나이 , 학변 , 학년  << x
 *   ====> 다음주
 *         명령문 묶기 , 메서드는 무엇인가
 *         한개에 대한 정보 묶기
 *         클래스
 *         --------------- + 프로그램 1개 완성
 *         2장  연산자 정리 
 *         --------
 *         종류 
 *         단항 연산자                                 연산 방향 (==>) 1 순위
 *             [] , () 최우선순위 연산자                   
 *             ++ , -- (전치연산)                           <==     2순위
 *             ++ , -- (후치연산)                           <==     3순위
 *             ----------------------- ! , (type)
 *             예) 
 *               (int)(Math.random()*10)
 *                  <<============ 연산 방향
 *                       
 *              **(type) 형변환 연산자
 *              ------------------
 *              숫자와 관련 / 클래스
 *              = UpCasting => 데이터형을 크게 만든다
 *                  정수 => 실수
 *                  문자 => 정수
 *              = DownCasting => 데이터형을 낮게 만든다
 *                  실수 => 정수
 *                  정수 => 문자
 *               크기 순서
 *               ------
 *                          ============> UpCasting
 *                   byte < char < int < long < float < double
 *                          <=========== DounCasting
 *              ** 자동으로 변경 (자동 형변환)
 *                 대입 / 연산
 *                 int a='A'
 *                       --- 65
 *                       
 *                 double d=10
 *                        -----
 *                         10.0
 *                       d=10.0 
 *                -------------
 *                변경되는 조건
 *                데이터형 변수명 = 값 
 *                -----         --
 *                   값보다 큰 데이터형이어야 변경
 *                 왼쪽이 큰 경우에는 자동으로 변환
 *                 왼쪽이 작은 경우에는 강제로 변환
 *              ** 필요에 의해 강제 변경 (강제로 형변환)
 *              int a = 10.5
 *              --- -   ---int<10.5 => 오류 
 *              int < (int) double
 *                  ***예외
 *               char c=65; => char은 예외
 *              ** 연산처리
 *              1) char는 자동으로 int로 변경 
 *              2) 연산처리시에는 큰 데이터형으로 변경 => 연산처리 ( 같은 데이터형이어야 한다)
 *                 *** int이하 데이터형은 연산시에 int값의 결과가 나온다
 *                 char + char = int
 *                 byte + byte = int
 *                 
 *                 byte b1=100;
 *                 byte b2=30;
 *                 byte b3=b1 + b2; ==> 오류
 *                 ---- int
 *                 
                       
 *         이항 연산자
 *             산술연산자 * , / , % ,      
 *                                    왼쪽 => 오른쪽
 *                       + , -      
 *                           
 *                    **) ' + ' 는
 *                        산술 외의 문자열 결합 연산자
 *                        "7"+7 => "77"
 *                        7+"7" => "77"
 *                        But---------------JavaScript = 14
 *                    **) ' / ' 는
 *                        0으로 나눌 수 없다
 *             
 *             비교연산자 : < , > , <= , >= , == , !=   
 *                      ---------------------------
 *                      숫자 , 문자 , 논리 => 기본형 비교
 *                      equals , instanceof
 *                      문자열       클래스
 *                      => 모든 결과값은 true/false
 *             논리연산자 :
 *                       &&            ||   => 결과값 true / false
 *                     범위에 포함      범위를 벗어났을때
 *                   조건 2개가 동시에   조건 2개중 1개라도 
 *                 true일 때만 true   true 일 때 true
 *                                                        
 *         삼항 연산자
 *               조건? 값1 : 값2    =====> if~else 로 많이 쓰임
 *               => 웹 / 게임 => 복잡도를 줄이기 위해 주로 사용
 *                 -- 단점 : Java + CSS + JavaScript + HTML
 *                 
 *              예)
 *                  login?"logout":"login"
 *                                              4줄짜리를 한 줄에 줄일수 있는 장점
 *              예)                                    
 *                  if(login)
 *                     로그아웃
 *                  else 
 *                     로그인
 *               
 *               
 *         대입 연산자 : = , += , -=    <===== 연산 방향
 *              예)
 *                 int a = 10;     -> a라는 변수에 10을 대입한다 (x)
 *                                 -> 10을 a라는 변수에 대입한다 (O)
 *              예)
 *                 int a = 10;
 *                 int b = 20;
 *                 int c = a + b;
 *                         -----
 *                          1번
 *                       - 
 *                       2번          ===> 대입연산자는 가장 마지막에 처리되는 연산자 이다     
 *                =====> 살술연산자 ===> 대입연산자
 *                =====> 제어문 : 비교연산자 , 증감연산자      
 *                              -------------------
 *                              조건문 : 비교 , 논리
 *   ---------------------------------------------------------------------------자바 연산자
 *   3장 제어문 : 프로그램을 제어
 *             = 반복수행
 *               for : 반복횟수가 있는경우 => 2차 for
 *               while : 반복횟수를 모르는 경우
 *               do while : 반복횟수를 모르는 경우 => 반드시 한번 이상 수행
 *             = 건너뛴다 : 단일 조건문
 *             = 선택한 내용만 처리 : 다중 조건문 , 선택문
 *             = 오류처리 : 조건문  ===> 처리를 못하는 경우에 예외처리
 *             throws / try~catch  => 반드시 예외처리 => file관련 , 네트워크 관련들은 예외처리를 해줘야함
 *                                   ------------ 8장
 *                                    2장 ~ 8장 => 기본문법
 *                                    9장 ~ 14장 => 라이브러리
 *                                    다른 프로그램 연결 : 네트워크 , SQL
 *            = 반복문에 제어
 *              종료 :  break; => 반복문 , 선택문 에서만 사용이 가능
 *              제외 : continue => 반복문에서만 사용이 가능 
 *       ------------------------------------------------------------
 *       => 조건문
 *       => 1. 단일 조건문
 *       1) 제어문 형식
 *           if(조건) 조건이 true 일 경우에 실행
 *           {
 *               조건이 true 일때만 수행 서술
 *               false면 => 건너뛴다
 *           }
 *       2) 동작 순서
 *           => 조건이 맞는 경우에만 실행
 *       3) 사용위치
 *           => 오류처리 => 사용자 입력값을 받은 경우에 주로 처리
 *       4) 조건 설정
 *           => 비교연산자 / 논리연산자
 *                       -------- 범위를 지정할 경우
 *         **if를 여러개 사용하면 독립적이기 때문에 모든 조건을 검색 => 속도가 느려질 수 있다
 *         **여러 문장을 동시에 수행이 가능
 *                               
 *           if~else => 선택조건문
 *           true / false에 해당되는 소스 코딩
 *           if(조건문)
 *           {
 *           	조건 true일때 처리
 *           }     
 *           else
 *           {
 *           	조건 false일때 처리
 *           }
 *           
 *           ==>> 한줄로 만들경우 : 삼항연산자
 *                                -> combobox , 페이지 지정 ...
 *           ==>> 두개로 나눠져 있는 경우
 *                로그인 / 아이디 중복 /외원가입여부 / 검색어 입력 여부... 
 *                웹=> 무조건 동작해야함
 *        
 *        다중 조건문 => 해당 조건문장만 수행 => 키보드 입력 (게임) , 메뉴선택시
 *        if(조건문)
 *        {
 *        	조건문 true => 수행 종료
 *        }  | false => 다음
 *        else if(조건문)
 *        {
 *        	조건문 true => 수행 종료
 *        }  | false => 다음
 *        else if(조건문)
 *        {
 *          조건문 true => 수행종료
 *        } | false => 다음
 *        else 
 *        {
 *          해당 조건이 없는경우에 처리 (생략이 가능하다 (꼭 else 를 사용할 필요는 없음))
 *        }
 *        -----------------------------------------------------------다중 조건문을 단순화 => 선택문
 *        
 *        ==> 처리문장이 같은 경우
 *        switch(정수,문자,문자열 만 입력가능)
 *        {
 *           case 1:
 *             처리문장
 *             break;
 *           case 2:    (2번과 3번의 처리문장이 같을때 이렇게 사용도 가능)
 *           case 3:	if(num==2 || num3)
 *             처리문장
 *             break;
 *              . . . 
 *           default: ( 생략이 가능)
 *        }
 *        
 *        => 웹에서 사용 빈도가 작다 => 네트워크의 경우수 , 게임
 *        
 *        
 */
public class 중첩_for_6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 컴퓨터가 난수 발생. 1~9 사이 중복이 없는 숫자 3개
		int[] com=new int[3];
		for(int i=0; i<com.length; i++) // 3번 반복
		{
			com[i]=(int)(Math.random()*9)+1;// 1~9 까지 숫자 확인
//		    중복 여부 확인
			for(int j=0; j<i; j++)// 생성된 난수 만큼만 비교
			{
				if(com[i]==com[j]) //같은수가 있는지 확인  -> 비교연산 / 논리연산 만 들어간다
				{
					i--;   // 다시 난수를 발생한다
					break; // j가 있는 for만 종료 ==> i++로 이동한다 
				}
			}
		}
//		System.out.println(Arrays.toString(com)); //확인용 이걸 알고있으면 게임이 안됨
		// 사용자가 입력한 데이터 저장
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
	
//		2. 사용자의 입력 요청.
		while(true) // 정해진 반복 횟수가 없다(무한루프) 정답시에 종료
		{
			System.out.print("세자리 정수를 입력하세요 >> ");
			int input=scan.nextInt();
//			오류처리 => 세자리 정수가 입력이 안된경우
			if(input<100 || input>999)
			{
				System.out.println("알림☞ 세자리 정수만 입력해야 합니다!");
//				while문에 처음으로 이동시켜야함
				continue; 
				/*
				 * continue 는
				 * while 일때 조건식으로 이동
				 * for 일때 증감식으로 이동
				 * 
				 * while(조건식)<-----        => 처음으로 다시시작
				 * {               |        
				 *     continue; ---
				 * }
				 *                   |---- 
				 * for(초기값; 조건식; 증감식) |  => 제외시킬때 주로 사용
				 * {	                 |
				 * 	   continue; ---------
				 * }
				 * 
				 * break; 는 while 이나 for 상관 없이 반복문을 중단시킴
				 */
			}
//			 세자리 정수를 입력한 경우
			user[0]=input/100;
			user[1]=input%100/10;
			user[2]=input%10;
			
//			오류처리 ==> 2개
//			1. 같은 수인 경우 x
			if(user[0]==user[1] ||
			   user[1]==user[2] ||
			   user[0]==user[2]  )
			{
				System.out.println("알림☞ 중복된 수는 사용할 수 없습니다 ");
				continue;
			}
				
//			2. 0을 입력하면 안된다
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("알림☞ 0을 입력할수 없습니다 ");
			}
//			3. 사용자와 컴퓨터 값 비교 => 힌트
		int S=0, B=0; // s는 숫자와 자리수가 맞는경우 ,
					  // b는 숫자는 있고 자리수가 맞지 않은 경우
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++) //같은 수가 존재하는지 확인
			{
				if(com[i]==user[j])
				{	
					if(i==j)
						S++; //같은 자리면
					else //다른자리면	
						B++;
				}		
			}
			//힌트 제공
		
		}
		System.out.printf("Input Nimber: %d Resurt : %ds - %db\n",
							input,S,B);
//		4. 정답 여부 확인 => 정답이면 종료 / 오답이면 => 다시 입력이 가능
//		                   break;          continue;
		if(S==3)
		{
			System.out.println("!! Home Run !!");
			break;
		}
			
		}
	
				
	}
	

}
