package com.company.day039;

import java.awt.Toolkit;

class BeepThread1 implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 소리나게
			sleepThread();
		}
	}
	
	void sleepThread() {
		try {
			Thread.sleep(1000); // 실행클래스
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ShowThread1 extends BeepThread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("★");
			sleepThread();
		}
	}
}

public class Thread007 {
	public static void main(String[] args) {
		Thread todo1 = new Thread(new BeepThread1());
		Thread todo2 = new Thread(new ShowThread1());
		
		todo1.start();
		todo2.start();
	}
}