package com.company.day038;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		String[] keyData = { "one", "two", "three" };
		String[] valueData = { "하나", "두울", "세엣" };

		for (int i = 0; i < keyData.length; i++) {
			map.put(keyData[i], valueData[i]);
		}
		
		System.out.println("=======================");
		System.out.println("KEY\tVALUE");
		System.out.println("=======================");

		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
		// iterator 생략
	}
}
