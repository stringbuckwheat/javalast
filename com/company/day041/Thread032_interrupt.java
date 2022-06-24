package com.company.day041;

class MyThread032 extends Thread {
	boolean yieldFlag;

	@Override
	public void run() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// Thread.sleep(3000)은 시간이 모두 경과하거나 interrupt()가 호출되면 깨어나니까
			System.out.println("\t>> sleep 중 Interrupt 발생..." + "\t" + this.getState());
			for (long i = 0; i < 1000000000L; i++) {
				// 시간 지연
				// 이런 거 없으면 너무 빨리 끝내서 getState()에 terminate 찍힐 수 있음
				// 진짜 찍힘 ㅋㅋㅋ
			}
		}
	}
}

public class Thread032_interrupt {
	public static void main(String[] args) {
		MyThread032 myThread = new MyThread032();
		myThread.start();
		
		// 스레드 시작 준비 시간
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1. myThread state > " + myThread.getState()); // TIMED_WAITING
		
		myThread.interrupt(); // 깨움
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("2. after interrupt() > " + myThread.getState()); // RUNNABLE
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
 */
