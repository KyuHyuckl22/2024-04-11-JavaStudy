package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static MemberDAO dao;
	
	// 1. 드라이버 등록
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDraiver");
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
	public String memberLogin ( String id,String pwd) {
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
				sql = "SELECT pwd FROM member "
					+ "WHERE id=?";
				//오라클로 전송
				ps = conn.prepareStatement(sql);
				ps.setString(1, sql); // 첫번째 ? 에 id 를 넣어라
				// 결과값 받기
				rs = ps.executeQuery();
				rs.next();
				String db_pwd = rs.getString(1);
				rs.close();
				
				if(db_pwd.equals(pwd)) { // 로그인이 된상태
					result = "OK";
				}
				else { // 이름이 없는 상태
					result = "NO PWD";
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
	// 2. 회원가입 => 아이디 중복체크 / 우편번호 검색
	// 3. 화원수정
	// 4. 화원탈퇴
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
