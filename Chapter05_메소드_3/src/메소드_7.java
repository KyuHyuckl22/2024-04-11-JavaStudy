/*
 *     달력만들기
 *     ------
 *     1. 절차적 언어
 *     2. 메소드화 ==> 구조적 프로그램
 *                      |
 *                    클래스 => 객체지향 프로그램
 *                    
 *     최소한 => 3개 
 *     입력 부분 -> 메소드
 *     ---------------
 *     처리 부분 -> 메소드 : 세분화
 *     출력 부분 -> 메소드
 *     ---------------
 * 
 */
import java.util.*;
public class 메소드_7 {
//	    입력 부분 => 반복 제거
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력:");
		return scan.nextInt();
	}
	
//	처리
	static int getweek(int year, int month) {  //어떤값을 받고 어떤 값을 넘겨줄 것이냐 를 빨리알아야함
		int total = (year-1)*365               //데이터를 가지고 올때 year 과 month 가 필요해서 매개변수로 입력해준것
				  + (year-1)/4
				  - (year-1)/100
				  + (year-1)/400;
//		2. 전 달 까지의 총 날수
		int[] lastday= {31,28,31,30,31,30,
				        31,31,30,31,30,31};
//		윤년이면 => 2월 => 29
		if(isYear(year))
			lastday[1]=29; //윤년이라면
		else 
			lastday[1]=28; //윤년이 아니라면
		for(int i=0; i<month-1; i++){
			total+=lastday[i];
		}
//		3.+1일 자의 요일 확인
		total++;
//		4. 요일 구하기 => 총날수 %7
		int week=total%7;
		return week;
	}
	
    static boolean isYear(int year) {
    	if((year%4==0 && year%100==0) || (year%400==0))
    		return true;
    	else
    		return false;
    }
    
//	출력
	static void print(int year, int month , int week) {
		int[] lastday= {31,28,31,30,31,30,
		        31,31,30,31,30,31};
		System.out.println(year+" 년도 "+month+"월 ");
		String[] strweek= {"일","월","화","수","목","금","토"};
		for(String w:strweek) 
			System.out.print(w+"\t");
			System.out.println();
		for(int i=1; i<=lastday[month-1]; i++){
//			1. 공백 출력 => 처음 1번만 출력
			if(i==1)
			{
				for(int j=0; j<week; j++){
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
//			토요일이면 => 다음줄에 출력
//			요일 확인
			week++;
			if(week>6) { // 7일이 되면
				System.out.println(); //다음줄에 출력한다
				week=0;  // week를 0으로 초기화
			}
		}	
	}
			
	static void process() {
		int year=input("년도");
		int month=input("월");
		
		int week=getweek(year,month);
		print(year,month,week);
	}
	
	public static void main(String[] args) {
		process();
	}
}		
	
////		입력 부분
//		Scanner scan=new Scanner(System.in);
////		1. 년도 입력
//		System.out.print("년도 입력 : ");
//		int year=scan.nextInt();
////		2. 월 입력 
//		System.out.print(" 월 입력 : ");
//		int month=scan.nextInt();
//		
//		
////		처리 부분 => 요일
////		1. 전년도 까지의 총 날수 구하기
////		  4년마다 100년마다 제외 400년마다
//		int total = (year-1)*365
//				  + (year-1)/4
//				  - (year-1)/100
//				  + (year-1)/400;
////		2. 전 달 까지의 총 날수
//		int[] lastday= {31,28,31,30,31,30,
//				        31,31,30,31,30,31};
////		윤년이면 => 2월 => 29
//		if((year%4==0 && year%100==0) || (year%400==0))
//			lastday[1]=29; //윤년이라면
//		else 
//			lastday[1]=28; //윤년이 아니라면
//		for(int i=0; i<month-1; i++){
//			total+=lastday[i];
//		}
////		3.+1일 자의 요일 확인
//		total++;
////		4. 요일 구하기 => 총날수 %7
//		int week=total%7;
////		출력 부분 
//		System.out.println(year+" 년도 "+month+"월 ");
//		String[] strweek= {"일","월","화","수","목","금","토"};
//		for(String w:strweek) 
//			System.out.print(w+"\t");
//			System.out.println();
//		for(int i=1; i<=lastday[month-1]; i++){
////			1. 공백 출력 => 처음 1번만 출력
//			if(i==1)
//			{
//				for(int j=0; j<week; j++){
//					System.out.print("\t");
//				}
//			}
//			System.out.printf("%2d\t",i);
////			토요일이면 => 다음줄에 출력
////			요일 확인
//			week++;
//			if(week>6) { // 7일이 되면
//				System.out.println(); //다음줄에 출력한다
//				week=0;  // week를 0으로 초기화
//			}
//		}
//	}
//
//}

