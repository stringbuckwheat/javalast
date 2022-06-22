package com.company.day039;

import java.awt.Toolkit;

// todo: 소리 + 화면 출력 같이
// Thread 상속 / run() 구현 / main start

class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 소리나게
			try {
				Thread.sleep(1000); // 실행클래스
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ShowThread extends Thread {
	@Override
	public void run() {
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

public class Thread001_Q {
	public static void main(String[] args) {
		BeepThread todo = new BeepThread();
		todo.start();
		
		// 실험
		new ShowThread().start();
	}
}
