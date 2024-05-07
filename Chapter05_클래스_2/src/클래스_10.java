/*
 *   static      /    instance 변수의 차이점
 *   -------         ------------------
 *     |                \  new 사용할때마다 메모리 공따로 생성
 *     | 메모리 공간은 1개 생성 => 모든 객체가 공유
 */
class Member {
	String name;
	String address;
	
}
class MemberSystem{
//	데이터가 공통으로 사용이 될때 => 크롤링, 파일읽은 데이터 => 
	static Member[] members=new Member[3];
/*
 * 
 * 	각각 저장하는 변수 => 멤버변수 (인스턴스) => new 갯수만큼 만들어진다
 *      => 학생정보, 영화정보, 맛집장보
 *  공유 (한개만 저장) => 정적변수 (공유변수) => static : 메모리 공간이 한개만 만들어 진다
 *       => 데이터 집합, 게시판, 회원가입 ...
 */
	static int index=0;
}
public class 클래스_10 {

	public static void main(String[] args) {
		
		MemberSystem ms1=new MemberSystem();
		ms1.members[ms1.index]=new Member();
		
		ms1.members[ms1.index].name ="홍길동";
		ms1.members[ms1.index].address ="서울";
		ms1.index++;
		ms1.members[ms1.index]=new Member();
		ms1.members[ms1.index].name ="심청이";
		ms1.members[ms1.index].address ="경기";
		ms1.index++;
		ms1.members[ms1.index]=new Member();
		ms1.members[ms1.index].name ="박무순";
		ms1.members[ms1.index].address ="인천";
		
		for(Member m:ms1.members) {
			System.out.println(m.name+","+m.address);
		}
		MemberSystem ms2=new MemberSystem();
		for(Member m:ms2.members) {
			System.out.println(m.name+","+m.address);
		}
		
	}

}
