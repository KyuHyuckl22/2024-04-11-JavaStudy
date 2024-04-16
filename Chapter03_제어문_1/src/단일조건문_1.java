/*
 *  정수입력을 받는다 => 양수/음수 인지 확인해서 출력
 * 
 */
import java.util.Scanner;
public class 단일조건문_1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("정수입력");
		num=scan.nextInt(); //
		
		if(num<0)
		{
			System.out.println(num+"는(은) 음수");
		}
		if(num>0)
		{
			System.out.println(num+"는(은) 양수");
		}
		
	}

}
