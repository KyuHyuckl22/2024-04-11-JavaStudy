package com.sist.util;
import java.io.*;
/*
 *   File
 *   InputStream                  OutputStream        ====> 바이트 스트림
 *       |                             |
 *   FileInputStream              FileOutputStream
 *   => 파일 읽기                    => 파일 쓰기           => 1byte씩 읽어서 출력 / 입력
 *   => read()                    => write()           => close()
 *  -------------------------------------------------------------------------  다운로드 /업로드
 *        Reader                 Writer               ====> 문자 스트림
 *          |                      |
 *       FileReader             FileWriter
 *       => 파일 읽기              => 파일 쓰기
 *       => read()              => write()       => 2byte씩 읽어서 출력 / 입력  => close()
 *  ------------------------------------------------------------------------- 한글이 포함된 데이터를 입출력 
 *    ☆☆ 한글은 한 글자당 2byte 
 *    
 *    바이트 스트림 : 1byte 전송(파일) => 파일 업로드, 네트워크 송수신 (인코딩, 디코딩)
 *    문자 스트림 : 2byte 전송 (파일을 제어)
 *    필터 스트림 : 실제 하드디스크에 있는 모든 내용을 메모리에 올려놓고 시작 => 속도가 빠르다
 *    ---------- BufferedInputStream / BufferedoutputStream
 *    ---------- BufferedReader / BufferedWriter
 *    IO
 *      => 메모리 입출력
 *         ----------
 *             표준입출력 => 358p
 *                 System.out : 출력 => print(), println(), printf()
 *                 System.in  : 입력 => read()
 *                 ---------> 예외처리가 필요 ...
 *      => 파일 입출력
 *      => 네트워크 입출력
 *      => 단점 : 단방향 통신을 한다
 *         ------------------- 읽기 / 쓰기 따로 만들어 진다  ==> 빨대(들이마시면서 한번에 뱉을 수 없다)
 *      => 만약에 양방향으로 통신 => 프로그램을 두개 동작 (읽기/쓰기)
 *                            --------------> 쓰레드 (네트워크)
 *                               
 *      
 *      
 */
// 파일 입출력
public class 라이브러리_5 {

	public static void main(String[] args) {
//		FileInputStream fis=null; //이렇게 사용하면 한글이 깨진다
		FileReader fis=null; // 한글이 포함 텍스트를 제어
		try {
			File file=new File("C:\\javaDev\\javaStudy\\Chapter10_라이브러리(java.util)_4\\src\\com\\sist\\util\\라이브러리_1.java");
			fis=new FileReader(file);
			// 가급적이면 try 존 에서 close 를 안하는것이 좋다
			// 오류가 났을때 catch 존으로 넘어가면 파일이 닫기지 않기 때문이다
			int i=0;
			while((i=fis.read())!=-1) { //-1 EOF(End Of File) 파일 끝까지
				System.out.print((char)i); //360p 
			}
		}catch(Exception ex) {
			ex.printStackTrace(); // 에러 확인
		}
		finally {
			// 정상 수행 (try) / 오류 발생(catch) 상관없이 무조건 수행하는 문장
			try {
				fis.close();
			}catch(Exception e) {}
		}
		
	}

}
