package com.company.day043;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Lambda015 {
	public static void main(String[] args) {
		Function<String, Integer> f = new Function<String, Integer>(){
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println(f.apply("안녕"));
		
		// 2-1) 표준형
		Function<String, Integer> f1 = str -> str.length();
		System.out.println(f1.apply("안녕"));
		System.out.println();
		
		// 2-2) 확장형
		IntFunction<Double> f2 = i -> (double)i;
		LongFunction<String> f3 = i -> String.valueOf(i);
		DoubleFunction<Integer> f4 = i -> (int)i;
		BiFunction<String, Integer, String> f5 = (name, age) -> "이름은 = " + name + ", 나이는 = " + age;
		
		System.out.println(f2.apply(10));
		System.out.println(f3.apply(20L));
		System.out.println(f4.apply(30.5));
		System.out.println(f5.apply("홍길동", 16));
		
		// 2-3) 확장형 (Return 고정)
		ToIntFunction<String> f6 = s -> s.length();
		ToLongFunction<Double> f7 = d -> d.longValue();
		// 래퍼클래스 Double을 기본형 long으로
		ToDoubleFunction<Integer> f8 = i -> i / 100.0;
		
		System.out.println(f6.applyAsInt("반갑습니다"));
		System.out.println(f7.applyAsLong(58.254));
		System.out.println(f8.applyAsDouble(250));
	}
}
