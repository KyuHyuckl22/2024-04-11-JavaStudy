package com.sist.util;
/*
 *   ArrayList     에 있는 함수 잘 기억하기
 *     => add(), remove(), set(), size(), get(), isEmpty(), clear() 
 *       ------                   ------  -----             -------     << 주로 쓰이는 것들
 *     => ArrayList 에는 한개만 저장
 *        ArrayList 가 두개 이상인 경우 => JOIN을 사용
 *        
 *        retainAll() = 두개의 List 에서 같은 값을 가져올때 (교집합)
 *                      --------------------------
 *                      장바구니에서 중복구매를 할때
 *        addAll() = 전체 데이터 복사할때
 *        removeAll() = 한쪽에 없는것만 가져올때 (차집합) 
 *        subList()  = 부분 복사 할때 (범위 지정해서 사용)
 *        asList() = 배열을 ArrayList 로 변경
 *        
 */
import java.util.*;
public class 컬렉션_5 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		for(String s:list)
			System.out.println(s);
//		addAll() => Set 에 저장되있는것을 복사가 가능하다
//		하나씩 첨부할때 add(), 한번에 처리할때 addAll()
		
//		asList 는 클래스는 첨부가 불가능하다 -> 기본형 or String 만 가능
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		for(String s:list)
			System.out.println(s);

	}

}
