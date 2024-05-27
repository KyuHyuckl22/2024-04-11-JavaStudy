package com.sist.io;
import java.util.*;
import java.io.*;
public class 라이브러리_2 {
	public static void main(String[] args) throws Exception {
		// 파일 생성 ↓     -> 같은 폴더에는 같은 파일명이 생성되지 않는다
		File file = new File("C:\\Java_date\\student.txt");
		// 존재 여부 ↓
		if(!file.exists()) { // 파일이 없다면
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		}
		else {
			System.out.println("이미 존재하는 파일입니다.");
		}
	}
}
