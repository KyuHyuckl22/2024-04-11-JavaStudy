package com.sist.manager;
import com.sist.vo.*; //Movie 클래스 불러오기
import java.io.FileReader;
//	패키지가 다르면 = import를 통해서 클래스를 읽어온다
/*
 * 
 * 
 *     접근 지정어
 *     ---------------------------------------------------------------
 *       종류       자신의 클래스        같은 패키지        모든 클래스
 *     ---------------------------------------------------------------
 *      private       0
 *     ---------------------------------------------------------------
 *      default       0               0
 *     ---------------------------------------------------------------
 *      protected     0               0 +다른패키지=> 상속을 받은경우        
 *     ---------------------------------------------------------------
 *      public        0               0                0
 *     ---------------------------------------------------------------
 *     
 *     멤벼변수 --> 데이터 보호가 목적 => private
 *       = 인스턴스
 *       = 정적 (공유)
 *     메소드 : 다른 클래스와 통신을 담당(연결) => public
 *     클래스 : 메소드를 이용하거나 멤버변수를 사용 => 다른 클래스에서 사용 => 메모리 할당 => public
 *     생성자 : 메모리 할당시 호출 => public
 * ---------------------------------------우리는 주로 public을 사용
 * 
 * 
 */
import java.util.*;
public class MovieManager {
//	데이터를 고정해서 공유할때 사용 =>> static
//	크롤링해서 저장 => 데이터의 모음 =>> 보여만 주는 상태 static
	public static Movie[] movies=new Movie[1938];
	
//	데이터가 여러개일때 메모리 공간을 한개만 이용해서 접근--> static
//	default 는 이 폴더 안에서만 사용이 가능하다	
	
//	private 를 주고 getter/setter 을 사용할건지
//	public 을 주고 공개를 할건지 선택해야 한다
//	옆사람과 같은 홈페이지를 들어가서 같은걸 보고있다 static
//	모든사람이 볼때는 오라클을 이용한다 페이지에 들어가는 데이터는 같다, 사용자의 동작이 다를뿐
//	인스턴스 변수는 각각 따로 저장이 되는것 (new를 사용했을때) => 따로따로 => 다른 메모리랑 충돌하면 x => 보안 - private 을 이용해서 저장 => 은닉화 
//  서로 입력했을때 주고받는것을 getter / setter 
//	get변수() 내가 답을 들었을때 / set변수() 내가 답을 줄때
//    초기화
/*
 *   생성자 : 초기화
 *   초기화 블록
 *  -----------------------------
 *  static은 new를 사용하지 않는다 => 접근이 가능
 */
//	static에 대한 초기화 블록
	static { // 이 블록을 쓰면 좋은점 
//		컴파일러에 의해 자동처리 ==> 호출하지 않는다 (생성자는 호출해야한다)
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0; // read() => char을 읽지 않고 ASC를 읽어온다-> 문자 번호를 읽어옴
//			A=> 65 => i는 읽어온 정수를 저장할 변수 => char로 변환
			while((i=fr.read())!=-1) { // -1EOF(파일의 끝)
				sb.append((char)i);    // end of file
			}
			fr.close(); //파일 닫기
			// 읽어온 데이터를 => movies에 저장
			String[] strMoStrings=sb.toString().split("\n"); // 한줄씩 배열에 저장
			for(String movie:strMoStrings) {
				String[] m=movie.split("\\|");
				movies[i].setMno(m[0]);
				movies[i].setTitle(m[1]);
				movies[i].setGenre(m[2]);
				movies[i].setPoster(m[3]);
				movies[i].setActor(m[4]);
				movies[i].setRegdate(m[5]);
				movies[i].setGrade(m[6]);
				movies[i].setDirector(m[7]);
				i++;
			}
		}catch(Exception ex) {ex.printStackTrace();}
	
	}
	public static Movie[] getMovieData(int page)
	{
		int total=movieTotalPage();
		int leng=20;
		if(page==total)
			leng=18;
		Movie[] movie=new Movie[leng];
		
		int j=0;  //20개씩 나눠주는 변수
		int rowSize=20;
		int pagecnt=(page*rowSize)-rowSize;
		for(int i=0; i<movies.length; i++){
			if(j<20 && i>=pagecnt) {
				movie[j]=new Movie();
				movie[j]=movies[i]; //movie 배열 => movies에 저장된 내용을 채워준다
				j++;
			}
		}
		return movies;
	}
	static int movieTotalPage() {
		return (int)(Math.ceil(movies.length/20.0));
//		ceil = 올림 메소드
	}
}
