package com.sist.main;

public class 예외처리_2 {

	public static void main(String[] args) {
//      try~catch => 수행 (웹에서 필수 => 네트워크와 관련 ), 오라클연동 ..
//	    웹, 파일, 오라클 => 예외처리는 문법 (반드시 추가)
/*
 *     파일을 읽어서 데이터 출력
 *     FileReader fr=new FileReader ("경로명")
 *     int i=0;
 *     while((i=fr.read())!=-1) {
 *       System.out.print((char)i);
 *     }
 *     fr.close()
 *    =============== 코딩테스트에서 위에처럼 하면 0점 처리 ================
 *    =============== 아래처럼 예외처리를 꼭 해줘야 함     ===============
 *     try {
 *     FileReader fr=new FileReader ("경로명")
 *     int i=0;
 *     while((i=fr.read())!=-1) {
 *       System.out.print((char)i);
 *     }
 *     fr.close()
 *     }catch(IOException e)
 */
		try {
			System.out.println("문장 1");
			System.out.println("문장 2");
			System.out.println("문장 3");
			int [] arr=new int[2];
			System.out.println(arr[2]);
			System.out.println(10/0); // 에러 발생
			System.out.println("문장 4");
			System.out.println("문장 5");
		}catch (ArithmeticException e) { // 지금 사용하는것은 0으로 나누는 것을 막아주는 예외처리라
//			                             배열 초과의 예외처리를 잡지 못한다.
//			                             해결 방법은 더 상위클래스를 사용 하던가 낱개 오류 클래스를 바꿔준다
			System.out.println("에러발생 => 복구"); // 에러 발생시에만 수행
		}
		System.out.println("문장 6");
		System.out.println("문장 7");
		System.out.println("프로그램 종료");
	}

}
