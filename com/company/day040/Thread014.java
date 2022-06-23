package com.company.day040;

class MyThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 1000000000; i++) {
			// 												다 기본값 5
		}
		System.out.println(getName() + " 우선순위 : " + getPriority());

	}
}

public class Thread014 {
	public static void main(String[] args) {
		// ## CPU CORE
		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());
		
//		// 1. 기본 우선순위 확인
//		for(int i = 0; i < 20; i++) {
//			Thread thread = new MyThread();
//			thread.start();
//		}
		
		// 2. 우선순위 직접 지정
		// 코어수가 12니까 스레드는 12 초과여야함
		for(int i = 0; i < 20; i++) {
			Thread thread = new MyThread();
			if(i==1)
				thread.setPriority(10);
			thread.start();
		}
	}
}
