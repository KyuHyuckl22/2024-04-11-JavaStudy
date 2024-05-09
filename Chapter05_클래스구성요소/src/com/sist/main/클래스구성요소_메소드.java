package com.sist.main;
/*
 *   메소드 : 기능별 분리
 *     => 문장으로 봤을때 => 단락을 만들어서 처리
 *     => 기능별로 분리하는 이유 => 오류 처리
 *        ---------------- 1- 재사용
 *                         2- 수정이 쉽다
 *                         3- 추가가 가능
 *                         4- 유지보수
 *                         5- 분업 => 나눠서 작업 => 일이 줄어든다 ...
 *                           --------------------------------
 *                           분업을 하게되면 필요 인원이 ++
 *     => 역할 : 다른 클래스와 연결해서 사용
 *        사람 클래스 =========== 자판기 클래스
 *                  동 전 투 입 => 음료수 선택
 *                               음료수 뽑기
 *                               잔돈을 돌려준다 ==> 동작
 *        객체지향 프로그램 = 여러개의 클래스를 만들어서 상호 연결해서 사용
 *        
 *     => 사이트 분석
 *        ------
 *        1. 데이터 확인
 *        2. 기능 확인 ==> 데이터 추출
 *      Ex)
 *          중복없는 난수 3개 발생  int[]com
 *          사용자 입력 int[] user
 *          입력값 난수 비교 com/user
 *          힌트 com/user/s/b
 *          종료  s==3
 *          
 *          공통 : 멤버변수
 *          한군데 : 지역변수   를 잡아라
 *      
 */                   
//   public => 한개의 파일에서는 pubilc은 한개만 사용이 가능
import java.util.*;

class Diary{
	public int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력");
		return scan.nextInt();
		
	}
//	요일 구하기
	public int getWeek(int year, int month) {
		Calendar cal=Calendar.getInstance(); // 객체 생성 방법 => 추상클래스는 new 사용해서 객체 생성이 불가능
//	    추상클래스 : 미완성된 클래스 => 객체는 new사용하지 않아도 객체 생성이 가능
//		Spring => new를 사용하지 않고 객체 사용이 가능 => 리플렉션
//		디자인 패턴 / 알고리즘 / 자료구조 ..등을 알아야 프로그램을 짤 수 있다
//		---------- GOF 패턴 => 23개 => 8가지
	    cal.set(Calendar.YEAR, year); //setatic final int YEAR -- new를 안쓰면 추상or 인터페이스
	    cal.set(Calendar.MONTH, month-1);                      // 
	    cal.set(Calendar.DATE, 1);
//	    상수 => static final ==> 모든 프로그램에서 공유 => 클래스명.상수명
//	    상수형 => final => 클래스내에서 사용 => 객체명. 상수
	    
	    int week=cal.get(Calendar.DAY_OF_WEEK);
//	    calender 의 단점 : month=0, week=1 
	    return week -1;
/*
 *  -1 을 주는 이유 코딩할때
 *  {일 월 화 수 목 금 토} 로 나오면
 *   0   .  .   .  6  배열은 0부터 시작하는데
 *   여기는 1부터 돌아간다 그래서 1을 빼주면 0번부터 시작할수 있게끔 바꾸는것	    
 */
		
	}
	public int getLastDay(int year, int month) {
		Calendar cal=Calendar.getInstance(); // 객체 생성 방법 => 추상클래스는 new 사용해서 객체 생성이 불가능
	    cal.set(Calendar.YEAR, year); //setatic final int YEAR -- new를 안쓰면 추상or 인터페이스
	    cal.set(Calendar.MONTH, month-1);                      // 
	    cal.set(Calendar.DATE, 1);
	    
	    int lastday=cal.getActualMaximum(Calendar.DATE);
	    return lastday;
	}
//	달력 출력 => 전역변수 없이 => 전역변수(멤버변수)
	public void print(int year,int month, int week, int lastday) {
{
		System.out.println(year+"년도 "+month+"월 ");
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		for(int i=1; i<lastday; i++){
			if(i==1) {
				
				for(int j=0; j<=week; j++) {
					System.out.print("\t");

				System.out.printf("%2d\t",i);
				}
			}
		}	
		
	}
}
	public void process()
	{
		int year=input("년도");
		int month=input("월");
		int week=getWeek(year, month);
		int lastday=getLastDay(year, month);
		print(year, month, week, lastday);
}
//   public이 있는 클래스가 저장명이 된다 => 자바는 파일명 = 클래스명이 동일해야한다
public class 클래스구성요소_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Diary d=new Diary(); // input => 저장 
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	d.process();
        	System.out.print("\n종료할까요?(y/n):");
        	char end=scan.next().charAt(0);
        	if(end=='y'|| end=='Y')
        	{
        		System.out.println("프로그램 종료");
        		System.exit(0);
        	}
        }
	}
}
}
