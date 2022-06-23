package com.company.day040;

class Cnt extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");

			try {
				Thread.sleep(999);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Star extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("★");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		// ver1. Thread
		Cnt todo1 = new Cnt();
		Star todo2 = new Star();

		todo1.start();
		todo2.start();

		// ver2. Runnable
		Thread todo3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.print(i + "\t");

					try {
						Thread.sleep(999);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread todo4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("★");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		todo3.start();
		todo4.start();
	}
}
