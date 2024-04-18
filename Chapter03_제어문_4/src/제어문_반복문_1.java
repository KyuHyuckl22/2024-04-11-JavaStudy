/*
 *  65p
 *  	반복 제어문
 *  	=for		>화면 출력	= 갯수 확정 => 반복 횟수 지정	
 *  		형식)           |true=> 반복수행문장
 *  					   |false => 종료		
 *  
 *  				  1   2    4
 *  			for(초기값;조건식;증가식) => 2차 for => 코딩테스트가 나오는 구간
 *  			{			
 *  				반복 수행문장 3
 *  			}
 *  
 *  
 *  	=while		>데이터베이스 = 무한 스크롤 =>반복횟수 지정이 업는 상태
 *  			초기값            1
 *  			while(조건식)		2 =>false면 종료
 *  			{
 *  				반복수행문장	3
 *  				증가식		4 => 조건식으로 이동
 *  			}
 *  	--------------------------------------한번도 수행을 못할 수도 있다
 *  		=> 조건이 선 조건
 *  	=do~while	>빈도수가 거의 없다
 *  		초기값
 *  			do{
 *  				반복문장
 *  				증가식
 *  			  }while(조건식)
 *		--------------------------------------무조건 1번이상 수행
 *			=> 조건이 후 조건 
 *			=> 자바의 모든 프로그램은 변수/연산자/if,for  로 사용한다
 *			=> 관련된것 끼리 묶어서 사용 : 배열 / 클래스 / 메소드
 *									
 *			***for : 반복문 => 가장 많이 사용되는 반복문
 *				=>for-each
 *				1) 형식
 *					for(초기값;조건식;증가식)
 *					{
 *						반복 수행 문장
 *					}
 *                  초기값 : 시작점  int i=1
 *                  조건식 : 끝점	 i<=10
 *                  증감식 : 	 i++1
 *                 
 *				2) 동작 순서
 *					for(①초기값;②조건식;③증가식)
 *					{			|true 반복문장 수행
 *                            반복수행문장 ④
 *					}
 *					① → ② → ④ → ③ → ② → ④ → ③ → ② → ④ → ③
 *						----	
 *				3) 구현
 *
 *
 */

public class 제어문_반복문_1 {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("Hello Java"); System.out.println("Hello Java");
		 * System.out.println("Hello Java"); System.out.println("Hello Java");
		 * System.out.println("Hello Java"); System.out.println("Hello Java");
		 * System.out.println("Hello Java"); System.out.println("Hello Java");
		 * System.out.println("Hello Java"); System.out.println("Hello Java");
		 * System.out.println("Hello Java"); System.out.println("Hello Java");
		 */
		for(int i=1;i<=5;i++) // 증가식은 프로그램에 따라서 달라질 수 있다.
		{					   // i+=2  2개씩올려라
			System.out.println(i+"→");
		}
		
		for(int n=5;n>=1;n--) //=>방문 cookie에 저장 클릭한 순서로 저장 => 뒤에서부터 출력
		{						//웹 => 최신순
			System.out.println(n+"-");
		}
		
		
	}
}
