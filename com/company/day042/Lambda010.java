package com.company.day042;

interface A10 {
	B10 abc(int k);
}

class B10 {
	B10() {
		System.out.println("default 생성자");
	}

	B10(int k) {
		System.out.println("parameter 생성자");
	}
}

public class Lambda010 {
	public static void main(String[] args) {
		A10 a1 = new A10() {
			@Override
			public B10 abc(int k) {
				return new B10(k);
			}
		};
		a1.abc(5);

		A10 a2 = k -> new B10(k);
		a2.abc(5);
		
		A10 a3 = B10::new;
		a3.abc(5);
	}
}
