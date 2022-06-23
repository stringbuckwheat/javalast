package com.company.day040;

// plusThread1가 MyData의 멤버변수 data를 4로 증가시켰으나
// 공유된 객체에 그 결과가 반영되지 않아 plusThread2의 실행결과도 여전히 4
// priority 수정 시도했으나 스레드가 3개라 문제 해결 불가
// 해결방안: synchronized 메소드

class MyData {
	int data = 3;

	// 문제) 비동기
	// public synchronized void plusData() {}

	// 해결방안 1) synchronized 메서드로 만들기
//	public synchronized void plusData() {
//		int d = data;
//
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		data = d + 1;
//	}

	// 해결방안 2) 블록 지정
	// 공유객체를 한 번에 하나씩 하나의 thread만 사용할 수 있도록 함
	// 하나의 thread가 사용중일 때는 객체를 lock -> 다음 순서로 진행
	public synchronized void plusData() {
		synchronized (this) {
			int d = data;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			data = d + 1;
		}
	}
}

class PlusThread extends Thread {
	MyData myData;

	public PlusThread() {
		super();
	}

	public PlusThread(MyData myData) {
		super();
		this.myData = myData;
	}

	@Override
	public void run() {
		myData.plusData(); // 3에서 시작해서 +1씩 하는 메서드
		System.out.println(getName() + " 실행결과: " + myData.data);
	}
}

public class Thread024 {
	public static void main(String[] args) {

		/*********************
		 * 공유객체상황 complete ver. ((원했던 결과))
		 * ------------------------------------------------------------------ 동기화가 이뤄져있는
		 * 상태 1. 공통(공용, 공유)으로 사용하는 객체
		 * 
		 * [data (3)]
		 * 
		 * 2. [PlusThread1] 3. [PlusThread2] data 값 1 증가 data 값 1 증가
		 * 
		 * 4. 1의 data에서 3 꺼내오기 7. 1의 data에서 4 꺼내오기 5. 3을 4로 변경 8. 4를 5로 변경 6. 다시 1에 변경된
		 * 4 집어넣기 9. 다시 1에 변경된 5 넣기
		 * 
		 * ------------------------------------------------------------------
		 * 
		 * 하나의 작업(4-5-6)이 완전히 완료된 후 다른 작업(7-8-9) 수행(되기를 바람) 그런데 4-5가 처리가 안 됐는데 7-8을 실행함
		 * 
		 * ------------------------------------------------------------------
		 * 
		 * 동기: 하나의 작업이 완전히 완료된 후에 다른 작업을 수행 -> 컴퓨터, 핸드폰 업데이트 비동기: 하나의 작업이 완전히 완료되지도 않았는데
		 * 다른 작업을 수행
		 * 
		 ***************************************************************/

		// 공유 객체 생성
		MyData myData = new MyData();

		// 1. plusThread1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1"); // 이따 실험
		plusThread1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 2. plusThread2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
