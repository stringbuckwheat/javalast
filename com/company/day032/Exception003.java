package com.company.day032;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception003 {
	public static void main(String[] args) {
		int one = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("1을 입력하세요");
				one = sc.nextInt();
				
				if (one == 1)
					break;
				
			} catch (InputMismatchException ie) {
				sc = new Scanner(System.in);
				System.out.println("숫자를 입력하셔야 합니다.");
			}
		}
	}
}
