/* 
 *  클래스 문제 변수 찾기
 *          1. 랭킹, 타이틀, 포스터, 가수, 앨범, 유지 모양, 등폭, 좋아요
 *          2. 이미지, 이름, 작성자사진, 작성자이름, 별점
 * 			3. 이미지1, 이미지2, 업체명, 업종, 전화번호, 주소, 평점, 테마, 좋아요버튼
 *          4. 영업시간, 히스토리, 휴일, 좌석, 판매, 금연석, 예약정보, 화장실, 주차, 기타, 맛집
 *          5. 아이디, 비밀번호, 비밀번호확인, 이름, 이메일, 우편번호, 주소, 상세주소, 전화번호, 소개
 *          6. 사진배열, 이름, 전화, 음식종류, 영업시간, 주차, 메뉴
 * 			7. 포스터, 제목, 개봉연도, 개봉, 장르, 국가, 등급, 러닝타임, 평점, 순위
 * 			8. 이미지, 상품명, 설명, 할인율, 원가, 첫구매할인가, 별, 배송, 포인트
 * 
 *     int a,b,c,d,e,f;
 *     int[] arr=new int[6]  << 위보다 아래가 더 잘 잡은것이다 데이터를 모아야 편하다
 *
 *     int max=arr[0]
 *     for(int i:arr)
 *     {
 *       if(max<i)
 *         max=i
 *     }
 *     
 *     String[] name
 *     int [] kor
 *     int [] math
 *     int [] eng
 *     int [] total
 *     double [] avg
 *     int [] rank
 *     char [] score
 *     ----------------
 *     class Student
 *     {                                        __         
 *         String name;                          |
 *         int kor,eng,math,total,rank;          |  한개에 들어있는 정보
 *         char score;                           |          |
 *         double avg;                           |          |
 *     }                                                    |
 *     Student[] std=new Student[10]   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *    
 *     
 *     
 */   
public class 클래스문제 {
	class Music {
		int rank;
		String title;
		String poster;
		String singer;
		String album;
		String state; // 유지 상승 하강
		int idcrement;  //등폭
		int like; //좋아요
	}

	public static void main(String[] args) {
		
	}
}
