/*
 * 		논리연산자 --> 결과값은 true / false
 * 		&& (and) -->직렬연산자 = 범위,기간 포함
 * 				jumsu>=0 && jumsu<=100  0~100사이에 있는지
 * 		|| (or)  -->병렬연산자 = 범위,기간을 벗어난경우
 * 				jumsu<0 || jumsu >100 ==> 오류  
 *					 
 * 		(조건) && (조건)		앞 조건에서 false 가 나왔으면 뒤에 조건은 수행하지 않는다     
 * 		----	 ----		(이미 false기 때문)
 * 			|	 |
 * 			------
 * 			  |
 *			 결과값
 * 							
 * 		(조건) || (조건)		앞 조건에서 true 가 나왔으면 뒤에 조건은 수행하지 않는다
 * 		----	 ----		(이미 true기 때문)
 * 			|	 |
 * 			------
 * 			  |
 *			 결과값 		
 *
 *
 *
 * 		----------------------------------------------
 *		                 	&&	     		|| 
 * 		----------------------------------------------
 * 		true true      		true 		  true
 * 		----------------------------------------------
 * 		true false			false		  true
 * 		----------------------------------------------
 * 		false true			false		  true
 * 		----------------------------------------------
 * 		false false			false		  false
 * 		----------------------------------------------
 * 
 */
public class 연산자_논리연산자_1 {
	public static void main(String[] args) {
		int x=10;
		int y=9;
		
		boolean bCheck= x==y && ++y==x;
		System.out.println("bCheck= "+bCheck);
		System.out.println("x= "+x);
		System.out.println("y= "+y); // y가 9가 출력된것을 보았을때 false 기 때문에
//										뒷 문장인 ++y 를 실행하지 않았다
		boolean cCheck= x!=y && ++y==x;
		System.out.println("cCheck= "+cCheck);
		System.out.println("x= "+x);
		System.out.println("y= "+y);  // y가 10이 출력됨  true 기 때문에
//										 뒷 문장인 ++y가 실행되었다
		
		
	}

}
