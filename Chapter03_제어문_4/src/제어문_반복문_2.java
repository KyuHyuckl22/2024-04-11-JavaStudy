/*
 * 	단을 입력을 받는다
 * 		=> 구구단 출력
 * 
 * 	ex)                         1)반복횟수는 몇회인가?
 *    단 입력 : 2					2)어디부터 어디까지 출력?
 *    	2*1=2					  -----  -----
 *    	..						  초기값   조건식     
 *    	2*9=18	=>1부터 9까지 증가
 *    			=>for문 9바퀴 수행
 *    	
 *    		
 */
import java.util.Scanner;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan=scan.nextInt();
		
		for(int i=1;i<=9;i++) //한개씩 증가 => 1부터 9까지 수행 = 종료
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
	}
}
