package com.sist.main2;
import java.util.*;
/*
 *   관련된 클래스를 모아서 => 한번에 관리 
 */
public class UserMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("게시판 (1), 맛집(2), 레시피(3), 맛집(4), 공지사항(5) : ");
		int menu=scan.nextInt();
		
		Container c=new Container();
		Model model=c.getmodel(menu);
		model.excute();
		
		
//		if (menu == 1) {
//			BoardModel model=new BoardModel();
//			model.execute();
//		}
//		if (menu == 2) {
//			FoodModel model=new FoodModel();
//			model.execute();
//		}
//		if (menu == 3) {
//			RecipeModel model=new RecipeModel();
//			model.execute();
//		}
//		if (menu == 4) {
//			SeoulModel model=new SeoulModel();
//			model.execute();
//		}
//		if (menu == 5) {
//			NoticeMoedl model=new NoticeMoedl();
//			model.execute();
//		}
		
	}
}
