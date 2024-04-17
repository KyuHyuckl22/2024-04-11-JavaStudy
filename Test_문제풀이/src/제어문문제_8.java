/*
 * 9)Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
 *  십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
 *
 */
import java.util.Scanner;
public class 제어문문제_8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100까지 2자리 정수 입력:");
		int num=scan.nextInt();
		if(num>=10 && num<=99) { //정상적으로 입력이 되었을때
			if(num%11==0) {
				System.out.println("10의자리와 1의자리가 같습니다");
			}
			else {
				System.out.println("10의자리와 1의자리가 같지 않습니다");
			}
		}
		else {
			System.out.println("잘못된 입력입니다!");
		}
			
		
		
	}
}
