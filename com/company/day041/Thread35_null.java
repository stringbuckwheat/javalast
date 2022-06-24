package com.company.day041;

class Consumer24_null extends Thread {
	private DataBox24_null dataBox24;

	public Consumer24_null(DataBox24_null dataBox24) {
		super();
		this.dataBox24 = dataBox24;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			dataBox24.getData();
		}
	}
}

class Producer24_null extends Thread {
	private DataBox24_null dataBox24;

	public Producer24_null(DataBox24_null dataBox24) {
		super();
		this.dataBox24 = dataBox24;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data - " + i;
			dataBox24.setData(data);
			System.out.println("Producer24가 생성한 데이터: " + data);
		}
	}
}

class DataBox24_null {
	private String data; // null인지 아닌지로도 판별 가능

	public DataBox24_null() {
		super();
	}

	public synchronized void getData() {
		if (this.data == null) {
			try {
				wait(); // notify 올때까지 기다려
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		System.out.println("ConsummerThread가 읽은 데이터: " + data);
		data = null;
		notify();
	}

	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		notify();
	}
}

public class Thread35_null {
	public static void main(String[] args) {
		System.out.println("35-1");
		DataBox24_null dataBox24 = new DataBox24_null();

		Producer24_null producer24 = new Producer24_null(dataBox24);
		Consumer24_null consumer24 = new Consumer24_null(dataBox24);

		producer24.start();
		consumer24.start();
	}
}
