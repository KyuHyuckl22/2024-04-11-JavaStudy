/*
 * 	비교연산자 => 숫자에서만 사용이 가능 (문자열은 비교가 불가능)
 * 	"aaa"==="aaa" x  [ equals() ] 라는 문자를 비교하는것이 따로 있음
 * 	*** 비교연산자는 결과값 => true / false => 조건문에서 주로 사용
 * 		종류)
 * 			== 같다    < 자바 스크립트  |  오라클 >   같다 =
 * 			!= 같지않다  
 * 			<  작다  		왼쪽 데이터 기준
 * 			>  크다		
 * 			<= 작거나같다	둘중 하나만 맞으면 true
 * 			>= 크거나같다
 * 			
 * 			6==7  false
 * 			6!=7  true
 * 			6>7	  false
 * 			6<7   true
 * 			6<=7  true
 * 			6>=7  false
 * 
 * 			==> char도 가능
 * 			'A' == 'B' 
 * 	 변수,연산자,제어문 이 정말 중요하다		연산자들은 꼭 암기할수 있기!
 * 	1) 단항연산자 / 산술연산자 / 비교연산자 / 대입연산자 / 논리연산자 / 형변환
 * 		
 * 	
 * 	
 * 		
 * 
 */
public class 연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수비교
		int a=(int)(Math.random()*100)+1; // 1~100 사이의 임의의 수를 추출
		int b=(int)(Math.random()*100)+1;
		System.out.println("a= "+a+",b="+b);
		
		System.out.println("===비교===");
		
		System.out.println("a==b	"+(a==b));
		System.out.println("a!=b	"+(a!=b));
		System.out.println("a<b	"+(a<b));
		System.out.println("a>b	"+(a>b));
		System.out.println("a<=b	"+(a<=b)); //a<b || a==b
		System.out.println("a>=b	"+(a>=b)); //a>b || a==b  ===> 44p
		
		System.out.println("====알파벳 비교====");
		char c=(char)((int)(Math.random()*26)+97); // 65=A    97=a
//							-------------         	난수추출
//										 ----		*26
//					   ----							int변환
//											  ---   +65
//				------								char변환
//		System.out.println(c);
		char d=(char)((int)(Math.random()*26)+97);
		System.out.println("c="+c+",d="+d);
		System.out.println("c==d	"+(c==d));
		System.out.println("c!=d	"+(c!=d));
		System.out.println("c<d	"+(c<d));
		System.out.println("c>d	"+(c>d));
		System.out.println("c<=d	"+(c<=d));
		System.out.println("c>=d	"+(c>=d));
		
		
		
		
		
		
	}

}
