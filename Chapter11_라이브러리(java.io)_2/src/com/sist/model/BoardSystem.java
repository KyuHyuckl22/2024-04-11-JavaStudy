package com.sist.model;

/*						  오라클에선
 *   1. 목록 출력 => 검색 =>  SELECT   => READ
 *   2. 게시물 추가 => 추가 => INSERT   => CREATE
 *   3. 상세보기 => 조건 => SELECT     => READ
 *   4. 수정 => 수정 => UPDATE        => UPDATE
 *   5. 삭제 => 삭제 => DELETE        => DELETE     
 *   --------------------------------------------- CRUD : 메모리 / 파일 / 데이터베이스
 *                                                        -----  ---  ---------- 오라클
 *                                                        컬렉션  ObjectInput / Output
 */
import java.util.*;
import java.io.*;
import java.sql.Array;

public class BoardSystem {
//    데이터 저장 => 모든 사용자가 공통으로 사용
	private static ArrayList<Board> list = new ArrayList<Board>();

	public BoardSystem() {
		boardGetData();
//		Board b=new Board();
//		b.setNo(1);
//		b.setName("홍길동");
//		b.setSubject("파일을 이용한 CRUD 배우기");
////		프로그램을 한마디로 정의 하자면 '데이터 관리' 이다 데이터 관리 잘하는사람이 최고
////		데이터 관리 프로그램들-> (JSP, Spring, VueJS, ReactJS)
////		==> 데이터분석 ==> 머신러닝 / 딥러닝 ==> 응용을 한다면 (AI)
//		b.setContent("파일을 이용한 CRUD=> 데이터베이스(오라클) : 읽기, 검색, 추가, 수정, 삭제 : 메모리(컬렉션), 파일, 데이터베이스 ");
//		b.setRegdate(new Date());
//		b.setHit(0);
//		b.setPwd("1234");
//		list.add(b);
//		boardSave(); // 생성자 호출시 저장 해놓고
//		boardGetData(); // 데이터 읽기
	}

	public void boardGetData() {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("c:\\javaDev\\Java_data\\board.txt");
			ois = new ObjectInputStream(fis);
			list = (ArrayList<Board>) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception ex) {
			}
		}
	}

//  저장
	public void boardSave() {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("c:\\javaDev\\Java_data\\board.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list); // 파일에 객체 단위로 저장
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception ex) {
			}
		}
	}

	public void boardInsert(Board board) {
		board.setNo(boardSequence() + 1);
		list.add(board);
		boardSave();
	}

//	목록  -> 페이지 나누기를 할 줄 알아야 함  
//	       ********** 면접 => 인라인 뷰
	public ArrayList<Board> boardList(int page) {
		ArrayList<Board> bList = new ArrayList<Board>();
		int j = 0; // 10개씩 나눠줄 변수
		int pagecnt = (page * 10) - 10; // 시작위치
		/*
		 * (page*10)-10 => 1이 들어가면 0 2가 들어가면 10 1page => 0~9 2page => 10~19 3page =>
		 * 20~29 ...
		 */
		ArrayList<Board> temp = new ArrayList<Board>();
		for (int i = list.size() - 1; i >= 0; i--) {
			temp.add(list.get(i));
		}
//		sort => 
		for (int i = 0; i < temp.size(); i++) {

			if (j < 10 && i >= pagecnt) {
				Board b = temp.get(i);
				bList.add(b);
				j++;
			}
		}
		return bList;
	}

	public int boardTotalPage() {
//		오라클에서는 SELECT CEIL(COUNT(*)/10.0) FROM board 
		return (int) (Math.ceil(list.size() / 10.0));
	}

//  상세보기
	public Board boardDetail(int no) {

		Board board = new Board();
		/*
		 * SELECT FROM board WHERE no=1
		 */
		for (Board b : list) {
			if (b.getNo() == no) {
				b.setHit(b.getHit() + 1); // 조회수 증가
				board = b;
				boardSave();
				break;
			}
		}
		return board;
	}

//  추가
	   public Board boardUpdateData(int no)
	   {
		   
		   Board board=new Board();
		  
		   for(Board b:list)
		   {
			   if(b.getNo()==no)
			   {
				   
				   board=b;
				   break;
			   }
		   }
		   return board;
	   }
//	수정
	public void boardUpdate(int no, Board board) {
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			if (b.getNo() == no) {
				index = i; // 인덱스 번호 구하기
				break;
			}
		}
		list.set(index, board);
		boardSave();// 파일에 저장
	}

//	삭제
	public void boardDelete(int no) {
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			if (b.getNo() == no) {
				index = i; // 인덱스 번호 구하기
				break;
			}
		}
		list.remove(index);
		// 파일에 다시 저장
		boardSave(); // 반복 제거
		/*
		 * 1. 메소드 1) 기능설정 => 기능에 관련된 명령문을 모아서 관련 => 재사용이 가능하게 만듦 2) 반복제거 3) 에러처리, 수정이
		 * 편리하게 만든다
		 */
	}

//	검색 
	public ArrayList<Board> boardFind(String subject) {
		ArrayList<Board> bList = new ArrayList<Board>();
		for (Board b : list) {
			if (b.getSubject().contains(subject)) {
				bList.add(b);
			}
		}
		return bList;
	}

//	sequence => 자동 증가번호
//	이론 ==> 교재
//	이론과 실무는 다르다
	public int boardSequence() {
		int max = 0;
//		종료하지 않는 프로그램을 제작 -> 에러가 나서
		try {
//			list => 처음에는 null
			for (Board b : list) {
				if (b.getNo() > max) {
					max = b.getNo();
				}
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return max;
	}
}
