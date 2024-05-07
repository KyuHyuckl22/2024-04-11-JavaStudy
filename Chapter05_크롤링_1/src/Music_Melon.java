//import java.io.FileReader;
//import java.io.FileWriter;
//import java.net.URLEncoder;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//
//class Music   // m. 이 붙으면 이곳에 있는 변수를 가져다 쓰는것임
//{             // m. 으로 설정했기때문  98번 줄
//	String rank;
//	String title;
//	String singer;
//	String album;
//	String poster;
//}
//class MelonMusic {
//	static Music[] musics=new Music[200];  // class 블록은 선언만 하는 위치
//	{
//		try {
////			int k=1;
////			for(int i=1; i<=4; i++){
////				Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get(); // 소스를 싹 긁어와라
//			
////				Elements title=doc.select("tr.lst"+i+"div.wrap  div.rank01 a");    //아래 있는걸 긁어온 것
////	  tr class="lst50" / <td><div class="wrap"> / div class="ellipsis rank01"><span><a href="javascript:melon.play.playSong('1000002721',37460832);" title="SPOT! (feat. JENNIE) 재생">SPOT! (feat. JENNIE)</a>    
//			
////				Elements singer=doc.select("tr.lst"+i+"div.wrap div.rank02 a");
//			
////				Elements album=doc.select("tr.lst"+i+"div.wrap div.rank03 a");
//			
////				Elements poster=doc.select("table.list-wrap a.cover img");
//			
////				for(int j=0; j<title.size(); j++){
////					System.out.println("순위 : "+k++);
////					System.out.println("노래명 : "+title.get(j).text());
////					System.out.println("가수명 : "+singer.get(j).text());
////					System.out.println("앨범 : "+album.get(j).text());         // <> 사이에 들어가면 
////					System.out.println("이미지 : "+poster.get(j).attr("src"));  // >< 사이에 들어가면 attr
//////					System.out.println("동영상 키 : "+youtubeData(title.get(j).text()));
////					System.out.println("======================================");
////					FileWriter fw=
////							new FileWriter("c:\\javaDev\\genie.txt",true);
////					String data=k+"|"
////							+title.get(j).text()+"|"
////							+singer.get(j).text()+"|"
////							+album.get(j).text()+"|"
////							+poster.get(j).attr("src")+"|"
////							+youtubeData(title.get(j).text())+"\r\n";
////					 fw.write(data);
////		               fw.close();
////		               k++;
////				}
////			}			
//			FileReader fr=new FileReader("c:\\javaDev\\genie.txt");
//			int i=0;
//			StringBuffer sb=new StringBuffer();
//			while((i=fr.read())!=-1) {
//				sb.append((char)i);
//			}
//			fr.close();
//			String data=sb.toString();
//			String[] temp=data.split("\n");
//			i=0;
//			for(String s:temp) {
//				String[] ss=s.split("\\|");
//				musics[i]=new Music();
//				musics[i].rank=ss[0];
//				musics[i].title=ss[1];
//				musics[i].singer=ss[2];
//				musics[i].album=ss[3];
//				musics[i].poster=ss[4];
//				musics[i].key=ss[5];
//				i++;
//				
//			}
//			
//		}catch(Exception ex) {}
//	}
//	static void musicList() {
//		System.out.println("========== Music List ==========");
//		int i=1;
//		for(Music s:musics) {
//			System.out.println(i+"."+s.title);
//			i++;
//		}
//	}
//	static void musicDetail(int rank) {
//		try {
//			Music m=musics[rank-1];
//			String url="http://youtube.com/embed/"+m.key;
//			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+url);
//		}catch (Exception ex) {}
//	}
//	static void musictitleFind(String title) {
//		int count=0;
//		for(Music m:musics) {
//			if(m.title.contains(title)) {
//				System.out.println(m.title);
//				count++;
//			}
//		}
//		System.out.println("검색 결과 총 "+ count+"Gun");
//		
//	}
//	
//	static void singerFind(String singer) {
//		int count=0;
//		for(Music m:musics) {
//			if(m.singer.contains(singer)) {
//				System.out.println(m.title+"["+m.singer+"]");
//				count++;
//			}
//		}
//		System.out.println("검색 결과 총 "+ count+"Gun");
//		
//	}
//	static void albumFind(String album) {
//		int count=0;
//		for(Music m:musics) {
//			if(m.album.contains(album)) {
//				System.out.println(m.title+" / ["+m.album+"] "+"/ ("+m.singer+")");
//				count++;
//			}
//		}
//		System.out.println("검색 결과 총 "+ count+"Gun");
//		
//	}
//	
//	static String youtubeData(String title) throws Exception {
//		String result=" ";
//		String url="https://www.youtube.com/results?search_query="
//			       +URLEncoder.encode(title, "UTF-8");
//		Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
////		정규식
//		Document doc=Jsoup.connect(url).get();
//		Matcher m=p.matcher(doc.toString());
//		
//		while(m.find()) {
//			String temp=m.group();
//			
//			temp=temp.substring(temp.indexOf("=")+1,temp.indexOf("\""));
//			result=temp;
//			break;
//		}
//		return result;
//	}
//}
//public class MusicMain {
//
//	public static void main(String[] args) {
//		GenieMusic gm=new GenieMusic();
//		gm.musicList();
//		System.out.println("=======================================");
//		Scanner scan=new Scanner(System.in);
////		System.out.print("1~200 사이의 번호 선택 : ");
////		int no=scan.nextInt();
////		gm.musicDetail(no);
//		System.out.print("검색어 입력 : ");
////		String title=scan.next();
//		String album=scan.next();
////		gm.musictitleFind(title);
////		gm.singerFind(singer);
//		gm.albumFind(album);
//		
//		
//		
//		
////		try {
////			String url="http://youtube.com/embed/js1CtxSY38I\\u0026pp=ygUJQXR0ZW50aW9u";
////			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" + url);
////		}catch(Exception ex) {}
//	}
//
//}
