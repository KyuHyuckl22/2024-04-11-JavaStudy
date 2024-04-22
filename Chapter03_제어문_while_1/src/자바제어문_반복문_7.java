/*
 * 파일출력 / DB 출력 / 네트워크 서버
 * 			  |뒙    	|애플리케이션=> 자바=>C/C++	|
 */
import java.io.FileReader;
import java.util.*;
import java.io.*;
public class 자바제어문_반복문_7 {
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
		int i=0;
		while ((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
		
	}
}
