/*
 * 		자주 바뀌는것들을 변수로 잡는다
 * 		사용자로 인해 바뀌는것들
 * 		겹치는 데이터는 맨 처음것 하나만 잡고 거기서 바뀌는것들을 변수로 잡는다
 * 
 * 		계산기는 정수형이 아닌 문자형으로 만들어졌다
 * 		때문에 누르자마자 계산이 되는것이 아니라 뒤에 숫자가 붙는거고,
 * 		계산할때 정수로 변환해서 계산되는것
 * 
 * 		그 사이트가 갖고있는 목적이 무엇인지 파악하기
 * 		ex) 쇼핑몰은 결제
 * 			영화 사이트 예매
 * 			당근마켓 연결  
 * 
 * 
 */
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byte_value=10;
		//byteValue 단어가 두개 붙었을때는 _ 를 사용하거나 두번째 시작하는 알파벳을 대문자로 준다 => -128~127 을 넘으면 안됨
		int intValue=20; // 컴퓨터에서는 모든 숫자를 => int로 인식한다  => 21억 4천을 넘으면 안됨
		// 4byte 
		long longValue=30L; // 구분 => 숫자뒤에 L,l
		// 8byte
		float floatValue=10.5F; // 소수점 6자리까지 계산
		// 4byte
		double doubleValue=10.5; // 10.5D or 10.5d => D,d 는 생략이 가능 => 실수의 디폴트값
		// 정수 의 디폴트 int
		// 실수 의 디폴트 double
		// 실제 프로그램에서는 int , double 이 가장 많이 사용된다
		// 변수 => 계속 상태가 변경 .../ 고정 => 상수 
		boolean booleanValue=true;
		// 1byte            => 조건식에 자주 사용되는 변수
		char charValue='A';
		// 2byte 문자 한개의 저장 공간(0~65535)
		
		/*
		 * 		byte => **char => int => long => double 
		 * 		boolean    |
		 * 				String
		 * 		총 6개의 변수만 잘 외우기
		 * 
		 * 			된장국 끓이는 법
		 */
		
		char c1='된';
		char c2='장';
		char c3='국';
		char c4=' ';
		char c5='끓';
		char c6='이';
		char c7='는';
		char c8=' ';
		char c9='법';
		
		System.out.println(c1+""+c2+c3+c4+c5+c6+c7+c8+c9); // 문자열을 써주지 않으면 char 는 숫자로 변환되어 나오기때문에 
//		"" 를 붙여준다
		
		String s= "된장국 끓이는 법";
		System.out.println(s);
		//여러개를 동시에 저장해주는 공간을 class 라고 함
		// String 은 class 다
		
		
		
		
		
		
	}

}
