package com.sist.main;
/*  많이 사용하는것들  이 3개만 외우자!
 *    ArrayList  /  HashSet  /  HashMap
 *    ---------     ------     --------
 *    중복이 있는경우   중복이 없는경우  두가지를 동시에 저장할대(id:admin),(pw:1234) ...
 *    
 *    => 자료구조들 이다
 *       자료구조 : 데이터 저장, 데이터 수정, 데이터 추가, 데이터 삭제, 데이터 검색  들을 수행할 수 있어야 한다
 *               --------  ________  -------  ________  ________
 *                            ↓                   ↓         ↓
 *                            -------------------------------
 *                               데이터를 찾을 수 있는 구분자가 필요하다
 *              => ArrayList : 인덱스 번호가 구분자 역할을 해줌 (중복이 있다)
 *              => Set       : 데이터 자체가지고 찾기 때문에 (중복이 없다)                 
 *              => Map       : key(중복없다), value(중복이 있다)
 *              ------------------------------------------------
 *               얘네들은 배열을 보완해 준것이다
 *                 배열 보완 : 고정--> 가변 으로 만들어주고
 *                          삭제, 추가 기능을 만들어줬다
 *              ------------------------------------------------
 *               => 자바에서는 컬렉션 이라고 부른다 (여러개를 수집하고 관리한다)
 *               
 *                 Collection
 *                     ↓
 *      ----------------------------------
 *     ↓               ↓                 ↓
 *   List             Set               Map
 *     ↓               ↓                 ↓
 *   ArrayList       HashSet            HashMap
 *   Linked          TreeSet            Hashtable
 *   Vector
 * =>List : MyBatis, JPA
 *         --------------
 *   
 *   => 개발자 선호
 *      --------
 *      ArrayList<String> list=new ArrayList<String>() ==> X
 *      
 *      List<String> list = new ArrayList<String>(); ==> O
 *      
 *      Set<String> list=new HashSet<String> ()
 *      Set<String> list=new TreeSet<String> ()
 *      
 */
import java.util.*;
public class Set_6 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("홍길동");
		list.add("박문수");
		
		for(int i=0; i<list.size(); i++){
			String name=list.get(i);
			System.out.println(name);
		}
	}

}
