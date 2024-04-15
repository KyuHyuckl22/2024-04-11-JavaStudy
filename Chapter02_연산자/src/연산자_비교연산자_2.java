/*
 * 	비교연산자 (true / false)  => 조건문 (if / if~else / 삼항연산자)
 * 	== , != , < , > , <= , >=
 * 	숫자(정수,실수) , 문자
 *  boolean  => == , != | true , false 밖에 없어서 저 두개 이외 비교연산자 사용시 오류  
 * 
 * 	학점 => score >=90 A
 * 		   score >=80 B
 * 		   score >=70 C
 * 		   score >=60 D
 * 
 * 		비교연산자는 실수, 정수, 문자 모두 가능하다
 */
public class 연산자_비교연산자_2 {
	public static void main(String[] args) {
//		실수도 비교연산자가 된다.
		double d=30.5;
		double e=20.0;
		
		System.out.println("d= "+d+",e= "+e);
		System.out.println(d+"=="+e+": "+(d==e));
		System.out.println(d+"!="+e+": "+(d!=e));
		System.out.println(d+"<"+e+":  "+(d<e));
		System.out.println(d+">"+e+":  "+(d>e));
		System.out.println(d+"<="+e+": "+(d<=e));
		System.out.println(d+">="+e+": "+(d>=e));
	}

}
