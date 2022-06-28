package com.company.day042;

interface A7{
	int abc(String str);
}

public class Lambda007 {
	public static void main(String[] args) {
		// 1. 인터페이스 익명이너클래스
		A7 a1 = new A7() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		System.out.println(a1.abc("hello"));

		
		// 2. 람다식으로
		A7 a2 = str -> str.length();
		System.out.println(a2.abc("hello"));
		
		// 3. :: 참조
		A7 a3 = String::length;
		System.out.println(a3.abc("hello"));
		System.out.println(a3.getClass().getSimpleName());
	}
}
