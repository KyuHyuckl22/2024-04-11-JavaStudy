/*
 * 100점 만점으로 입력받아
 * 90~100 A
 * 80~89 B
 * 70~79 C
 * 60~69 D
 * 60 이하면 F 를 출력하라
 * 
 * switch ~ case : 선택문
 * --------------------
 * if문의 조건문과 다르게 case를 사용 => case에 사용할 수 있는것 : 정수, 문자, 문자열
 * => 값을 한개 지정
 * => 값이 입력 => swutch에 값을 받는다
 * 	  switch(op)
 * => case 처음부터 검색
 * => 해당 문자, 정수를 찾아서 문장을 수행
 * => case를 찾아서 처리하고 break가 없는 경우에는 break가 존재하는 곳 까지 문장을 수행
 * 	  int a=3;
 *    switch(a)
 *    {
 *    	case1:
 *    		문장
 *    	case2:
 *    		문장
 *    	case3:
 *    		문장
 *      case4:
 *      	문장
 *      case5:
 *      	문장
 *    }
 *    **찾은 case 부터 break가 있는 case 까지 수행
 *    **해당 case에 없는 경우에는 default (생략이 가능) => case마다  break;
 *    **수행 후 빠져나갈 수 있게 만들어주는게 break
 *    **break는 switch~case를 종료
 *    
 *    **보통 프로그램에서는 if를 많이 사용한다
 *    	경우의 수가 많은경우에는 switch를 주로 이용한다(게임,메뉴)
 *      => swicth가 if 보다 간결하다
 *      => 네트워크
 *    ** if -> 범위가 있는 경우
 *       if(score>=90 && score <= 100)
 *    ** 값 1개씩 여러개인 경우 => switch ~ case
 *    	 switch(score)
 *   	 {
 *   		case 100: case 99: case 98 ....
 *    	 }
 *    	switch(정수,문자,문자열) 만 들어간다
 */
import java.util.Scanner;
public class 제어문_반복문문제_1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.print("학점을 입력하세요 : ");
		int score=scan.nextInt();
		
		switch(score/10)
		{
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("B");
			break;
		case 8:
			System.out.println("C");
			break;
		case 7:
			System.out.println("D");
			break;
		case 6:
			System.out.println("F");
			break;
			default :
				System.out.println("F");
		}
		
	}

}
