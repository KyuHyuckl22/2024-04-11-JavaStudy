package com.sist.util;
// 파일 읽기 =>FileInputStream / FileReader
/*           1byte 씩 읽어서      2byte 씩 읽어서
 *            한글이 깨진다         한글 정상수행
 *            
 *   --> 한글을 읽을때 1byte 를 2 byte 로 변경해서 읽기 => BufferedReader
 *  
 */
import java.io.*;
public class 라이브러리_10 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try { //읽을 파일 설정
			fis=new FileInputStream("c:\\javaDev\\melon.txt");
////			영문, 숫자, 특수문자는 상관이 없다 => 영어가 아닌 다른 언어는 다 깨진다
//			int i=0;
//			String data="";
//			while((i=fis.read())!=-1) { //파일이 끝날때까지 읽는다
//				data+=(char)i;
//			}
//			
//			System.out.println(data);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(fis));
//													 -----------------
//														1byte   2byte 를 1byte 로 읽어온다
			String data="";
			long start=System.currentTimeMillis();
			while(true) {
				String s=br.readLine(); // 한 줄씩 읽기
				if(s==null) break; //문장이 끝나면
				data+=s+"\n";
			}
			long end=System.currentTimeMillis();
			System.out.println(data);
			System.out.println("걸린시간: "+(end-start));
			
		}catch(Exception ex) {
			ex.printStackTrace(); // 에러 확인 (어디서 난지 알아야 복구하기 좋음)
		}
		finally {
			// 에러가 나오든 정상적으로 수행하든 반드시 닫는다
			try {
				fis.close();
			}catch(Exception ex) {}
		}
	}

}
