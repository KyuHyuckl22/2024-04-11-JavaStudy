/*
 *    static 메소드 
 *    -----------
 *    => static 변수만 사용이 가능   
 *  
 *    멤버 메소드(******) => 5장 시작 => 140 
 *       => static변수, 멤버변수를 사용할 수 있다
 *       
 *    static 은 공용이기 때문에 한곳에서 바꾸면 다 바뀐다
 * 
 */
public class 멤버변수_활용3 {

//	int a=10; (x)
	static int a=10;// (o)	   static 은 static만 가져올 수 있다
	static void display() {
		System.out.println("a="+a);
	}
	
	int b=10;
	static void display2() {    // static을 사용하지 않고 가져오는 방법
		멤버변수_활용3 ss=new 멤버변수_활용3();  
		System.out.println("b="+ss.b);
	}
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
