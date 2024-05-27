package com.sist.util;
/*
 *   FileReader 
 */
/*
 *   한줄씩 읽어오는 BufferedReader 가 속도가 훨씬 빠르다
 */
import java.io.*;
public class 라이브러리_11 {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\melon.txt");
			int i=0;
			long start=System.currentTimeMillis();
			String data="";
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			long end=System.currentTimeMillis();
			System.out.println(data);
			System.out.println("걸린 시간 : "+ (end-start));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}catch(Exception ex) {}
		}
		
	}

}
