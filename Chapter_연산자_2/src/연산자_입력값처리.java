import java.util.Scanner; //Scanner 는 키보드의 입력값을 읽는다
// c=> include
// c#=> using
// python => import
// javascript => import
// 기존에 만든 클래스를 불러온다, 라이브러리 읽기
// 같은 폴더에 있는 경우에는 생략 => 다른폴더에 있는 경우에만 사용
// 국어, 영어, 수학 점수를 입력을 받아서 => 총점 , 평균
public class 연산자_입력값처리 {
	
	public static void main(String[] args) {
		//저장할 메모리공간을 생성
		int kor,eng,math,total;
		double avg;
		
		//사용자로부터 입력값을 받아서 변수에 초기화
		//키보드 입력값 읽기
		Scanner scan=new Scanner(System.in);
		System.out.print("국어,영어,수학 입력 :(60 70 80): ");
//		System.out.print("국어 점수");
		kor=scan.nextInt();
		
//		System.out.print("영어 점수");
		eng=scan.nextInt();
		
//		System.out.print("수학 점수");
		math=scan.nextInt();
		
		//처리
		//사용자 요청 ==> 프로그램에서 요청 처리 결과를 보여준다 => 연산자
		total=kor+eng+math;
		avg=total/3.0;
		
		System.out.println("===결과===");
		System.out.println("총점: "+ total);
		System.out.printf("평균:%.2f",avg);
		
	}

}
