package com.sist.io;

import java.io.Serializable;
import java.io.*;

/*
 *    ObjectInputStream / ObjectOutputStream
 *  => 객체단위 저장
 *    input = 직렬화      /  output = 역직렬화
 *    
 *    병렬화는 각 객체를 따로따로 저장해야하는데
 *    직렬은 한번에 저장이 가능하다                 (내가 그냥 쓴거라 아닐 수도 있음 나중에 자세하게 알게되면 수정하시길)
 */
import java.util.*;

class Student implements Serializable {
	private int hakbun;
	private String name;
	private int kor, eng, math;

	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

//	디폴트 생성자
	public Student() {
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}

public class 라이브러리_1 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "홍길동", 90, 80, 70));
		list.add(new Student(2, "이순신", 70, 60, 50));
		list.add(new Student(3, "심청이", 80, 50, 40));
		list.add(new Student(4, "김두한", 60, 40, 30));
		list.add(new Student(5, "박문수", 50, 30, 20));
//		객체단위 저장 => list 통으로 저장
		ObjectOutputStream oos = null;
		try {
			File file = new File("c:\\javaDev\\Java_data\\std.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
//			ObjectOutputStream 생성    생성시에 반드시  FileOutputStream 객체를 매개변수로 전송해줘야 함
			FileOutputStream fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
//			객체 단위로 파일을 저장
			oos.writeObject(list); // << 병렬 --> 직렬로 변경
			System.out.println("객체단위 저장 완");
		} catch (Exception ex) {
//			에러 확인
			ex.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception ex) {
			}
		}
	}

}
