package com.company.day042;

interface A5{
	void papa();
}

class Ason5{
	static void son() {
		System.out.println("메서드");
	}
}

public class Lambda005 {
	public static void main(String[] args) {
		A5 a1 = new A5() {
			@Override
			public void papa() {
				Ason5.son();
			}
		};
		a1.papa();
		System.out.println("익명 클래스: " + a1.getClass().getSimpleName());
		
		// 2. 람다식
		A5 a2 = () -> Ason5.son();
		a2.papa();
		System.out.println("람다식: " + a2.getClass().getSimpleName());
		
		// 3. :: 표현식으로
		// -- 객체 생성할 필요 없음!
		A5 a3 = Ason5::son; // son()은 static
		a3.papa();
		System.out.println("메서드 참조: " + a3.getClass().getSimpleName());
	}
}
