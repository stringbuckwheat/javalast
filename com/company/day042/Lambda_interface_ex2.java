package com.company.day042;

interface Ref {
	NullPointerException hi();
}

public class Lambda_interface_ex2 {
	public static void main(String[] args) {
		// 1) String::length
		// 2) int[]::new
		// 3) Arrays::stream
		// 4) String::equals
		// 5) Integer::compare
		// 6) Card::new
		// 7) System.out::println
		// 8) Math::random
		// 9) String::toUpperCase
		// 10) NullPointerException::new
		// 11) Optional::get
		// 12) StringBuffer::append
		// 13) System.out::println
		
		Ref r1 = NullPointerException::new;
		throw r1.hi();
	}
}
