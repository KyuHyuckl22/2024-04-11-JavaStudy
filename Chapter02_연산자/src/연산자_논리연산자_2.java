/*
 *  점수 >=60  <=100   -> true
 */
public class 연산자_논리연산자_2 {
	
	public static void main(String[] args) {
		int score=(int)(Math.random()*100)+1;  //1~100 난수 발생
		System.out.println("난수값 : "+score);
//		
//		boolean bCheck=(score>=60) && (score%2==0);
////									   ---------- 짝수 조건(나눴을때 나머지가0이면)
//		System.out.println(bCheck);
		
		//score가 60 이상이고 score 짝수면
		boolean bCheck=(score>=60) && (score%2==0);
	    System.out.println(bCheck);
		
		//score가 40 이상이고 score 홀수면
		bCheck=(score>40)&&(score%2!=0);
		System.out.println(bCheck);
		
		// 변수=> 필요시마다 변경해서 사용이 가능
		// main이 종료시까지 메모리가 유지
		
		
		
	}

}
