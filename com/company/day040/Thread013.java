package com.company.day040;

/*
 1. 현재 스레드 확인: Thread.currentThread()
 2. 동작하는 스레드 수: Thread.activeCount()
 3. 스레드 작업 이름: getName()
*/

class ThreadA extends Thread{
	
	public ThreadA() {
		super.setName("AAA"); ////////////
	}

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("\t" + getName());
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadB extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("\t\t....." + getName());
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Thread013 {
	public static void main(String[] args) {
		// main(String[] args)도 스레드
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드: " + mainThread.getName()); // main
		System.out.println(">> 동작하는 스레드 수: " + Thread.activeCount()); // 1
		
		System.out.println();
		System.out.println();
		
		ThreadA a = new ThreadA();
		System.out.println("작업스레드: " + a.getName()); // AAA
		a.start();
		
		ThreadB b = new ThreadB();
		System.out.println("작업스레드: " + b.getName()); // AAA
		b.start();
		
		System.out.println(">> 동작하는 스레드 수: " + Thread.activeCount()); // 2
	}
}
