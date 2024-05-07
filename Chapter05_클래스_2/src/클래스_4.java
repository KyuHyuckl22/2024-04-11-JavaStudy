/*
 *     초기화 블록 => 자동호출
 *       클래스 블록 안에 {}
 *        
 */
import java.util.*;
class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	String loc;
	int pay;
//	초기화 블록
//	초기화 ==> 파일읽기, 라이브러리, 데이터베이스 연결 => {} 구현
	
	{
		for(int i=0; i<10; i++){
			sabun=i;
		}
//		sabun = 1;
//		name ="홍길동";
//		dept= "개발부";
//		job= "대리";
//		loc= "서울";
//		pay= 3600;
				
	}
//	생성자
/*  특징
 *  	=> 멤버변수의 초기화
 *      => 메모리에 저장시에 호출되는 메소드
 *      => 모든 클래스에 한개이상 존재
 *      => 없는 경우에는 자동으로 추가가 된다
 *      
 *      => 리턴형이 없다
 *      => 클래스명과 동일
 *      => 생성자는 여러개일 수도 있다
 */
	
	void Sawon() { //생성자가 아닌 일반 메소드
		
	}
//	 생성자는 반드시 호출시에 new 생성자() 가 되어야함
//	Scanner scan= new Scanner(System.in);
/*
 *  기본 초기값 = 명시적 초기화 = 초기화 블록 = 생성자
 *             --------------------------- 보통은 생성자를 주로 이용
 *             
 *  class A
 *  {
 *      int a=10;
 *      {
 *          a=100;
 *      }
 *      
 *      A()
 *      {
 *          a=200;
 *      }
 *  }
 *    A aa=new A();
 *    
 *    ----- aa -----
 *        0 x 100
 *    --------------  0x100
 *                         ---------------
 *                         -----  a  -----
 *                           0 => 10 => 100 => 200
 *                         ---------------
 *                         ---------------
 *    관련된 데이터가 여러개 저장시에는 => 메모리 주소를 이용해서 접근한다 ==> 참조변수
 *                                                          ------
 *                                                          배열 / 클래스
 *    일반 1개의 변수만 이용
 *    
 *    ** 객체 지향 프로그램은
 *          여러개의 데이터 + 여러개의 메소드를 한곳에 저장한 후에 동시에 제어
 *          ----------------------- 저장 공간을 객체
 *                                           ---- 한번에 기능을 만들어서 사용
 *                                           1. 재사용이 편하다
 *                                           
 *                                           2. 수정 이나 추가 하기 편리하다
 *                                           3. 데이터를 보호할 수있다
 *       1970년도
 *              	
 *              SW          HW        => SW 언어 / HW언어(저급언어)
 *                                      ------- 고급언어
 *      c언어 : 절차적 언어
 *            => 재사용이 안됨
 *            => 편집기 => 한번 사용하면 저장이 안됨
 *       1980 년도
 *      c++ : 객체지향 프로그램 => 직접회르
 *        | 스투덥 => 몸값을 올리기 위해 이루러
 *        1980년eh IBM => C언어 개발자 양성
 *        2001년 ~ 2024년 자바 개발자 양성
 *                       -------------
 *                       공급 > 수요 => 자바는 가치가 많이 하락
 *                       => 최신에 가장 많이 사용하는 기술
 *                       
 *         
 *             
 */
// 사용자 입력을 받아서 초기화. 파일 릭기
	Sawon() { // 이게 생성자
		Scanner scan=new Scanner(System.in);
		System.out.print("사번 입력: ");
		sabun=scan.nextInt();
		System.out.print("이름 입력: ");
		name=scan.next();
		System.out.print("부서 입력: ");
		dept=scan.next();
	}
}
public class 클래스_4 {

	public static void main(String[] args) {
		Sawon hong=new Sawon(); // 저장하면 메모리공간(sabun,name,dept,job,loc,pay)
		System.out.println("사번: "+hong.sabun);
		System.out.println("이름: "+hong.name);
		System.out.println("부서: "+hong.dept);
	}

}
