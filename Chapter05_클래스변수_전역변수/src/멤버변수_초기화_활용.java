/*
 *    class ClassName
 *    {
 *     --------------------
 *    
 *     --------------------
 *    
 *     --------------------
 *     int a;
 *      void display()
 *      {
 *         ----------변수 선언 => 지역변수 => 메소드가 종료하면 사라진다 => 사용하려면 리턴형  
 *          a=100; 
 *      }
 *      void print()
 *      {
 *          sout a;     맴버변수가 있으면 return; , 매개변수를 사용하지 않아도 연결이 된다
 *      }
 *     --------------------
 *    
 *    
 *    }
 */
import java.util.*;
class sawon {
	String name;
	String dept;
	String loc;
	String job;
	int pay;
}
public class 멤버변수_초기화_활용 {
//	사원 등록
	static void sawonInsert() {
		sawon s=new sawon();
		s.name = "홍길동";
		s.dept = "개발부";
		s.loc = "서울";
		s.job = "대리";
		s.pay = 3600;
	    			
	}
	
//	사원 목록
	
//	사원 상세보기
	public static void main(String[] args) {

		
	}

}
