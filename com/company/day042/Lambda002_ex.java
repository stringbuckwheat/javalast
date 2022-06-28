package com.company.day042;

import java.util.Arrays;

interface Basic1 {
	int max(int a, int b);
}

interface Basic2 {
	void printVar(String name, int i);
}

interface Basic3 {
	int square(int x);
}

interface Basic4 {
	int roll();
}

interface Basic5 {
	int sumArr(int[] arr);
}

interface Basic6 {
	int[] emptyArr();
}

interface Basic7<String, Integer> {
	void printVar(String name, Integer i);
}

public class Lambda002_ex {
	public static void main(String[] args) {
		// 람다식으로 변경
		Basic1 f11 = (a, b) -> a > b ? a : b;
		System.out.println(f11.max(10, 3));

		Basic2 f21 = (name, i) -> System.out.println(name + i);
		f21.printVar("Java", 11);

		Basic3 f31 = x -> x * x;
		System.out.println(f31.square(10));

		Basic4 f41 = () -> (int) (Math.random() * 6);
		System.out.println(f41.roll());

		int[] arr = { 1, 2, 3 };
		Basic5 f51 = arr1 -> {
			// Lambda expression's parameter arr cannot redeclare another local variable
			// defined in an enclosing scope.
			// parameter를 arr로 주면 에러: 람다식 파라미터 변수명과 기존 작성한 변수명이 동일
			// 람다 -> 지역변수 arr과 파라미터 arr을 식별 불가
			// 해결: 다른 이름 지어줌
			int sum = 0;
			for (int i : arr1)
				sum += i;
			return sum;
		};
		System.out.println(f51.sumArr(arr));

		Basic6 f61 = () -> new int[] {};
		System.out.println(Arrays.toString(f61.emptyArr()));

		Basic7<String, Integer> f71 = (name, i) -> System.out.println(name + i);
		f71.printVar("name", 5);
	}
}
