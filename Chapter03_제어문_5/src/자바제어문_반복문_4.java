/*
 *   1~100 까지 사이의 정수를 10개 추출
 *   => 최대값  / 최소값 구한다
 *      ----     ----
 *      변수1      변수2      for 문 10바퀴
 *   
 * 
 */
public class 자바제어문_반복문_4 {

	public static void main(String[] args) {
		int max=1;    //가장 낮은숫자
		int min=100;  //가장 높은숫자
		
		// ==> 반복수행 => 임의의 정수 10개 추출
		for(int i=0;i<=10;i++)  //출력하고는 상관이 없다
		{
			//=> 임의의 정수 추출
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			//최대값, 최소값
			if(max<num)
				max=num; //최대값
			if(min>num)
				min=num; //최소값
		}
		/*
		 *  int max=1;
		 *  int a=10;
		 *  int b=20;
		 *  int c=30;
		 *  
		 *  if(max<a)
		 *     max=a  => max=> 0 => 10
		 *  if(max<b)
		 *     max=b  => max=> 10 => 20
		 *  if(max<c)
		 *     max=c  => max=> 20 => 30
		 *     
		 */
		System.out.println();
		System.out.println("최대값:"+ max);
		System.out.println("최소값:"+ min);
		
	}
}
