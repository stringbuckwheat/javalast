package com.company.day043;

import java.util.function.*;

public class Lambda011_FunctionalInterface {
	public static void main(String[] args) {
		// 설계하는 사람들 많이 씀
		
		// 1) Consumer - void accept(T t)
		// Consumer<T>: 아무 클래스나 다 와도 됨
		Consumer<String> consumer = s -> System.out.println("1. Consumer: " + s);
		consumer.accept("hi");

		// 2) Supplier - T get()
		Supplier<String> supplier = () -> "2. Supplier: hihi";
		System.out.println(supplier.get());
		///// IntSupplier - getAsInt()
		IntSupplier is = () -> (int) (Math.random() * 6) + 1;
		System.out.println("2-1) IntSupplier: 난수 출력 -> " + is.getAsInt());

		// 3) Predicate - boolean Test(T t)
		Predicate<Integer> predicate = i -> i < 0; // 음수인지 확인하는
		System.out.println("3. Predicate: " + predicate.test(-1));
		System.out.println("3. Predicate: " + predicate.test(1));

		// 4) Function - R apply(T t) ★★★★★
		// 문자열 받아서 숫자 리턴
		Function<String, Integer> basic = s -> Integer.parseInt(s);
		System.out.println("4. Function: " + (basic.apply("10") + 3));
		
		// 5) Operator: 계산식
		// IntBinaryOperator -> applyAsInt()
		int[] score1 = {100, 80, 99};
		IntBinaryOperator max = (a, b) -> a >= b ? a : b;
		
		int result = -9999;
		
		for(int s : score1) {
			result = max.applyAsInt(result, s);
		}
		
		System.out.println("5. Operator - IntBinaryOperator: 최대값 -> " + result);
		
	}
}
