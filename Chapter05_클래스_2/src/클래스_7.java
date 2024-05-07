/*
 *    맛집 데이터형을 만들어서 => 값을 대입 후 출력
 */
class Siksin {
	String name;
	double avg;
	String loc;
	int hit;
	String menu; 
}
public class 클래스_7 {

	public static void main(String[] args) {
		Siksin f1=new Siksin();  // 공간을 먼저 만들어 줘야하고 그 안에서 변수를 초기화
		f1.name= "새벽집 청담동점";
		f1.avg= 4.0;
		f1.loc= "청담동";
		f1.hit= 17560;
		f1.menu= "꽃등심(150g), 양념갈비(260g), 생고기(150g), 불고기(200g), 샤브샤브(160g)";
		String[] menus=f1.menu.split(",");
		
		System.out.println("업체명: "+f1.name);
		System.out.println("평점: "+f1.avg);
		System.out.println("위치: "+f1.loc);
		System.out.println("==== 메뉴 ====");
		for(String m:menus) {
			System.out.println("o "+m.trim());
		}
	}

}
