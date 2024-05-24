package com.sist.util;
/*
 *   정렬
 *   Collections.sort()
 */
import java.util.*;
public class 컬렉션_6 {

	public static void main(String[] args) {
//		<> ==> 제네릭   제네릭은 반드시 클래스만 지정이 가능하다
//		<int>, <double> => 오류
//		<Integer> , <Double> 사용
		ArrayList<Integer> list = new ArrayList<Integer>(); // wrapper => 제네릭에 첨부, 기능부여
//		정수 =10
		Random r= new Random();
		for(int i=0; i<10; i++) {
//			오토박싱 => Integer i=10
			list.add(r.nextInt(100)+1); // 1~100
		}
		System.out.println("==== list 데이터 출력 ====");
		for(int i:list) {//Integer 로 받았지만 int 로 받기가 가능하다 ==> 언박싱 이라고 함
			System.out.println(i);
		}
		System.out.println("==== 정렬해서 출력 ====");
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(0, 5)); 
//		list => 데이터 5개 복사
		System.out.println("==== 복사된 데이터 출력 ====");
		for(int i:list2) {
			System.out.println(i);
		}
//		5개 추가 
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		System.out.println("==== list2 에 있는 모든 데이터 출력 ====");
		for(int i:list2) {
			System.out.println(i);
		}
		System.out.println("==== list2 정렬 ====");
		Collections.sort(list2);
		for(int i:list2) {
			System.out.println(i);
		}
//		게시판글쓰기, 댓글 등 은
//		실시간으로 바뀌기 때문에 배열을 저장해버릴 수 없다
//		자동으로 변하는 ArrayList 를 사용하는 이유다
	}

}
