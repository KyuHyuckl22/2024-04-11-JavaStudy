/*
 * 
 */
public class 제어문_선택문_2 {

	public static void main(String[] args) {
		int com=(int)(Math.random()*3); //0 1 2 
		switch(com)
		{
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				break;
			case 2:
				System.out.println("보");
				
				//default 생략이 가능. 0 1 2 이외에 다른 숫자가 나올수 없기 때문
		}
		
	}
}
