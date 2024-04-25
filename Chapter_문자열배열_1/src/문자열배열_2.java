/*
 *   startsWith / endsWith  => Cookie
 *   자동 완성기 
 */
import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		
		String[] books= {
				"자바와 오라클",
				"자바로 시작하는 웹 프로그램",
				"자바와  JSP",
				"JSP와 오라클",
				"JSP와  Ajax",
				"Ajax와 JQuery",
				"혼자 배우는 자바",
				"자바 프로그래밍",
				"오라클 AND 자바",
				"최신 자바"				
		};
//		데이터 모음
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd=scan.next();
		for(String book:books)
		{ //이 제목 안에    이 단어로 시작했는가- startsWith
//			if(book.     startsWith(fd))
//			if(book.     endsWith(fd))
//			이 제목 안에    이 단어로 끝나는가 - endsWith
			if(book.     endsWith(fd)||book.     startsWith(fd))  //앞단어시작과 뒷단어 포함  ===> contains 가 훨씬 간결하다
			{
				System.out.println(book);
				try
				{
					Thread.sleep(600);
					
				}catch(Exception ex) {}
			}
		}
			

	}

}
