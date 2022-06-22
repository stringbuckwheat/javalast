package com.company.day032;

class Outer003 {
	static int a = 10;
	
	static class Inner3 {
		int iv = 200;
	}
}

public class Class003_inner_d4 {
	public static void main(String[] args) {
		Outer003.Inner3 inner3 = new Outer003.Inner3();
		// Inner가 static 클래스니까 new Inner3()할 필요가 없다
		System.out.println(inner3.iv);
		
		System.out.println("static - method area - memory - 공용사용 목적");
		System.out.println("클래스명.변수  로 호출");
	}
}
