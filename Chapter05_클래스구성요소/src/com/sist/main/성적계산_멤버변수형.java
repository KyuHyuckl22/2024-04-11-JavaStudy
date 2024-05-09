package com.sist.main;

import java.util.Scanner;

class Student2{
	private int kor,eng,math,total;
	private double avg;
	private char score;
//	Student2에 선언되는 모든 메소드에 사용이 가능
//	입력

	public int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력:");
		return scan.nextInt();
	}
//	total  
	public void totalData() {
		total=kor+eng+math;
	}
//	avg
	public void avgData() {
		avg=total/3.0;
	}
//	score
	public void scoreDate() {
		switch(total/30) {
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
	}
//	코딩은 지역변수 우선순위 => 지역변수, 매개변수
	/*
	 *  만약 매개변수, 지역변수가 생성된다면 
	 *  그 블록은 멤버변수 kor 이 아닌 지역변수 kor 이 된다
	 *  kor 을 만들면 kor은 우선 지역변수를 찾는다 만약 지역변수가 없다면
	 *  그때 멤버변수로 올라간다 
	 */
	public void print() {
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println(" 총 점 : "+total);
		System.out.printf(" 평 균 :%.2f\n ",avg);
		System.out.println(" 학 점 : "+score);
	}
	public void process() {
		kor=input("국어");
		eng=input("영어");
		math=input("수학");
		totalData();
		avgData();
		scoreDate();
		print();
	}
}
public class 성적계산_멤버변수형 {

	public static void main(String[] args) {
		Student2 s=new Student2();
		s.process();
	}

}
