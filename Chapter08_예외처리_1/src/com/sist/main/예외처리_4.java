package com.sist.main;
/*
 *   try 절 ==> 정상수행이 가능한 문장
 *   catch 절 => try 안에 문장을 수행하는 과정에서 에러가 발생시 처리
 *   ---------- 여러개 사용이 가능, 예외처리 클래스의 순서
 *                             ---------------
 *                             크기 => 상속 => 상속도 => 위로 올라갈수록 에러를 막는 기능이 많다
 *  
 *   Exception
 *       |
 *   RuntimeException
 *       |
 *   NumberFormatException, NullPointerException, ClassCastException
 *   
 *     
 * 
 */
//import java.util.*;
//class A {
//	
//}
//class B extends A {
//	
//}
//public class 예외처리_4 {
//	public static void main(String[] args) {
//		try {
//			A a=new A();
//			B b=(B)a;  // 오류발생 ==> ClassCastException
//			
//		}catch (RuntimeException e) { 가장 큰 오류처리 클래스가 위로 올라오면 아래 세개는 
//			                          사용할 필요가 없어지기 때문에 이 클래스를 넣고싶다면 
//		}                             맨 아래에 넣어 줘야 오류가 생기지 않는다
//	     catch (ArithmeticException e) { //0으로 나눌때 에러 처리
//			
//		}catch (ArrayIndexOutOfBoundsException e) {//배열 범위 초가시 에러
//			
//		}catch (NumberFormatException e) { //문자열을 정수로 변환할때 = 오류처리
//					}
//		catch (RuntimeException e) {
//			
//		}  
//		ClassCastException << 이 에러가 났는데 다른 에러잡이들이 
//		System.out.pri

