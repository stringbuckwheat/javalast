package com.company.day034;

import java.util.HashSet;
import java.util.Iterator;

/* □ 핵심 인터페이스 [List, Set, Map]
 * List: 순서O(index O), 중복 허용  > 기차		- add(), get(idx), size(), remove()
 * Set: 순서X(index X), 중복 허용 X > 주머니		- add(), Iterator(get 사용X), size(), remove()
 * Map: 순서 대신 key, value
 */

public class HashSet001 {
	public static void main(String[] args) {
		// 1. hashSet
		HashSet set = new HashSet();
		set.add("apple");
		set.add("banana");
		set.add("coconut");
		set.add("banana");
		set.add(123);
		set.add(123);
		System.out.println("1: set" + set);
		System.out.println("2: get 처리 안 됨 - set.get()");
		System.out.println("3: set.size(): " + set.size());
		set.remove("banana");
		System.out.println("4: set.remove(\"banana\"): " + set);
		
		// 1. 주머니 모으기, 처리 대상 확인, 꺼내오기
		Iterator it = set.iterator();
		System.out.println("처리 대상 확인: " + it.hasNext());
		System.out.println(it.next());
		
		System.out.println("=== 출력");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
