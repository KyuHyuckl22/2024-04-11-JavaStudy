package com.sist.user;
// 클라이언트 => 접속자 => 윈도우, JSP, Spring, Kotlin => 화면출력
import java.util.*;
import com.sist.manager.*;
import com.sist.vo.*;
public class UserMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		MovieManager mgr=new MovieManager(); 
//		new는 메모리를 계속 생성하기 때문에 for문 이나 while 문 안에 넣어두면 메모리가 계속 생성된다
//		그게 문제가 생길 수 있으니 반복문을 사용할때는 new를 빼두
		while(true) {
			System.out.println("========== 메 뉴 ==========");
			System.out.println("1. 목록");
			System.out.println("2. 검색");
			System.out.println("3. 상세보기");
			System.out.println("4. 종료");
			System.out.println("==========================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==1) {     //movieTotalPage 가 public 이기 때문에 끌어다 쓰기가 가능하다
				int total=mgr.movieTotalPage();
				System.out.println("1~"+total+"사이의 페이지 입력:");
				int page=scan.nextInt();
//				데이터를 읽어와라 요청
				Movie [] movie=mgr.movieListData(page);
				for(Movie m:movie) {
					System.out.println(m.getRank()+"."+m.getTitle());
				}
			}
			else if(menu==2) {
				System.out.println("검색어 입력:");
				String title=scan.next();
				Movie[] movie=mgr.movieFindData(title);
				for(Movie m:movie) {
					System.out.println(m.getRank()+"."+m.getTitle());
				}
			}
			else if(menu==3) {
				System.out.println("번호 입력:");
				int mno=scan.nextInt();
				Movie mmm=mgr.movieDeteilData(mno);
			}
			else if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("없는 메뉴 입니다");
			}
		}
	}

}
