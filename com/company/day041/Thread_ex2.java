package com.company.day041;

/* 동기화 메서드 또는 블록 안에서만
 * wait(): 호출한 스레드는 일시정지 / 다른 스레드가 notify(), notifyAll()을 해주면 실행 대기상태
 * notify(): 
 */
class DataBox {
	boolean isEmpty = true;
	int data;
	// data가 비었는지 확인
	// t1은 넣기, t2는 꺼내오기를 담당하는 스레드

	synchronized void inputData(int data) {
		if (!isEmpty) { // 꺼내갈 때까지 wait
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		// 데이터 넣고, flag 바꾸고, wait() 깨우기
		this.data = data;
		isEmpty = false;
		System.out.println("입력 데이터: " + data);

		notify();		
	}

	synchronized void outputData() {
		if (isEmpty) { // 데이터가 비어있다면 wait
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 꺼내와도 된다고 알려줌
		isEmpty = true;
		System.out.println("출력 데이터: " + data);
		notify();
	}
}

public class Thread_ex2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
		};

		t1.start();
		t2.start();
	}
}
