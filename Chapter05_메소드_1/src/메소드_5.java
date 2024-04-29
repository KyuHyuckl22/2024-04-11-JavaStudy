/*
 *   1~100 까지 사이의 2의 배수의 합
 *             사이의 3의 배수의 합
 *             사이의 4의 배수의 합
 *             사이의 5의 배수의 합
 *             사이의 6의 배수의 합
 *             사이의 7의 배수의 합
 *             사이의 8의 배수의 합
 *             사이의 9의 배수의 합
 *        총 9개의 메서드가 필요
 */
public class 메소드_5 {
/*    static int display2() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%2==0)
    			sum+=i;
    		
    	}
    	return sum;
    			
    }
    static int display3() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%3==0)
    			sum+=i;
    		
    	}
    	return sum;
    	
    }
    static int display4() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%4==0)
    			sum+=i;
    		
    	}
    	return sum;
    	
    }
    static int display5() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%5==0)
    			sum+=i;
    		
    	}
    	return sum;
    	
    }
    static int display6() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%6==0)
    			sum+=i;
    		
    	}
    	return sum;
    	
    }
    static int display7() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%7==0)
    			sum+=i;
    		
    	}
    	return sum;
    	
    }
    static int display8() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%8==0)
    			sum+=i;
    		
    	}
    	return sum;
    	
    }
    static int display9() {
    	int sum=0;
    	for(int i=1; i<=100 ;i++) {
    		if(i%9==0)
    			sum+=i;
    		
    	}
    	return sum;
    	
    }*/
	/*
	 *  다른 클래스에서 사용이 가능 => 재사용 => 조립식
	 *  게시판에는 다 있다 (CRUD) 읽기, 수정, 추가, 삭제  => 3000줄  => 게시판으 5개 이상
	 *  
	 */
	static int display(int num) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%num==0){
				sum+=i;
			}
			
		}
		return sum;
	}
//	main 안에 쓰인것은 객체지향이 아닌 절차적 언어이다
//	메소드 => 반복제어 => 소스를 간겨랗게 만들수 있다
//	절차적 언어 => 순차적 => 재사용을 사용할 수 없다. 한번 사용하고 버려야 함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {
			System.out.println("1~100 까지의"+i+"배수의 합"+display(i));
		}
/*		System.out.println("1~100까지의 2의 배수의 합 : "+display2());
		System.out.println("1~100까지의 3의 배수의 합 : "+display3());
		System.out.println("1~100까지의 4의 배수의 합 : "+display4());
		System.out.println("1~100까지의 5의 배수의 합 : "+display5());
		System.out.println("1~100까지의 6의 배수의 합 : "+display6());
		System.out.println("1~100까지의 7의 배수의 합 : "+display7());
		System.out.println("1~100까지의 8의 배수의 합 : "+display8());
		System.out.println("1~100까지의 9의 배수의 합 : "+display9());  // 이렇게 할거면 메서드를 사용하지 않는다.
*/	}

}
