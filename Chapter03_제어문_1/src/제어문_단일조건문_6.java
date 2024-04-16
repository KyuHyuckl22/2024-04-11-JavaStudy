/*
 * 	국어 영어 수학 점수를 입력받아서
 * 	총점 , 평균
 * 	학점 => 100~90 A
 * 		   89~80 B
 * 		   79~70 C
 *         69~60 D
 *         	 F
 *         
 *  변수의 갯수 : 최대 6개  국어 , 영어 , 수학 , 총점 , 평균 , 학점
 *  		   최소 4개  국어 , 영어 , 수학 , 학점
 *  
 */

import java.util.Scanner;

public class 제어문_단일조건문_6 {

	public static void main(String[] args) {
		//입력값
		Scanner scan=new Scanner(System.in);
		//필요한 변수 선언
		int kor,eng,math;
		kor=1;
		eng=1;
		math=1;
		char score='A';
		//입력값을 받아서 초기화
		System.out.print("국어점수 입력 : ");
		kor=scan.nextInt();
		
		System.out.print("영어점수 입력 : ");
		eng=scan.nextInt();
		
		System.out.print("수학점수 입력 : ");
		math=scan.nextInt();
		//학점계산
		int avg=(kor+eng+math)/3;
		if(avg>=90 && avg<=100)
		{
			score='A';
		}
		if(avg>=80 && avg<90)
		{
			score='B';
		}if(avg>=70 && avg<80)
		{
			score='C';
		}if(avg>=60 && avg<70)
		{
			score='D';
		}
		if(avg<60)
		{
			score='F';
		}
		// 오류처리를 하려면
		// if문은 개별 문장이기 때문에 끝까지 수행해간다.
		// 나중에 배울 다중 if를 사용해야한다
		
		// 출력
		System.out.println("=====결과=====");
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+ (kor+eng+math));
		System.out.printf("평균 : %.2f\n ",(kor+eng+math)/3.0);
		//=> \n => newLine => ln
		//=> \t => tab => 일정간격을	두는
		System.out.println("학점 : "+score+"학점");


	}
}
