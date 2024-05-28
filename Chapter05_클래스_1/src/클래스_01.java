/*
 *   클래스 
 *     = 사용자 정의 데이터형 : 데이터만 모아서 관리
 *                        ----------다른데이터를 모아서 관리
 *     = 액션 클래스 : 메소드를 여러개 모아서 관리
 *     ** 클래스는 한개에 대한 정보
 *     class Sawon{
 *         이름
 *         부서
 *         근무지
 *         입사일
 *         직위
 *         연봉
 *         ...
 *     }
 *     
 *     class 학생 {
 *         이름 
 *         학년 int
 *         학점 char
 *         주소 String
 *         전화
 *         ...
 *         
 *     }
 *     
 */
//    데이터형=> 형변환
//     프로그램에 맞게
class Student {
	String name;
	int age;
	// 인스턴스 변수 : 메모리 공간을 따로 생성
	String school_name;
}

public class 클래스_01 {
	public static void main(String[] args) {
		Student hong = new Student();

		Student Sim = new Student();

		Student park = new Student();

		System.out.println("==== hong 영역 ====");
		System.out.println("이름 : " + hong.name);
		System.out.println("나이 : " + hong.name);
		System.out.println("==== shim 영역 ====");
		System.out.println("==== park 영역 ====");

	}
}
