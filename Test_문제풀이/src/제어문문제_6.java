import java.util.Scanner;
public class 제어문문제_6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.print("정수입력:");
		a=scan.nextInt();
		if(a>=90 && a<=100) {
			System.out.println("A학점입니다");
		}
		else if(a>=80 ) {
			System.out.println("B학점입니다");
		}

		else if(a>=70 ) {
			System.out.println("C학점입니다");
		}

		else if(a>=60 ) {
			System.out.println("D학점입니다");
		}

		else if(a<60) {
			System.out.println("F학점입니다");
		}
		else {
			System.out.println("잘못입력하셨습니다");
		}
		
	}
}
