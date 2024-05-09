/*
 *   데이터를 묶어서 사용 => 1개 이름으로 여러개의 변수에 접근 (여러개는 제어가 어렵기 때문에 한개로 통합시켜야한다)
 *                                              --------------------------------------통합 시키는 방법
 *                                              배열: 같은 데이터형 크기를 이용한다 => 고정적이다
 *                                              클래스: 다른 데이터형을 모아서 관리 => 가변적이다
 *   자바는 클래스로 시작 클래스로 종료
 *   
 *   클래스 구성요소
 *   => 사용은   데이터형 / 연산자 / 제어문 / 메소드
 *             --------------------------- 필요한 경우에는 라이브러리 사용
 *             1장: 자바 설치, 특징
 *             2장: 변수 / 데이터형
 *             3장: 연산자
 *             4장: 제어문 / 배열
 *             5장: 클래스***
 *             6장: 객체지향의 특성
 *             7장: 클래스의 종류
 *             8장: 예외처리  
 *             9장 ~ 11장: 라이브러리 (암기)
 *             12장: 핵심 -> 오라클 연동   
 *      2장 ~ 8장, 12장이 Java의 핵심
 *      
 *             프로그램
 *             -----
 *             네트워크 ==>C/C++
 *             데이터베이스 ==> Java => 웹
 *   
 *   메모리 구조
 *   --------------------------------------  
 *      메소드 영역
 *      -------
 *      1. 메소드
 *      2. static 변수
 *   --------------------------------------  
 *      스택
 *      ---
 *      1. 지역변수
 *      2. 매개변수 ---->{} 가 종료되면 자동으로 메모리에서 회수
 *   --------------------------------------  
 *      힙 => 프로그래머가 관리 => GC(실제 데이터가 저장되는 영역)
 *      --                       ------------------ 프로그램이 종료될때까지 유지
 *        1. 배열
 *        2. 맴버변수
 *   --------------------------------------  
 *      변수 
 *         지역변수 / 매개변수 => 메모리에 저장 (메소드 호출)
 *                           사용 범위는 메소드 안에서만 사용이 가능
 *                           지역변수: 요청처리를 위한 변수
 *                           매개변수: 사용자 요청값이 있는 경우 
 *                        => 저장되는 위치: 스택
 *         멤버변수 => 메모리에 저장 시점 => new 를 이용할때 따로 생성(10개의 new를 사용하면 10개의 공간이 생긴다)
 *                                => 사용 범위는 클래스 전체 / 다른 클래스 에서도 사용이 가능
 *         공유변수 => 메모리 저장시점 => 컴파일시에 한개의 메모리 공간이 생성, 공유한다
 *                                => 사용 범위는 클래스 전체 / 다른 클래스에서도 사용이 가능
 *         class A
 *         {
 *              int a;
 *              int c; 
 *              ---------> 저장이 안된 상태
 *              static int b; => 저장이 된상태
 *         }
 *         a 와 c 를 저장하기 위해선"  A aa=new A();  " => 저장되는 시점 
 *         
 *         Stack             Heap
 *         --aa--           
 *          0x100 \
 *         ------  메모리 주소          -----  메모리 주소를 만들어 주는 'new' --> 동적 메모리 할당 (실행시마다 메모리 생성)=> 변수를 묶어주는 역할
 *                 0x100             -----         값을 사용할때
 *                                     0  --> a     aa.a \
 *                                   -----                 aa에 있는 a,c 를 불러와라
 *                                     0  --> c     aa.c /
 *                                   -----          ( '.' -> 메모리 주소 접근 연산자)
 *                                  ** aa는 메모리 주소에 연결된 변수만 사용이 가능
 *   
 *                                     
 *   A bb=new A();    (new 를 사용할때마다 메모리 할당이 달라진다)
 *                    (aa와 bb의 메모리 주소가 다른 이유)
 *   --bb--
 *   
 *   ------        0x200      --------
 *                             ------
 *                               0  --> a \                                     
 *                             ------      bb.a , bb.c
 *                               0  --> c /                               
 *                             ------
 *                                               
 *                                                                 
 *   static => 
 *   
 *   ---b---
 *      0    ==> aa.b , bb.b , cc.b , A.b ==> 공유가 가능하다
 *   -------
 *   지역변수 \
 *   멤버변수 --> 사용이 거의 대부분
 *   매개변수 /
 *   
 *   지역변수, 매개변수 특징 => 프로그램 종료시까지 메모리 유지 / 따로 저장이 되기때문에 관리가 편함
 *                       다른 데이터형 여러개를 묶어서 사용이 가능
 *                    ** 프로그램은 결국 데이터 관리이다
 *                       React / Vue / Next => 데이터 관리 프로그램      
 *                                             ----- AI / 머신러닝 , 딥러닝 
 *   변수
 *   --- 초기화
 *   멤버변수 / 공유변수 => 기본 초기화
 *     int = 0 , boolean = false, double = 0.0, String = null
 *   멤버변수 
 *   공유변수
 *   ------- 명시적인 초기화
 *   ------- 자동 초기화
 *   ------- 메모리에 저장시 초기화
 *   
 *   class A 
 *   {
 *      int b; => 0
 *      int a=100; ---> 값을 직접 집어넣는 명시적인 초기화
 *      static int c;
 *      static int d=100;
 *      => 자동 초기화 (호출없이)
 *      {  
 *          => 초기화 블록
 *          a=1000; 
 *      }
 *      static  -> 공유변수 초기화
 *      {
 *         d==1000;
 *      }
 *   }
 *   - {}      --> 멤버변수 초기화 
 *   - static  --> 공유변수 초기화
 *     {
 *     
 *     }
 *   -------------------------------- 
 *   class A 
 *     {
 *        int a; => 선언만 가능
 *                  구현이 불가능
 *                  제어문 / 연산처리 / 라이브러리 / 메모리 호출(메서드호출) => (X) 
 *     }
 *   --------------------------------
 *   지역변수 => 반드시 초기화            
 *   --------------------------------  
 *      생성자 / 초기화          
 *   --------------------------------  
 *      메소드 : 저장된 변수 활용
 *      --------기능
 *      => 리턴형 / 매개변수 -->사용자가 요청한 값 (웹에서 주로 사용) ex) 검색어, 로그인, 회원가입, 글쓰기, 수정하기 ...
 *          |
 *         요청처리에 대한 결과값      
 *   -------------------------------- 
 *             
 *   클래스 => 재사용 목적 (부품) => 컴포넌트
 *    |
 *    1. 데이터 보호 (노출x) => 캡슐화/은닉화
 *    2. 재사용 => 상속 / 포함
 *             is-a     has-a
 *    3. 유지보수 => 수정, 추가
 *            오버라이딩, 오버로딩 => 다형성
 *    -------------------------------6장(면접 단골질문)
 *    *** 라이브러리를 사용
 *        ------------ 미국 (정보제공)  우리나라: 시각적 효과
 *            | 프로그램에 맞게 변경 사용 => 오버라이딩
 *            | Math.random()  => 형변환
 *            | substring(int s, int e)
 *                              ------- e-1 부터 시작함
 *            | Spring: 로드존슨이 만든 => 전자정부 프레임워크
 *    ---------------------------------------------
 *    변수 => 멤버변수
 *   
 */
public class 클래스변수 {
  //이 부분은
  // 변수 선언 , 메소드 선언만 가능
	public static void main(String[] args) {

	}

}
