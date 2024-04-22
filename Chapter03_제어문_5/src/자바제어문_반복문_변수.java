/*
 * 
 */
public class 자바제어문_반복문_변수 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
//		int i; i변수를 for문 밖에서 사용하고 싶다면 for문 밖에서 변수를 넣어라
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}// i변수는 메모리에서 삭제 for블록에서 담았기 때문
//		System.out.print(i+" "); 오류
	}

}
