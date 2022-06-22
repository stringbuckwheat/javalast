package com.company.day036;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics000 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3.14);
		list.add(10);
		list.add("abc");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		// list2.add("도라에몽"); // Integer 형태밖에 못 집어넣음
		
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nFOR");
		for(Integer i : list2) {
			System.out.println(i);
		}
		
		ArrayList<String> list3 = new ArrayList<>(); // 뒤의 제네릭은 생략 가능
		list3.add("aaa");
		list3.add("eee");
		list3.add("ccc");
		
		// it = list3.iterator(); // 불가. Integer타입
		Iterator<String> it3 = list3.iterator();
		
		System.out.println("\nWHILE");
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		System.out.println("\nFOR");
		for(String s : list3) {
			System.out.println(s);
		}
	}
}
