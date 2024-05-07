/*
 *   class Sawon {  => 한명의 사원에 대한 
 *       String name;
 *       String dept;
 *   }
 *   ------------------------------> 변수가 아니라 데이터형 (Sawon 데이터형)==> 사용자 데이터형
 *   public class MainClass
 *   {
 *       static void aaa()
 *       {
 *           Sawon s = new Sawon();  -----
 *       }                                |
 *       static void bbb()                |
 *       {                                |
 *           Sawon s = new Sawon();  ----- ==> 메소드 안에 있는 변수는 호출 후에 사라진다
 *       }                                |==> 각자 다 다른변수 이름이 같다고 같은 변수가 아니다      
 *   	 static void ccc()                |==> 블록 {} 이 끝나면 사라진다
 *       {                                |      
 *           Sawon s = new Sawon();  -----
 *       }  
 *   
 *   }
 *   
 *    public class MainClass
 *   {
 *       Sawon s = new Sawon();  --> 이걸 전역변수로 돌리면 모든 메소드 에서 s 만으로도 가용할 수 있다
 *                                 
 *       static void aaa()
 *       {
 *            s = new Sawon();  -----
 *       }                           |
 *       static void bbb()           |
 *       {                           |
 *            s = new Sawon();  ----- ==> 
 *       }                           |    
 *   	 static void ccc()           |
 *       {                           |      
 *            s = new Sawon();  -----
 *       }  
 *   
 *   }
 */
public class 맴버변수_활용 {  //넘기고 받고 하는 메소드가 많으면 지역변수 보다는 전역 변수를 사용하는게 좋다
//	                                                ----        -----
//	                                            메소드안에서만      class 에 박아놓고
//	                                            사용하는 변수       메소드 안에 뿌려버리는 변수
    static int a=100;  // 멤버변수                                                     
    static void aaa() {
    	int a=100;
    	System.out.println("aaa():a="+a);
    	System.out.println("aaa():a는 사라진다");
    }
    static void bbb() {
    	int b=200;
    	System.out.println("bbb():a="+a);
    	System.out.println("bbb():a는 사라진다");
    }
    static void ccc() {
        int c=300;             
        System.out.println("ccc():a="+a);
        System.out.println("ccc():a는 사라진다");
    }	
    
	public static void main(String[] args) {

		aaa();
		bbb();
		ccc();
	}

}
