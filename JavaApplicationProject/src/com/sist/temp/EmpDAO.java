
package com.sist.temp;

import java.util.*;
import java.sql.*;

public class EmpDAO {
	// 오라클 연결
	private Connection conn;
	// 오라클에 SQL 문장 전송
	private PreparedStatement ps;
	/*
	 * 사용자 요청 ===> 자바 ===> 오라클 | SQL 문장 실행 <=== 결과값 저장 <=== | 데이터 출력 (윈도우, 브라우저)
	 * -------------- VO, DAO 변경이 없다
	 * 
	 */
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	// 싱글턴 => 한 개의 객체만 사용이 가능
	private static EmpDAO dao;

	/*
	 * thin : 연결만 하는 역할 oci : oracle client
	 */
	// 1. 드라이버 등록(한번만 등록)
	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Dbeaver, sqldeveloper
		} catch (Exception ex) {
		}
	}

	// 2. 싱글턴 패턴 => 메모리 공간을 한 개만 사용 => static
	public static EmpDAO newInstance() {
		if (dao == null)
			dao = new EmpDAO(); // 생성이 안 된 경우
		return dao; // 이미 생성된 dao를 사용한다
	}

	// 3. 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
			// conn hr/happy => 오라클 명령
		} catch (Exception ex) {
		}

	}

	// 4. 오라클 닫기
	public void disConnection() {
		try {
			if (ps != null)
				ps.close();
			// 송수신 => 닫고
			if (conn != null)
				conn.close();
			// exit
		} catch (Exception ex) {
		}
	}

	// 5. 오라클에 요청
	public ArrayList<EmpVO> empListData() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
			// 1. 연결
			getConnection();
			// 2. SQL 문장 만들기
			String sql = "SELECT empno,ename,job,sal,deptno FROM emp";
			// 3. 오라클로 전송
			ps = conn.prepareStatement(sql);
			// 4. 오라클에서 실행된 결과를 가지고 온다
			ResultSet rs = ps.executeQuery(); // enter
			// 실행된 모든
			// 데이터는 rs에 존재한다
			/*
			 * 
			 */
			// ==> list 에 첨부
			while (rs.next()) { // while 문 한 바퀴에 한줄

				// double => rs.getDouble (번호)
				// date => rs.getDate (번호)
				// 오라클은 1번부터 시작한다
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setSal(rs.getInt(4));
				vo.setDeptno(rs.getInt(5));
				list.add(vo);
			}

			rs.close();
		} catch (Exception ex) {
			// 에러 확인
			ex.printStackTrace();
		} finally {
			// 오라클 닫기
			disConnection();
		}
		return list;
	}

	public EmpVO empDetailData(int empno) {
		EmpVO vo = new EmpVO(); // 사원 한 명에 대한 정보
		try {
//		   1. 오라클 연결
			getConnection(); // 반복제거시 사용
			/*
			 * 메소드 는 전송해 주기 위해서 만드는것 ---- 브라우저 / 윈도우에서는 사용이 불가능 => 핵심은 리턴형 / 매개변수를 잡을 수 있는가
			 * ----- 1) 목록 => ArrayList 2) 맛집 한개 정보 => FoodVO ==> 한개의 정보를 줄때는 반드시 구분자를 주어야
			 * 한다 3) 검색 => ArrayList
			 */
//		   2. SQL 문장
			String sql = "SELECT empno,ename,job,sal,deptno FROM emp WHERE empno=" + empno;
//		   3. 오라클 전송
			ps = conn.prepareStatement(sql);
//		   4. 실행 결과 
			ResultSet rs = ps.executeQuery();
//		   5. EmpVO 에 값 채워주기
			rs.next();
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setSal(rs.getInt(4));
			vo.setDeptno(rs.getInt(5));
			rs.close();
//		   MyBatis 는 SQL 문장만 주면 다 알아서 해준다
		} catch (Exception ex) {
//		   에러 확인
			ex.printStackTrace();
		} finally {
			// 오라클 닫기
			disConnection();
		}
		return vo;
	}

	public ArrayList<EmpVO> empFind(String ename) { // 몇글자만 맞춰서 찾기
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
			// 연결
			getConnection();
			/*
			 *  A로 시작 => startsWith("A")
			 *  LIKE 'A%'
			 *  LIKE '%A' endWith
			 *  LIKE '%A%' contains  
			 *  ----> String => 오라클에서 처리가 가능
			 *  
			 *  
			 */
			String sql = "SELECTempno,ename,job,sal,deptno FROM emp WHERE ename LIKE '%" +ename.toUpperCase() + "%'";
			// 데이터는 대소문자를 구분한다
			// 3. 오라클로 전송
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				EmpVO vo = new EmpVO();
				
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setSal(rs.getInt(4));
				vo.setDeptno(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disConnection();
		}
		return list;

	}
	// 문제 => 우편번호 검색
//	VO => desc 테이블명
//	메소드 제작
//	MainClass => 동을입력 => 출력
	
	
}