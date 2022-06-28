package com.company.day042;

// :: 메서드를 참조한다는 의미
// 1. 객체 생성 확인 - new 대신에 System.out 자체가 객체이므로 객체를 만들 필요 없이 >> static final
// 2. 객체 변수::인스턴스메서드

interface A4{
	void abc(int k);
}

public class Lambda004 {
	public static void main(String[] args) {
		// 1. 인터페이스 구현 - 익명 이너클래스 처리
		A4 a1 = new A4() {
			@Override
			public void abc(int k) {
				System.out.println(k);
			}
		};
		System.out.println("!!" + a1.getClass().getSimpleName());
		
		a1.abc(10);		
		
		// 2. 람다식으로 줄이기
		A4 a2 = k -> System.out.println(k);
		a2.abc(10);
		
		// 3. 인스턴스 메서드 참조
		A4 a3 = k -> System.out.println(k);
		a3.abc(10);
		
		// 4. 메서드 참조 - ★★★★★★★★
		A4 a4 = System.out::println;
		a4.abc(10);
		
		System.out.println(a4.getClass().getSimpleName());
	}
}
