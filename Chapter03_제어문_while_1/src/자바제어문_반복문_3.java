/*
 *   A-Z 까지 for
 *   Z-A 까지 while
 */
public class 자바제어문_반복문_3 {

	public static void main(String[] args) {
		
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		char c='Z';
		while(c>='A')
		{
			
			System.out.print(c+" ");
			c--;
		}
		
		
	}
}
