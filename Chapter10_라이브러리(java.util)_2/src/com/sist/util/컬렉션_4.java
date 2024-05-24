package com.sist.util;
import java.util.*;
public class 컬렉션_4 {

	public static void main(String[] args) {
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("박문수");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("심청이");
		System.out.println("==== names1 출력====");
		for(String name:names1) {
			System.out.println(name);
		}
		
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길수");
		names2.add("박문수");
		names2.add("이순신");
		names2.add("강감찬");
		names2.add("심청이");
		System.out.println("==== names2 출력====");
		for(String name:names2) {
			System.out.println(name);
		}
		
		System.out.println("==== 데이터 복사 temp ====");
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1); // 전체 데이터를 추가한다
//		names1 에 있는 모든 데이터를 temp 에 옮긴다
		for(String name:temp) {
			System.out.println(name);
		}
		
		System.out.println("==== 교집합 출력 ===="); // 오라클 에선=> INTERSECT    -> JOIN(INNER JOIN)
		temp.retainAll(names2); // => 지니뮤직, 멜론 
//		temp 와 names2 에 있는 데이터중 같은 내용을 출력하라
		for(String name:temp) {
			System.out.println(name);
		}
//		System.out.println("==== 차집합 출력 ===="); // 오라클 에선=> MINUS        -> OUTER JOIN(LEFT , RIGHT)
////		차집합에는 기준이 있다 name1 이 기준일때와 name2 가 기준일때 결과값이 다를 수 있다
//		names1.removeAll(names2); // 왼쪽이 기준  2를 빼라 1번에서
//		for(String name:names1) {
//			System.out.println(name);
//		} //현재 names1 은 "홍길동" 만 남아버린 상태
//		이렇게 원본이 변해버리면 나중에 불편해짐 때문에 names1 을 temp2 에 담아놓은 후 다시 차집합 찾기
		System.out.println("==== 차집합 출력 ====");
		ArrayList<String> temp2=new ArrayList<String>();
		temp2.addAll(names1); 
		temp2.removeAll(names2);
		for(String name:temp2) {
			System.out.println(name);
		} 
		
		
		ArrayList<String> names3=new ArrayList<String>(names1.subList(0, 3)); //0번부터 3번까지 저장해달라고 명령
		                                               // 마지막 번호 제외됨 => 0 1 2 만 카피를 떠버림 
		                                               // 부분적 복사를 할떄 사용하는게 subList 
		
/*  names1 이 갖고있는 데이터
 *      인덱스 번호
 *  홍길동 0
	박문수 1
	이순신 2
	강감찬 3
	심청이 4	
 */
		System.out.println("==== 부분적 카피 subList (시작 인덱스, 마지막 인덱스)====");
		for(String name:names3) {
			System.out.println(name);
		} 
/*  결과값 : 
 *  홍길동
 *  박문수
 *  이순신 		
 */
	}

}
