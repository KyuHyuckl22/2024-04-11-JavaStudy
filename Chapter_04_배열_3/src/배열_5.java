import java.util.*;
import java.io.*;
public class 배열_5 {
																		  // "C:\javaDev\Java_data\데이터모음\seoul_location.txt"
	public static void main(String[] args)throws Exception {              //c:\\java_data\\seoul_location.txt
		FileReader fr=new FileReader("C:\\javaDev\\Java_data\\데이터모음\\seoul_location.txt");//  C:\javaDev\Java_data\데이터모음
		String data="";
		int i=0;
		//fr => 한글자씩 => ASC 코드로 읽어옴 => 'A' --> '65'
		// 
		while((i=fr.read())!=-1)   //-1 파일 끝 (EOF)
		{
			data+=(char)i;
		}
		fr.close();
//		System.out.println(data);
		String[] location=data.split("\n");
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("========== 메뉴 ==========");
			System.out.println("1. 목록");
			System.out.println("2. 명소 검색");
			System.out.println("3. 주소 검색");
			System.out.println("4. 종료");
			System.out.println("=========================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==4) {
				System.out.println("프로그램 종료");
				break; //종료
			}
			else if(menu==1) {
				for(String loc:location) {
					String[] locData=loc.split("\\|");
					System.out.println("명소명 : "+locData[1]);
					System.out.println("명소소개 : "+locData[2]);
					System.out.println("위치 : "+locData[3]);
					System.out.println("==============================================================================");

				}
			}
			else if(menu==2) {
				System.out.print("검색어 입력 : ");
				String fd=scan.next();
				for(String loc:location) {
					if(loc.contains(fd));
					String[] locData=loc.split("\\|");
					System.out.println("명소명 : "+locData[1]);
					System.out.println("명소소개 : "+locData[2]);
					System.out.println("위치 : "+locData[3]);
					System.out.println("==============================================================================");
				}
			}
			
			// 메소드로 처리 => 중복 제거 , 재사용
			else if(menu==3) {
				System.out.print("주소 입력 : ");
				String address=scan.next();
				for(String loc:location) {
					if(loc.contains(address));
					String[] locData=loc.split("\\|");
					System.out.println("명소명 : "+locData[1]);
					System.out.println("명소소개 : "+locData[2]);
					System.out.println("위치 : "+locData[3]);
					System.out.println("==============================================================================");
			}
		}
			
				
			
		}

	}

}
