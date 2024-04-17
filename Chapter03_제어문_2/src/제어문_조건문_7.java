/*
 * 	1. 형식 ==> 어떤곳에서 사용해야 하는지 파악하기
 * 	2. 흐름 파악 => 동작 순서
 * 	3. 응용
 * ------------------------
 * 1) 제어문 : 프로그램을 제어할때 사용
 * 			 ----------- 필요한 내용, 요청된 내용만 출력 ,반복 수행
 *                                 ------------> 필요시에 프로그램을 건너뛸 수 있음
 * 2) 조건문 : 오류처리 , 건너뛴다... 사용자 요청에 맞는 내용만 출력									                                           
 * 	=단일 조건문 : 독립적인 문장 (조건에 맞는 모든 문장을 수행)
 * 		if(조건문)
 * 		{
 * 			true에 수행이 되는 영역 =>false면 건너뛴다
 * 		}
 *  =선택 조건문 : true/false =>나눠서 처리
 *  	if(조건문)
 *  	{
 *  		true일때 처리되는 문장
 *  	}
 *  	else
 *  	{
 *  		false일때 처리되는 문장
 *  	}
 *  =다중 조건문 :여러개의 조건중에 1개만 출력 => p58
 *   형식)	무조건 1문장만 수행
 *   	if(조건문)
 *   	{
 *   		조건문 => true 문장수행 => 종료
 *   			false
 *   	}		↓
 *   	else if(조건문)
 *   	{
 *   		조건문 => true 문장수행 => 종로
 *   			false
 *   	}		↓
 *   	else if(조건문)
 *   	{
 *   		조건문 => true 문장수행 => 종료
 *   	}		↓
 *   	else 
 *   	{
 *   		해당 조건이 없는 경우에 수행문장 => 필요시에만 처리 (생략이 가능)
 *   	}
 *   	--------------------------------------------------
 *  	등장 빈도)
 *  		if~else =>단일 조건문 => 다중 조건문
 *									|(주로 나오는 곳)
 *									게임 => 키선택 
 *									메뉴 => 대체할수있는것 switch~case
 *		--------------------------------------------------
 *		
 *  성적	계산 => 다중조건문 => 자주 풀어봐야한다
 *  ABCDF
 */
import java.util.Scanner;
public class 제어문_조건문_7 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); //클래스 메모리 저장 => new
		//System.in => 키보드 입력값
		System.out.print("국어점수: ");
		int kor=scan.nextInt();
		System.out.print("영어점수: ");
		int eng=scan.nextInt();
		System.out.print("수학점수: ");
		int math=scan.nextInt();
		
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println(" 총 점 :"+(kor+eng+math));
		System.out.printf(" 평 균 :%.2f\n",(kor+eng+math)/3.0);
		//요청사항 => 학점을 구해달라 => 다중조건문을 사용하여
		char score=' ';
		int avg=(kor+eng+math)/3;
		
		if(avg>=90) {
			score='A';
		}
		else if(avg>=80) {
			score='B';
		}
		else if(avg>=70) {
			score='C';
		}
		else if(avg>=60) {
			score='D';
		}
		else {// 해당 조건이 없는경우 else 수행 
			score='F';
		}
		System.out.println(" 학 점 : "+score);
		
	}
}
