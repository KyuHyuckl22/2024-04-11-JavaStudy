/*
 *  다른 클래스에 있는 것 가져오기
 *  
 */
public class 메소드_3 {

	public static void main(String[] args) {

		boolean bCheck=메소드_2.isLogin("aemin", "1234");
		if(bCheck) {
			System.out.println(" 로그인 되었습니다 ");
		} else {
			System.out.println("아이디나 비밀번호를 확인해주세요");
		}
		
	}

}
