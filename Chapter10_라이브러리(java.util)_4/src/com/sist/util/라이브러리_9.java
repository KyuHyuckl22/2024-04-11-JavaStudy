package com.sist.util;
/*
 *    파일 쓰기 => 문자 스트림 (2byte기 때문에 한글 사용이 편리)
 *    FileWriter
 */
import java.io.*;
public class 라이브러리_9 {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\javaDev\\Java_data\\board.txt",true); //없을 경우 자동 생성
			//                       ,true 를 주지 않으면 덮어쓴다   단 폴더는 생성하지 않는다
			//                        true 를 준다면 덮어쓰지 않는다
			String msg="ABCDEFG HHHHHHHHHHHHHHHHH111122222333\r\n";
			//                               때문에 true 를 주면 \r \n 을 주는게 좋다
			fw.write(msg);
			System.out.println("저장 완");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}catch(Exception ex) {}
		}
				
	}

}
