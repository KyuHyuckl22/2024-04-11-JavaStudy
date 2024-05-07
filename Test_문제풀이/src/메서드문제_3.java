/*
 *  1. 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
 *  
 */
import java.util.*;
public class 메서드문제_3 {
	
//		정수 입력
	static int input() {
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767 사이의 정수 입력 :");
		return scan.nextInt();	
		
	}
//////	    이진법 처리
//	static int[] binaryCheck(int[] binary, int num) {
//		int index=15; // 뒤에서 부터 값을 저장 
//		while(true) { // 반복 횟수를 알 수 없음 => 무한루프 생성
//			// 2로 나누고 나머지값 저장 
//			binary [index] =num%2;
////			// 2로 나누기 
//			num=num/2;
//			// num 이 0이 될때까지 
//			if(num==0) break;
//			
//			index--;
//		}
//		return binary;
//	}
	 
	 static int[] binaryCheck(int num) {
	        int[] binary = new int[16];
	        int index = 15; // 뒤에서부터 값을 저장
	        while (true) { // 반복 횟수를 알 수 없음 => 무한루프 생성
	            // 2로 나누고 나머지값 저장
	            binary[index] = num % 2;
	            // 2로 나누기
	            num = num / 2;
	            // num 이 0이 될때까지
	            if (num == 0)
	                break;
	            index--;
	        }
	        return binary;
	    }
//		출력  ==> void 는 전송할 값이 없는 경우
	static void print(int[] binary) {
		for(int i=0; i<binary.length; i++){
			if(i%4==0 && i !=0) {
				System.out.print(" ");
				
			}
			System.out.print(binary[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int a =input();
		System.out.println(a);
		int[] binary = binaryCheck(a);
		print(binary);
//		Scanner scan=new Scanner(System.in);
//		System.out.print("0~32767 사이의 정수 입력 :");
//		int num=scan.nextInt();
//		
//		int[] binary=new int [16]; // 16개의 정수가 0으로 초기화
///*
// *      new를 이용하면
// *      데이터형 초기화
// *      int => 0
// *      double => 0.0
// *      boolean => false
// *      char => '\0'
// *      String => null
// *    new => 동적 메모리 할당 (실행시에 메모리를 만들어서 배치)
// *    		
// */
//		int index=15; // 뒤에서 부터 값을 저장 
//		while(true) { // 반복 횟수를 알 수 없음 => 무한루프 생성
//			// 2로 나누고 나머지값 저장 
//			binary[index]=num%2;
//			// 2로 나누기 
//			num=num/2;
//			// num 이 0이 될때까지 
//			if(num==0) break;
//			
//			index--;
//		}
//		
//		
//		
//		for(int i=0; i<binary.length; i++){
//			if(i%4==0 && i !=0) {
//				System.out.print(" ");
//				
//			}
//			System.out.print(binary[i]);
//		}
	}
}
