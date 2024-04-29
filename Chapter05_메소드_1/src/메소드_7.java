/*
 *  char 리턴 ==> 알파벳을 전송 => 대문자 => 소문자 ,  소문자 => 대문자
 *                    2개의 기능------------  , ------------               
 */
public class 메소드_7 {
	static char upper(char c) {
		return (char) (c-32); // 'a' => 'A'  
	}                        //   97     65   ==> 32 차이
	static char lower(char c) {
		return (char) (c+32);
	}
	static char upperLower(char c) {
		char res=' ';  // 결과값이 여러개인 경우에는 값이 변경되기 때문에 변수를 선언한다. 변수의 값이 나오는 경우의 수를 따져야 함
		if(c>='A' && c<='Z')
			res=(char)(c+32);
		else
			res=(char)(c-32);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c=upper('m');
//		System.out.println(c);
//		c=lower('M');
//		System.out.println(c);
		
		char c=upperLower('A');
		System.out.println(c);
//		char c=upperLower('a');
//		System.out.println(c);

	}

}
