package com.sist.main;
// 에러 메시지 => 출력
/*
 * 에러 확인
 * getMessage() : 에러 내용만 출력
 * printStackTrace() => 권장 사항 => 에러 위치 확인
 * ----------------------------------------------
 * 
 * Exception : 상속을 내린 모든 클래스의 예외처리 기능을 가지고 있다
 * ----------------------------------------------
 *      IOException / SQLException / ClassNotFoundException / RuntimeException
 *      ...
 * ----------------------------------------------
 *  
 *  RuntimeException : 실행시 예외처리의 모든 기능을 가지고 있다
 *  ---------------------------------------------
 *      ClassCastException / ArithmeticException / NullPointerException / NumberException
 *  상속에서 크기
 *  -----------> 상속 내리는 클래스가 받는 클래스보다 크다
 *  
 *   class A
 *   class B extends A    ==>   A > B
 *   
 *   interface A
 *   class B implements A ==>   A > B    인터페이스도 클래스다
 *           ----------- 인터페이스에서 클래스 상속은 구현한다 (인터페이스는 구현이 안된 메소드를 가지고 있다)
 *  ----------------------------------------------------------------------------------------
 *      => ClassCastException < RuntimeException < Exception < Throwable
 *      --------------------------------------------------------------------------------------
 *      예외처리
 *      Exception => 예외처리의 최상위 클래스
 *      --------- 모든 예외처리가 첨부되어 있다
 *      => 어떤 에러가 발생했는지 확인
 *         getMessage(), printStackTrace(): 권장
 *         => 에러발생시 처리하는 과정 잘 확인해야함
 *           - output 창 잘 확인하기
 *           - 에러만 잡아도 정시퇴근은 한다
 *  
 */
class AA {
	
}
class BB extends AA {
	
}
public class 예외처리_7 {
	String msg; // 초기값이 null값  
//	                     null인 경우에는 연결하는 주소가 없어서 메소드를 사용할 수 없다
//	                     이때 나오는 오류가 NullPointerException
   public static void main(String[] args) {

      try {
         //int a = Integer.parseInt(" 10"); // 정수로 변환
//         int[] arr = new int[2];
//         arr[0] = 10;
//         arr[2] = 20;
//    	  예외처리_7 a=new 예외처리_7();
    	  
//    	  System.out.println(s);
    	  
    	  AA a1=new AA();
    	  BB b=(BB)a1; //classCastException
//    	  형변환은 반드시 생성자가 일치
      } catch (Exception ex) {
         // Exception => 자바에서 지원하는 모든 오류 처리가 가능 => Throwable : Error 같이 출력 => 웹
//         System.out.println(e.getMessage());
         ex.printStackTrace();
         
         // error 자주 발생하는 경우 => try ~ catch
      }
   }

}