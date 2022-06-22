package com.company.day032;

class A{
	
	public A() {
		super();
		System.out.println("A 객체가 생성됨");
	}
	
	class B{
		int field1;
		
		public B() {
			super();
			System.out.println("\t(B) 인스턴스 멤버 클래스: 객체가 생성됨");
		}

		void method1() {
			System.out.println("\tB-method: " + field1);
		}
	}
	
	static class C{
		int field1;
		static int field2;

		public C() {
			super();
			System.out.println("\t\tC 객체가 생성됨");
		}

		void method1() {
			System.out.println("\t\tC-method: " + field1);
		}
		
		void method2() {
			System.out.println("\t\tC-method: " + field2);
		}
	}
	
	void method() {
		class D{
			int field;

			public D() {
				this(41);
				System.out.println("\t\t\tD 객체가 생성됨");
			}

			public D(int field) {
				super();
				this.field = field;
			}
			
			void method1() {
				System.out.println("\t\t\tD-method: " + field);
			}
		}
		
		D d = new D();
		d.method1();
	}
}

public class Ex001 {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 21;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 31;
		c.method1();
		A.C.field2 = 32; // 클래스명으로 접근하고 있으므로 static
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
