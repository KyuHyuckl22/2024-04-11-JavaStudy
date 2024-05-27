package com.sist.util;
import java.util.*;
/*
 *     1. ArrayList
 *     ------------
 *     2. HashSet
 *     3. Hashmap
 *     4. Properties
 */
public class 라이브러리_4 {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("오렌지");
		set.add("메론");
// 		실무에서는 주로 iterator() 주로 사용한다
//		List 보다는 set 이나  map
//		List 는 주로 for-each
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
