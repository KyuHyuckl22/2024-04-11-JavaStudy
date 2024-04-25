/*
 *  자바 => Application / Web / Mobile
 *   					----                                 ----------------> 언어 통합 Dart 
 *   개발 방법                               HTML<-web<-자바     코틀린 /스위프트              Flutter
 *   ------                                        브라우저 / 모바일                       React Native
 *   데이터 저장 =====> 데이터 가공(사용자 요청에따라) ======> 화면에 출력
 *   --------        ---------------------    
 *   |                   명령문을 모아서 관리                                       메소드*******
 *   |                   ---------------                                      게시판
 *   |                   = 사용자 입력부분                                         = 목록출력기능 => 묶는다
 *   |                   = 사용자 요청처리 부분									   = 글쓰기 
 *   |                   = 결과값 도출											   = 상세보기
 *   |                   -------------------> 장점                              = 삭제
 *   한개 저장 : 변수                               1) 재사용                        = 수정
 *   여러개 저장 : 배열 , 클래스                       2) 유지보수가 편리                 = 검색 
 *   ** 배열  (4장) [배열의 특징]                     -----------------------       => 오더가 요청
 *     => 일차원 배열                                => 변수 / 메소드 == 클래스(조립)    = 댓글형 게시판
 *     => 같은 데이터 여러개 모아서 관리(한개 이름으로 처리)                                 =게시판 => 상속 받아서 처리 => 댓글추가
 *     => 장점                                                                          => 재사용(유지보수)
 *       -> 변수 여러개를 한개의 이름으로 제어 => 반복문 사용이 편리해짐                        
 *          연속적 메모리 공간을 만든다
 *          ---- 인덱스 번호를 사용해서 처리
 *     => 단점 
 *       -> 고정적이다 => 추가 , 삭제하기가 어렵다 (더 큰 배열, 작은 배열)
 *          같은 데이터형만 모아서 관리
 *          ==> 보완 (가변형 , 다른 데이터형을 모아서 관리 = **컬렉션 => 12장)
 *   ** 클래스 (5장)
 *     => 다른 데이터를 여러개 모아서 관리 ( 한개 이름으로 처리 )
 *   ** 변수 / 연산자 / 제어문 => 기본 문법 
 *      ---------------- 모아서 관리
 *   ** ex)변수 100개 사용 => a1~a100 최대값 , 최소값 구하기 => if문만 99개를 사용해야한다
 *         하지만 배열을 사용하면 5줄정도면 끝낼 수 있다.
 *              
 *   ** 변수 / 배열 / 클래스 => 메모리에 저장: RAM 프로그램 종료시 삭제
 *      ----------------------------
 *      | 영구적인 저장 장치
 *        = 파일 => 파일 여러개를 연결해서 사용하기 어렵다 , 보안에 취약
 *        = RDBMS => 관계형 데이터베이스
 *          파일 => table
 *          ========================오라클 / MySQL / MS-SQL / MariaDB
 *                                         -----            -------
 *                                             |            | 
 *                                             ----------------- 무료버전 
 *                                                              (3차 프로젝트때 MySQL / MariaDB 선택)
 *                                         
 *    개발 => 누가 잘 모아서 관리 하는가 
 *                 ------------- 수정,삭제,추가가 쉽게 만드는 작업
 *                 => 변수 + 연산자 + 제어문 => 기능별로 모아서 처리 
 *                 => 패키지 ex)java.io
 *                            java.util
 *                            java.swing
 *                           ------------
 *                          1차 에서 만든것을 2차 에 끌어다 사용
 *                         ---           ---
 *                         JSP           Spring
 *                         ----Spring형식
 *    *** 1. 변수 여러개를 모아서 관리
 *      int a,b,c,d,e,f,g;
 *          ------------- 
 *          int [] arr=new int[7];
 *          |	    |      ------ 저장하는 갯수 
 *          |       --- 배열명
 *          ----- 배열 데이터형
 *     double b1,b2,b3....
 *          double[] arr=new double[갯수]                          
 *                 
 *                 
 *    p84 --> 배열의 필요성             
 */
import java.util.Scanner;
//  	3명의 학생 => 국어,영어,수학=> 1.총점 2.평균 3. 학점
public class 배열_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;
		char score1,score2,score3;
		
		// 점수 입력
		System.out.print("첫번째 학생의 국어점수:");
		kor1=scan.nextInt();
		System.out.print("첫번째 학생의 영어점수:");
		eng1=scan.nextInt();
		System.out.print("첫번째 학생의 수학점수:");
		math1=scan.nextInt();
		
		System.out.print("두번째 학생의 국어점수:");
		kor2=scan.nextInt();
		System.out.print("두번째 학생의 영어점수:");
		eng2=scan.nextInt();
		System.out.print("두번째 학생의 수학점수:");
		math2=scan.nextInt();
		
		System.out.print("세번째 학생의 국어점수:");
		kor3=scan.nextInt();
		System.out.print("세번째 학생의 영어점수:");
		eng3=scan.nextInt();
		System.out.print("세번째 학생의 수학점수:");
		math3=scan.nextInt();
		//총점 계산
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		//평균 계산
		avg1=total1/3.0;
		avg2=total2/3.0;
		avg3=total3/3.0;
		//학점
		switch(total1/30)
		{
		case 10: case 9:
			score1='A';
			break;
		case 8:
			score1='B';
			break;
		case 7:
			score1='C';
			break;
		case 6:
			score1='D';
			break;
			default:
				score1='F';
		}
		switch(total2/30)
		{
		case 10: case 9:
			score2='A';
			break;
		case 8:
			score2='B';
			break;
		case 7:
			score2='C';
			break;
		case 6:
			score2='D';
			break;
			default:
				score2='F';
		}
		switch(total3/30)
		{
		case 10: case 9:
			score3='A';
			break;
		case 8:
			score3='B';
			break;
		case 7:
			score3='C';
			break;
		case 6:
			score3='D';
			break;
			default:
				score3='F';
		}
		//결과값 출력
//		%-5d   5칸중 왼쪽정렬     %5d  5칸중 오른쪽 정렬
//		-----                -----
//		00000                00000
//		90---                ---90
//		
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
				+ kor1,eng1,math1,total1,avg1,score1);
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
				+ kor2,eng2,math2,total2,avg2,score2);
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
				+ kor3,eng3,math3,total3,avg3,score3);
		
	}
}
