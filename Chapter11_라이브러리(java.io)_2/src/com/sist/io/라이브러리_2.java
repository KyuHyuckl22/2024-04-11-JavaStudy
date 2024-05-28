package com.sist.io;
/*
 *    데이터 읽기
 */
import java.util.*;
import java.io.*;
//  파일 입출력 => 프로젝트
// ObjectInputStream / ObjectOutputStream => 사용 빈도가 많이 줄었다
// 이유 => SQL (오라클 연동 을 사용하다보니 파일과 관련된 코드를 많이 사용하지 않게되었다)
// 개인정보 저장 => 네트워크가 연결이 안되면 파일로 저장 (네트워크 에러 발생시를 대비 해놓은것)
// 오라클 정지시 => inputstream / outputstream 을 사용해서 파일에 접근
/*   => JSON / CVS / XML => 파싱(필요한 데이터 읽기) => 오픈 API (라이브러리가 따로 있다)
 *   ☆☆☆jackon CVSReader / CVSWriter , ☆☆☆DOM/SAX
 *           => 파이썬(공공데이터) => CSV (데이터 파일을 읽어올 수 있어야 함) 
 * 
 */
public class 라이브러리_2 {

	public static void main(String[] args) {
		ObjectInputStream ois=null;
		try {
//			객체 생성
			FileInputStream fis=new FileInputStream("c:\\javaDev\\Java_data\\std.txt");
			ois=new ObjectInputStream(fis);
			ArrayList<Student> list=(ArrayList<Student>)ois.readObject();
//			제네릭 까지 데이터형                              
			for(Student s:list) {
				System.out.println(s.getHakbun()+" "
						+s.getName()+" "
						+s.getKor()+" "
						+s.getMath()+" "
						+s.getEng());
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				ois.close();
			}catch(Exception ex) {}
		}
	}

}
