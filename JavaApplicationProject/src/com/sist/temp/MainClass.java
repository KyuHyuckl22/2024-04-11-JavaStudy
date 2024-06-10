package com.sist.temp;
import java.util.*;
import java.util.ArrayList;
//import java.util.stream.Sink.ChainedDouble;

public class MainClass {

	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.newInstance();
		ArrayList<EmpVO> list = dao.empListData();
		for (EmpVO vo : list) {
			System.out.println(vo.getEmpno() + "" + vo.getJob() + vo.getEname() + vo.getSal() + vo.getDeptno());
		}
		System.out.println(" ========================================== ");
		Scanner scan=new Scanner(System.in);
		/*System.out.print("사번을 입력: ");
		int empno=scan.nextInt();
		EmpVO vo=dao.empDetailData(empno);
		System.out.println(vo.getEmpno() + "" + vo.getJob() + vo.getEname() + vo.getSal() + vo.getDeptno());*/
		System.out.print("검색어 입력 : ");
		String ename = scan.next();
		list = dao.empFind(ename);
		for (EmpVO vo : list) {
			System.out.println(vo.getEmpno() + "" 
				+ vo.getJob() 
				+ vo.getEname() 
				+ vo.getSal() 
				+ vo.getDeptno());
		}
		
	}
}
