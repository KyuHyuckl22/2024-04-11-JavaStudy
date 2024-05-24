import java.util.*;
public class 메소드정리_메소드화 {

//	세자리 정수가 중복없는 난수로 발생한다.
	static void rand(int[] com) {
		for(int i=0; i<com.length; i++) {
			com[i]=(int)(Math.random()*9)+1; //1~9 사이 정수 => 중복없이
			// 중복체크
			for(int j=0; j<i; j++){
				if(com[i]==com[j]) {
					i--; //원상복귀 시켜서 다시추출하게 만들기
					break;
				}
			}
			
		}
	}
//	사용자 입력값을 가지고 온다
	static void inputData(int[] user) {
		user= new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) { 
			System.out.print(" 세자리 정수 입력 :");
			int input = scan.nextInt();
			//오류처리하기
			if(input< 100 || input> 999) {
				System.out.println("세자리 정수만 입력이 가능합니다");
		    // 처음상태로 돌아간다
				continue;
			}
			user[0]=input / 100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//오류처리
			if(user[0]==user[1] || user [1]== user[2] ||user[0] == user[2]) {
				System.out.println("같은 수는 입력할 수 없습니다");
				continue;
			
			}
			if(user[0]==0 || user [1]==0 || user[2]==0) {
				System.out.println(" 0은 입력할 수 없습니다");
				continue;
			}
			break; // 종료
		}
	}
	static void process() {
		int[] com=new int[3];
		//난수
		rand(com); // 배열 주소를 메소드로 전숭 => 값을 변경해서 가져온다 (call by refernce)
		System.out.println(Arrays.toString(com));
		int[] user = new int[3];
//		inputData(user);
//		System.out.println(Arrays.toString(user));
		while(true) {
			inputData(user);
			int s = compare(com, user);
			if(isEnd(s)) {
				System.out.print("Home Run");
				break;
			}
		}
	}
//	비교
	static int compare(int[] com, int[] user) {
		int s=0, b=0;
		for(int i=0; i<com.length; i++){
			for(int j=0; j<user.length; j++){
				// i=0 => j= 0,1,2
				// i=1 => j= 0,1,2
				// i=2 => j= 0,1,2
				if(com[i]==user[j]) {//같은 수가 있는지
					if(i==j) //같은 자리에 있는가
						s++;
					else     //다른 자리에 있는가
						b++;
				}
			}
			
		}
		hint(user,s,b);
		return s;
		
	}
	static boolean isEnd(int s) {
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
//	힌트
	static void hint(int[] user, int s, int b) {
		System.out.printf("Input Number : %d%d%d, Result: %dS- %dB\n",user[0],user[1],user[2],s,b);
	}
	

	public static void main(String[] args) {
		process();  // 완성된 메소드만 호출
		

	}

}
