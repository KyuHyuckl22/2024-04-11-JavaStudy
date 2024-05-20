package com.sist.main;
/*
 *   문자열 2개 받아서 
 *   정수 배열에 저장  ==> 정수변환 의심 (사용자), 배열의 인덱스 (프로그래머의 실수)
 *   배열값을 나누기 해서 출력  ==> 사용자가 0을 입력하는 경우
 *   ---------------------------------------------------------
 *   1. 예상되는 에러 => 3개
 *   2. 기타 발생 => 4개
 *   
 *     1) 사전에 방지할 수 있는 프로그램 제작
 *       웹 => 사용자 => 사이트에서 오류 발생하면 => 탈퇴
 *       
 *     2) 조건문으로 가능
 *       예외처리 => 예상되는 에러 도출
 *                ----------------
 *   
 */
public class 예외처리_6 {

	public static void main(String[] args) {
		try {
			String s1="3";
			String s2="0";
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int [] arr= {n1,n2};
			System.out.println(arr[0/arr[1]]);
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("배열범위 초과");
		}catch(NumberFormatException e) {
			System.out.println("정수변환 오류");
		}catch( ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		catch(Exception e) {
			System.out.println("예상치 못한 에러 발생"); 
//			가장 큰 애러는 항상 아래에 넣어줘야 한다 위로 올라가면 오류가남
//			예상치 못한 오류가 있을지도 모르기때문에 항상 Exception 을 넣어주는게 좋다
		}
	}
}
