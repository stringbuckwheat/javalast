package com.company.day032;

class Inner001_2_Oop049{
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
	// static B field3 = new B(); // 오류! - 클래스변수의 초기화 시점에 B 생성자 호출 불가
	static C field4 = new C();
	
	// 정적 메소드
	static void method2() {
		// B var1 = new B(); // 오류 - 같은 이유
		C var2 = new C();
	}
	
	// 인스턴스 멤버 클래스
	class B{
		public B() {
			super();
			System.out.println("\tB-생성자");
		}
		
		void method3() {
			System.out.println("\tB-method3: " + field1);
		}
	}
	
	static class C{
		public C() {
			super();
			System.out.println("\t\tC-생성자");
		}
		
		void method4() {
			System.out.println("\t\tC-method3: " + field4);
		}
	}
}

public class Ex002 {
	public static void main(String[] args) {
		System.out.println("멤버변수 접근방법");
		
		// 인스턴스 멤버 클래스 객체 생성
		Inner001_2_Oop049 test = new Inner001_2_Oop049();
		Inner001_2_Oop049.B b = test.new B();
		
		// 정적 멤버 클래스 객체 생성
		Inner001_2_Oop049.C c = new Inner001_2_Oop049.C();
		
		test.method1();
		Inner001_2_Oop049.method2();
		b.method3();
		// Inner001_2_Oop049.method4(); -- 오류
		Inner001_2_Oop049.C.new C().method4();
		
		c.method4();
		
	}
}
