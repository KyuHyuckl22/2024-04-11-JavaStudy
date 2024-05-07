/*
 *   절차적 언어
 *    => 순차적으로 명령문 (한줄씩 번역)
 *      => 재사용 / 수정 / 추가
 *    => 메소드 : 기능별 나눠서 처리 
 *    => 변수가 메소드 안에서 사용 리턴형 / 매개변수 => 고려
 *    => 전역변수 => 전체 메소드에서 사용하는 변수 => 리턴형 / 매개변수는 고려하지 않는다
 *       -----
 *       지역변수 => 매개변수 포함 => 메소드 블록 => 메소드가 종료되면 사라진다
 *     실무는 전역변수를 사용
 *       전역변수 => 클래스 블록 => 프로그램 종료시에 사라진다
 *       
 *       -------------------------------------- 모든 변수가 전역변수가 되는것은 아니다.
 *       전역변수 : a,b                            공통으로 사용되는 변수가 전역변수가 될 수 있다
 *       지역변수 : c,d,e 
 *       aaa()
 *        => a
 *        => b
 *        => c
 *       bbb()
 *        => a
 *        => b
 *        => d
 *       ccc()
 *        => a
 *        => b
 *        => e
 *      
 *      1. 년도 / 월 / => year / month
 *      2. 요일 => year / month /week /i
 *      3. 출력 => year / month / week /i => 루프변수 (지역변수 )
 *      
 *       사람 =====자판기 
 *       ===     ===
 *       지역변수 =>동전
 */
//      분법 => 메소드 ( 재사용 ) = 실제 프로그램 5장~12 => 웹프로그ㅐㄻ
import java.util.*;

public class 달력만들기_절차적언어 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 년도 입력
        System.out.print("년도 입력: ");
        int year = scan.nextInt();
        
        // 월 입력
        System.out.print("월 입력: ");
        int month = scan.nextInt();
        
        // 월 입력 값 검증
        if (month < 1 || month > 12) {
            System.out.println("잘못된 월 입력입니다. 1부터 12 사이의 값을 입력하세요.");
            return;
        }
        
        // 요일 계산
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, 1);
        
        int week = cal.get(Calendar.DAY_OF_WEEK) - 1; // 일요일부터 시작
        
        // 마지막 날 계산
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        
        // 요일 출력
        String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.printf("%d년 %d월\n", year, month);
        for (String s : strWeek) {
            System.out.print(s + "\t");
        }
        System.out.println("\n");
        
        // 날짜 출력
        int day = 1;
        for (int i = 0; i < 6; i++) { // 최대 6주
            for (int j = 0; j < 7; j++) { // 요일 수
                if (i == 0 && j < week) {
                    System.out.print("\t");
                } else {
                    if (day <= lastDay) {
                        System.out.printf("%2d\t", day);
                    }
                    day++;
                }
            }
            System.out.println();
        }
    }
}
