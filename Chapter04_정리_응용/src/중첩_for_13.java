/*
 *   알파벳 10개 난수 => 버블벙렬 (DESC)
 *   중복없는 알파벳.. 
 * 
 */
import java.util.*;
public class 중첩_for_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] alpha=new char[10];
		for(int i=0; i<alpha.length; i++) {
			alpha[i]=(char)((Math.random()*26)+65);
			for(int j=0; j<i; j++) {
				if(alpha[i]==alpha[j]) {
					i--;
					break;
					
				}

			}
			
		}
	System.out.println(Arrays.toString(alpha));  // 중첩없는 난수발생
	
	}

}
