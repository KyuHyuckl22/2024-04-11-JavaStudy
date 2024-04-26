/*
 *     ★
 *     ★★
 *     ★★★
 *     ★★★★   
 *     줄수  별표
 *     i     j
 *     1     1
 *     2     2
 *     3     3
 *     4     4   ==> 관계 i==j ==> j==1 
 *     
 *     ★★★★
 *     ★★★
 *     ★★
 *     ★             
 *     줄수  별표
 *      1    4
 *      2    3
 *      3    2 
 *      4    1  ==> 관계 i+j=5 ==>  i=5-j
 *      
 *      ----------------------------
 *          *
 *         **
 *        ***
 *       ****
 *       줄수  공백  별표    공백출력 => i+j=4 ==>  j=4-1  k==i
 *        i   j    k 
 *        1   3    1    
 *        2   2    2
 *        3   1    3
 *        4   0    4 
 *      
 *       ****
 *        ***
 *         **
 *          *
 *       줄수  공백  별표     j+1=i   --->  j=1-i
 *       i     j    k     
 *       1     0    4
 *       2     1    3
 *       3     2    2 
 *       4     3    1  
 *        
 *     
 */
public class 중첩_for_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++) // 몇줄이냐
		{
			for(int j=1; j<=5-i; j++) // 한 줄에 몇개 출력할거냐
			{
				System.out.print("★");
			}
		System.out.println();	
		}
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=5-i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
