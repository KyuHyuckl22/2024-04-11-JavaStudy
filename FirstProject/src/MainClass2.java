//출력 형식
/*
 	=System.out.println()
 						=====  ln()  => new Line
 						
 	 Ststem.out.println("Hello ")
 	 Ststem.out.println("Java")
 	 Hello
 	 Java
 	
 	 					
 	=System.out.print()  ==> 옆으로 출력
 	=System.out.print("Hello ")
 	=System.out.print("Java")
 	Hello Java
 	
 	=System.out.printf()
	 서식이 있는 출력
	 %d => 정수 
	 %f => 실수
	 %c => 문자
	 %s => 문자열
	 
	 =자바에서 표현법
	  정수 표현법 
	  => 10진법 (0-9)  10,20 ...
	  => 8진법  (0-7)  010 (8진법은 앞에 0이 붙어있음)
	  => 16진법 		 0x10 = 16  (16진법은 0x가 붙어있음) 주로 색상에서 쓰임
	  => 2진법  (0-1)      0b10 = 2	(2진법은 0b가 붙어있음) 
	  =============================================================
	  		10 , 10L 
	       int   long
	  	 32bit	 64bit    
	  실수 표현법 => 10.5 , 10.5F
	              -----  -----
	              64bit  32bit        1byte = 8bit   bit 에는 0 과 1 만 들어감.
	              저장하는 메모리 크기
	              
	  문자 표현법 => 'A' 한 글자만 사용 가능
  	  문자열 표현법 => "Hello" 여러 문자 사용이 가능
  	  
 */
public class MainClass2 {

	public static void main(String[] args) {
//		System.out.println("\"길동홍\"");
//		System.out.println("c:\\javaDev\\movie.txt");  // "나 \ 를 출력하고 싶을땐 \를 추가해줘야 출력된다.
//		System.out.println();  세미클론 > ; 는 명령문이 종료할때 반드시 입력해줘야 한다.
		if (true) { // '{' 를 열고 엔터를 누르면 자동으로 '}' 가 들어온다.

//		System.out.print("홍길동\n남자"); //다음줄에 출력시키기  new line 의 n
//		System.out.println("");
//		System.out.println("홍길동\t남자"); //일정간격 띄우기  tab 의 t
//		System.out.print("홍길동\t");
//		System.out.print("남자\t");
//		System.out.print("26");  // ln 이 빠진 print 는 옆으로 쭉 출력해줌.
			
		//System.out.println("★\n★★\n★★★\n★★★★\n★★★★★"); 
			  for(int i=0;i<=5;i++) {
				  for(int j=0;j<=i;j++)
				  { 
					  System.out.print("*"); 
				  } 
				  System.out.println(); 
			}
			 
		System.out.println("10 20 30 40 50");
		System.out.printf("%3d%3d%3d%3d%3d",10,20,30,40,50);
		// 000 3칸 = 3d 
		// -를 붙이면 왼쪽정렬
		// +를 붙이면 우측정렬

		}

	}

}
