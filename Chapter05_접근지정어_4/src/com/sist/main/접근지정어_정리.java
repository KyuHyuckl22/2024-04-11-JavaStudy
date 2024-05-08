package com.sist.main;
/*
 *   데이터 저장 =======> 데이터 처리(요청) ====> 화면에 출력
 *   --------          -----------        --------
 *   1. 변수            1. 연산자             1. 명령 프롬프트 => System.out.println();
 *   2. 배열            2. 제어문             2. 윈도우 => JFrame
 *   3. 클래스           3. 메소드            3. 브라우저 => HTML
 *   -------           -----------       -----------
 *   파일 / 오라클          클래스    
 *   
 *   1. 묶는 방법
 *      = 데이터 묶기
 *        - 배열
 *        - 클래스 : 변수만 설정
 *                 getter / setter
 *      = 명령문 묶기 : 메소드
 *                 => ~Manager
 *      ----------
 *      = 동시에 (데이터 / 명령문)
 *   
 *   2. 사용범위를 지정 : 접근지정어
 *      private : 자신의 클래스 내에서 접근이 가능 => 데이터를 감추는 경우 (은닉화)
 *      default : 같은 패키지 안에서만 접근이 가능
 *      protected : 같은 패키지 안에서만 접근 + 상속을 받은 경우 다른 패키지
 *      public : 패키지 상관없이 모든 클래스에서 접근이 가능
 *      
 *      **private / public
 *      ** 공개 / 비공개
 *        public private
 *        
 *        class Main
 *        {
 *           public JButton b=new JButton("로그인");  //공개
 *        }
 *        class Member
 *        {
 *           private String id;  //비공개 
 *           private String Pwd;
 *        }
 *      ** 윈도우 관련 => Button/TextField  => 공개
 *      ** 개인정보 / 영화정보 ... => 비공개 
 *      ** 실제가 아니라 가상 => 키워드
 *         int : 4byte, double : 8byte
 *         ------------------------------------------
 *         
 *         패키지 : 관련 클래스를 묶어서 관리 => 찾기(검색)
 *         ----> 분업이 쉽게
 *         형식)
 *             회사
 *               com.회사명.구분자
 *             그룹
 *               org.회사명.구분자
 *             학교
 *               ac.회사명.구분자
 *             ----------------
 *             1) 패키지는 클래스 구분 폴더이다
 *             2) 식별자 사용
 *                -------- 알파벳(소문자로 사용)
 *                -------- 숫자는 앞에 사용이 안된다
 *                -------- 키워드는 사용할 수 없다
 *                -------- 특수문자는 사용 빈도가 거의 없다
 *                -------- 공백이 있으면 안된다
 *             3) 실무
 *                com.회사명.dao => 오라클(데이터베이스) 연결
 *                com.회사명.manager => 파일, 이메일, 뉴스(외부에서API)
 *                com.회사명.vo => 데이터형 (사용자 정의)
 *                com.회사명.service => BI (통합)=> 조립
 *                com.회사명.controller => 브라우저와 연결
 *        => 패키지는 반드시 첫번째줄에 사용한다 => 한번만 사용이 가능
 *        => 패키지를 불러오는 방법
 *           import com.회사명.dao.*; => dao 폴더안에 있는 모든 클래스를 불러온다
 *           import com.회사명.dao.BoardDAO => BoardDAO 한개를 불러오는 경우
 *        => 패키지를 만들면
 *        패키지가 다를 경우에는 같은 이름의 클래스를 생성 할 수 있다
 *        Ex)
 *           com.sist.dao      com.sist.vo
 *           | 				    |
 *           Board.java		   Board.java
 *       => 충돌
 *         import java.util.Date; => Date
 *         import java.sql.*;  => Date
 *         
 *         Date date = new Date(); =>  오류발생
 *    -------------------------------------------------------
 *      변수    연산자   제어문
 *             ---------
 *                 |
 *                메소드
 *      --------------------
 *                 |
 *                클래스
 *              -------- 클래스 여러개 묶어서
 *                       ---------------> 패키지    ------> 관련 내용 127p
 *    ** 멤버변서 (지역변수 제외) => private
 *    ** 클래스, 메소드, 생성자 => 다른 클래스와 연결 => public
 *    
 *    클래스 : 설계
 *    메소드 : 기능 설정
 *    생성자 : 시작점, 초기화
 *    변수 : 화면 출력할 데이터를 모아준다
 *    ---------------------------------자바
 *      => 인터페이스, 예외처리, 추상클래스 => 추가 ===>7장
 *      
 *    => 객체지향 프로그램
 *       -----------
 *         유지보수
 *         ------
 *           |
 *           수정, 추가
 *             게시판 => 답변이 너무 늦다
 *                  => 실시간 채팅  그러다보니 생긴 문제점 => 직원이 상주해야한다
 *                  => 챗봇으로 대채
 *             게시판 => 묻고 답하기 => 기존의 만들어진 게시판 활용 : 재사용
 *                                 ----------------------- 상속 / 포함
 *             게시판에 등록된 데이터 => 감춘다 (손실방지) = 캡슐화
 *           ----------------- 캡슐화, 상속, 수정, 추가  ==> 객체지향 프로그램
 *                                       --------
 *   ** 필수가 아니라 객체지향 프로그램의 권장        다형성
 *      
 *    
 */
public class 접근지정어_정리 {

	public static void main(String[] args) {

	}

}
