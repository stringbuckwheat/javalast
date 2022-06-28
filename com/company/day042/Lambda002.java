package com.company.day042;

interface A2 {
	void method1();
}

interface B2 {
	void method2(int a);
}

interface C2 {
	int method3();
}

interface D2 {
	double method4(int a, double b);
}

public class Lambda002 {
	public static void main(String[] args) {
		// 파라미터 X, 리턴 X
		A2 a2 = () -> System.out.println("파라미터 X, 리턴 X");
		a2.method1();

		// 파라미터 O, 리턴 X
		B2 b1 = (int a) -> System.out.println(a);
		b1.method2(5);

		B2 b2 = a -> System.out.println(a); // 타입도 생략 가능
		b2.method2(10);

		// 파라미터 X, 리턴 O
		C2 c2 = () -> 88;
		System.out.println(c2.method3());

		// 파라미터 O, 리턴 O
		D2 d2 = (a, b) -> a + b;
		System.out.println(d2.method4(10, 3));
	}
}