package com.sist.music;

public abstract class MusicSystem {
/*
 *  전체 데이터를 가지고 있다
 *  데이터 초기화 => 추상 메소드
 *  
 *  목록 출력     구현 
 *  상세보기      구현
 *  검색         구현
 */
//	전체 데이터를 가지고 있다
	public static Music[] musics = new Music[50];
//	데이터 초기화 => 추상 메소드
	public abstract void init(); // 읽어오는 파일명이 다르기때문에 따로 구현
	                             // 여기서 구현하지 않으면 다른 클래스에서 따로 구현할 수 있기때문에 
	                             // 동일한 내용이면 구현을 시켜버리고, 그렇지 않다면 선언만해서 따로 구현한다.
//	목록 출력
	public void list() {
		System.out.println("==== 목록출력 ====");
		int i=1;
		for(Music m:musics) {
			System.out.println(i+"."+m.getTitle());
			i++;
		}
	}
//	상세보기
	public void detail(int mno) {
		System.out.println("==== 상세보기 ====");
		Music m=musics[mno-1];
//	    번호는 1번부터 시작하지만 배열은 0번부터 시작한다
        System.out.println("제목:"+m.getTitle());
        System.out.println("가수명:"+m.getSinger());
        System.out.println("노래명:"+m.getAlbum());
	}
	   // 검색
	   public void find(String title)
	   {
		   System.out.println("=========== 검색 ============");
		   for(Music m:musics)
		   {
			   if(m.getTitle().contains(title))
			   {
			     System.out.println(m.getTitle());
			   }
		   }
	   }
	   //////////////////////////// 구현 
	}