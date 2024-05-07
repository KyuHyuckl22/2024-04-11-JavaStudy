/*
 *    1|쇼생크 탈출|드라마|https://movie-phinf.psttic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
 *    |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
 *    |2016 .02.24 재개봉, 1995 .01.28 개봉
 *    |15세 관람가
 *    |프랭크 다라본트
 *
 * 
 */
import java.util.*;
import java.io.*; //파일 입출력 => 데이터 읽기 => 메모리에 저장
//  사용자 정의 데이터형 ==> 한개에 대한 영화 정보 => 응용
class Movie {
	String mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}
public class 멤버변수_초기화 {
    Movie[] movies=new Movie[1938]; // 선언만 하는 영역
/*
 *    m 
 *      => movies[1938]
 *      => m.movies     
 */
//     멤버변수 => 프로그램 종료시까지 유지
//     초기화 => 시작
//     파일 읽기=> 구현을 하기 위해서는 {} 블록을 열고 닫아야 한다
    {  
    	try
    	{
    		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
//    		파일 읽기 => 반드시 예외처리
    		StringBuffer sb=new StringBuffer();
//    		문자열을 임시로 저장하는 클래스
//    		+ 보다 Buffer 를 사용하는게 더 빠름
    		int i=0; // 파일의 글자읽기 -> ASC => 정수형
    		String m="";
    		while((i=fr.read())!=-1) {
    			sb.append((char)i);
//    			m+=(char)i;
    		}
    		fr.close();
//    		System.out.println(m);
    		String temp=sb.toString();
//    		String => 메소드 활용
    		String[] movie=temp.split("\n");
    		int j=0;
    		for(String mm:movie) {
    			movies[j]=new Movie(); // 클래스 초기화를 해서 new 사용으로 저장할 공간을 만든다 
    			String[] data=mm.split("\\|"); // | 를 찾아서 나눠놓기
    			movies[j].mno=data[0];
    			movies[j].title=data[1];
    			movies[j].genre=data[2];
    			movies[j].poster=data[3];
    			movies[j].actor=data[4];
    			movies[j].regdate=data[5];
    			movies[j].grade=data[6];
    			movies[j].director=data[7];
    			j++;
//    			하나의 영화 공간에 들어있는 데이터
    		}
    	}catch(Exception ex) {}
    }
//    목록 출력
//    static Movie[] movieListData() {
//    	return movies;
//    	
//    }  (static 은 static 만 부를 수 있다)
    
	public static void main(String[] args) {
//		
		멤버변수_초기화 m=new 멤버변수_초기화();
		Scanner scan=new Scanner(System.in);
/*		System.out.println("===== 영화 목록 =====");
		for(Movie movie:m.movies) {   //클래스 변수. 을 찍고 접근해야 한다
			System.out.println(movie.mno+"."+movie.title);
		}
		System.out.println("===== 출연자 검색 =====");
		System.out.print("출연자명 입력 : ");
		String actor=scan.next();
		int count=0;
		for(Movie movie:m.movies) {
			if(movie.actor.contains(actor)) {
				System.out.println(movie.title+"("+movie.actor+")");
				count++;
				
			}
		}
		System.out.println("출연한 영화 총"+count+ "건입니다");
		System.out.println("===== 영화명 검색 =====");
		System.out.print("영화명 입력 : ");
		String movieName=scan.next();
		count=0;
		for(Movie movie:m.movies) {
			if(movie.title.contains(movieName)) {
				System.out.println(movie.title+"("+movie.actor+")");
				count++;
				
			}
		}
		System.out.println("출연한 영화 총"+count+ "건입니다");
		
		System.out.println("===== 시청 연령 검색 =====");
		System.out.print("나이 입력 : ");
		String grade=scan.next();
		count=0;
		for(Movie movie:m.movies) {
			if(movie.grade.contains(grade)) {
				System.out.println(movie.title+"("+movie.grade+")");
				count++;
				
			}
		}
		System.out.println("===== 장르 검색 =====");
		System.out.print("장르 입력 : ");
		String genre=scan.next();
		count=0;
		for(Movie movie:m.movies) {
			if(movie.genre.contains(genre)) {
				System.out.println(movie.title+"("+movie.genre+")");
				count++;
				
			}
		}
		System.out.println("===== TOP 10 =====");
		for(int i=0; i<10; i++) {
			System.out.println(m.movies[i].mno+"."+m.movies[i].title);
		}*/
//		영화 번호 입력, 그 입력에 맞는 영화를 불러와서 상세정보창 띄우기
		System.out.print("1~1938번 사이의 정수 입력 : ");
		int no=scan.nextInt();
		Movie mm=m.movies[no-1];
		System.out.println("순위 : "+mm.mno);
		System.out.println("영화명 : "+mm.title);
		System.out.println("출연 : "+mm.actor);
		System.out.println("이미지 : "+mm.poster);
		System.out.println("장르 : "+mm.genre);
		System.out.println("등급 : "+mm.grade);
		System.out.println("감독 : "+mm.director);
		
		
	}

}
