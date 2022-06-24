package com.company.day041;

class DataClass {
	private int memory;

	public DataClass() {
		super();
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory); // ##
		}
	}
}

class User1 extends Thread {
	private DataClass data;

	public void datausing(DataClass data) {
		this.setName("AAA");
		this.data = data;
	}

	@Override
	public void run() {
		data.setMemory(100);
	}
}

class User2 extends Thread {
	private DataClass data;

	public void datausing(DataClass data) {
		this.setName("BBB");
		this.data = data;
	}

	@Override
	public void run() {
		data.setMemory(50);
	}
}

public class Thread025_Ex1_Q {
	public static void main(String[] args) {
		/// 공유객체를 사용할때 주의할점
		DataClass box = new DataClass();

		User1 aaa = new User1();
		aaa.datausing(box);
		aaa.start();

		// 의도한 결과:
		// User1이 멤버변수 MyData의 memory를 100으로 수정했으니 setMemory의 결과가 AAA:100 그 이후 bbb: 50이
		// 출력되어야 하는데,
		// 공유된 객체에 두 메소드가 동시에 접근하는 바람에 의도한 결과가 나오지 않아 둘 모두 50
		// 문제) 비동기

		// 해결방안 1) synchronized 메서드로 만들기
		// public synchronized void setMemory(int memory) {}

		// 해결방안 2) 동기화 블록 지정
		// public void setMemory(int memory) {
		// synchronized(this){}

		User2 bbb = new User2();
		bbb.datausing(box);
		bbb.start();
	}
}