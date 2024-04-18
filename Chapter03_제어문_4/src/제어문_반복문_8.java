import java.util.Scanner;
// 계산기 (사칙연산)
public class 제어문_반복문_8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		for(;;)
		{
			System.out.print("첫번재 정수를 입력:");
			int num1=scan.nextInt();	
			System.out.print("연산자 입력 (+,-,*,/):");
			char op=scan.next().charAt(0);
			System.out.print("두번째 정수를 입력:");
			int num2=scan.nextInt();
			
			switch(op)
			{
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case '/':
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다!");
				else
					System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
//			case 'q':
//			case 'Q':
//				System.out.println("프로그램 종료");
//				//프로그램 자체를 종료
//				System.exit(0); // 0정상종료 , 0이 아닌 경우 비정상 종료
				default:
					System.out.println("잘못된 입력입니다");
			}
			System.out.print("종료할까요? 'Y/N");
			char exit=scan.next().charAt(0);
			if(exit=='y')
			{
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
