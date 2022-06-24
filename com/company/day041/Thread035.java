//package com.company.day041;
//
//class Consumer24 extends Thread {
//	private DataBox24 dataBox24;
//
//	public Consumer24(DataBox24 dataBox24) {
//		super();
//		this.dataBox24 = dataBox24;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("ConsummerThread가 읽은 데이터: " + dataBox24.getData());
//		}
//	}
//}
//
//class Producer24 extends Thread {
//	private DataBox24 dataBox24;
//
//	public Producer24(DataBox24 dataBox24) {
//		super();
//		this.dataBox24 = dataBox24;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 1; i <= 3; i++) {
//			String data = "Data - " + i;
//			dataBox24.setData(data);
//			System.out.println("Producer24가 생성한 데이터: " + data);
//		}
//	}
//}
//
//class DataBox24 {
//	boolean isEmpty = true;
//	private String data; // null인지 아닌지로 판별 가능
//
//	public DataBox24() {
//		super();
//	}
//
//	public synchronized String getData() {
//		if (isEmpty) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}		
//		
//		isEmpty = true;
//		notify();
//		
//		return data;
//	}
//
//	public synchronized void setData(String data) {
//		if(!isEmpty) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		this.data = data;
//		isEmpty = false;
//		notify();
//	}
//}
//
//public class Thread035 {
//	public static void main(String[] args) {
//		DataBox24 dataBox24 = new DataBox24();
//
//		Producer24 producer24 = new Producer24(dataBox24);
//		Consumer24 consumer24 = new Consumer24(dataBox24);
//
//		producer24.start();
//		consumer24.start();
//	}
//}
