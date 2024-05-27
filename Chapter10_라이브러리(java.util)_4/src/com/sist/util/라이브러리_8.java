package com.sist.util;
/*
 *   파일 쓰기 FileWriter
 *       => 크롤링한 데이터를 저장
 *   파일 읽기 FileReader
 *       => 프로그램 제어
 *       => 읽기 => 한줄씩 (파일에 있는 데이터를 메모리에 한번에 저장) / 한글자(파일에 있는 데이터를 한개씩)
 *       => 필터 스트림 => BufferedReader ☆☆☆☆☆☆☆ (네트워크, 웹) 369p
 *       
 *   FileWriter (FileOutputStream) => write(), close() 메서드 기억하기
 *   FileReader (fileInputStream) => read(), close() 메서드 기억하기
 *       => 한 글자씩 읽기 / 한 글자씩 쓰기
 *         ----------    -----------> 여러글자 입력이 가능
 *             FileWriter => write(String s) String 을 넣을 수 있다
 *             FileOutputStream => write(byte[]) byte 배열을 넣을 수 있다
 *             
 *             String 에서 byte[] 변환
 *             String s="aaa";
 *                    s.getBytes()
 *                    
 */
// 파일에 저장
import java.io.*;
public class 라이브러리_8 {

	public static void main(String[] args) {
//		1. FileOutputStream 을 이용한 저장
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("c:\\javaDev\\Java_data\\member.txt");
			// 파일이 없는 경우에는 자동 생성이 된다
			// 파일이 있는 경우에는 문자 저장이 가능.
			// Read 는 자동 생성이 안됨
			// FileOutputStream , FileWriter  이 둘은 경로명과 파일명을 지정하면 파일이 없는 경우 자동 생성이 된다
			// 한 글자 입력 : byte(int,char) / 할 것인지 / 여러글자 한 번에 입력 : (byte[])
//			fos.write('A');
//			fos.write('B');
//			fos.write('C');
			String msg="ABCDEFG HIJKLMNOP QRS TUV WXYZ";
			fos.write(msg.getBytes());
//			↑ byte 단위로 저장 
			System.out.println("저장 완료!");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}catch (Exception ex) {
				
			}
		}
		
	}

}
