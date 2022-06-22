package com.company.day032;

public class Exception001 {
	public static void main(String[] args) {
		// Q1) 10/0
		// 1-1. 발생오류: ArithmeticException: / by zero
		// 1-2. 해결방법
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException");
		}
		
		// Q2)
		int[] a = {10, 20, 30};

		try {
			for(int i = 0; i <=3; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("인덱스 확인!");
		}
		
		// Q3)
		Integer test3 = null;

		try {
			System.out.println(10/test3);
		} catch(NullPointerException ne) {
			System.out.println("NullPointerException");
			System.out.println("null point 오류!");
		}
	}
}
