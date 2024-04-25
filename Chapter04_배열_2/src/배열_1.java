/*   가장많이 나오는 
 *   1. 배열생성
 *      => 같은 데이터형만 모아서 관리
 *      => 데이터형[] 배열명;     (권장)
 *      => 데이터형 배열명[]; => 사용은 가능 (C/C++ 에서 주로 사용)
 *   2. 초기화
 *      => 데이터형[] 배열명={값,값,..}=> 변경하지 않는 데이터형
 *      => 데이터형[] 배열명=new 데이터형[갯수]    int[] test=new int[3]
 *        -> 기본 디폴드 값
 *           int => 0
 *           char =>'\0'
 *           double => 0.0
 *           long => 0L
 *           boolean => false
 *   3. 저장 갯수 확인
 *      => length => 배열명.length
 *   4. 데이터 변경
 *      => 연속적인 메모리 공간을 갖고있음
 *        *-----*
 *        => 인덱스 번호를 이용해서 데이터를 변경하거나 읽기
 *        => 변수 , 배열  의 역할은 읽기 , 쓰기(수정가능)
 *      => 인덱스 번호는 0번부터 시작한다
 *      
 *        int[] arr=new int [3]
 *                     arr[0] arr[1] arr[2]     
 *        arr  ------->  ----  ---   ---
 *                       0     0      0
 *        			     ----  ---   ---  저장된 크기가 동일하다  (데이터형이 같은)
 *      => 값을 변경할때
 *        arr[0]=100
 *        arr[1]=200
 *        arr[2]=300 -----일반 변수 초기화랑 동일
 *    * 인덱스는 0부터 순차적으로 되어있다 중간에 띄워진 수가 없음
 *       => 반복문을 사용하기 편리하다
 *       => 5개 지정하면 => 변경할 수 없다 : 고정적 (가변형 => 클래스 제작)
 *       => 소스량을 줄일 수 있다
 *       => 소프트 웨어 라인
 *          ------------ 하루 개발 코딩량  250줄 = 주석은 포함하지 않음
                 
 *   5. for-each
 *     형식)  p92 
 *        
 *        for(데이터형 변수명: 배열명)
 *        {   ----------- 인덱스 번호가 아니라 => 실제 배열에 저장된 값
 *        	 배열 데이터형과 변수명의 데이터형이 일치가 되야한다
 *           형변환을 할 수 없다
 *        }
 *        => 배열의 값을 변경하거나 , 초기화(X)
 *        => Only 출력만 한다 
 *          -> 웹에서 주로 사용
 *       ---------------------------------
 *       
 *   
 */
public class 배열_1 {

	public static void main(String[] args) {
		
//		정수 10개 저장 => 용도가 같은경우 => 배열 / 일반변수
		int[] arr=new int [10]; //변수 10개와 같다
		// arr이름으로 10개의 데이터를 제어
		// char 5ro => 'A'~'E'   //초기값을 안다면 {}를 사용하고 모른다면 new를 사용한다
		char[] alpha= {'A','B','C','D','E'};
		// 데이터형 변환
		double[] data= {10.5,20.5,30.5,40.5,50};
		// double d=50 => 50(int) 에서 실제 저장은 => d=50.0 double 형으로 변경
		// 작은 데이터형은 추가가 가능
		for(double d:data)
		{
			System.out.println(d);
		}
		// {}=> int , byte , char    같거나 작은것만 들어갈수 있음
		int[] arr2= {'A','B','C','D','E'};
		//            65  66  67  68  69
		for(int i:arr2)
		{
			System.out.println(i);
		}
		char[] ch= {65,66,67,68,69};
		for(char c:ch)
		{
			System.out.println(c);
		}
		boolean[] boo=new boolean[5];
		for(boolean b:boo)
		{
			System.out.println(b);
		}
		String[] str=new String[5];
		//클래스 => null (null은 주소가 없는경우)
		for(String s:str)
		{
			System.out.println(s);
		}
		double[] dd=new double[5];
		for(double d:dd)
		{
			System.out.println(d);
		}
				
		
		
	}
}
