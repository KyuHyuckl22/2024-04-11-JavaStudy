package com.sist.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		Set_5 music=new Set_5();
		
		Set<String> genie=music.genieData();
		System.out.println("==== 지니 뮤직 ====");
		for(String title:genie) {
			System.out.println(title);
		}
		System.out.println("==== 멜론 뮤직 ====");
		Set<String> melon=music.melonData();
		for(String title:melon) {
			System.out.println(title);
		}
		System.out.println("==== 지니뮤직에만 있는 곡 ====");
		genie.removeAll(melon);
		for(String title:melon) {
			System.out.println(title);
		}
		
//		System.out.println("==== 멜론에만 있는 곡 ====");
//		melon.removeAll(genie);
//		for(String title:genie) {
//			System.out.println(title);
//		}
//		이렇게만 하면 안됨 이미 지니가 바뀌었으니 위에 멜론을 주석처리를 하던가, temp로 옮겨야 한다
		System.out.println("==== 지니뮤직에만 있는 곡 ====");
		Set<String> gTemp=new HashSet<String>();
		gTemp.addAll(genie);
		gTemp.removeAll(melon);
		
		for(String title:gTemp) {
			System.out.println(title);
		}
		System.out.println("==== 멜론뮤직에만 있는 곡 ====");
		Set<String> mTemp=new HashSet<String>();
		mTemp.addAll(melon);
		mTemp.removeAll(genie);
		for(String title:mTemp) {
			System.out.println(title);
		}
		
		System.out.println("==== 지니뮤직 + 멜론뮤직 ====");
//		 => UNION / UNIONALL
		ArrayList<String> list=new ArrayList<String>(); // Array = 중복 포함  Set = 중복 제거
		list.addAll(genie);
		list.addAll(melon);
		
		for(String title:list) {
			System.out.println(title);
		}
		
		
		System.out.println("==== 지니 + 멜론 (중복제거) ====");
		Set<String> list2=new HashSet<String>();
		list.addAll(genie);
		list.addAll(melon);
		for(String title:list2) {
			System.out.println(title);
		}
		
	}

}
