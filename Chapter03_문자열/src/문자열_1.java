/*
 *   *****************************X100
 *     => 원본은 변경되지 않는다
 *   문자열 = char[]
 *   -----
 *   String => 문자열을 저장하는 데이터형 / 클래스 (기능 => 메서드를 갖고있다)
 *   ------프로그램에서 가장 많이 사용되는 데이터형
 *   1) 형식
 *       String name="홍길동";
 *       -----  ---- ----
 * 		데이터형   변수명  리터럴
 * 
 *       String name=new String("홍길동"); => 문자열은 저장 갯수에 제한이 없다
 *   2) 연산자
 *     + : 문자열 결합
 *     String name="홍길동";
 *     String etc= "입니다";
 *     => System.out.println(name+etc) => "홍길동입니다"
 *   3) 기능
 *       ***= equals () : 같은 문자열이 있는경우
 *       ***= contains() : 문자열중에 포함 여무
 *       ------------------------ 서제스트 (자동완성기)
 *       ***= startsWith() : 시작하는 문자열이 같은경우 => 검색에 자주 사용
 *       = endsWith() : 끝나는 문자열이 같은경우 => 확장자 찾는경우 자주 사용
 *       -------------------------
 *       = charAt() : 문자열중에 문자 한개 추출 => char
 *       ***= indexOf() : 문자가 몇번째 존재하는지 확인 (앞에서부터)
 *       ***= lastIndexOf() : 문자가 몇번째 존재하는지 확인 (뒤에서부터)
 *          Hello Java => a
 *          	   - -
 *       ***= length() : 문자갯수
 *       = replace() : 문자 변환
 *       ***= substring() : 문자를 자르는 경우에 사용
 *       = toUpperCase() : 대문자변환
 *       = toLowerCase() : 소문자변환
 *       ***= trim() : 공백문자 제거 ( 좌우의 공백)
 *       = split() : 
 *       replasceAll() : 정규표현식(가-힇)을 지정한 문자로 출력
 *       ***valueOf() : 
 *       ------------------------------------반드시 암기
 *       JavaScript => 문자열 기능 동일
 *       
 *       
 */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		String alpha="abcdefg";
		System.out.println("문자 갯수:"+alpha.length());
		System.out.println("대문자 변환"+alpha.toUpperCase());
		alpha="ABCDEFG";
		System.out.println("소문자 변환"+alpha.toLowerCase());
		/*
		 * 	  ABCDEFG  => 문자열은 index번호를 가지고 이다.
		 *    0123456
		 * 
		 */
		System.out.println("문자추출 : 3번째"+alpha.charAt(3));
		
		String myId="admin";
		String myPw="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		System.out.print("비밀번호 입력:");
		String pw=scan.next();
		
		if(id.equals(myId) && pw.equals(myPw))
		{
			System.out.println(id+"님 로그인 되었습니다.");
		}
		else
		{
			System.out.println("아이디나 비밀번호가 틀립니다!");
		}
 	}
}
