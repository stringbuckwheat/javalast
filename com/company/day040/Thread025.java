package com.company.day040;

class DataClass{
	private int memory;

	public DataClass() {
		super();
	}

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory); // ##
	}
}

class User1 extends Thread{
	private DataClass data;
	
	public void dataUsing(DataClass data) {
		this.setName("AAA");
		this.data = data;
	}

	@Override
	public void run() {
		data.setMemory(100);
	}
}

class User2 extends Thread{
	private DataClass data;
	
	public void dataUsing(DataClass data) {
		this.setName("BBB");
		this.data = data;
	}

	@Override
	public void run() {
		data.setMemory(50);
	}
}

public class Thread025 {
	public static void main(String[] args) {
		DataClass box = new DataClass();
		
		User1 aaa = new User1();
		aaa.dataUsing(box);
		aaa.start();
		
		User2 bbb = new User2();
		bbb.dataUsing(box);
		bbb.start();
	}
}
