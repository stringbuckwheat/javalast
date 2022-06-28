package com.company.day042;

// interface / abstract의 차이
// 공통점: 자식 클래스를 통해 구현해야함, new 불가
// 차이점: 

interface A{
	public void abc();
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("메서드 내용");
	}
}

public class Lambda000 {
	public static void main(String[] args) {
		// 1. 객체지향 프로그래밍 문법1(case 1)
		A a1 = new B();
		a1.abc();
		
		// 2. 객체지향 프로그래밍 문법2(case 2): 익명 이너클래스 사용
		A a2 = new A() {

			@Override
			public void abc() {
				System.out.println("메서드 내용");
			}
			
		};
		a2.abc(); // 메서드 내용
		
		// 3. 함수적 프로그래밍 문법(람다식) - case3
		A a3 = () -> System.out.println("메소드 내용");
		a3.abc();
		
		/*
		 * 인터페이스 있어야 하고, 이후 파라미터와 바디만 작성
		 */
	}
}
