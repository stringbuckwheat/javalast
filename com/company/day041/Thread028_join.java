package com.company.day041;

public class Thread028_join {
	public static void main(String[] args) {
		// # 쓰레드 상태 저장 클래스
		Thread.State state; //f3 눌러보기
		
		// #1. 객체 생성(NEW)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i<100000000L; i++) {
					// 진행사항의 시간 지연을 표현
				}
			}
		};
		
		state = myThread.getState();
		System.out.println("1. new 객체 만든 상태 - myThread state > " + state);
		
		// #2. myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("2. start()한 상태 - myThread state > "  + state);
		
		// #3. myThread 종료 - join은 myThread의 처리가 끝날 때까지 기다림
		try {
			myThread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		state = myThread.getState();
		System.out.println("3. run() 다 실행한 상태 - myThread state >"  + state);
	}
}
