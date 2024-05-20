package com.sist.main;
/*
 * finally
 *   
 *   예외처리
 *     try {
 *         정상수행코드 
 *         => 에러 발생
 *     } catch {
 *         에러에 대한 대비 => 사전에 에러 방지 => 에러 복구
 *     } catch {
 *         에러에 대한 대비 => 사전에 에러 방지 => 에러 복구= 다시입력(continue)
 *     }
 *     Finally => 생략이 가능 ( 필요시에만 사용)
 *     {
 *     파일 닫기 / 서버닫기 / 오라클 닫기 ==> DDOS
 *     => try 수행, catch 수행  - 무조건 수행이 된다
 *     }
 *     
 *     흐름
 *     
 *     문장 1
 *     문장 2
 *     try {
 *       문장 3
 *       문장 4
 *       문장 5
 *     } catch(예외처리 클래스) {
 *       문장 6
 *     }
 *     finally {
 *       문장 7
 *     }
 *                       에러가 없을때
 *               1 -> 2 -> 3 -> 4-> 5-> 7 (종료)
 *     
 *       문장 1
 *       문장 2   -> 에러발생 --> 종료
 *     try {
 *       문장 3
 *       문장 4
 *       문장 5
 *     } catch(예외처리 클래스) {
 *       문장 6
 *     }
 *     finally {
 *       문장 7
 *     }
 *     
 *     1 -> 2 (종료)        왜냐 try 안에 있어야 건너뛰는데 try 밖에서 오류가 났기때문
 *     
 *       문장 1
 *       문장 2
 *     try {
 *       문장 3
 *       문장 4  --> 에러발생
 *       문장 5
 *     } catch(예외처리 클래스) {
 *       문장 6
 *     }
 *     finally {
 *       문장 7
 *     }
 *          
 *    1 -> 2 -> 3 -> 6 -> 7 (종료)   에러가 나든 안나든 무조건 수행하는 문장 : finally
 */
public class 예외처리_8 {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("3");
			System.out.println(10/0	); // try 안에서 에러가 나면 catch 로 이동
			System.out.println("5");
		} catch(Exception e) { //에러 발생시에만 수행 => ptintStackTrace(), getMessage
			System.out.println("에러처리 => 6");
		}
		finally {
			System.out.println("7");  //파일 닫기, 오라클 닫기 에 주로 사용
			
		}
	}

}
