package com.company.day040;

// 동기화 블록의 문제점
class MyData26{
	/* Key Object!!!!!
	 * 
	 * one()할 때 num_on()이 기다리고 또 il()이 기다리는 게 동기화의 핵심
	 * 쓰레드가 작업을 완료할 때까지 대기
	 * synchronized(this)
	 * 
	 * 1. 모든 객체는 단 하나의 열쇠를 갖고 있다.
	 * synchronized(this)의 this를 키 객체라고 부르는데,
	 * 동기화를 하면 키 객체를 갖게 된다. one(), num_one(), il()은 키를 갖고 있다.
	 * 
	 * 2. 동기화를 하면 처음 사용하는 스레드가 키 객체를 갖게된다.
	 * 
	 * 3. 다른 스레드가 먼저 사용중인 스레드 작업을 완료하고 key를 반납할 때까지 대기하는 것을 blocked라고 한다.
	 * synchronized 메서드는 key를 깰 수 없지만 synchronized(this)는 키를 깰 수 있다.
	 * 예컨대 이 예제의 synchronized(new Object())는 this가 아니므로 동기화가 깨진다!
	*/
	
	synchronized void one() {
		for(int i = 0; i < 3; i++) {
			System.out.println("one- " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end one
	
	synchronized void num_one() {
		for(int i = 0; i < 3; i++) {
			System.out.println("1-" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end num_one
	
	void il() {
		synchronized(this) {
			for(int i = 0; i < 3; i++) {
				System.out.println("일-" + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	} // end il
} // end for class

public class Thread026_keyObject {
	public static void main(String[] args) {
		MyData26 action = new MyData26();
		
		new Thread() {
			public void run() {
				action.one();
			}
		}.start();
		
		new Thread() {
			public void run() {
				action.num_one();
			}
		}.start();
		
		new Thread() {
			public void run() {
				action.il();
			}
		}.start();
		
		// 
	}
}
