package com.sist.main;
import java.io.BufferedOutputStream;
/*
 *   1. => 263p
 *     예외 : 프로그램에 의도하지 않은 문제가 발생한 상황
 *                            -------------
 *                            발생된 위치에서 비정상 종료를 한다 --> 비정상 종료를 방지하고, 정상종료가 가능하게 만드는것 => 예외처리
 *      => 문제가 발생하는 경우
 *        = 사용자의 부주의 (입력을 잘못하는 경우)
 *        = 프로그램의 결함 (프로그래머의 실수)
 *        = 해결책 
 *          1) 조건문 사용 => if  => 문제발생을 사전에 예방
 *          2) 조건문이 안되는 경우 => 예외처리를 이용한다
 *                               ------
 *                               직접처리 : 프로그래머가 에러발생시 처리 => 복구
 *                                       try ~ catch
 *                                     소스코딩   에러처리 -> 예상되는 에러를 처리하기 위해
 *                          =============== 주로 직접처리를 많이 사용한다 =========================
 *                               간접처리 : 시스템에 의해 처리가 가능 => 회피
 *                                      throws
 *                                      예상되는 에러를 등록 => 호출시에 처리하고 사용
 *                                      라이브러리에 많이 존재 
 *                                      ------------------ 라이브러리 메소드 호출시에는 예외처리 후에 사용
 *                               간접처리를 사용하는 경우 : 이미 소스코드가 완료된상태 에는 try ~ catch 를 사용하기 어렵기때문에
 *                                                   이때 주로 간접처리를 사용한다
 *                             
 */
import java.util.*;
public class 예외처리_3 {

	public static void main(String[] args) {
      try {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
//		문자열로 받는다 (윈도우, 웹 => 정수가 없다 => 문자열로 받는다)
		String num1=scan.next();
		System.out.print("두번째 정수 입력 : ");
		String num2=scan.next();

//		첫번째 에러
		int n1=Integer.parseInt(num1); // 문자열을 정수로 변환
//		에러발생 의심부분 1
		int n2=Integer.parseInt(num2); // 문자열을 정수로 변환
//		에러발생 의심부분 2
		int n3=n1/n2;
//		에러발생 의심부분 3
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		System.out.println("n3="+n3);
//		num1, num2, n1,n2, n3  => try 블록 안에서만 사용이 가능 => 블록변수 / 지역변수 
		
      }catch (NumberFormatException e) {  // 정수 변환이 안되는 경우에만 처리 
    	    System.out.println(" 정수만 입력할 수 있습니다");
      }catch(ArithmeticException e) {
              System.out.println("0으로 나눌 수 없습니다");
      }
		
//		정상수행 가능, 사용자가 입력을 잘못한 경우 => 에러처리가 안된다 => 입력값을 받아야 알 수 있다
//		강제로 예외처리를하지 않는다 => 필요시 =>예외처리를 생략이 가능
		System.out.println("프로그램 종료 ");
		

	}

}
