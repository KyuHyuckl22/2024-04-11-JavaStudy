/*
 *    ☆☆☆☆☆
 *    ☆☆☆☆☆
 *    ☆☆☆☆☆
 *    ☆☆☆☆☆  => 
 *    1) 1차for 에 들어갈것 => 줄 수 4 => 1~4
 *    2) 2차for 에 들어갈것 => ☆ ==> 5개
 *    
 *    ABCD
 *    EFGH
 *    IJKL
 *    MNOP   => 출력
 *    1) 1차 4줄
 *    2) 2차 영어 순서대로...
 *    
 *    
 */
public class 중첩_for_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("☆");
			}
			System.out.println();
		}

		
//		char c='A';
//		for(int i=1; i<=4; i++)         ==> 출력물   ABCD
//		{ 										   EFGH
//			for(int j=1; j>=5; j++)                IJKL
//			{									   MNOP
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=4; i++)//       ==> 출력물  ABCD
		{					   //                 ABCD
			char c='A';        //                 ABCD
			for(int j=1; j<=5; j++)//             ABCD  -> 변수 위치에 따라 출력물이 이렇게도 바뀜
			{
				System.out.print(c++);
			}
			System.out.println();    // ☆ ★
		}
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=5; j++)            
			{
				if(j==3)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=1; j--)
			{
				if(i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==6-j || i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		String[] img= {"♠","◈","♣","♥"};
		for(int i=0; i<4; i++)
		{		
			for(int j=0; j<4; j++)
			{
				System.out.print(img[j]);
				
//				if(j==1)                    --> 이걸 줄일수 있는게 배열!!
//					System.out.print("♠");
//				if(j==2)
//					System.out.print("◈");
//				if(j==3)
//					System.out.print("♣");
//				if(j==4)
//					System.out.print("♥");				
			}
			System.out.println();
		}
		
	
	}

}
