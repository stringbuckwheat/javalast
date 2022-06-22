package com.company.day032;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception005_test2 {
	public static int nextInt() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1을 입력하세요");
		return sc.nextInt(); // 버퍼 깨짐
	}

	public static void main(String[] args) {
		int one = 0;

		while (true) {
			try {
				one = nextInt();
				
				if (one == 1) {
					break;
				}
				
			} catch (InputMismatchException ie) {
				System.out.println("숫자만 입력 가능합니다.");
				// 메소드 호출 시 스캐너 새로 열리므로 버퍼 안 비워도 됨
			}
		}
	}
}
