/*
 * 	돈까스 : 8000
 * 	칼국수 : 6000
 *  왕만두 : 5000
 *  ------------
 *  주문 돈까스 => 16인분
 *      칼국수 => 8인분
 *      왕만두 => 1인분
 * -------------- 총 계산서를 출력하는 프로그램을 작성
 */
public class 자바변수_1 {

	public static void main(String[] args) {
		int d=8000;
		int c=6000;
		int w=5000;
		
		System.out.println("총 금액은 "+((d*16)+(c*8)+w)+" 원 입니다.");
		
		
	}
}
