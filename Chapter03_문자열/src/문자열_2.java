/*
 *    문자열 ==> 알파벳을 입력받아서 => A, a의 갯수가 몇개인지 확인
 */
import javax.swing.*;
// 웹, 윈도우 ==> String이 엄청 중요하다
public class 문자열_2 {

	public static void main(String[] args) {
		String alpha=JOptionPane.showInputDialog("알파벳 입력:");
		int count=0;
		for(int i=0;i<alpha.length();i++) // length() : 문자갯수
		{
			char c=alpha.charAt(i); // 문자 1개씩 추출
			if(c=='A' || c=='a')
			{
				count++;
			}
		}
//		System.out.println(alpha+"에서 A,a 는 총"+count+"개 입니다");
		JOptionPane.showMessageDialog(null, alpha+"에서 A,a는 총 "+count+"개 입니다");
	}
}
