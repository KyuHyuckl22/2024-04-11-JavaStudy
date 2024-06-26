/* 		꼭 기억하기!!
 * 		
 * 		1.변수/상수
 * 		  변수는 한개의 데이터를 저장하는 메모리 공간의 이름 => 변경할 수 있다 O
 * 		  => 외부 => 계속 변경되는 데이터를 찾는다
 * 		  상수는 한개의 데이터를 저장하는 메모리 공간의 이름 => 병경할 수 없음 X
 *		  final 데이터형   변수 = 값 => 모든 상수명은 대문자로 되어있다.
 *		  
 *		2. 변수 / 상수 선언
 *			=> 데이터형 변수명;	
 *			=> final 데이터형 상수명; => 오류발생
 *			=> final 데이터형 상수명 =값;  바로 값을 설정해줘야함
 *		3. 데이터형 (기본형) => 저장범위 , 메모리 크기 (1,2,4,8 byte)
 *  	   ----------------------------------------
 *  		정수형 byte : 1 byte => -128 ~ 127 => 네트워크 전송시에 주로 사용 (업로드 , 다운로드)
 *  			 int  : 4 byte => -12억4천 ~ 21억4천 => 모든 정수는 컴퓨터에서 int로 인식 가장 많이 사용되는 정수형
 *  								(웹 에서 숫자가 나오면 대부분 int형) ex) 회원 / 게시판
 *																	  |       | 
 *  														  나이 int age   게시물 번호 int bno , 
 *  																		조회수 int hit
 *  			 long :	8 byte => 최근 많이 사용하기 시작함 Why?=> 빅 데이터 => Ai 
 *  	   ----------------------------------------
 *  		실수형 double : 8 byte => 평균 ...
 *  					   			실수형의 default => 실수가 나오면 컴퓨터에서는 double 로 인식함
 *  								=> 평균치 , 평점 등 (%.2F)
 *  	   ----------------------------------------
 *  		문자형 char : 2 byte => (0~65535) 각국의 언어 사용이 가능 , 문자 한개 저장 => '' 에 저장해야함 
 *  							  ** 연산시에는 정수로 변경이 된다
 *  								 연산처리가 될때 연산은 같은 데이터형끼리만 연산이 된다
 *  							  10 + 10.5 
 *  							 -----------
 *  							 10.0 + 10.5   int 가 double 로 바뀌고 시작함 (큰 데이터로 맞춰놓은 후 계산)
 *  							 'A' + 1
 *  							 ---
 *  						  	 65 + 1 = 66
 *  	   ----------------------------------------
 *  		논리형 boolean : 1 byte => (1 : true , 0 : false) => true/false
 *  								 => 조건이 있는 경우
 *  								 => boolean bCheck=fales;
 *  	   ----------------------------------------
 *          선언 방법 => 초기화
 *          byte b = 10;
 *          
 *          byte b;
 *          b=10;
 *   		-----------------
 *    		int i=10;    => 선언 + 초기값   // 값을 알아서 바로 만들 수 있을때.
 *      
 *          int i;       => 선언    // 사용자로부터 입력값을 받는 경우 
 *          i = 10; 	 => 초기값   // 우리는 어떤 값이 들어갈 지 모를때
 *          
 *          
 *          여러개가 있는 경우
 *          int a; 
 *          int b; 
 *          int c;
 *          ------> int a,b,c; 
 *          
 *          여러개의 변수에 초기화
 *          int a=10;
 *          int b=10;
 *          int c=20;
 *          
 *          int a=10, b=10 , c=20; 같은 데이터형일 경우에만
 *          =========================================
 *          데이터형 변수명 = 값
 *          			 -- 초기화
 *          변수의 명칭
 *          --------
 *          1) 알파벳, 한글로 시작한다 (알파벳은 대소문자 구분)
 *          2) 숫자를 사용할 수 있다 (맨 앞에 사용 X)
 *          3) 키워드는 사용할 수 없다 (int , long ...)
 *          4) 특수문자 사용 (_ , $)
 *          5) 공백은 허용하지 않는다
 *          
 *          데이터 크기
 *          byte < char < int < long < double
 *          boolean 은 크기에 제외
 *          
 *          데이터의 교환은 반드시 임시변수 설정
 *          int a=10;
 *          int b=20;
 *          int temp=a;
 *          a=b;
 *          b=temp
 *          -------------------------------------------
 *          
 *          
 *          **** 변수에 값을 대입할때는
 *          byte b = 값(byte)
 *          char c = 값(char, int)
 *          int i = 값(byte, char , int )
 *          long l = 값(byte, char, int, long)
 *          double d = 값(byte, char, int, long, double
 *          --------------------------------------------
 *           작은 데이터형을 대입을 하면 자동으로 변경
 *           
 *           char c = 65; => c = 'A'
 *           int a ='A' => a = 65
 *           long a = 10 => a = 10F
 *           double a = 'A' => a = 65.0
 *           -------------------------------------------> 2장 37page
 *           
 *          
 *          
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		System.out.println(Byte.MAX_VALUE);
//		int a = 'A';
//		System.out.println(a);
//                                 |		
//								전부다 대문자로 되어있는 상수
//								   |
		System.out.println(Byte.MIN_VALUE);
		
	}

}
