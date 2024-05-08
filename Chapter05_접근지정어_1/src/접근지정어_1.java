/*  공부를 해야하는부분들 
 *  객체지향 프로그램 => 자바 (CBD)  => 데이터관리 
 *                               -------
 *  1. 클래스             => 이미 필요한 기능은 다 만들어져 있다 => 이걸 조립해서 만드는 프로그램(레고)
 *     = 변수 설정 (어떤 데이터가 필요한지) : 캡슐화 (데이터 보호) => getter / setter
 *       ------
 *        기본형 => 정수, 실수, 논리, 문자
 *        배열 
 *        클래스 => 포함 클래스 : String
 *        1) 요구사항
 *         => 데이터 선언 => 데이터 수집 => 데이터 분석 => 데이터 분리 => 데이터 예측
 *            ---------------------------------------------------------- 이 과정을 머신러닝 / 딥러닝 이라고 한다
 *                                                                               -----------                 
 *                                                                               | 예측 => 프로그램 제작 (AI)
 *        2) 기능 설정 : 목록 / 상세 / 예약 / 결제 ... 모아둔것을 메소드
 *           ----------------------------------------------
 *           변수 + 메소드 => 한개의 기능 => 설계 하는것을 (클래스) 라고한다  => 활용 => 객체
 *                  | 사용자의 요청에 의해 기능이 변경될 수 있음 => 오버라이딩
 *           ---------> 객체에 의해 관리
 *           
 *     = 변수에 초기값 : 생성자  => 서버 / 데이터베이스 (미리 연결)
 *     = 변수를 활용 : 메소드  => 기능 (수정, 추가) => 다형성 (오버로딩 / 오버라이딩)
 *  2. 접근지정어 => public / private / protected / default (접근 범위 지정)  127p  
 *  3. 상속 / 포함 => 재사용기법
 *                 있는 그대로 사용 : 포함 => Spring => POJO방식 
 *                 변경해서 사용 : 상속 => Window, 네트워크, 쓰레드 
 *    ------------------------------- 객체지향의 3대 특성 (캡슐화, 상속, 다형성)  ***면접의 단골코스 
 *  4. 클래스 종류
 *     = 일반 클래스  8888  중요
 *     = 추상 클래스
 *     = 인터페이스  8888  중요
 *     = 내부 클래스
 *       - 멤버 클래스  8888  중요
 *       - 익명의 클래스  8888 중요
 *       - 지역클래스
 *     = 종단 클래스
 *  5. 조립법
 *     = 패키지 => 관련 클래스끼리 모아서 관리 : import
 *       ----- 폴더에 저장 java, javax
 *       
 *  6. 예외처리 : 프로그램의 비정상 종료 방지, 사전 에러를 방지 하는것
 *                                  -----------------
 *                                  파일 : 경로명, 파일명
 *                                  네트워크 : URL / Server IP
 *                                          ---- Jsoup
 *                         
 *  ----------------------기본문법 (8장)  여기까지 할수 있어야 프로그램 개발을 할 수 있다
 *  7. 라이브러리 (자바), 외부에서 지원(Jsoup, lombok)
 *                    -----------------------
 *                    mvnrepository.com
 *                                                                      J2SE 
 *                                                                      일반 자바
 *  ------------------------------------------------------------------- 
 *                    
 *  J2EE : 웹 개발시 사용하는 라이브러리  ==> JSP / Srvlet (기업용 환경)
 *  ----------------------------------------------------------- maven, sptring-boot
 *  => 기본 이론, 구현 => 웹 (구현) 
 *     ------- 면접
 *  
 *  1) 클래스의 구조 (설계)
 *     class ClassName
 *     {
 *     ---------------------
 *       데이터 선언
 *       => 멤버변수
 *          = 인스턴스 변수 : new 사용시마다 메모리가 따로 생성 여러개 저장이 가능
 *          = 정적 변수 : static => 메모리 공간을 1개만 사용
 *          = 변수 : 메모리에 저장 / 메모리에 읽기
 *                 ---------   ---------- 메소드화
 *                 setter       getter
 *            *** static을 제외한 모든 변수는 은닉화 (데이터 보호) => 캡슐화
 *                                                         ---- 필요시에는 사용이 가능
 *                => 시큐어 코딩 : 3000만원의 벌금
 *             = 다른 클래스와 연결해서 사용이 가능하게 만든다
 *             = 객체 ==객체 => 상호 연결해서 사용
 *               ---------
 *               Ex) 
 *                  사람 --> 자판기
 *                   동전투입 -> 음료수 선택 -> 잔돈 => 접근지정어
 *                  사람 --> 컴퓨터 => 메소드 (명령어)
 *                  사용자 --> 게임
 *                  사용자 --> 웹 사이트
 *                  요청      응답
 *                  
 *                  프로그램을 짤때 항상 
 *                  행위자 를 잡는게 중요하다    
 *                  
 *     Back-End (자바, JSP, Spring, 오라클) => 권장  : 데이터 관리
 *     
 *     Front-End (JavaScript) => Ajax, Next, Vue, React  => 객체지향 프로그램 : 화면출력
 *     HTML : 사용자 정의(x) / CSS (속성) => 암기
 *     ---------------------
 *      데이터 초기화 => 클래스 영역 안에는 선언만 가능 => 구현(파일 읽기, 화면UI, 웹 연결, 연산처리, 제어문)
 *           생성자  === 모든 클래스에서 반드시 한개 이상을 포함한다
 *                   => 생략할 경우에는 컴파일러가 자동으로 생성 : default 생성자
 *                   => default 생성자는 매개변수가 없는 생성자 default
 *                   class A
 *                   {
 *                       A(){} ==> default 생성자 => 없는 경우에 자동추가
 *                       A(int a) {}
 *                       A(int a, int b) {}
 *                   }
 *                   
 *             = 리턴형이 없다
 *             = 클래스명과 동일
 *             = 여러개를 사용이 가능 => 오버로딩
 *             = 객체 생성시 반드시 호출
 *             = 시작과 동시에 처리해야하는 기능이 있는 경우 => 화면UI
 *           초기화 블록 => 인스턴스 변수 => 자동으로 처리 (호출 안한다)
 *           {
 *           	구현이 가능
 *              => 자동 로그인, Cookie, Session에 등록, 데이터 베이스연동
 *           }
 *           
 *           정적 블록
 *           static
 *           {
 *               static 변수의 초기화
 *           }
 *     ---------------------
 *        메소드 : 요청처리 => 응답 => 웹 (메뉴) => 버튼, 마우스 클릭
 *     ---------------------
 *     }
 *     ================ 설계 => 메모리에 저장
 *  2) 객체 생성 
 *     클래스명 변수명(객체) = new 클래스명 ()
 *                           --------- 저장공간을 만들어 주면 => 초기화를 대입하는 역할
 *                       --- 클래스 크기만큼 메모리 확보 => 저장할 공간을 만들어준다
 *           --------- 변수, 메소드 => 동시에 관리 => 객체
 *  3) 객체 활용
 *     객체명.변수명, 객체명.메소드명()  ==> . (연결된 주소에 접속하는 연산자)
 *  4) 객체 소멸
 *     객체명=null  => 연결되는 주소를 지워준다 (사용x) => 가비지컬렉션 대상 (쓰레기 컬렉션)
 *                                              ----------- 주소가 null인경우, 사용하지 않는경우
 *                                               ---------- 메모리를 자동으로 회수
 *   => 공장 ==> 컴퓨터 (임대)
 *               |
 *              책상 위에 올려줌 => new
 *               | 
 *              코드 연결 => 작동하게 만든다 ==> 생성자 -> 바로 사용이 가능하게 만든다
 *              
 *              데이터를 저장할 메모리를 만들고 초기값 설정=> 바로 사용이 가능하게 만든다
 *              ------------------------------------------------------
 *              자바 번역)
 *                      new 클래스명()
 *              여러개의 데이터 / 여러개의 메소드가 존재
 *              -----------------------------   . 접근
 *    
 *   => 자바 프로그램의 순서
 *      관련된 클래스를 모아준다 : (패키지) 라고부름
 *      ---------------------------------client / server => user / admin
 *      => 입출력 => java.io, javax.swing, java.util
 *      package 경로명; 한번만 사용이 가능
 *      필요한 클래스를 가지고 온다 : 사용자 정의, 라이브러리
 *      import ...: 여러개 사용이 가능
 *      
 *      class ClassName
 *      {
 *      
 *      }
 *      패키지가 만들어진 경우
 *      ---------------
 *      연결 (조립) => 접근의 문제
 *      ---------------------------------접근 지정어
 *      -------------------------------------------------------------------------------------------------------
 *                     자신의 클래스             같은 패키지         같은 패키지+상속(다른패키지)           모든 클래스
 *      -------------------------------------------------------------------------------------------------------
 * ★★★★★ private           o                                                                    => 본인
 *                      멤버변수
 *      -------------------------------------------------------------------------------------------------------
 * ★★★★★ default           o                    o
 *      -------------------------------------------------------------------------------------------------------
 *        protected         o                    o                    o
 *      -------------------------------------------------------------------------------------------------------
 * ★★★★★ public            o                    o                     o                         o   (오픈)=> 공개
 *                     클래스 / 메소드 / 생성자 => 다른 클래스와 연결
 *      -------------------------------------------------------------------------------------------------------
 *       클래스 : public으로 선언
 *       메소드 : 다른 클래스와 통신 => public
 *       변수 : 다른 클래스에 사용이 안되게 만든다 => private => 은닉화
 *             -------- 사용할 수도 있다 => getter / setter
 *       생성자 : 다른 클래스에서 메모리 할당 => public
 *       -------------------
 *       
 *       접근 범위의 크기
 *       private < default < protected < public
 *       
 *       1. 자바 프로그램은 모아서 관리
 *       -----------------------
 *          1) 변수
 *          2) 연산자
 *          3) 제어문
 *          -----------문법사항
 *          
 *          묶음 => 한개의 이름으로 제어
 *          1) 변수 => 여러개 (변수가 여러개 있는경우 => 제어하기가 어려움)
 *                   => 한개의 이름으로 제어가 가능하게 만든다
 *                   => 배열 => 이름은 1개 인덱스
 *                      단점) 고정적, 연속적으로 메모리를 설정 => 같은크기(데이터형)만 모아서 관리
 *                   => 보완 => 클래스 (.) => 다른 데이터형을 모아서 관리 (제한이없다)
 *          2) 명령문 => 연산자 / 제어문 => 단점 (중복, 다시 처음으로 돌아갈 수 없다)
 *                     ---------------------------------------------
 *                     묶어서 사용 => 메소드
 *          --------------------------------------------------- + 클래스
 *            클래스
 *              => 변수만 묶어서 사용 : 사용자 정의 데이터형
 *              => 관련된 메소드만 묶어서 사용 : 액션 클래스
 *              => 변수 + 메소드 = 혼합
 *            클래스 => 기능별로 다시 묶어서 사용
 *                   -----
 *                   게시판 / 회원가입 / 맛집 / 여행 ... 패키지                    
 *                                                ----
 *                                                | 교보서적
 *                                                | 헌책방
 *          
 *          
 *          
 */                 

class Sawon { // private 을 사용하면 Sawon class 안에서만 사용이 가능 이것이 캡슐화
//	main class 에서 사용 하기 위해서 get / set 을 사용한다
//	우측에 outline 을 확인하면 get set 이 보인다
	private int hakbun;
	private String name;
	private String sex;
//	 읽기 getter / 쓰기 setter 
}
public class 접근지정어_1 {

	public static void main(String[] args) {

	}

}
