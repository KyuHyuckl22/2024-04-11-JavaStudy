/*
 *     달력만들기
 *     1. 연도, 월 입력받기 year/month
 *     2. 요일 => year/month/week
 *     3. 출력 => year/month/week
 * 
 */
//다시
import java.util.*;
public class 맴버변수_활용2 {
	//입력
	static int year,month,day,week;  // 모든 메서드에서 같이 사용할 수 있다
	static int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력 : ");
		return scan.nextInt();
	}
	static int getWeek(int year, int month, int day) {
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.YEAR, year);
	cal.set(Calendar.MONTH, month-1);
	cal.set(Calendar.DATE, day);
	return day;
	
	
//	static int input(String msg) {
//		Scanner scan=new Scanner(System.in);
//		System.out.print(msg+"입력 : ");
//		return scan.nextInt();
//	}
//	
//	static int getWeek(int year, int month, int day) {
//		Calendar cal=Calendar.getInstance();
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH, month-1);
//		cal.set(Calendar.DATE, day);
//		
//		int week=cal.get(Calendar.DAY_OF_WEEK);
//		return week;
//	}
//	static void print(int year, int month, int day, int week) {
//		String[] strWeek= {"","일","월","화","수","목","금","토"};
//		System.out.printf("%d년도 %d월 %d일 %s요일입니다 \n");
//	}
//	public static void main(String[] args) {
//		int year=input("년도");
//		int month=input("월");
//		int day=input("일");
//		int week=getWeek(year, month, day);
//		print(year,month,day,week);
	}

}
