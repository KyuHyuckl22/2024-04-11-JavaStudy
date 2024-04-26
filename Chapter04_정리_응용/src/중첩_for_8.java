/*
 *  
 */
import java.util.Arrays;
import java.util.Scanner;
public class 중첩_for_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬후:");
		/*
		 * int a=10
		 * int b=20
		 * a=b               
		 * b=a ==> 20
		 *  
		 * int temp=a;  a 임시 저장소 temp
		 * a=b
		 * b=temp
		 * 
		 */
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
			  if(arr[i]>arr[j])
			  {	  
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			  }	
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
