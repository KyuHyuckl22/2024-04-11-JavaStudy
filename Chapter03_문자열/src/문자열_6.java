
public class 문자열_6 {

	public static void main(String[] args) {
		String alpha="ABCDEFGHIJ";
//					  0123456789
//		1. => CDEFGHIJ
//		2. => EFG
		System.out.println(alpha.substring(2));
		System.out.println(alpha.substring(4,7));
		
		String id=" admin ";
		System.out.println(id+"의 문자 갯수:"+id.length());  //공백 또한 문자의 갯수로 들어간다
		// " " => space
		id = id.trim(); // 공백 지우개
		System.out.println(id+"의 문자 갯수:"+id.length());
		// trim ==> 좌우의 공백 제거 => 검색 , 입력
		//" 감자" 실수
		
		String msg="Hello Java";
//					0123456789
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a")); // 경로명을 자를때 주로 사용
		
		String ext="Hello.Java";
		System.out.println(ext.substring(ext.indexOf(".")+1));
//		 업로드 / 다운로드
/*	
 *   데이터형
 *      정수 : 정수만 저장 => int / long
 *                        Integer , Long , Byte
 *      실수 : 실수만 저장 => double
 *      				  Double
 *      문자 : 문자 1개 저장 => char
 *      논리 : true / false  => boolean
 *                             Boolean
 *      문자열 : 문자 여러개를 동시에 저장 => String , 기능을 가지고 있다
 *      							  -----------------------
 *      								| 문자열을 제어하는 기능을 제공
 * 		
 */
		
		
	}
}
