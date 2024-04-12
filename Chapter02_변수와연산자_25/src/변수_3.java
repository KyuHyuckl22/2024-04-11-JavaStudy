/*
 * 		국어 영어 수학 => 총점 / 평균 / 학점 (ABCDF)
 * 		===> 6개의 변수를 필요로 한다.
 * 			 정수형 4
 * 			 double 1
 * 			 char 1
 */
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 90;
		int eng = 80;
		int math = 75;
		int total = kor+eng+math;
		double avg = total /3.0;   // 정수/정수 = 정수  ex) 5 / 2 = 2 만출력
		System.out.println("국어 점수 :"+kor);
		System.out.println("영어 점수 :"+eng);
		System.out.println("수학 점수 :"+math);
		System.out.println("총 점 :"+total);
		System.out.printf("평균은 %.2f", avg); // .2f 는 반올림 해서 소숫점 2자릿 수까지만 출력하게 만들어준다
		
		
	}

}
