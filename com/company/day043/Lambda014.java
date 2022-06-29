package com.company.day043;

import java.util.function.*;

public class Lambda014 {
	public static void main(String[] args) {
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// 빈 문자열인지 아닌지
				return (t.length() > 0) ? true : false;
			}
		};

		// 2-1) 표준형
		Predicate<String> p1 = str -> str.length() > 0;
		System.out.println(p1.test("안녕"));
//		System.out.println(p1.test(""));
		System.out.println();

		// 2-2) 확장형 predicate
		IntPredicate p2 = i -> (i % 2 == 0);
		LongPredicate p3 = i -> (i > 100);
		DoublePredicate p4 = i -> (i > 0);
		BiPredicate<String, String> p5 = (a, b) -> (a.equals(b));

		System.out.println(p2.test(2));
		System.out.println(p3.test(85L));
		System.out.println(p4.test(-5.8));
		System.out.println(p5.test("안녕", "안녕"));
	}
}
