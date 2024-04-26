/*
 *     알파벳 10개를 임의로 추출한 후에 정렬해서 출력 => ASC / DESC
 *                                         오름차순   내림차순
 *     
 */ 

import java.util.*;
public class 중첩_for_10 {
	public static void main(String[] args) {
//		알파벳 10개
		char[] ch=new char[10];				
//		임의 추출
		for(int i=0; i<ch.length; i++) {
		 ch[i]=(char)((Math.random()*26)+65);

		}
		System.out.println("정렬 전 :");
		System.out.println(Arrays.toString(ch));
//		ASC 오름차순
		for(int i=0; i<ch.length-1; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
		}
		System.out.println("정렬 후 :");
		System.out.println(Arrays.toString(ch));
//		DESC 내림차순 출력
		  
		 
		 
	}
}
