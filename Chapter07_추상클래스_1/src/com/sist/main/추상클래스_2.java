package com.sist.main;
// 이미 처리 메소드명은 알고있다
// 24 개의 버튼을 메소드 => btn1 ...btn24
// 유지보수 하는 사람들이 쉽게끔 만들어야 함. 다른사람을 생각해줘야함
abstract class Button {
	public abstract void click(); // 일반메소드니 void 앞에 abstract 를 줘야함 
}
class Login extends Button {
	@Override
	public void click() {
		System.out.println("로그인 요청");
	}
}
class Join extends Button {
	@Override
	public void click() {
		System.out.println("회원가입 요청");
	}
}
// 추상 클래스를 사용하게 되면 결함성이 낮은 프로그램을 만들 수 있다
public class 추상클래스_2 {

	public static void main(String[] args) {
		Button btn=new Login();
		btn.click();
		
		btn=new Join();
		btn.click();
	}

}
