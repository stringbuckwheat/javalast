package com.company.day032;

class Outer002{
	class Inner{
		int iv = 100;
	}
}

public class Class002_inner_d3 {
	public static void main(String[] args) {
		// inner 클래스의 iv값 출력
		System.out.println("사용법 1) ");
		Outer002.Inner inner = new Outer002().new Inner();
		System.out.println(inner.iv);
		System.out.println();
		
		// 사용법2
		System.out.println("사용법 2) ");
		Outer002 o2 = new Outer002();
		Outer002.Inner oi2 = o2.new Inner();
		System.out.println(oi2.iv);
	}
}
