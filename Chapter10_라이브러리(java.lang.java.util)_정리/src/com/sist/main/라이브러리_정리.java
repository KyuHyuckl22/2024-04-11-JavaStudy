package com.sist.main;

import java.util.Arrays;

/*
 *   자바에서 지원하는 클래스들의 집합 == 라이브러리    (완제품 이며, 특별한 경우가 아니면 그대로 사용한다)
 *   => 운영체제와 연결 => API (Application Program Interface)
 *   => 자바에서는 관련된 클래스 끼리 분류를 해놨는데 그 분류한 것을 패키지 라고 한다.
 *      자바의 패키지 
 *  ☆☆☆ java.lang : 자바의 기본 클래스 -> import 생략이 가능하다
 *        -> Object : 최상위 클래스 -> 모든 클래스의 상속을 내려주는 클래스
 *                    extends Object
 *                    ---------------
 *                    객체와 관련된 기능 (메소드) 를 제공
 *                    = 메모리 할당시 주소값 확인 : toString()
 *                    = 객체 사용시 복제해서 사용 : clone()
 *                               ---  새로운 메모리를 만들어서 사용
 *                    = 객체 소멸자, 메모리가 해제시 호출 : finalize()
 *            ☆☆☆☆☆   = 객체 메모리 주소를 리턴 => 필요시에는 변경이 가능 : HashCode()
 *            ☆☆☆☆☆   = 객체 비교 : equals
 *            ☆☆☆☆☆   Object가 가지고 있는 기능 => 모든 클래스에서 사용이 가능
 *                                           --------------------- 필요시에는 오버라이딩해서 사용이 가능
 *                                                                         ------
 *                                                                          메소드 내용을 변경
 *                                                                          => toString()
 *                                                                          => hashCode()
 *        -> String : 문자열을 저장하는 클래스
 *                    String s=" " 
 *                    String s= new String("")   => 새로운 메모리에 저장해서 사용, 한글 변환 코드
 *                    C언어      자바언어
 *                    ----     ------
 *                    ASC       Unicode   ==> UTF-8  = 한글변환을 도와주는 애구나~ 라고 생각해놔도 좋음
 *                 한글이 깨짐       각국의 언어를 
 *           한글이 깨지면 포인터를     사용이 가능하게 
 *                 사용해야함         만들어준다                 
 *                  1byte         2byte
 *                  Encoding / Decoding
 *                   브라우저는 C언어로 만들어져있다
 *                   
 *                   
 *                         Encoding
 *                     자바    ==>   브라우저
 *                     자바    <==   브라우저
 *                         Decoding
 *                          
 *                     자바라는뜻 = %EC%9E%90%EB%B0%94
 *      ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆               
 *            기능 (메소드)
 *            1. 문자의 갯수 : length()
 *            2. 문자를 있는 그대로 가지고 오기 : toString()
 *            3. 문자 변환 : replace(), replaceAll()
 *            4. 문자 위치찾기 : indexOf(), lastIndexOf
 *            5. 문자제어 자르기 : subString(), split()
 *            6. 공백문자 제거 : trim()
 *            7. 모든 데이터형을 문자열 변환 : velueOf()
 *            8. 비교 : equals(), 
 *            9. 검색 : startsWith(), endsWith(), contains() 
 *            => 웹의 핵심
 *               1) 문자열 제어
 *               2) 데이터베이스 연동
 *                --------------- => 웹 프로그램의 92% 를 차지하고 있다
 *      ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆         
 *                
 *        -> StringBuffer : 문자열 결함
 *          => append()
 *        -> Math : 수학
 *          => 올림 : ceil()
 *          => 난수발생 : random()  <--예전 쓰던거 | 요즘 쓰는거 --> Random 클래스를 주로 사용
 *        -> System
 *          => exit() : 프로그램 종료
 *          => gc() : 메모리 회수
 *        -> Wrapper ==> 제네릭에서 주로 사용
 *          = Integer : parseInt() => 문자열을 정수형 변환
 *          = Double : parseDouble() => 문자열을 실수형 변환
 *          = Boolean : parseBoolean() => 문자열을 논리형 변환
 *  ☆☆☆ java.util : 프로그램 사용에 유용하게 사용할 수 있게 만든 클래스 집합
 *        -> Random : 난수발생
 *          => nextInt()   =>  nextInt(100) ==> 마지막 숫자는 제외되기 때문에 0~99
 *        -> Date : 기능이 없다(메서드가 없다) => 생성 Date date = new Date()
 *          => 오라클 날짜 데이터와 호환 => 데이터베이스 호환
 *        -> Calendar : Date에 없는 기능을 첨부해준다
 *          => 추상 클래스로 되어있다
 *             -------=> new 를 사용할 수 없다
 *            -> Calender cal = Calendar.getInsteance()
 *              주로 요일, 마지막 날 구하기 에 사용
 *              => 예약, 예매 에 필요한 달력만들기 할때 주로 사용
 *        -> StringTokenizer : 단어별로 분리할때 주로 사용
 *          => nextToken() : 단어 하나씩을 읽어올때
 *          => countTokens() : 분리된 단어의 갯수 
 *          => 반복문 수행 => hasMoreTokens()
 *     ------------------------------------- 제네릭 (데이터형을 변경 => Object : 형변환) <클래스명>    
 *        						                단점 : 기본형 데이터는 사용이 불가능 하다
 *                                                   ---------- 각 데이터형마다 클래스를 지원 (Wrapper)
 *        -> ArrayList <<-- 중복된 데이터가 있는경우
 *                          순서는(인덱스) 자동조절이 된다 -> 구분자 인덱스
 *      ☆☆  = 추가     - add()  
 *          = 수정     - set()
 *          = 삭제     - remove()
 *      ☆☆  = 전체삭제   - clear()
 *      ☆☆  = 저장 갯수  - size()
 *      ☆☆  = 읽기     - get()
 *        -> ArrayList가 여러개 있는 경우
 *          = 같은 값(교집합)    		- retainAll()
 *          = 차집합(한쪽에 없는 데이터)	- removeAll()
 *          = 전체 데이터 복사			- addAll()
 *          = 부분 데이터 복사  			- subList()
 *        -> HashSet  <<- 중복이 없는 데이터
 *                        순서가 없다(출력시에 원하는 순서로 출력이 안되는 경우도 있다)
 *                        중복 제거는 list 로 변경해서 사용한다 
 *                         자체값 = 구분자
 *          = add()
 *          = clear()
 *          = iterater()
 *        -> HashMap
 *     -------------------------------------
 *      java.text : 변환 (숫자, 날짜변환) 
 *        -> DecimalFormat : format()
 *       ☆☆☆   DecimalFormat df=new DecimalFormat("###,###,###,###"); // 오라클 9,999,999
 *        -> SimpleDateFomat : format()
 *       ☆☆☆   SimpleDateFormat sdf=new SimpleDateFormat("");
 *                년도 => yyyy
 *                월  => MM/M
 *                일	 => dd/d
 *                시간 => hh/h
 *                분  => mm/m
 *                초  => ss/s
 *      java.io   : 입출력 (메모리 입출력, 파일 입출력, 네트워크 입출력)
 *      java.net  : 네트워크 프로그램 개발
 *  ☆☆☆ java.sql  : 데이터베이스 프로그램 개발 
 *   
 */
import java.net.*;
public class 라이브러리_정리 {

	public static void main(String[] args) throws Exception{
//		System.out.println(Arrays.toString("자바".getBytes()));
		System.out.println("==== Encoder 결과값 ====");
		String s=URLEncoder.encode("자바","UTF-8");
		System.out.println(s);
		
		System.out.println("==== Decoder 결과값 ====");
		s=URLDecoder.decode(s,"UTF-8");
		System.out.println(s);
//		브라우저 들어갈때는 Encoder 로 보내줘야 한다
	}

}
