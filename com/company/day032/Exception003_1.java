package com.company.day032;

import java.util.Scanner;

public class Exception003_1 {
	public static void main(String[] args) {
		int one = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("1을 입력하세요");
				one = sc.nextInt();
				
				if (one == 1)
					break;
				
			} catch (Exception e) {
				// Scanner.next() 메소드가 개행문자를 제거하지 않기 때문에 
				// 남겨진 개행문자가 다음 nextLine()의 입력으로 처리됨. 
				// 버퍼를 비워 해결
				
				sc.next();
				System.out.println("숫자를 입력하셔야 합니다.");
			}
		}
	}
}

/* 버퍼: 입력(키보드) > 출력(컴퓨터)  - 임시 저장 바구니
 * 1. a > a
 * 2. abc enter > scanner.next() - [ abc enter ]
 * 3. 10 enter > scanner.nextInt() - [ 10 enter ]
 * 4. a enter > scanner.nextInt() - [a + enter] -- 정수형을 원하는데 a와 enter
 */