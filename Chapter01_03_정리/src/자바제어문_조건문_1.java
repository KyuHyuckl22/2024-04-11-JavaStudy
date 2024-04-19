/*
 *   자바 조건문
 *   ---------
 *   1. 단일 조건문 : 독립문장 => 여러개 사용에 조건 맞는 모든 문장을 수행한다.
 *   								  ------
 *     형식) 
 *     		if(조건문)
 *     		{
 *               조건이 true일때 실행하는 문장
 *          }
 *          false명 스킵 == 필요시에는 문장을 수행 => 건너뛴다
 *          if : 오류처리 , 유효성 검사
 *          조건 => 부정연산자 , 비교연산자 , 논리연산자
 *          	  --------------------------- true/false
 *          1. 조건
 *             num=1;
 *             조건 num값 1보다 크고 100보다 작을때
 *             if(num>=1 && num<=100) => num이 1~100 사이에 있는 경우
 *             		     ---
 *             조건 num값 1보다 작거나 100보다 큰 경우 => 포함이 없는 상태
 *             if(num<1 || num>100) => 포함하지 않는경우
 *          
 *             if(num==1)  => if(num>1) ==> if(num<1)
 *             
 *          2. id,pw
 *             if(id.eqauls("admin") && pw.equals("1234"))	=> 맞을때
 *             if(!(id.eqauls("admin") && pw.equals("1234")))  => 맞지 않을때
 *              ==> 문자열에서는 '==' 을 사용하지 않고 'eqauls' 를 사용한다   
 */
import java.util.Scanner;
//자판기 프로그램
/*
 *   동전 투입 => 입력
 *   설정된 데이터를 선택
 *   --------------
 *   잔돈계산
 *   => 1000 , 100 , 10  ==> %
 */
public class 자바제어문_조건문_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("동전을 투입하세요 : ");
		int pay=scan.nextInt();
		//투입금액
		int change=0;
		System.out.println("투입된 동전 : "+pay+"원");
		System.out.println("1.콜라(1900원)\n2.파워에이드(1500원)\n3.커피(1200)");
		System.out.print("메뉴 선택 : ");
		int menu=scan.nextInt();
		if(menu==1)
		{
			System.out.println("콜라(1900) 선택하셨습니다.");
			if(pay>=1900)
			{
				change=pay-1900;
			}
			else
			{
				System.out.println("금액이 "+(1900-pay)+"원 부족합니다:");
			}
		}
		if(menu==2)
		{
			System.out.println("파워에이드(1500) 선택하셨습니다.");
			if(pay>=1500)
			{
				change=pay-1500;
			}
			else
			{
				System.out.println("금액이 "+(1500-pay)+"원 부족합니다:");
			}
		}
		if(menu==3)
		{
			System.out.println("커피(1200) 선택하셨습니다.");
			if(pay>=1200)
			{
				change=pay-1200;
			}
			else
			{
				System.out.println("금액이 "+(1200-pay)+"원 부족합니다:");
			}
		}
		//잔돈 계산
		if(change>0)
		{
			System.out.println("잔돈 : "+change);
			System.out.println("천원 : "+change/1000);
			System.out.println("오백원 : "+ change%1000/500);
			System.out.println("백원 : "+ change%1000%500/100);
		}

	}
}
