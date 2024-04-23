/*
 *  continue => for문에서 주로 사용=> 제외
 * 
 */
public class 자바제어문_2 {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			if(i==3) continue; // 3을 제외하고 출력한다
			//증가식으로 이동해서 제외하고 수행
			System.out.println("i="+i);
			
		}
		System.out.println("===== while-countinue =====");
		int i=1;
		while(i<=5) // while(true)=> 횟수가 없는 경우
		{
//			System.out.println("i="+i);
			if(i==3) continue; // 증가하지 못하고 => 조건식으로 이동
			System.out.println("i="+i);
			i++;
		}
		//continue , break 문장은 자신의 반복문에서만 제어
		/*
		 *   for(int i=1;i<=3;i++)
		 *   {
		 *   	for(int j=1;j<=3;j++)
		 *   	{ 
		 *   		if(j==2) break; => j가 있는 for만 종료
		 *   	}
		 *   }
		 * 
		 * 구구단 / 페이지 나누기 => 조건
		 * ----   ---------
		 *  |         |
		 * 이차for      |
		 *            1차for
		 */
		
	}
}
