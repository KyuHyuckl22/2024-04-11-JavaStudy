/*
 *      5개 정수 => 넘겨주면 => 정렬을 해주는 프로그램
 *                          올림차순     ASC  -> 1234
 *                          내림차순     DESC -> 4321
 *      
 *    = 선택 정렬 => 1개를 선택해서 변경
 *    = 버블 정렬 => 인접한 데이터 끼리 변경
 *    ------------------------------- sort reserve, 오라클 : ORDER BY
 *    .. 로직 (프로그램을 짜는 방식과, 2차 for문)
 *    
 *      1) 2차 for
 *                     | false 일 경우 => 종료
 *                1    2
 *          for(초기값; 조건식; 증가식){
 *                     | true 일 경우
 *          --------------------------------
 *                          | false 라면 1차의 증가식으로 이동
 *                    1     2     |-------
 *              for(초기값; 조건식; 증가식){    |
 *                          | true 일 경우  |
 *                  반복 출력 문장------------
 *              }
 *          --------------------------------    
 *          }
 *     ex) 
 *         for(int i=1; i<=5; i++){
 *             for(int j=1, j<=5; j++){
 *                 반복 수행 문장 --> 25번
 *             }
 *         }
 *         i=1 j1    i=2  j1    ... i=5 j1   i=6  => false 문장 수행 종료                                        
 *             j2         j2            j2  
 *             j3         j3            j3
 *             j4         j4            j4
 *             j5         j5            j5
 *         
 *        선택 정렬 => 앞에서부터 정렬
 *        ------
 *        30 20 40 10 50
 *        == ==
 *        20 30 
 *        ==    ==  
 *        20    40 
 *        ==       ==  
 *        10       20
 *        ==          ==
 *        10          50
 *      ------------------------------ for문 1바퀴
 *        10 30 40 20 50
 *           == ==
 *           30 40
 *           ==    ==
 *           20    30 
 *           ==       ==
 *           20       50
 *     ------------------------------- for문 2바퀴
 *        10 20 40 30 50
 *              == ==
 *              30 40
 *              ==    ==
 *              30    50  
 *     -------------------------------- for문 3바퀴
 *        10 20 30 40 50
 *                 == ==
 *                 40 50
 *     --------------------------------- for문 4바퀴  length-1 이 붙는 이유는 5개의 단어들은 4바퀴만 돌기 때문이다                                
 *         
 *         
 *          
 */
public class 메소드_6 {
	static int[] sort(int type, int[] arr) {
    for(int i=0; i<arr.length-1; i++) {
    	for(int j=i+1; j<arr.length; j++) {
    		if(arr[i]>arr[j]);
    		int temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    		
    	}
    }
	return arr;
} 
	public static void main(String[] args) {
        int[]arr=new int[5];
        for(int i=0; i<arr.length; i++) {
//        	초기화
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("변경 전 =======");
        for(int i: arr) {
        	System.out.print
        	(i+" ");
        }
        
//        sort 를 사용해서 정렬하기
        System.out.println("\n ===== 변경 후 =====");
        arr = sort(1, arr);
        for(int i:arr) {
        	System.out.print(i+" ");
        }
        
//        for(int i=0; i<arr.length-1; i++) {
//        	for(int j=i+1; j<arr.length; j++) {
//        		if(arr[i]>arr[j]);
//        		int temp=arr[i];
//        		arr[i]=arr[j];
//        		arr[j]=temp;
//        	}
        	
//        }
	}

}
