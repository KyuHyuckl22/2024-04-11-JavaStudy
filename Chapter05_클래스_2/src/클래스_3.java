/*
 *     변수 => 초기화 (프로그램에 필요한 데이터 값을 저장)
 *     | 필요한 값을 지정
 *     -------------------- 선언
 *     | 파일 읽기
 *     | 웹 읽기 (크롤링)
 *     | 메소드를 이용하는 방법
 *     | 입력값을 받아서 처리
 *     -------------------- 구현
 *                          --- 클래스 {} 안에서는 사용이 불가능
 *                          | 초기화 블록 / 생성자
 *     = 선언과 동시에 값을 지정                     
 *     = 모든 클래스에는 생성자가 반드시 1개 이상이 존재한다
 *     = 생성자가 없는 경우에는 컴파일시에 자동으로 1개를 추가한다
 *     
 *   *** 자바 프로그램에서 자동으로 추가되는 내용
 *     1. import java.lang.*;
 *               ----------
 *               String, Math, System  사용시 자동으로 추가가되게 만들어놓음
 *     2. extends Object : 모든 클래스는 Object 상속을 받고있다
 *     3. 메소드 => void => return 생략
 *     4. 모든 클래스 생성자가 없는경우 => 자동 추가
 */
class Student{
//	 변수
	String name= "홍길동";
	int hakbun= 1;
	String school_name="SIST";
	String subject= "컴퓨터";
	int year= 2;
	
/*
 *   자동 초기화
 *   int => 0
 *   double => 0.0
 *   String => null
 *   boolean => false	
 */
}
public class 클래스_3 {
//	int a;   이것은 오류
//	a=100;   값을 나중에 대입했기 때문

	//	int a=100; 이건 가능
	
//	int a; {   이건 초기화 블록을 이용해서 가능
//		 a=100; 
//	}
	
	public static void main(String[] args) {
//		++++++++++++++++++  홍 심 박 들이 변수를 제어하는 객체가 된것이다   ++++++++++++++++++++++++
//		1번째 학생 생성
//		hong 메모리주소 => name, subject, school_name, year, hakbun ==>  .을 이용해서 접근
		Student hong=new Student();
//		                  생성자 => 리턴형이 없다 / 클래스명과 도잉ㄹ => 외부에서 데이터 읽어서 변수에 대입
//		                  사용자로부터 입력값을 받아서 초기화
//		                  시작과 동시에 연결 => 서버 구동, 화면 UI, 데이터베이스 연동
//		                  생략이 가능. 생략시 자동으로 컴파일러가 추가
		System.out.println("이름: "+hong.name);
		System.out.println("학년: "+hong.year);
		System.out.println("학과: "+hong.subject);
		
//		2번째 학생 생성
		Student sim= new Student();
//		변경
		sim.name="심청이";
		sim.year= 3;
		sim.subject= "java";
		System.out.println("이름: "+sim.name);
		System.out.println("학년: "+sim.year);
		System.out.println("학과: "+sim.subject);
//		3번째 학생 생성 => park => 박문수 , 1 , 파이썬
		Student park= new Student();
		park.name="박문수";
		park.year= 1;
		park.subject= "파이썬";
		System.out.println("이름: "+park.name);
		System.out.println("학년: "+park.year);
		System.out.println("학과: "+park.subject);
		
	}

}
