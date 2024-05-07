
public class 메소드정리_03 {
    static void swap(int[] arr) {
    	// 메모리 주소 자체를 넘겨준다 => 같은 메모리에서 값을 변경하기 때문에 원본 자체가 변경된다
       System.out.println("변경 전 : arr[0]="+arr[0]+", arr[1]="+arr[1]);
       int temp=arr[0];
       arr[0]=arr[1];
       arr[1]=temp; // 값 교환
       System.out.println("변경 후 : arr[0]="+arr[0]+", arr[1]="+arr[1]);
    }
	public static void main(String[] args) {
//		Call By Refernce 방식 => 메모리 주소 자체를 변경
//		주소는 배열 / 클래스 만 가지고 있다  ==> 배열하고 클래스가 나오면 자체를 바꾼다
		int[] temp= {100,200};
		swap(temp);
		System.out.println("main => temp 값:temp[0]="+temp[0]+",temp[1]="+temp[1]);

	}

}
