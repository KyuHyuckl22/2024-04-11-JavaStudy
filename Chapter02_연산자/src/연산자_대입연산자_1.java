/*
 * 		대입연산자 => 메모리에 저장
 * 				  ----- 변수 
 *					
 *				=   => int a=10;
 *							10을 a라는 메모리에 저장 (대입)
 *					=> 형변환
 *					   int a='A'
 *					   ----- ---
 *				      4byte   2byte   => 작은 값은 대입이 가능
 *					=> 'A'  ==> 65로 변경후에 저장
 *				
 *				 	   long 1=20;
 *					   -----  ---
 *					  8byte   4byte 
 *					=> 20  ==> 20L	
 *		복합대입연사자
 *
 *		+=
 *			int a=10;
 *				       <===대입연산자는 오른쪽에서 먼저 계산한값을 왼쪽에 저장한다
 *			a+=1;  => a=a+1;
 *						---
 *						 10+1  => a=11
 *
 *			a+=10  ==> a=a+10  =>20
 *			a+=20  ==> a=a+20  =>30		
 *		-=
 *			a-=1   ==> a=a-1
 *			a-=10  ==> a=a-10
 *		*=
 *			a*=2   ==> a=a*2
 *		/=
 *			a/=2   ==> a=a/2
 *
 *		
 *		int a=10;
 *		a++;
 *		a++;
 *		a++;    ==>	  a+=5
 *		a++;          
 *		a++;         
 *		
 *	  1씩증가*5         5씩증가
 *
 *		=>누적 , 문자열 결합 할때 많이 씀
 *
 *
 *			
 *		
 */
public class 연산자_대입연산자_1 {
	
	public static void main(String[] args) {
//		
//		long 1=20; //20L
//		int 20=1L; // 큰 메모리를 작은것에 넣을수 없음
		double d=20;
		System.out.println("d= "+d); // int형 정수 20이 아니라 더 큰 값인
//									    double형 실수로 바뀌어서 20.0이 나옴
		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a= "+a);
		
		int b = 10;
		b+=5;
		System.out.println("b= "+b);
//		한개증가 / 한개감소
//		  ++      --
//		여러개증가/여러개감소
//		  +=      -=
//		
//		int a =10;
//		a++ / ++a / a+=1 /a=a+1 >> 한개증가
		
//		int a =10;
//		a-- / --a / a-=1 /a=a-1 >> 한개감소
		
//		여러개증가 여러개 감소
//		int a=10;
//		a-=5 ==> a=a-5
//		a+=5 ==> a=a+5     ---->41p
		
		int score1=10;
		int score2=5;
		score1+=score2;
//		10   +   5
		System.out.println("score1= "+score1); //15
		
		score1-=score2;
//		15   -   5
		System.out.println("score1= "+score1); //10
		
		//변수값이 변경 ==> ++,--,+=,-=
		//나머지 연산자는 변수값 변경 불가
		int m=10;
		m++; //11
		m+=10; //21
		int n=20;
		System.out.println(  
				m+n);
		System.out.println("n= "+n);
		
	}

}
