/*
 * 
 */
public class 자바제어문_반복문_8 {

	public static void main(String[] args) {
		
		// 변수 => 범위지정 => {} => scope
		for(int i=1;i<=5;i++) //for문 안에서 설정하는 변수는 for안에서만 사용이 가능하
		{
			char c='A';
		    System.out.print(c+" ");
			c++;
		}//c 변수는 여기까지만 사용이가능
//		c 변수는 사라진다
	}
}
