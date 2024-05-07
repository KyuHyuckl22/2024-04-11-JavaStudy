/*
 *     Human 이라는 데이터형을 제작 => 한개의 정보 => 따로 저장시에는 new
 *     
 */
class Human{
	static String name;
	static String sex;
//	new 사용시 다른 메모리 생성
//	static 사용시 공통으로 사용하는 메모리가 생성
}
public class 멤버변수_활용4 {

	public static void main(String[] args) {
		Human hong=new Human();
		hong.name="홍길동";
		hong.sex="남자";
		
		Human shim=new Human();
		shim.name="심청이";
		shim.sex="여자";

		System.out.println(hong.name); //결과값 심청이
//		static 은 공용이기 때문에 마지막에 바꾼 심청이로 모두 바뀐것이다
//		하지만 멤버변수에 있는 static을 빼버리면 따로 저장하기 때문에  결과값이 홍길동으로 바뀐다
		
	}

}
