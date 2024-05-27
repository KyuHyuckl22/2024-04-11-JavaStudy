package com.sist.util;
/*
 *   데이터를 묶어서 한번에 처리
 *     = Iterator() 
 *        = hasNext()  => 위 -> 아래
 *        = next()
 *        = remove()
 *        = hasProvious()  => 아래 -> 위
 *        
 *        
 *     Set / Map => 크롤링 시에 사용
 */
import java.util.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("이순신");
		list.add("강감찬");
		
		System.out.println("==== 일반 형식 출력 ====");
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println("==== 재출력 ====");
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println("==== Iterator ====");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==== 재출력 ====");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// 재출력이 안됨. Iterator 를 사용해서 데이터를 한번 끄집어내면 재출력을 할 수 없다.
		// 단방향. 소진이 되면 데이터가 사라진다
		System.out.println("==== 다시 출력 ====");
		Iterator<String> it2=list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("==== ListIterator ====");
		ListIterator<String> it3=list.listIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		System.out.println("==== ListIterator2 ====");
		ListIterator<String> it4=list.listIterator();
		while(it4.hasPrevious()) {
			System.out.println(it4.previous());
		}
	}

}
