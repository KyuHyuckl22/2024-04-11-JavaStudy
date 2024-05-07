/*
 *   데이터형
 *   같은 폴더 안에 같은 클래스명이 있으면 오류가 난다
 */

import java.util.Scanner;

class Sutdent2 {
//	맴버변수, 인스턴스 변수, 객체변수 ..
//	인스턴스는 메모리에 저장된 상태 => new 를 이용해서 메모리를 
	String name; //null
	int kor,eng,math,total; //0
	double avg; //0.0
	char score; // '\0'
	int rank; // 0 ==> 자동으로 초기화

	
}
public class 클래스_02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student hong=new Student2;
//		System.out.println("이름 : "+hong.name);
//		System.out.println("국어 : "+hong.kor);
//		System.out.println("평균 : "+hong.avg);
//		System.out.println("학점 : "+hong.char);
		Sutdent2[] std=new Sutdent2[3];
//		사용자 정의 데이터형 => 배열 사용이 가능
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<std.length; i++){
			std[i]=new Sutdent2();
			
			System.out.print((i+1)+"번째 국어 입력: ");
			std[i].kor=scan.nextInt();
			System.out.print((i+1)+"번째 영어 입력: ");
			std[i].eng=scan.nextInt();
			System.out.print((i+1)+"번째 수학 입력: ");
			std[i].math=scan.nextInt();
			
			
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;
		}
		
		for(int i=0; i<3; i++){
			System.out.println("국어점수"+std[i].kor);
			System.out.println("영어점수"+std[i].eng);
			System.out.println("수학점수"+std[i].math);
			System.out.println("총점"+std[i].total);
		}
	}

}
