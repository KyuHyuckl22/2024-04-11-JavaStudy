/*
 *    사용자로부터2~9사이의 정수를 입력받아 구구단을 출력하라
 *    단 입력이 2~9까지 아닐경우에는 다시 입력을 하게 만든다
 */
import java.util.Scanner;
public class 자바제어문_반복문_6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//프로그램에 필요한 데이터를 사용자로부터 받아서 => 오류체크
		int num;  // 블록변수 => 블록 {} 을 벗어나면 자동으로 삭제가됨
		for(;;) // 무한루프 => 사용자 입력 ~ 2-9
		{
			System.out.print("2~9 사이의 정수 입력 : ");
			num=scan.nextInt();
			if(num<2 || num>9)
			{
				System.out.println("잘못된 입력입니다");
				continue; //for을 처음으로 이동시키기
			}
			break; //for 종료
		}
		System.out.println("단 = "+ num);
		System.out.println("====="+num+" 단 =====");
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
		
	}
}
