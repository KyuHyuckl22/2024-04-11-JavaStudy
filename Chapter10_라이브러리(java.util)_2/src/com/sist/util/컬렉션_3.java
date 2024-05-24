package com.sist.util;
//  import 는 무조건 패키지 아래
import java.util.*;
//  사용자 정의

class Student {
	private int hakbun;
	private String name;
	private int kor,eng,math;
//	읽기 / 쓰기 기능 추가 => 다른 클래스에서 사용이 가능하게 만든다
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
//	자동으로 디폴트 생성자가 생성이 안된다 ..
	public Student(int hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
//	매개변수가 있는 생성자가 있는 경우에는 디폴트 생성자를 만들어야 제어가 편리하다
	public Student() {
//		 초기화 => 모든 학생 정보가 같은 값을 가지고 저장이 된다
	}
//	 데이터 추가
}
class A { // 이렇게 저장하면 객체를 생성할때마다 같은 값을 받는다
	int a,b;
	public A() {
		a=10;
		b=20;
	}
}

/*        
 *    A aa=new A();  호출시 실제 데이터는 
 *                   -- aa --
 *                   
 *                   --------    -------------
 *                                   -----
 *                                    10    => a
 *                                   -----
 *                                    20    => b
 *                                   ----- 
 *                               --------------
 *    A bb=new A();   
 *                   -- bb --
 *                   
 *                   --------    -------------
 *                                   -----
 *                                    10    => a
 *                                   -----
 *                                    20    => b
 *                                   ----- 
 *                               --------------    
 *    A cc=new A(100,200);   
 *                   -- cc --
 *                   
 *                   --------    -------------
 *                                   -----
 *                                    100   => a
 *                                   -----
 *                                    200   => b
 *                                   ----- 
 *                               --------------                                                          
 *    A dd=new A(1000,2000);   
 *                   -- dd --
 *                   
 *                   --------    -------------
 *                                   -----
 *                                    1000   => a
 *                                   -----
 *                                    2000   => b
 *                                   ----- 
 *                               --------------                       
 *      
 */
public class 컬렉션_3 {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1, "홍길동",90,80,70));
		list.add(new Student(2, "박문수",90,80,70));
		list.add(new Student(3, "이순신",90,80,70));
		list.add(new Student(4, "이산",90,80,70));
		list.add(new Student(5, "심청이",90,80,70));
		System.out.println("== 데이터 출력 ==");
/*
 * 		%d => 정수
 *      %s => 문자열
 *      %c => 문자
 *      %f => 실수
 *      
 *      %-3d   3칸의 공간을 만들고 왼쪽 앞부터 채워라
 *      000
 *      1--
 *      
 *      %3d    3칸의 공간을 만들고 오른쪽 끝부터 채워라
 *      000
 *      --1
 */
		for(Student std:list) {
//			printf ==> 형식이 있는 출력
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n",
				std.getHakbun(),std.getName(),std.getKor(),
				std.getEng(),std.getMath());
			
		}
		System.out.println("== 데이터 추가1 ==");
//		student  추가
		Student s = new Student();
		s.setHakbun(6);
		s.setName("강감찬");
		s.setKor(78);
		s.setEng(90);
		s.setMath(60);
		list.add(s);
		for(Student std:list) {
//			printf ==> 형식이 있는 출력
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n",
				std.getHakbun(),std.getName(),std.getKor(),
				std.getEng(),std.getMath());
//			위와 아래는 똑같이 데이터를 추가하는것인데
//			아래는 생성과 동시에 값을 넣어주는거라 아래가 더 편하고 소스량도 줄일 수 있다
		}
		System.out.println("== 데이터 추가2 ==");
		list.add(new Student(7,"춘향이", 89, 80, 90));		
		for(Student std:list) {
//			printf ==> 형식이 있는 출력
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n",
				std.getHakbun(),std.getName(),std.getKor(),
				std.getEng(),std.getMath());
			
		}
		System.out.println("== 데이터 출력 ==");
		for(Student std:list) {
			System.out.println(std);
		}//주소값 출력
		
		System.out.println("== 데이터 출력 2==");
		for(int i =0; i<list.size();i++) {
			Student std=list.get(i);
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n",
					std.getHakbun(),std.getName(),std.getKor(),
					std.getEng(),std.getMath());
		}
		System.out.println("== 데이터 삭제 ==");
		list.remove(3); //인덱스번호 3번을 삭제한다. 학번4번(인덱스번호 3) 에 있던 이산이 삭제된다
//		                                     인덱스는 자동으로 당겨지지만 우리가 기입한 학번4 는 당겨지지 않고 그대로 삭제된다
		for(Student std:list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n",
				std.getHakbun(),std.getName(),std.getKor(),
				std.getEng(),std.getMath());
			
		}
		System.out.println("== 학생 수정 ==");
		list.set(1, new Student(2,"수정",90,90,90));  //인덱스 1번에 저장되어있던 학생의 정보를 변경한다
		for(Student std:list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n",
				std.getHakbun(),std.getName(),std.getKor(),
				std.getEng(),std.getMath());
			
		}
		System.out.println("== 학생 졸업 ==");
		list.clear();
		for(Student std:list) {
			System.out.printf("%-3d %-5s %-5d %-5d %-5d\n",
				std.getHakbun(),std.getName(),std.getKor(),
				std.getEng(),std.getMath());
			
		}
		System.out.println("현재인원 : "+list.size());
	}

}
