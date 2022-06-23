package com.company.day040;

class ForDaemon extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("데몬스레드가 실행중입니다.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread017 {
	public static void main(String[] args) {
		Thread dt = new ForDaemon();
		dt.setDaemon(true);
		dt.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인쓰레드가 종료됩니다");
	}
}
