/*
 *     Jsoup 은 ->  미리보기에 데이터 출력된 결과만 긁어올 수 있다. (페이지 우클릭 후 소스보기)
 *     
 */
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 메소드_5 {
	static void find(int type,String fd) throws Exception{
		Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
		Elements title=doc.select("div.wrap_song_info div.rank01");
		Elements singer=doc.select("div.wrap_song_info div.rank02 span.checkEllipsis");
		
		for(int i=0; i<title.size(); i++) {
			boolean bCheck=false;
			if(type==1)
				bCheck=title.get(i).text().contains(fd);
			else
				bCheck=singer.get(i).text().contains(fd);
			if(bCheck)
				System.out.println((i+1)+"."+title.get(i).text()+"["+singer.get(i).text()+"]");
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("===== 메 뉴 =====");
			System.out.println("1. 음악 목록"); //멜론
			System.out.println("2. 노래명 검색");
			System.out.println("3. 가수명 검색");
			System.out.println("4. 프로그램 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택 : ");
			int menu=scan.nextInt();
			if(menu==1) {
				Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
				Elements title=doc.select("div.wrap_song_info div.rank01");
				Elements singer=doc.select("div.wrap_song_info div.rank02 ");
				for(int i=0; i<title.size(); i++){
					System.out.println((i+1)+"."+title.get(i).text());
				}
			}
			else if(menu==2) {
				System.out.print("검색어 입력 : ");
				String fd=scan.next();
				find(1,fd);

			}
			else if(menu==3) {
				System.out.print("검색어 입력 : ");
				String fd=scan.next();
				find(2,fd);				
			}
			else if(menu==4) {
				System.out.println("프로그램 종료");
				break;  //for, while => 바로종료
			}
			else {
				System.out.println(" 잘못된 입력입니다 ");
				continue;
				/*
				 *   for(초기값; 조건식; 증가식 )
				 *      continue; ==> 증가식 이동 => 특정부분 제외
				 *    while
				 */
			}
					
		}
	}

}
