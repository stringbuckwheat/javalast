package com.company.day042;

// (1) 
//:: 스코프는 메서드를 포함한다
//1. 객체 생성 확인
//2. 변수::메서드명

// (2) 생성자 참조
// - 배열 객체 생성자, 클래스 객체 생성자
// 1. 구현 메서드의 내부에 반드시 new 자료형[]이 포함됨
// 2. 배열타입::new

interface A8{
	int[] abc(int len);
}

public class Lambda008 {
	public static void main(String[] args) {
		A8 a1 = new A8() {
			@Override
			public int[] abc(int len) {
				return new int[len];
			}
		};
		
		int[] arr1 = a1.abc(5);
		System.out.println(arr1.length);
		
		// 람다식
		A8 a2 = len -> new int[len];
		int[] arr2 = a2.abc(6);
		System.out.println(arr2.length);

		
		// 메서드 참조
		A8 a3 = int[]::new;
		int[] arr3 = a3.abc(7);
		System.out.println(arr3.length);
		// 클래스도 자료형 -> new를 호출하면 생성자 자동 호출
	}
}
