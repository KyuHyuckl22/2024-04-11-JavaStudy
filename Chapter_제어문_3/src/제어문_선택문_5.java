/*
 *  국어 영어 수학 => 총점 , 평균 (연산자) 학점 (if , switch)
 */
import java.util.Scanner;
public class 제어문_선택문_5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 :");
		int kor=scan.nextInt();
		System.out.print("영어점수 :");
		int eng=scan.nextInt();
		System.out.print("수학점수 :");
		int math=scan.nextInt();
		
		System.out.println("국어점수 :"+kor);
		System.out.println("영어점수 :"+eng);
		System.out.println("수학점수 :"+math);
		System.out.println("총점:"+ (kor+eng+math));
		System.out.printf("평균:%.2f\n", (kor+eng+math)/3.0);
		
		int avg=(kor+math+eng)/30;
		//0~10
		char score=' ';
		switch(avg)
		{
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
				default:
					score='F';
					
		}
		System.out.println("학점:"+score);
		//프로그램은 결과값 => 정답은 없다
		
		
	
		
		
	}
}
