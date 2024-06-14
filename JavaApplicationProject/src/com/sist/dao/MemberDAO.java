package com.sist.dao;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.*;
public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static MemberDAO dao;
	
	// 1. 드라이버 등록
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {}
	}
	// 2. 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL,"hr","happy");
		}catch ( Exception ex ) {}
	}
	// 3. 오라클 해제
	public void disConnection() {
		try {
			if (ps != null) ps.close();
			if (conn != null) conn.close();
		}catch(Exception ex) {}
	
		
	}
	// 4. 싱글턴 => 한 사람당 한개의 DAP 만 사용할 수 있게 만든다 => 메모리 누수 현상을 제거
	public static MemberDAO newInstance() {
		if (dao == null)
			dao = new MemberDAO();
		return dao;
	}
	/////////////////////////// 모든 DAO 에 공통사항
	//기능
	// 1. 로그인처리
	/*	리턴형 => 경우의 수 
	 * = 사번이 없는 경우      		0
	 * = 사번은 존재 이름이 틀린경우	1
	 * = 사번은 존재, 이름도 동일		2
	 * ------------------------------String / int
	 */
	public String memberLogin ( String id,String pw) {
		String result = "";
		try {
//			1. 연결
			getConnection();
//			2. SQL 문장
			String sql = "SELECT COUNT (*) FROM member "
						+ "WHERE id=?";
//			3. 오라클로 SQL 문장 전송
			ps = conn.prepareStatement(sql);
			//?에 값을 채운다
			ps.setString(1, id);
			
//			4. 결과값을 받는다
			ResultSet rs = ps.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			rs.close();
			if(count == 0) { // ID가 없는 경우
				result = "NO ID";
			}
			else { // ID가 있다면
				sql = "SELECT pw FROM member "
					+ "WHERE id=?";
				//오라클로 전송
				ps = conn.prepareStatement(sql);
				ps.setString(1, id); // 첫번째 ? 에 id 를 넣어라
				// 결과값 받기
				rs = ps.executeQuery();
				rs.next();
				String db_pw = rs.getString(1);
				rs.close();
				
				if(db_pw.equals(pw)) { // 로그인이 된상태
					result = "OK";
				}
				else { // 이름이 없는 상태
					result = "NO PW";
				}
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return result;
	}
//	1-1 회원 정보 읽기
	public MemberVO memberInfo(String id) {
		MemberVO vo = new MemberVO();
		try {
			getConnection();
			String sql = "SELECT id,name,sex,admin "
						+"FROM member "
						+"WHERE id=? ";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setId(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setSex(rs.getString(3));
			vo.setAdmin(rs.getString(4));
			rs.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return vo;
	}
	// 2. 회원가입 => 아이디 중복체크 / 우편번호 검색
	// 2-1 아이디 중복체크
	/*
 ID                 
 PW                 
 NAME               
 SEX           
 BIRTHDAY           
 POST              
 ADDR1               
 ADDR2               
 PHONE              
 EMAIL               
 CONTENT    
 REGDATE    
 ADMIN         
	 */
	public String memberInsert(MemberVO vo) {
		/*
		 * Statement
		 * String sql = "INSERT INTO memver VALUES(
		 */
		String result = "";
		try {
			getConnection();
			// admin = 관리자냐? 라는 질문에 no 라고 답한것임. 가입하는건 일반 유저
			String sql = "INSERT INTO member VALUES(?,?,?,?,?,?,?,?,?,?,?,SYSDATE,'n')";
			ps = conn.prepareStatement(sql);
			// ? 에 값을 채운다 setString 을 줬을때
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getSex());
			ps.setString(5, vo.getBirthday());

			ps.setString(6, vo.getPost());
			ps.setString(7, vo.getAddr1());
			ps.setString(8, vo.getAddr2());
			ps.setString(9, vo.getPhone());
			ps.setString(10, vo.getEmail());
			ps.setString(11, vo.getContent());
			
			// 추가 요청
			// executeUpdate 는 commit 이 포함되어 있어서 자동으로 commit 이 날아간다
			// == INSER / UPDATE / DELETE 
			ps.executeUpdate();
			// executeQuery() => 데이터를 가지고 온다 == SELECT
			result = "yes";
		}catch(Exception ex) {
			result = ex.getMessage(); //에러시 에러 메세지가 뜸
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return result;
	}
	public int memberIdCheck(String id) {
		int count = 0;
		try {
			getConnection();
			String sql = "SELECT COUNT(*) FROM member "
						+"WHERE id=? "; 
			ps = conn.prepareStatement(sql); // ?에 값을 채운다
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			count = rs.getInt(1);
			rs.close();
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return count;
				
	}

	
	// 3. 회원수정
	// 4. 회원탈퇴
	// => sql 문장 제작 => 웹도 가능 => DAO 변경이 없다
	// 5. 우편번호 검색
	public ArrayList<ZipcodeVO> postFindData(String dong){
		ArrayList<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
		try {
			getConnection();
			String sql = "SELECT zipcode, sido, gugun, dong, NVL(bunji,' ') "
						 +"FROM zipcode "
						 +"WHERE dong LIKE '%'||?||'%' ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dong); // 자동으로 '서초'
			ResultSet rs = ps
					.executeQuery();
			while (rs.next()) {
				ZipcodeVO vo = new ZipcodeVO();
				vo.setZipcode(rs.getString(1));
				vo.setSido(rs.getString(2));
				vo.setGugun(rs.getString(3));
				vo.setDong(rs.getString(4));
				vo.setBunji(rs.getString(5));
				list.add(vo);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return list;
	}
}
