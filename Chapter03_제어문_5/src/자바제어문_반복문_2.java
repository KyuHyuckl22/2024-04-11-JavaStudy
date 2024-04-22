/*
 *   반복 => 필요한 내용만 출력
 *   
 *   for은 무조건 지정된 횟수만큼 돌아간다
 *   for(초기값;조건식;증감식)
 *   {
 *   	if(조건문)
 *   	{
 *   		출력문
 *   	}
 *   }
 *   
 */
public class 자바제어문_반복문_2 {

	public static void main(String[] args) {
//		 짝수만 출력해보기  1~10 중
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println();
//		같은 내용을 출력하지만 경우의 수가 많다 => 개발자마다 같은 내용을 다르게 코딩할 수 있다
//		요구한 결과물을 출력
		System.out.println();
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");    //가독성 => 다른 프로그래머가 볼 경우 알아보기쉽게
		System.out.println();
		// 가독성 - 유지보수 - 최적화
//		읽기쉽고 - 수정이쉽고  - 빠른속도로
//		  3        1          2     **
		
		//유지보수
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		
	
	}
}
