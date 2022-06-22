package com.company.day032;

public class Exception002 {
	public static void main(String[] args) {
		// ver-1) 멀티 캐치 블록
		int[] a = {10, 20, 30};
		Integer test3 = null;

		try {
			System.out.println(10/0); // 여기서 예외가 발생하면 다음 진행이 안 됨
			
			for(int i = 0; i <=3; i++) {
				System.out.println(a[i]);
			}
			
			System.out.println(10/test3);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("error1: by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("인덱스 확인");
		} catch(NullPointerException e) {
			System.out.println("NullPointerException");
			System.out.println("null");
		} catch(Exception e) {
			System.out.println("모든 Exception의 최고 조상");
		} finally {
			System.out.println("finally 안 써도 되나 마지막에 무조건 처리하는 부분");
		}
		
		// ver-2
		try {
			System.out.println(10/0); // 여기서 예외가 발생하면 다음 진행이 안 됨
			
			for(int i = 0; i <=3; i++) {
				System.out.println(a[i]);
			}
			
			System.out.println(10/test3);

		} catch(Exception e) {	// 부모는 자식을 담을 수 있다
			System.out.println("모든 Exception의 최고 조상");
		} finally {
			System.out.println("finally 안 써도 되나 마지막에 무조건 처리하는 부분");
		}
		
		
	}// efm
} // end class
