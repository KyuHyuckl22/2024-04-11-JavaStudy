/*
 *     문자 10개를 저장
 *     => 출력
 *        Hello
 *     => 반대 출력
 *        olleH
 *     => Sort => 2차 for 
 *    ----------------------------------       
 *     면접 : 기술면접 / 코딩테스트 / 인성면접
 *           ----             ------
 *         기본 개념 보다
 *         자신의 포트폴리오에서 질문이 나옴
 *    ---------------------------------- 이력서 통과가 우선이다
 *    
 *    
 */
public class 배열_2 {
	public static void main(String[] args) {
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		//출력 => for-each : 출력중심 => 웹 => 배열/(컬랙선=12장)
		/*
		 *  for(데이터형 변수:배열명)
		 *      -----     ----
		 *          |      |
		 *          ---------- 일치(데이터형 변수가 데이터형이 클수도 있다)
		 *  char[]
		 *  
		 *  for(char c:배열)
		 *  for(int i:배열)
		 *  for(double d:배열)
		 *  
		 *  byte < char < int < long < double
		 *         ------>
		 *       * 가급적이면 같은 데이터형으로 받는다
		 *       * 인덱스를 이용하는 것이 아니라 => 실제 배열에 저장된 값을 읽어온다
		 *       * 단점 : 관련된 다른 배열의 값을 출력할 수 없다
		 *       String[] names={"","","",""};
		 *       String[] sexs={"","","",""};
		 *       
		 *       이름(성별)
		 *       for(String name:names)  --> 두개를 동시에 제어할 수 없다 , 뒤에서부터 출력할 수도 없다
		 *       두개를 동시에 제어하기 위해선 index를 사용해야 한다 --> 일반 for문을 이용해야 한다
		 *       
		 *       
		 */
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n--------반대로 출력 ----------");
		for(int i=alpha.length-1;i>=0;i--)
		{
			System.out.print(alpha[i]+" ");
		}
	
	}
}
