package com.company.day032;

public class Exception004 {
	public static void main(String[] args) {
		// ## 부분에서 오류

		try {
			test(1); // public static 리턴값 메서드명(파라미터)
			test(0); // ##
		} catch (ArithmeticException ae) {
			// 오류처리 넘기기, 예외 떠넘기기
			System.out.println("ArithmeticException");
		}
	}

	public static void test(int a) throws ArithmeticException {
		// ##
		System.out.println(10 / a);
		// 클래스 안에 메서드에서 오류 가능성이 있는 경우, 오류 처리는 호출한 곳에서 try catch
	}
}
