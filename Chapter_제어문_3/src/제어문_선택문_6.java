/*
 * 	 학습 ==>반복 
 * 		=>형식
 * 		=>코딩연습 안되는 지점
 * 		=>에러처리
 * 		=>라이브러리
 * 		=>구글링 -> 관련된 큰 프로그램 찾기
 * 		-----------------------------자바 끝날때 까지
 */
import java.util.Scanner; // *
public class 제어문_선택문_6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.print("달 입력 >> ");
		int month=scan.nextInt();
		switch(month)
		{
		case 3: case 4: case 5:
			System.out.println("봄 입니다");
			break;	
		case 6: case 7: case 8:
			System.out.println("여름 입니다");
			break;		
		case 9: case 10: case 11:
			System.out.println("가을 입니다");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울 입니다");
			break;
		default :
			System.out.println("없는 달 입니다");
		}
		
	}
}
