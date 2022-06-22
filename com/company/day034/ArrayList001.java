package com.company.day034;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList001 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("피자");
		list.add(4500);
		list.add(3);
		
		System.out.println("1) list 출력: " + list);
		System.out.println("2) size 개수 출력: " + list.size());
		System.out.println("3) 4500원 출력: " + list.get(1));
		System.out.println("4) for 구문 이용해서 출력: ");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		// Iterator iter -> 
		// 1. list들을 모으기 { 대상1, 대상2, 대상3, ... }		> list.iterator()
		// 2. 처리 대상 유무 확인 { -> 대상1, 대상2, 대상3, ... }	> iter.hasNext()
		// 3. 있다면 대상 꺼내와서 처리 { -> 대상1, 대상2, 대상3, ... }	> iter.next()
		// ------- 
		// 4. 처리 대상 유무 확인 {     , -> 대상2, 대상3, ... }	> iter.hasNext()
		// 5. 있다면 대상 꺼내와서 처리 {     , -> 대상2, 대상3, ... }	> iter.next()
		// ...
		// 다 하면 빠져나옴
		
		System.out.println();
		System.out.println("iterator");
		
		Iterator iter = list.iterator(); 	 // 1. list 모으기 - 줄서기
		while(iter.hasNext()) { 			 // 2. 처리대상 있는지
			System.out.println(iter.next()); // 3. 있다면 대상 꺼내와서 처리
		}
	}
}
