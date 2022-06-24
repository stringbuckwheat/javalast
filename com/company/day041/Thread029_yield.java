package com.company.day041;

class MyThread029 extends Thread {
	boolean yieldFlag;

	@Override
	public void run() {
		while (true) {
			if (yieldFlag) {
				Thread.yield();
				// System.out.println(getName() + " -> " + this.getState());
			} else {
				System.out.println(getName() + " 실행..." /*+ this.getState()*/);

				for (long i = 0; i < 1000000000L; i++) {}
				// 시간지연을 위한 코드
				// Thread.sleep()을 쓰면 안되는 이유??
			}
		}
	}
}

public class Thread029_yield {
	public static void main(String[] args) {
		
		// 1)
		MyThread029 thread1 = new MyThread029();
		thread1.setName("thread1");
		// boolean 기본값은 false -- 양보 안 함
		thread1.setDaemon(true);
		thread1.start();

		// 2)
		MyThread029 thread2 = new MyThread029();
		thread2.setName("thread2");
		thread2.yieldFlag = true; // 양보함
		// Thread 타입 변수로 지정하면 yieldFlag 못 씀 - 다형성
		thread2.setDaemon(true);
		thread2.start();

		// 3)
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			thread1.yieldFlag = !thread1.yieldFlag; // 양보 안 하던 애가 양보함
			thread2.yieldFlag = !thread2.yieldFlag;
		}
	}
}

/****
 * 1. new ---> [Runnable: 2. 실행대기 -> 3. 실행] ---> 4. 소멸(TERMINATED) 5. 양보(yield)
 * 
 * 
 */