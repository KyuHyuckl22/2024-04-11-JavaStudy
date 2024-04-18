/*
 * 1~10 사이의 숫자중 3의 배수를 제외하고 출력하라
 */
public class 제어문_반복문문제_9 {

	public static void main(String[] args) { 
		for(int i=1;i<=10;i++)
		{
			if(i%3!=0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
