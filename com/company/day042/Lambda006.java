package com.company.day042;

// :: 메서드를 포함한다
// 1. 객체 생성 확인
// 2. 변수::메서드명

interface A6{
	void papa(Ason6 a6, int k);
}

class Ason6{
	void son(int k) {
		System.out.println(k);
	}
}

public class Lambda006 {
	public static void main(String[] args) {
		// 1. 인터페이스 + 익명클래스
		A6 a1 = new A6(){
			@Override
			public void papa(Ason6 a6, int k) {
				a6.son(k);
			}
		};
		
		a1.papa(new Ason6(), 10);
		
		System.out.println();
		
		// 2. 람다식
		A6 a2 = (Ason6 a6, int k) -> a6.son(k);
		a2.papa(new Ason6(), 100);
		System.out.println();

		// 3. 메서드 참조
		Ason6 as6 = new Ason6();
		A6 a3 = Ason6::son;
		a3.papa(as6, 1000);
		
		System.out.println(as6.getClass());
	}
}
