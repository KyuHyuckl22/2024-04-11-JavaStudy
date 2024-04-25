/*
 * 4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
 *
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class 배열문제0424_4 {

	public static void main(String[] args) {
//--------------------------------------------------------------------강사님이 만든거
//			// TODO Auto-generated method stub
//	        //1 정수 10개를 저장하는 공간 => 배열 
//			int[] arr=new int[10];
//			//2 초기화 
//			for(int i=0;i<arr.length;i++)
//			{
//				arr[i]=(int)(Math.random()*100)+1;
//			}
//			System.out.println(Arrays.toString(arr));// 저장된 값 확인 
//			//3 출력
//			for(int i:arr)// 실제 저장된 값을 읽어 온다 
//			{
//				if(i%3==0)
//					System.out.print(i+" ");
//	-----------------------------------------------------------------내가 만든거	
		Scanner scan=new Scanner(System.in);
		int[]sum =new int[10];
		
		for(int i=0;i<10;i++) 
			{
				System.out.print("정수 입력 : ");
				sum[i]=scan.nextInt();	
				
			}	
		
		for(int i=0;i<sum.length;i++)
		{
			
			if(sum[i]%3==0 && sum[i]!=0)
			{
				System.out.print(sum[i]+" ");
			}
		}	
		
	}
	
}
