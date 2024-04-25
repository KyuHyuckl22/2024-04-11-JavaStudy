/*
 *    9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
 *         int[] arr = { 10, 20, 30, 50, 3, 60, -3 }; 
 * 
 */
public class 배열문제0424_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,50,3,60,-3};
		int index=0;
//		for(int i=0;i<arr.length;i++)  --------------방법 1
//		{
//			if(arr[i]==60)
//			{
//				index=i;
//				break;
//			}
//		}
//		System.out.println("index="+index);

		for(int i:arr)
		{
			if(i==60)
				break;
			index++;
		}
		System.out.println("index="+index);
	}

}
