/*
 *  중복이 없는 난수
 *  1~10 까지의 10개의 난수 발생 = 중복X 
 * 
 */
public class 중첩_for_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		용도가 같은 정수 10개 저장
		int[] arr=new int[10]; // => 변수 이름을 1개로 통일해서 사용 -> 구분은 index로
//		인덱스 번호는 0번부커 시작한다
//		제어하기가 편리하다 (읽기/쓰기가 편하다) => 반복문을 사용하기 때문에 소스 코딩을 줄일 수 있다
//		int a=random() => 500개를 발생시켜야 하는데 500개를 다 따로 적을것이냐? xx
//		클래스도 한개의 이름으로 여러개를 동시에 제어한다 => 인터페이스
		for(int i=0; i<arr.length; i++)  // i 출력 칸 수
		{
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0; j<i; j++)  // j 출력물
			{
				if(arr[i]==arr[j]) // i와 j가 같을경우
				{
					i--;  // i에 --를 줘서 다시 난수가 발생할 수 있게 만듦
					break;  //break는 2차 for문에 속해있는 break기 때문에 2차 for문만 정지 시킨다
				}

			}
		}
//		초기화 완료 => 출력시작
		for(int i:arr)
		{
			System.out.print(i+" ");
			
		}
		
	}

}
