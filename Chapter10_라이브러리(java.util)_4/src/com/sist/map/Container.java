package com.sist.map;
import java.util.*;
public class Container {
//	스프링이 이렇게 생김 
//  우리가 모아놓은 클래스들을 관리해주는 역할
	private Map<String,Model> map=new HashMap<String,Model>();
	public Container() {
		map.put("board", new BoardModel());
		map.put("join", new JoinModel());
		map.put("food", new FoodModel());
		map.put("login", new LoginModel());
		map.put("notice", new NoticeModel());
	}
	public Model getBean(String key) {
		return map.get(key);
	}
}
