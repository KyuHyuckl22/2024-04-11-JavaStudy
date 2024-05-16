package com.sist.main2;
/*
 * 2|SPOT! (Feat. JENNIE)|지코 (ZICO)|SPOT!|//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/085/072/667/85072667_1714091257020_1_140x140.JPG/dims/resize/Q_80,0|xfqBQ2XhBCg\u0026pp=ygUUU1BPVCEgKEZlYXQuIEpFTk5JRSk%3D
 */
/*
 * 1|
 */
//  모든 클래스에는 this, super : 상속을 내린 클래스에 접근
//  모든 클래스는 상속을 받는다 => extends Object (생략)
public class Music {
//	다른 클래스에서 사용한다
	private String mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
//	Music 안에서만 사용 가능 => 다른 클래스로 연결하기 위해선 메소드를 이용해서 접근이 가능 => 데이터 보호(캡슐화)
	public String getMno() {
		
		return mno;
	}
	public void setMno(String mno) {
//		매개변수, 지역변수는 임시변수 이다 => 메소드 안에서만 사용이 가능 => 다른 클래스에서는 사용하지 못한다
		this.mno = mno;  // 멤버변수에 저장을 해놓지 않으면 다른 클래스로 넘어갔을때 값이 다 지워져서 null 값이 된다
//		this 는 자신의 클래스 객체 주소를 저장해서 사용
//		this 는 static : 모든 객체는 this 를 가지고 있다
//		this 가 많이 사용되는 곳 => 멤버변수와 지역변수의 이름이 같을때 구분
//		this.mon => Music 이 가지고 있는 변수
	}
	public String getTitle() {
		return title;
//		1. 지역변수나 매개변수를 먼저 찾는다
//		2. 없는 경우 멤버변수를 찾는다
//		지역변수 우선순위
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
}
