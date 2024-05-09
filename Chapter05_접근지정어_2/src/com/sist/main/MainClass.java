package com.sist.main;

//  Movie 를 불러온다
import com.sist.vo.Movie;
//     클래스가 다른 폴더에 저장된 경우는 반드시 import를 이용해서 불러온다
//           ------- 자바에서는 패키지
/*
 *    private / public
 *    
 *    변수 => private => 데이터 공개 (x)
 *        => 접근이 가능하게 만든다 --> get변수명() , set변수명()
 *    메소드 / 클래스 / 생성자 => 다른 클래스에서 연결해줘야함 -> public
 *    127p
 */
public class MainClass {

	public static void main(String[] args) {
//		메모리에 저장
		java.util.Date date=new java.util.Date(); //클래스 충돌시에 사용법
		Movie movie=new Movie();
		movie.setRank(1);
		System.out.println("순위: "+movie.getRank());
	}

}
