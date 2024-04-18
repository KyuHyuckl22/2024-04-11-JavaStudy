/*
 * 2+4+6+...100까지의 정수의 합을 구하고 출력하라
 * 
 * 
 * for => 반복문 => 반복횟수가 있는 경우에 주로 사용
 *    1)형식
 *    	for(초기값;조건식;증가식) => 정수, 문자
 *    	{ 
 *    		반복 실행문장
 *    	}
 *    2) 순서		  | 2번이 false면 종료
 *           1    2     4
 *    	for(초기값;조건식;증가식) => 정수, 문자
 *    	{ 	      | true|   
 *    		반복 실행문장---3
 *    	}			
 *    			    |false면 종료            true
 *     초기값 -----> 조건식 ----> 실행문장 ----> 증가식 
 *     			 	|_________________________|
 *    3) 초기값 : 시작점 => int i=0, int i=1, int i='A' ...
 *    4) 조건식 : 어디까지 출력 (범위) i<=10
 *    5) 증가 : 2씩,1씩,...
 *    
 *    
 * 											
 */
public class 제어문_반복문문제_3 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}		
			System.out.println("2+4+6+...100까지의 정수의 합: "+sum);
	/*
	 *  수열이 아닌 경우에는 for을 사용할 수 없다.
	 *  숫자를 돌릴 수 있는 패턴이 있어야 한다.
	 *  ex)
	 *    1 1 2 3 4 5 5 6 6 7 9 7 ... 이런건 돌릴 수 없다
	 */
	}
}
