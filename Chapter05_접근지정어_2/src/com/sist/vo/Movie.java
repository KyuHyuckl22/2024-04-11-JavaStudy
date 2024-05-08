package com.sist.vo;
import lombok.*;
@Data
public class Movie {
//	public 은 공유
//	private 은 비밀
	private int rank;
	private String title;
	private String actor;
	private String director;
	private String grade;
	private String genre;
	private String regdate;
    public Movie() {
    	
    }
    //private => Movie 클래스의 블록
/*
 *   실제 데이터값은 은닉화
 *   ------------ 읽기 / 변경 => 메소드를 이용해서 접근이 가능하게 만든다 : 캡슐화
 *   
 *   변수에 대한 기능을 부여
 *    = 읽기  getter
 *    = 쓰기  setter
 */
	
	
	public static void main(String[] args) {
		
		

	}
}
