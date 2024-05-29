package com.sist.ann;

import java.lang.reflect.Method;
import java.util.*;

public class BoardMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("URL 주소 입력 : ");
		String url = scan.next();

		Class clsname = Class.forName("com.sist.ann.BoardSystem");
		Object obj = clsname.getDeclaredConstructor().newInstance();

		Method[] methods = clsname.getDeclaredMethods();
		for (Method m : methods) {
			RequestMapping rm = m.getAnnotation(RequestMapping.class);
			if (url.equals(rm.value())) {
				m.invoke(obj, null);
			}
		}
	}

}
