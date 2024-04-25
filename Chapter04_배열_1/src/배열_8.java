/*
 *   
 */
import java.util.*;

public class 배열_8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        // 년 월 일 => 결과값 무슨 요일

        System.out.println("년 입력:");
        int year = scan.nextInt();
        System.out.println("월 입력:");
        int month = scan.nextInt();
        System.out.println("일 입력:");
        int day = scan.nextInt();

        System.out.println("==== API 이용 ====");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year); // Calendar.YEAR를 사용하여 연도 설정
        cal.set(Calendar.MONTH, month - 1); // Calendar.MONTH를 사용하여 월 설정 (0부터 시작하므로 -1 해줌)
        cal.set(Calendar.DATE, day); // Calendar.DATE를 사용하여 일 설정

        String[] strWeek = {"", "일", "월", "화", "수", "목", "금", "토"};
        // week =>0 week=>1
        int week = cal.get(Calendar.DAY_OF_WEEK); // Calendar.DAY_OF_WEEK를 사용하여 요일 가져오기
        System.out.println(strWeek[week]); // 요일 출력
        System.out.println(year+"년도"+month+"월"+day+"일은"+strWeek[week]+"요일입니다");
    }
}
