/*
 * 무한루프를 이용한
 * 간단한 게임 : UP / Down 게임
 * => 1~100 사이의 난수 => 맞추는 프로그램
 * => 힌트
 * 
 * 	-> 1~100 까지 사이의 수를 입력이 안된 경우 => 제외하고 다시 입력할수 있게 처음으로 이동 => continue
 * 	-> 정답일 경우 => break를 주면서 게임 종료(for문 종료)
 * ==> 반복 제어문 : break , coutinue
 * ==> 다시 처음부터 실행
 * 	  --------------
 * 	  => 반복문 이 있거나
 * 	  => 메서드가 있을때
 * 
 */
import java.util.Scanner;
public class 제어문_반복문_7 {

	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		// 1. 난수 발생
		int com=(int)(Math.random()*100)+1; // 1~100 사이의 정수 한개 추출
		// 2. 사용자가 난수를 맞추는 코딩
		// while(true) ==> 데이터베이스
		// 오라클 => MySQL / MariaDB
		//     3차 프로젝트때 선택 어떤걸 쓸지
		for(;;)  //종료하지 않는 프로그램 => 무한루프 => 반드시 종료하는 프로그램을 줘야한다 => q/Q
		{
			// 사용자 입력
			System.out.print("1~100 사이의 정수 입력 : ");
			int user=scan.nextInt();
			
			if(user<1 || user>100) //범위를 벗어난 경우 => ||
			{
				System.out.println("잘못 입력하셨습니다");
				continue; //for의 처음으로 다시 돌아간다
			}
		 //정상적으로 입력한 경우
			count++;;
		if(com>user)
		{
			System.out.println(user+" 이상입니다");
		}
		else if(com<user)
		{
			System.out.println(user+" 이하입니다");
		}
		else 
		{
			System.out.println("정답입니다~");
			break;
		}
		}
		
		System.out.println(100-(count*5)+"점");
	}
}
