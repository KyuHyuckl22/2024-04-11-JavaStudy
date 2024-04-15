/*
 *  	형변환 연산자
 *  	------------(데이터형) => boolean 은 제외
 *  		|
 *  	UpCasting => 데이터형을 크게 만든다
 *  	DownCasting => 데이터형을 낮게 만든다
 *  		-------------> upcasting
 *  	byte < char < int < long < float < double
 *  		<------------- downcasting
 * 	
 * 		예)	***숫자에서만 가능함
 * 			'A' => char
 * 			(int)'A' => int
 * 			=> UpCasting
 * 
 * 			10.5 => double
 * 			(int)10.5 => int => 10
 * 			=> DownCasting
 * 			
 * 			
 */
public class 연산자_단항연산자_3 {
	public static void main(String[] args) {
		//형 변환=> (데이터형)
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println(98);
		System.out.println((char)98); // 'a' => 97
		
		System.out.println(10.5);   //double 형을
		System.out.println((int)10.5);	//int 로 변환
		/*
		 * 
		 * 10.5 + 10.5 = 21.0 
		 * (int)(10.5 + 10.5) = 21.0
		 * 
		 * (int)10.5 + (int)10.5 = 20
		 * 
		 * double d = 123456.78
		 * int i = 123456
		 * 	(int)((d-i)*100)
		 */
		
		double d = 123456.78;  // 8byte
		int i = 123456;		   // 4byte   bit가 다르기때문에 99999로 채우고 있는것
							   // 때문에 77.99999999 를 78 로 출력 
		System.out.println((int)((d-i)*100));
		
		int rand=(int)(Math.random()*100)+1;
//				       -----------
//					   0.0 ~ 0.99  		 		<< Math.random 이 가져오는것 (난수1)
//					   0.0 ~ 99.0		  	    << *100
//			   	  0~99					 		<< int 형 변환
//										 1~100	<< +1 들어오기
		System.out.println("rand= " + rand);
		
	}

}
