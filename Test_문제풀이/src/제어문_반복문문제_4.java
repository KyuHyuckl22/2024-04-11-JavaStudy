/*
 * 5,10,15,20,25,30,35,40,45,50 을 출력하는 프로그램을 만들어라
 */
public class 제어문_반복문문제_4 {

	public static void main(String[] args) {
		for(int i=5;i<=50;i+=5)
		{
			if(i!=50)  // , 를 없애기 위해 만듦
				System.out.print(i+",");
			else
				System.out.print(i);
		}
	}
}
