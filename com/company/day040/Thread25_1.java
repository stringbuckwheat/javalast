package com.company.day040;

class DataClass_1 {
	private int memory;

	public DataClass_1() {
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

			System.out.println(Thread.currentThread().getName() + " : " + this.memory); // ##
		} // end for syn
	}
}

class User1_1 extends Thread {
	private DataClass_1 data;

	public void dataUsing(DataClass_1 data) {
		this.setName("AAA");
		this.data = data;
	}

	@Override
	public void run() {
		data.setMemory(100);
	}
}

class User2_1 extends Thread {
	private DataClass_1 data;

	public void dataUsing(DataClass_1 data) {
		this.setName("BBB");
		this.data = data;
	}

	@Override
	public void run() {
		data.setMemory(50);
	}
}

public class Thread25_1 {
	public static void main(String[] args) {
		DataClass_1 box = new DataClass_1();

		User1_1 aaa = new User1_1();
		aaa.dataUsing(box);
		aaa.start();

		User2_1 bbb = new User2_1();
		bbb.dataUsing(box);
		bbb.start();
	}
}
