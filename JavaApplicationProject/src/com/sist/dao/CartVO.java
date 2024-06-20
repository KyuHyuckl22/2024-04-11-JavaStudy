package com.sist.dao;
/*
 CNO                                       NOT NULL NUMBER
 ID                                                 VARCHAR2(20)
 GNO                                                NUMBER
 ACCOUNT                                            NUMBER
 PRICE                                              NUMBER
 REGDATE                                            DATE
 */
import java.util.*;

import lombok.Data;
//  DTO => Data Transfor Object =>
//  서브쿼리, 조인 => 해당 VO 를 포함
//	VO는 반드시 테이블 한개만 연결
@Data
public class CartVO {
	private int cno,gno,price,account;
	private String id;
	private Date regdate;
//	goodsvo 의 데이터들을 모두 가져온다↓  goodsvo 의 변수를 또 다시 잡을 필요가 없다
	private GoodsVO gvo = new GoodsVO();
}
