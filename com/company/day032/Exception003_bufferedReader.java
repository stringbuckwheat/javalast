package com.company.day032;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Exception003_bufferedReader {
	public static void main(String[] args) {
		int one = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				System.out.println("1을 입력하세요");
				one = Integer.parseInt(br.readLine());
				
				if (one == 1)
					break;
				
			} catch (Exception e) {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("숫자를 입력하셔야 합니다.");
			}
		}
	}
}
