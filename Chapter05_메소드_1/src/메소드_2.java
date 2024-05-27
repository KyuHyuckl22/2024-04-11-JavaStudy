/*
 * 	리턴형(o) , 매개변수 (o)
 * 
 */

import java.util.Scanner;

public class 메소드_2 {
	static boolean isLogin(String id, String pw) {
//		매개변수는 여러개 사용이 가능 , 리턴형은 1개만 사용
//		매개변수가 많은 경우 => 클래스 , 배열 => 3개 이상일때
		final String ID = "admin";
		final String PW = "1234";
/*
 * 		메소드 안에 선언된 변수 , 상수 => 메소드 안에서만 사용이 가능
 *      ----------------------> 매개변수도 메소드 안에서만 사용이 가능
 */
		boolean bCheck = false;
		if(id.equals(ID) && PW.equals(PW)) {
			bCheck=true;
		} else {
			bCheck=false;
		}
		
		return bCheck;  // 사용자 요청에 대한 결과값
//		리턴에 사용하는 데이터형과 실제 전송하는 값이 일치해야함. 
//		선언하는곳이 크고 사용하는곳은 작아도 괜찮지만, 선언보다 큰 사용을 하는것은 안된다

//import java.util.Scanner;
//
//import java.util.Scanner;
}

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" ID : ");
		String id = scan.next();
		System.out.println(" PW : ");
		String pw = scan.next();
//		기능요청
//		메소드에서 넘겨주는 결과값을 받는다
		boolean bCheck=isLogin(id,pw);
		
		if(bCheck) {
			System.out.println(id+"님 로그인 되었습니다 ");
		} else {
			System.out.println("아이디나 비밀번호가 틀립니다 ");
		}
			


	}

}
