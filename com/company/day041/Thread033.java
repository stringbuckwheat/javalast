package com.company.day041;

class MyThread1 extends Thread{

	@Override
	public void run() {
		for (long i = 0; i < 1000000000L; i++) { /* 시간 지연 */ }
	}
}

class MyThread2 extends Thread{
	MyThread1 myThread1; // ##
	
	public MyThread2(MyThread1 myThread1) {
		super();
		this.myThread1 = myThread1;
	}

	@Override
	public void run() {
		try {
			myThread1.join(7000); 
			// 쓰레드 자신이 하던 작업을 잠시 멈추고 다른 쓰레드가 지정된 시간 동안 작업을 수행하도록 할 때
			// myThread1에 7초 동안 cpu 우선 사용권 주고, 그동안 myThread2는 일시정지

		} catch (InterruptedException e) {
			System.out.println(">> join 진행중 interrupt 발생...");
			
			for (long i = 0; i < 1000000000L; i++) { /* 시간 지연 */ }
		}
	}
}

public class Thread033 {
	public static void main(String[] args) {
		// #1. 객체 만들기
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2(thread1);
		
		thread1.start();
		thread2.start();
		
		// #2. step1
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("> thread1 상태: " + thread1.getState()); // RUNNABLE
		System.out.println("> thread2 상태: " + thread2.getState()); // TIMED_WAITING
		// thread1은 7초 동안 CPU 우선 사용권을 가지고, thread2는 그동안 TIMED_WAITING
		
		// #3. step2: 대기시간 깨버리기
		thread2.interrupt();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("> thread1 상태: " + thread1.getState()); // RUNNABLE
		System.out.println("> thread2 상태: " + thread2.getState()); // RUNNABLE
	}
}

/*****
 * 								5. yield(양보) 
 * 									↑↓ 
 * 1. new -- (start) --> [ 2. runnable(실행대기) --> (실행) ] -- (run) --> 4. TERMINATED 
 * 							↑↓ 				↑↓ 			↑↓ 
 * 						timed_waiting		blocked 	WAITING
 * 
 * -------------------------------- 7. (RUN) -> TIMED_WAITING: 주어진 시간까지 기다리는 상태
 * Thread.sleep(1000), join / 시간 종료, interrupt()
 * 
 * 		join을 호출한 스레드는 마지막 일시정지 상태는 TIMED_WATING
 *		일시정지하는 시간의 지정 없이 join을 호출하면 join된 스레드 객체의 실행이 완료될 때까지
 * 		이를 호출한 스레드는 timed_waiting
 */