package com.company.day042;

interface AA{
	void abc(); // public abstract
}

class Ason implements AA{
	@Override
	public void abc() {
		System.out.println("메서드 내용");
	}	
}

public class Lambda001 {
	public static void main(String[] args) {
		// 1. 인터페이스
		Ason a = new Ason();
		a.abc();
		
		// 2. 익명클래스
		AA a1 = new AA() {
			@Override
			public void abc() {
				System.out.println("메서드 내용");
			}
		};
		a1.abc();
		
		// 3. 람다 - 함수적 프로그래밍: (입력) -> {처리, 출력}
		AA a2 = () -> System.out.println("메서드 내용");
		a2.abc();

	} // end for main
} // end for class
