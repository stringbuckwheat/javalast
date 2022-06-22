package com.company.day034;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet002 {
	public static void main(String[] args) {
		HashSet ironHash = new HashSet();
		String[] name = {"iron", "hulk", "captain"};
		
		for(String n : name) {
			ironHash.add(n);
			// 같은 주소인지 hashCode()를 가지고 체크
		}
		
		Iterator it = ironHash.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 향상된 for문도 사용 가능
		System.out.println("향상된 for문");
		for(Object e : ironHash) {
			System.out.println(e);
		}
	}
}
