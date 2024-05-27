package com.sist.io;
import java.io.*;
import java.util.*;
import java.text.*;
/*
 *   File 관련 
 *       1. 생성자 => 경로명 : 폴더 정보 읽기
 *       			File dir=new File("C:\\javaDev");
 *               => 경로명 / 파일명  : 파일에 대한 정보
 *                  File dir=new File("C:\\javaDev\\파일명");
 *                  
 *       2. 폴더 생성 : mkdir()
 *          파일 생성 : createNewFile()
 *          
 *       3. 폴더 삭제 : delete()
 *                      -> 폴더 안에 파일 or 폴더가 있으면 삭제가 안된다 
 *                                ----------
 *                                    ↓
 *                                  먼저 삭제해야 폴더가 삭제된다
 *          파일 삭제 : delete() --> 삭제
 *       
 *       4. 폴더 안에 있는 파일 or 폴더 의 정보를 읽기 : listFiles() : File[]
 *       
 *       5.    파일명, 경로명
 *        getName(), getPath()
 *        
 *       6. 파일 크기 : leght()
 *       
 */
public class 라이브러리_4 {
//  try-catch 를 쓸거냐 throws 를 사용할것이냐
/*  
 *    코딩이 된 상태라면 throws 
 *    코딩을 시작하는 상태라면 try - catch 
 *    io/sql/net  => 클래스 는 CheckedException 을 갖고있다
 */
	public static void main(String[] args) {
		try {
			File dir=new File("C:\\javaDev");
			// 파일 정보 읽기 ↓  위 경로에 있는 모든 파일 읽기
			File[] list=dir.listFiles();
			for(File file:list) {
				if(file.isFile()) { // 파일
					System.out.print(file.getName()+"   ");
					String s=file.getName();
					s=s.substring(s.lastIndexOf(".")+1); // 확장자 자르기
					System.out.println(s+"파일");
					
//					크기를 눈에 보기 편하게 kb 랑 byte 로 표기한것
//					/1024 !=0?  :  나누기 1024가 0이 아니라면 이라는 뜻
//					String s=file.length()/1024!=0? file.length()/1024+"KB":file.length()+"Byes";
//					System.out.print(s+"   ");
//					System.out.print(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").
//							format(new Date(file.lastModified())));
//					System.out.println();
				}
//				else { // 디렉토리 (폴더)
//					System.out.print(file.getName()+"   ");
//					System.out.print(" 파일 폴더 ");
//					System.out.print(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").
//							format(new Date(file.lastModified())));
//					System.out.println();
//				}
			}
		}catch(Exception ex) {}
	}

}
