/*
 *    반복문 => 데이터베이스에서 데이터를 읽어올때
 *            파일읽기 / HTML 화면 출력
 * 
 *    1) for / for - each / for 2차
 *       for : 반복문 => 횟수 지정된 상태
 *             형식)               | --> false면 종료
 *                       |start---| -----|      
 *                 for(초기식;    조건식;   증감식)
 *                 {             |<-true  |
 *                     실행문장--------------
 *                 }
 *                 시작점 : 초기화
 *                 조건식 : 범위 (반복횟수)
 *                 -----false가 나올때 까지 수행
 *                 증감식 : 
 *      => 무한루프
 *         for(;;) => while(true)
 *      => for each : 배열 출력 , 컬렉션 출력
 *        ==> 출력 전용
 *           형식)
 *               for(배열에 저장된 데이터를 받을 변수 : 배열)
 *                   ----------------------------
 *                      데이터 형이 항상 일치해야 한다
 *               => 자바스크립트 : forEach , each , map
 *        
 *        ==> 2차 for 문의 형식
 *                 ①      ②
 *            for(초기값 ; 조건식 ; 증감식)
 *            {           | true
 *              --------------------
 *                          | false => 1차 for 증가식으로 이동
 *              for(초기값 ; 조건식 ; 증감식)
 *              {           | true
 *                  실행문장③
 *              }
 *                ------------------문장
 *            }
 *            
 *            for(int i=1; i<=3; i++)
 *            {
 *                for(int j=1; j<=3; j++)
 *                {
 *                    실행문장
 *                }
 *            }
 *                    
 *            i=1 -> i <=3 true
 *                   j=1 문장수행 j++
 *                   j=2 문장수행 j++
 *                   j=3 문장수행 j++
 *                   j=4 false =====> i++
 *            i=2 -> i <=3 true
 *                   j=1 문장수행 j++
 *                   j=2 문장수행 j++
 *                   j=3 문장수행 j++
 *                   j=4 false =====> i++
 *            i=3 -> i <=3 true
 *                   j=1 문장수행 j++
 *                   j=2 문장수행 j++
 *                   j=3 문장수행 j++
 *                   j=4 false =====> i++
 *                   
 *            i=4 -> false -> for문 종료       
 *                           
 *    2) while
 *   
 */
// 3명의 국어 영어 수학 점수를 입력을 받아서 총점 , 평균 , 학점 , 등수 (2차)
import java.util.Scanner;

public class 중첩_for_7 {
	public static void main(String[] args) {
		
		String[] name=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
//		 사용자 입력
//		 처리 결과값
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
//		용도별로 나눠서 저장
//		1. 프로그램에 필요한 변수 / 배열 선언 ** => 저장공간 catch 중요
//		2. 사용자 입력
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<kor.length; i++) {
			System.out.print("이름 입력 : ");
			name[i]=scan.next();
					
			System.out.print((i+1)+"번째 국어 : ");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어 : ");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학 : ");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/(double)kor.length;
			
			switch(total[i]/30) {
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
				break;
			}
			
			
		}
//		순위 결정 
		for(int i=0; i<kor.length; i++) {
			rank[i]=1;
			for(int j=0; j<kor.length; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
			
//		3. 입력된 데이터를 처리 => 요청처리
//		4. 처리한 데이터를 화면 출력(사용자)
//		=> 변수 선언 => 프로그램의 85%
		for(int i=0; i<kor.length; i++) {
			System.out.printf("%-7s%-5d%-5d%-5d%-5d%-7.2f%3c\t%-3d\n",
					name[i],kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
			/*    -5d => ㅁㅁㅁㅁㅁ 칸
			 *           90      점이 나왔다면 왼쪽에 붙여서 3칸 크기를 확보할 수 있다.
			 *     5d => ㅁㅁㅁㅁㅁ 칸
			 *               90  점  +는 왼쪽을 떼는용도   
			 */
		
		
//		순위결정 => 등수 구하기 알고리즘 =>> 정보처리문제 / 중간 기업 코딩테스트
		
		}
		
		
	}


