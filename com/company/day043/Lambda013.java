package com.company.day043;

import java.util.function.*;

// Supplier: 매개값 없고 리턴값만 있는 추상메서드 [Supplier] -> 리턴값
public class Lambda013 {
	public static void main(String[] args) {
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "Supplier<T> 함수형 인터페이스";
			}
		};
		
		System.out.println(s.get());
		
		// 2-1) 표준형
		Supplier<String> s1 = () -> "Supplier<T> 함수형 인터페이스";
		System.out.println(s1.get());
		
		// 2-2) 확장형
		// boolean java.util.function.BooleanSupplier.getAsBoolean()
		BooleanSupplier s2 = () -> 1 > 2;
		System.out.println(s2.getAsBoolean());
		
		// int java.util.function.IntSupplier.getAsInt()
		IntSupplier s3 = () -> 5;
		System.out.println(s3.getAsInt());
		
		LongSupplier s4 = () -> 10L;
		System.out.println(s4.getAsLong());

		DoubleSupplier s5 = () -> 5.8;
		System.out.println(s5.getAsDouble());

	}
}
