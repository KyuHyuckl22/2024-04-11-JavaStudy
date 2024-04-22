/*  p70
 *   =>for문과 동일한 반복문
 *   =>몇회 반복햐서 원하는 값을 얻는다
 *     ---------> for
 *   =>반복 횟수가 명확하지 않는 경우
 *     ---------> while
 *     =>개발자들의 사용 빈도수  for 이든 while 이든 틀린건 아님
 *     while
 *     -------파일 읽기 , (*데이터베이스 읽기*) , 네트워크 서버
 *            ---------------------------------- Back-End (while)
 *            화면출력, 페이지나누기...
 *            ---------------------------------- Front-End (for)
 *   형식)
 *       초기값
 *       while(조건식)
 *       {
 *       	반복 수행문장
 *       	증가식
 *       }
 *   
 *   순서)    
 *       초기값			----1
 *       while(조건식)    ----2
 *       {				
 *       	반복 수행문장   ----3
 *       	증가식     -------4----->2번으로 이동
 *       }
 *      
 *       1 => 2-3-4 => 2-3-4 => 2-3-4 ... 2번 false 종료
 *       
 *       주로 while은 무한루프시에 주로 사용
 *           for(;;)
 *           while(true)
 *           
 *       1) 1~10 까지 출력
 *       
 *          for(int i=1;i<=10;i++)
 *          {
 *          	System.out.print(i+" ");
 *          }    
 *          
 *          int i=1;
 *          while(i<=10)
 *          {
 *          	System.out.print(i+" ");
 *          	i++;
 *          }
 *   
 * 
 */
public class 자바제어문_반복문_1 {

	public static void main(String[] args) {
		System.out.println("====="+"for"+"=====");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			
		}
		
		
		System.out.println("\n====="+"while"+"=====");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		
//		자바 어렵다
//		--------
//		오라클 => SQL
//		------------
//		HTML/CSS/JavaScript
//		-------------------
//		JSP  => 1차 =>ERD,FlewChart => 설계 => 아이템 기획
//		---
//		Spring => 2차
//		--------------------------------
//		Spring=Boot => 3차
//		-----------
//		Python
//		-------
//		React
	}
}
