package com.company.day039;

import java.awt.Toolkit;

public class Thread001 {
	public static void main(String[] args) {
		// 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// toolkit.beep();
		// Thread는 실행클래스
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 소리나게
			try {
				Thread.sleep(1000); // 실행클래스
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 자막
		for(int i = 0; i < 5; i++) {
			System.out.println("★");
			try {
				Thread.sleep(1000); // 실행클래스
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
