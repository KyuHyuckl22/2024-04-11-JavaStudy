/*
 *  컴퓨터 / 사용자  => 가위 바위 보
 *  ----   ----
 *  난수     입력
 *  
 *  => 임의로 설정
 *  	0=>가위
 *  	1=>바위
 *  	2=>보
 */
import java.util.Scanner;

public class 제어문_단일조건문_2 {
	
	public static void main(String[] args) {
		
		
		//컴퓨터
		int com=(int)(Math.random()*3); //0,1,2

		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("가위(0)"+"바위(1)"+"보(2)");
		
		int user = scan.nextInt();
		
		
		if (com==0) 
			System.out.println("컴퓨터:가위");
		if (com==1)
			System.out.println("컴퓨터:바위");
		if (com==2)
			System.out.println("컴퓨터:보");
		
		if (user==0) 
			System.out.println("사용자:가위");
		if (user==1)
			System.out.println("사용자:바위");
		if (user==2)
			System.out.println("사용자:보");
		
		/*
		 * 게임 결과 출력 
		 *  com => 0(가위) user 0  비김		    	 0
		 *                     1  사용자 win		    -1
		 *                     2  컴퓨터 win		    -2
		 *   
		 *  com => 1(바위) user 0  컴퓨터win			1
		 *                     1  비김				0
		 *                     2  사용자win          -1 
		 * 
		 * com => 2(보)    user 0  사용자win			-2
		 *                     1  컴퓨터win			1
		 *                     2  비김				0
         *
		 *  컴퓨터 : -2 , 1                    
		 *  사용자 : -1 , 2
		 *                     
		 *                     
		 */		
		System.out.println("======게임결과======");
//		int result=com-user;
//		if(result==-2||result==1)
//			System.out.println("컴퓨터win");
//		if(result==-1||result==2)
//			System.out.println("사용자win");
//		if (result==0) 
//			System.out.println("비겼다");
		
	
		if(com==0 && user==0)
			System.out.println("비겼다");
		if(com==0 && user==1)
			System.out.println("사용자win");
		if(com==0 && user==2)
			System.out.println("컴퓨터win");
		
		if(com==1 && user==0)
			System.out.println("컴퓨터win");
		if(com==1 && user==1)
			System.out.println("비겼다");
		if(com==1 && user==2)
			System.out.println("사용자win");
		if(com==2 && user==0)
			System.out.println("사용자win");
		if(com==2 && user==1)
			System.out.println("컴퓨터win");
		if(com==2 && user==2)
			System.out.println("비겼다");
		
		
		
	}

}
