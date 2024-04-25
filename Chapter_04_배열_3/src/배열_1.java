/*
 *     배열 : 같은 데이터형 여러개 데이터를 모아서 저장
 *          ----------- 용도가 같은 데이터 인지 확인
 *           => 고정적이다 라는 단점 과
 *           => 여러개의 데이터를 한개의 이름으로 제어를 할 수 있다 라는 장점
 *                           ---------------- index  번호는 항상 0번부터 시작
 *          1) 선언 
 *            데이터형[] 배열명;
 *            데이터형 배열명[];
 *            예)
 *              정수
 *              int[] arr
 *              실수
 *              double[] arr
 *              문자
 *              char[] arr
 *              문자열
 *              String[] arr
 *              논리
 *              boolean[] arr
 *              
 *          2) 초기화
 *             => 실제 값을 초기화
 *               -> int[] arr;
 *                  arr=new int[]{1,2,3,4,5}
 *             => 기본 값을 초기화
 *               -> int arr=new int[5]; => 자동으로 0으로 초기화
 *               -> int [] => 0 
 *               -> double[] => 0.0
 *               -> boolean[] => false
 *               -> String[] => null(주소가 없는 상태
 *                              null => 모든 클래스에 저장(참조할 수 있는 주소가 없을경우 null)
 *               -> long[] => 0L
 *               -> char[] => '\0' (공백. 값이 없는 상태)
 *               
 *               ** new 연산자 => malloc() => 자주 사용=> 연산자로 승격
 *                  ----->  넘겨주는 값 (주소값 => int)
 *                  -----> 동적 메모리 할당 (생성) 
 *                         --- 실행시마다 메모리 확보 (메모리 따로 생성)
 *                         --- 메모리 주소가 다르다 => 클래스에서 저장할때 주로 사용
 *                                       
 *                                       
 *                  int[] arr=new int[5];                    
 *                  System.out.println(arr); => [I@6f2b958e  라는 메모리 주소값이 나옴
 *                                          연속적인 메모리를 가지고 있다
 *                                     arr0  arr1  arr2  arr3  arr4   => index 를 이용하지만 실제로는 일반 변수와 같음
 *                  arr ---------->   ------------------------------
 *                  					 0  |  0  |  0  |  0  |  0
 *                                    ------------------------------
 *                                   => 주소를 이용해서 원하는 데이터에 접근하는 변수 => 참조변수   라고 한다
 *                                      배열 / 클래스
 *                                   => 변수 / 배열 / 클래스  =>  다 변수다
 *                                      한개만 저장 / 같은 데이터형 여러개 / 다른 데이터형 여러개 저장 
 *                                   => 예)
 *                                        학생 1명에 대한 정보
 *                                        ---------------
 *                                        1. 이름
 *                                        2. 성별
 *                                        3. 학번
 *                                        4. 학년
 *                                        5. 주소
 *                                        6. 전화
 *                                        7. 나이
 *                                        ---------------                배열
 *                                        변수 => 학생 1명일때          학생이 10명이라면? 
 *                                              String name;
 *                                              String sex;             X 10  
 *                                              int hakbun;         이것을 다 쳐야하는가?
 *                                              int year;
 *                                              String address; 
 *                                              String phone;       String[] phone=new String [10] 이면 끝
 *                                              int age;              
 *               클래스
 *               class Student
 *               {
 *               	String name,sex,address,phone;        배열보다 더 편리하게 더 쉽게 관리할 수 있게 만들어주는게
 *                  int hakbun,year,age                   클래스  이다
 *               }                     
 *               => 메모리 원하는 만큼 확보 할 수 있다                                               
 *               Student hong=new Student()                  
 *               Student hong1=new Student()                  
 *               Student hong2=new Student() 
 *                ...  
 *               Student[] std=new Student[1000] -> 학생 1000명을 관리할 수 있게 만들어줌
 *                
 *          3) 값 변경
 *             int[] arr={10,20,30,40,50}  => 5개의 메모리가 자동으로 구축
 *             
 *             Stack(주소 영역)
 *             arr ----------->        Heap (실제 데이터가 저장되는 영역)
 *                               [0]    [1]    [2]   
 *                             ----------------------------------
 *                               10  |  20  |  30  |  40  |  50  
 *                             ----------------------------------
 *                         0x100   0x104  0x108   0x112  0x116
 *                         4byte 씩 증가
 *               배열 변수는 시작 주소값만 가지고 있다 => arr=0x100
 *               arr[0] => 0x100주소 첫번째 값
 *               arr[1] => 0x100주소 두번째 값
 *               ...
 *               ...
 *               
 *              세번째 값 변겅 => (30) 을 변경 
 *                arr[2]=100   =>   30은 사라지고 => 100으로 변경
 *              마지막 값 변경 => (50) 을 변경
 *                arr[4]=500   =>   50은 사라지고 => 500으로 변경
 *              배열의 값을 변경할때 => 배열명[인덱스]
 *                                ----------- 0번부터
 *                                ----------- 갯수 => length
 *              => 배열 복사
 *                 얕은 복사 : 공유할때 쓰이는 방식
 *                 깊은 복사 : 새로운 배열을 생성
 *                       
 *          4) 출력 => for -each
 * 
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		얕은 복사  - 같은 영역을 제어할 수 있음
//		int[] arr= {10,20,30,40,50};
//		int[] temp=arr;    // temp 에 arr을 대입한다면
//		temp[0] = 100;     // temp 와 arr의 주소가 같아진다 때문에
//		temp[1] = 200;     // temp 에서 바꾸면 arr의 값도 바뀐다
//		arr[0] = 100 , arr[1] = 200
//		System.out.println("temp[0]="+temp[0]);
//		System.out.println("temp[1]="+temp[1]);
//		System.out.println("arr[0]="+arr[0]);
//		System.out.println("arr[1]="+arr[1]);
		
//		깊은 복사  - 영역을 나눠줌
		int[] arr= {10,20,30,40,50};
		int[] temp=arr.clone();   // clone(); < arr의 값은 그대로 두고 복사를떠서 temp 라는 새로운 배열을 생성해줌
		int[] temp2=arr;          // 배열은 메모리 주소를 이용한다  주소를 대입하면 같은 메모리를 제어하게된다
		System.out.println("arr="+arr);      // arr=[I@6f2b958e     clone 을 사용한 temp 와는 주소값이 다르지만                                                   
		System.out.println("temp="+temp);    // temp=[I@1f89ab83    얕은 복사로 대입해버린 temp2 와는 주소값이 같다                                                             
		System.out.println("temp2="+temp2);  // temp2=[I@6f2b958e   이렇게되면 temp2로 arr을 제어할 수 있게 된다.                                                                  
		temp[0]=100;              
		temp[1]=200;              
				
		System.out.println("temp[0]="+temp[0]);
		System.out.println("temp[1]="+temp[1]);
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);

//		=> 원본이 변경될 수 있다 
//		   주소값은 대입이 가능하다
		

	}

}
