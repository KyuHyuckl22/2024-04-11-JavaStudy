
public class 문자열_5 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="HELLO";
		/*
		 *   equalsIgnoreCase : 대소문자 구분없이 비교
		 *   equals : 대소문자 구분
		 *   결과값 = true / false  주로 조건문에서 사용
		 *   
		 */
//		if(s1.equalsIgnoreCase(s2)) // 같은경우 true / 다른경우 => faslse
//		{   // IgnoreCase => 대소문자 구분을 없앤다
//			System.out.println("s1과s2가 같다");
//		}
//		else
//		{
//			System.out.println("s1과s2가 다르다");
//		}
		String msg="Hello Java";
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		}
//		 length() 문자갯수 => index=0
		
		
	}
}
