/*
 *   배열  => 5개
 *   ----------------------------------------------
 *           |         |         |         |       
 *   ----------------------------------------------
 *   -------   -------   -------   -------   --------- 간격이 동일 => 인덱스
 *                                                     --------------------단위가 4byte  8yte
 *                                                                             int[]   double[]
 *    1) 초기값 
 *       0번부터 추가
 *       마지막부터 추가
 *       -----------
 *       정수를 입력 받아서=>2진법을 출력
 *       
 *       8bit
 *       10=> 00001010  ==> 뒤에서부터 출력하는게 더 유리함
 *   
 *   
 *   
 *   
 */
import java.util.Scanner;
public class 배열활용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("0~32767 까지의 정수 입력: ");
		//16bit
		int input=scan.nextInt();
		//0과1다시저장
		int[] binary=new int[16];
		int index =binary.length-1;
		
		System.out.println("===== API 이용=====");
		System.out.println(Integer.toBinaryString(input)); //2진법
		System.out.println(Integer.toOctalString(input));  //8진법
		System.out.println(Integer.toHexString(input));   //16진법
		
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0);
		}
		
//		for(int i=0;i<=binary.length;i++)
//		{
//			if(i%4==0 && i !=0)
//			{
//				
//			System.out.println(" ");
//			}
//			System.out.println(binary[i]);
//		}
	}

}
