package com.sist.dao;

import java.util.*;
import java.sql.*;

public class EmpDeptDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static EmpDeptDAO dao;

	// 1. 드라이버 등록
	public EmpDeptDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDraiver");
		} catch (Exception ex) {
		}
	}

	// 2. 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
		} catch (Exception ex) {
		}
	}

	// 3. 오라클 해제
	public void disConnection() {
		try {
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception ex) {
		}

	}

	// 4. 싱글턴 => 한 사람당 한개의 DAP 만 사용할 수 있게 만든다 => 메모리 누수 현상을 제거
	public static EmpDeptDAO newInstance() {
		if (dao == null)
			dao = new EmpDeptDAO();
		return dao;
	}

	// 기능설정
	// 1. emp,dept 데이터 출력 ( 웹 , 윈도우 ) => DAO 변경이 없다 => React / Vue / Ajax
	// 2. DAO / VO 는 변경사항이 없다
	// sql 은 검색언어이다 => SELECT 가 핵심!
//	오라클을 배우는 목적 => 자바에서 사용이 가능한지
	public ArrayList<EmpVO> empListData() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
			getConnection();
			String sql = "SELECT empno,ename,job,hiredate,dname,loc " 
						+ "FROM emp,dept "
						+ "WHERE emp.deptno = dept.deptno";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); // sql 에서 명령문을 적어놓은 것에 엔터키 역할을 하는 문장
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.getDvo().setDname(rs.getString(5));
				vo.getDvo().setLoc(rs.getNString(6));
				
				list.add(vo);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}
}
