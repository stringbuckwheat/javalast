package com.company.day039;

class Gugudan_1 implements Runnable{
	@Override
	public void run() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
				threadSleep();
			}
		}
	}
	
	void threadSleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Sum65_1 extends Gugudan_1 implements Runnable{
	@Override
	public void run() {
		int sum = 0;
		
		for(int i = 1; i <= 65; i++) {
			sum += i;
			System.out.println(sum);
			
			threadSleep();
		}
	}
}

public class Thread009 {
	public static void main(String[] args) {
		Thread todo1 = new Thread(new Gugudan_1());
		Thread todo2 = new Thread(new Sum65_1());
		
		todo1.start();
		todo2.start();
		
		// ver2: 변수 저장
		// ver3: 익명 클래스
		Thread todo3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 2; i < 10; i++) {
					for(int j = 1; j < 10; j++) {
						System.out.println(i + " x " + j + " = " + (i*j));
						threadSleep();
					}
				}
			}
			
			void threadSleep() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
