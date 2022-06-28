package com.company.day042;

interface A9{
	B9 abc(); // return B9
}

class B9{
	B9(){System.out.println("default 생성자");}
	B9(int k){System.out.println("parameter 생성자");}
}

public class Lambda009 {
	public static void main(String[] args) {
		// 인터페이스 + 이너 익명클래스
		A9 a1 = new A9() {
			@Override
			public B9 abc() { return new B9();}
		};
		
		a1.abc();
		System.out.println();
		
		// 람다
		A9 a2 = () -> new B9();
		a2.abc();
		System.out.println();
		
		// 메서드 참조
		A9 a3 = B9::new;
		a3.abc();
	} // end main
} // end class