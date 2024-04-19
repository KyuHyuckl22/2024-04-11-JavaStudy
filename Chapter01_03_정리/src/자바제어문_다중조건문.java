import java.util.Scanner;
/*
 *    다중 조건문 형식)
 *         if(조건문)
 *         	{
 *          }
 *          else if(조건)
 *          {
 *          }
 *          else if(조건)
 *          {
 *          }
 *          else
 *          {
 *          	조건에 맞는 문장이 없는경우 => default =>생략가능
 *          }
 *          
 *          
 */
public class 자바제어문_다중조건문 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(;;)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1.영화 목록 보기");
			System.out.println("2.영화 상세 보기");
			System.out.println("3.영화 검색 ");
			System.out.println("4.영화 추천 ");
			System.out.println("5.영화 예약 ");
			System.out.println("6. 종료 ");
			System.out.println("===============");
			System.out.print("메뉴 선택: ");
			int menu=scan.nextInt();
			if(menu==6)
			{
				System.out.println("프로그램 종료");
				break;
			}
			if(menu==1)
			{
				System.out.println("영화 목록 보기 출력");
			}
			else if (menu==2)
			{
				System.out.println("영화 상세 보기 출력");
			}	
			else if (menu==3)
			{
				System.out.println("영화 검색 출력");
			}
			else if (menu==4)
			{
				System.out.println("영화 추천 목록 출력");
			}
			else if (menu==5)
			{
				System.out.println("영화 예약하기");
			}
			else
				System.out.println("없는 메뉴입니다.");
			
		}
		
	}
}
