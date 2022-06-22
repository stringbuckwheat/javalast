package com.company.day032;

class Outer004 {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println("value: " + value);
			System.out.println("this.value: " + this.value);
			System.out.println("Inner.this.value: " + Inner.this.value);
			// System.out.println(new Outer004().value);
			System.out.println("Outer004.Inner.this.value: " + Outer004.Inner.this.value);
			System.out.println("Outer004.this.value: " + Outer004.this.value);
		}
	}
}

public class Class004 {
	public static void main(String[] args) {
		Outer004 outer = new Outer004();
		Outer004.Inner inner = outer.new Inner();
		inner.method1();
	}
}
