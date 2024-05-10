 package com.sist.manager;
//  사용자의 요청이 있는 경우 처리
//  모든 데이터 관리
/*
 *  1. 데이터 읽기 => 시작과 동시에 => 초기화
 *                              ---- 자동 초기화 / 생성자
 *  2. 요청에 대한 처리 => 메소드
 *    => 전체 목록 (페이지 나누기)
 *    => 검색 결과 출력
 *    => 상세보기
 *    ----------------------윈도우 
 *  3. 패키지 => 관련된 클래스를 모아서 관리
 *    => 접근지정어 => public
 *    
 */
 import java.io.*;
 import java.util.*;
 import com. sist.vo.*;
public class MovieManager {
//	Movie에 있는 모든 데이터를 읽어서 저장 => 변수 => 모든 User가 공통된 데이터를 사용한다
	private static Movie[] movies=new Movie[1938]; // 목록을 저장 => 모든 데이터가 동일
	/*
	 *   변수=> 기본형/ 배열/ 클래스
	 *   Movie : 사용자 정의 데이터형 => 배열, 형변환도 가능하다
	 *   
	 *   초기화 방법
	 *  1. 
	 *   static
	 *   {
	 *   }
	 *     or
	 *  2. 생성자
	 */
//  초기화 => 생성자 => UserMain 에서 사용
	public MovieManager()
	{
//		파일에서 데이터를 읽어서 저장 => 예외처리를 하지 않으면 오류가 생김

		try
		{
//		    정상적으로 수행 => 명령문
//          예외처리는 모든 문장에 있다 => 파일 입출력 / 네트워크 / 데이터베이스 
//			IP 가 들어가면  try-catch 를 사용해야 함
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			
			int i=0; // fr.read()=> 리턴형 => int (문자의 번호를 읽어온다)
			StringBuffer sb=new StringBuffer();  // 읽어서 데이터를 누적
			
			
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			fr.close();
			
			String data=sb.toString();
			String[] temp=data.split("\n");
			i=0;
			for(String s:temp) {
				String[] movie=s.split("\\|");
//				 split, replaceAll => ? , . , + , * , | => 기호 자체 => \\.
//				  ||를 사용하지 않으면 => 연산자로 처리
//				 \"   \'     \\
				movies[i]=new Movie();
				movies[i].setRank(movie[0]);
				movies[i].setTitle(movie[1]);
				movies[i].setGenre(movie[2]);
				movies[i].setPoster(movie[3]);
				movies[i].setActor(movie[4]);
				movies[i].setRegdate(movie[5]);
				movies[i].setGrade(movie[6]);
				movies[i].setDirector(movie[7]);
				i++;
				
			}
			
		}catch(Exception ex){}
}	
		
//	public static void main(String[] args) {
//		MovieManager m=new MovieManager();
//		for(Movie movie:m.movies) {
//			System.out.println(movie.getRank()+"."+movie.getTitle());
//		}
//	}
//	
	public Movie[] movieListData(int page) {
		int total=movieTotalPage();
		int leng=20;
		if(page==total) //마지막 페이지면
			leng=18;
//		배열의 단점: 고정적이기 때문에 배열에 맞춰놔야함 ==> 그것의 보완 (컬랙션) -> 12장
		Movie[] movie=new Movie[leng];
		
		int j=0;  // 20개씩 나눠주는 변수
		int pagecnt=(20*page)-20;
		/*
		 *  1page => 0~19  (20)
		 *  2page => 20~39
		 *  3page =...
		 */
		for(int i=0; i<movies.length; i++) {
			if(j<20 && i>=pagecnt) {
				movie[j]=new Movie();
				movie[j]=movies[i];
				j++;
			}
		}
		return movie;
	}
	public int movieTotalPage() {
		return(int)(Math.ceil(movies.length/20.0)); //ceil 올림
	}
//	상세보기 영화 하나에 대한 정보
	public Movie movieDeteilData(int mno) {
//		배열은 0번부터 시작하기 때문
		return movies[mno-1];
	}
//	검색
	public Movie[] movieFindData(String title) {
		int count=0;
		for(Movie m:movies) {
			if(m.getTitle().contains(title)) { // 제목중 (title) <-얘가 포함되어 있다면 이라는뜻
				count++;
			}
		}
//		선언 할대 갯수먼저 확인해 주고, 그 후 데이터값을 채워줘야 한다 -> 갯수가 동일하면 선언, 동일하지 않을 경우에는 배열을 먼저 잡고 선언해야한다
//		데이터 누수를 방지하기 위해 갯수만큼만
		Movie[] movie=new Movie[count]; // 실행할때마다 요청하는..(동적) => 가변형
		int i=0;
		for(Movie m:movies) {  
			if(m.getTitle().contains(title)) {
				movie[i]=m;
				i++;
			}
		}
		return movie;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		MovieManager m=new MovieManager();
//		int total=m.movieTotalPage();
////		인스턴스 변수 / 인스턴스 메소드 ==> 99:1
//		System.out.println("1~"+total+"사이의 페이지 입력 :");
//		int page=scan.nextInt();
////		데이터 읽기
//		Movie[] movie=m.movieListData(page);
//		for(Movie mm:movie) {
//			System.out.println(mm.getRank()+"."+mm.getTitle());
//		}
		System.out.println("검색어 입력:");
		String title=scan.next();
		
	    Movie[] movie=m.movieFindData(title);
	    for(Movie mm:movie) {
	    	System.out.println(mm.getRank()+"."+mm.getTitle());
	    }
	    
	    System.out.println("=============================================");
	    System.out.print("영화 상세보기 번호입력:");
	    int mno=scan.nextInt();
	    
		Movie mmm=m.movieDeteilData(mno);
//		메소드(요청에 처리 => 기능)
//		처리기능 / 데이터만 있는 클래스 (데이터형)
//		파일 / 오라클 => 데이터만 있는 클래스에 값을 채워서 전송
		System.out.println("순위:"+mmm.getRank());
		System.out.println("영화명:"+mmm.getTitle());
		System.out.println("감독:"+mmm.getDirector());
		System.out.println("출연:"+mmm.getActor());
		System.out.println("장르:"+mmm.getGenre());
		System.out.println("등급:"+mmm.getGrade());
		System.out.println("개봉일:"+mmm.getRegdate());
//		사이트는 | 목록 / 상세보기 / 검색 | 이 기본이다
		
	}
/*
 *   주력
 *   ---
 *     데이터 모으기 : Movie => 멤버변수 중심
 *     ---------
 *     기능설정 => 목록 / 상세 / 검색 / 예약 / 댓글 ..등  메소드로 이루어져 있다 => 액션클래스 -> 메소드 중심
 *              데이터 읽기 => 초기화(전체목록 을) 할때 생성되는 걸 생성자 라고 함
 *     -----
 *     다른 클래스에 활용 : 접근지정어         
 *     ------------   private/ protected/ default => 사용할 수 없다 (접근이 안되기 때문)
 *                    public
 *                    ---> 데이터 : 접근금지
 *                          => 
 */
}

