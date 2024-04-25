/*
 *    1. 배열의 범위를 벗어나면 오류가 발생한다 --> 0번부터 갯수-1 까지
 *    2. 프로그래머의 실수가 가장 많은곳 --> 실행시에 오류 발생
 *    => ArrayIndexOutOfBoundsException  --> 이런 말 발생시 범위를 벗어난 오류 => p93
 *    
 *      
 */
public class 배열_4 {
	public static void main(String[] args) {
		int[] arr= {1,2};
		System.out.println(arr[2]);
		
	}
}

