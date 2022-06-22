package com.company.day039;

class Hello_1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("hello");
			sleepThread();
		}
	}
	
	void sleepThread() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Cnt10_1 extends Hello_1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1);
			
			sleepThread();
		}
	}
}

public class Thread008 {
	public static void main(String[] args) {
		// ver1
		Thread todo1 = new Thread(new Hello_1());
		Thread todo2 = new Thread(new Cnt10_1());
		
		todo1.start();
		todo2.start();
		
		// ver2
		Hello_1 hello = new Hello_1();
		Cnt10_1 cnt = new Cnt10_1();
		Thread todo3 = new Thread(hello);
		Thread todo4 = new Thread(cnt);
		
		todo3.start();
		todo4.start();
		
		// ver3
		Thread todo5 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
					sleepThread();
				}
			}
			
			void sleepThread() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		todo5.start();
		
		// 6은 생략
	}
}
