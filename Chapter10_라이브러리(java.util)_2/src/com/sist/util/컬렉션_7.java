package com.sist.util;
/*
 *   ArrayList
 *   ---------
 *     1. 데이터 중복 허용 (오라클은 데이터 중복을 허용)
 *        -----------
 *        데이터 중복시에는 구분자가 필요하다
 *        ArrayList 는 인덱스를 구분자로 사용한다 (자동으로 추가 , 자동으로 관리) => 0 부터 순차적으로 만들어 준다
 *        
 *        오라클 => ID, 게시물번호, 영화번호, 장바구니 번호
 *             => 중복이 없는 데이터 첨부 => PRIMARY KEY
 *             => 오라클은 자동으로 인덱스 번호가 추가되지 않는다
 *             
 *     2. 기능 (메소드) => 라이브러리는 메소드
 *     ☆☆ 1) 추가하는 기능 => add()
 *        2) 수정하는 기능 => set(index, 데이터) ==> set(몇번째를, 어떻게수정할건지)
 *        3) 삭제하는 기능 => remove(int index) 구분자를 넣고 삭제
 *     ☆☆ 4) 저장갯수     => size() => 댓글, 장바구니.. 
 *     ☆☆ 5) 읽기 기능    => get(int index)
 *     ☆☆ 6) 전체 삭제    => clear()
 *     ☆☆ 7) 데이터 존재여부 확인 => isEmpty()
 *     
 *     3. ArrayList 가 여러개인 경우
 *             영화목록 / 예약목록
 *             쇼핑목록 / 결제
 *             ------  ----  상품번호 / ID 
 *         ex) 1-상품명  
 *             2-가격
 *             3-상품번호
 *               ...           상품번호가 교집합이 된것들만 꺼내와서
 *            자바   오라클       결제를 하는것
 *            파일 = 테이블
 *    -------------------------------        
 *     => retainAll() => 교집합
 *     => addAll() => 전체복사
 *     => removeAll() => 차집합
 *     => subList() => 부분적 복사
 *    -----------------------------------> 오라클 에서는 JOIN 이라고 부른다
 *    
 *     오라클 질문시 JOIN,SUBQUERY 를 자주 물어본다
 *               -------------
 *                 => 여러개의 테이블을 연동 시키는것
 */
import java.util.*;
public class 컬렉션_7 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("홍길동");
		list.add("박문수");
		list.add("이순신");
		list.add("홍길동");
		System.out.println("현재 저장된 갯수 : "+list.size()); // 크기 확인할때 length 가 아닌 size
		list.remove("홍길동");
		System.out.println("현재 저장된 갯수 : "+list.size());
//		자동으로 위에서부터 사용되기때문에 구분자를 줘서 내가 원하지 않는 데이터가 지워질 수 있다 그렇기때문에 구분자가 꼭 필요하다
	}

}
