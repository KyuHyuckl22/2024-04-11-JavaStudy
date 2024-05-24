package com.sist.util;
import java.util.*;
public class 컬렉션_2 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>(); // <<  Object 였던것을 다 String 으로 바꿔준것
//		 추가시 문자열만 추가가 가능하다          
//		 장점 갯수가 자동으로 변한다
		names.add("홍길동"); //0
		names.add("박문수"); //1
		names.add("심청이"); //2
		names.add("이순신"); //3
		names.add("강감찬"); //4
		
		System.out.println("==== 저장된 데이터 출력 ====");
		for(int i=0; i<names.size(); i++){
			String name=names.get(i); 
			System.out.println(i+" : "+name);
		}
		System.out.println("==== 데이터 추가 후에 인덱스 확인 ====");
//		추가시 맨 마지막에 추가를 해야 속도가 빨라진다
		names.add("춘향이"); // 자동으로 5번
		for(int i=0; i<names.size(); i++){
			String name=names.get(i); 
			System.out.println(i+" : "+name);
		}
	    System.out.println("==== 지정된 위치에 추가 ====");
//	    add() => 오버로딩 ==> add(String), add(int index, String)
//	                                    몇번째 인덱스번호에, 무엇을 추가할것인가
	    
	    names.add(3, "이산"); // 자동으로 인덱스 번호 3번으로 들어감
		for(int i=0; i<names.size(); i++){
			String name=names.get(i); 
			System.out.println(i+" : "+name);
		}
		System.out.println("==== 데이터 수정 =====");
//		set(int index, String)
//		인덱스 번호에 해당하는 것을, 이렇게 바꿔라
		names.set(1,"박문수 수정");
		for(int i=0; i<names.size(); i++){
			String name=names.get(i); 
			System.out.println(i+" : "+name);
		}
		names.set(3, "이산 수정");
		for(int i=0; i<names.size(); i++){
			String name=names.get(i); 
			System.out.println(i+" : "+name);
		}
		System.out.println("==== 데이터 삭제 ===="); // 선택한 인덱스 번호를 삭제하고 그 번호를 매꾸기 위해 번호들이 당겨져온다
		names.remove(2);
		for(int i=0; i<names.size(); i++){
			String name=names.get(i); 
			System.out.println(i+" : "+name);
//			결과 2번에 있던 심청이가 빠지면서 '이산 수정' 이 2번이 되었다
		}
		System.out.println("현재인원 : "+names.size());
		System.out.println("==== 전체 삭제 ====");
		names.clear();
		System.out.println("현재인원 : "+names.size());
	}

}
