/*
 * 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
 */
public class 제어문_반복문문제_7 {

	public static void main(String[] args) {
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)  //짝수 출력
			{	
				System.out.printf("%2d ",i); //한 자린데 두자리를 차지하게 만들어라
				if(i%3==0)	//3개씩 나눠서 다음줄로 내려라
					System.out.println();
			}
		}
		
	}
}
