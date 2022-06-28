package com.company.day042;

/*

□ 메서드 참조
이미 구현된 메서드 참조하기
1. 객체 생성 확인
2. 객체 참조(변수)::인스턴스 메서드명

*/

interface A3 {
	void papa();
}

class Ason3{
	void son() {
		System.out.println("메서드");
	}
}

public class Lambda003 {
	public static void main(String[] args) {
		// 1. 인터페이스
		A3 a1 = new A3() {
			@Override
			public void papa() {
				Ason3 s = new Ason3();
				s.son();
			}
		};
		a1.papa();
		
		// 2. 람다식
		A3 a2 = () -> new Ason3().son();
		
		A3 a3 = () -> {
			Ason3 s = new Ason3();
			s.son();
		};
		
		// 3. 인스턴스 참조타입으로 표현
		// 1) 객체 생성 확인
		Ason3 s4 = new Ason3();
		// 2) 객체참조(변수)::인스턴스메서드명
		A3 a4 = s4::son; // ()없이 메서드 명만
		System.out.println(a4.getClass().getSimpleName());
		/////////// s4::son의 타입이 인터페이스 A3라는 타입에 담기는 게 이상하게 느껴지는데?
		/////////// 형변환이 되고 있는건가?
		a4.papa(); // 이걸 또 papa로 불러?
	}
}
