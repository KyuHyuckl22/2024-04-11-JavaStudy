/*
 *   초 를 입력받아서 시간 / 분 / 초 출력
 *   ex)
 *   	63을 입력하면 1분 3초 ==> 라이브러리 (시간 => 초단위)  60*60*24  < 하루 저장
 */
import java.util.Scanner;//   (/ , %)을 사용해야함
public class 자바제어문_조건문_2 {
	// 예전 구글 온라인 시험문제였음
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("초 입력 : ");
		int num=scan.nextInt();
		
		int hour=num/3600;   //시간 계산
		System.out.print(hour+"시간 ");
		int minute=(num%3600)/60;    //분 계산
		System.out.print(minute+"분 ");
		int second=(num%3600)%60;   //시간과 분을 나누고 남은 나머지 값으로 초 출력
		System.out.print(second+"초 ");
		
		//숫자 분리 => /,% 를 사용하여 처리를 한다
	}
}
