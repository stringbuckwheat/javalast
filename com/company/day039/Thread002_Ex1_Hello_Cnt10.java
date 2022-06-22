package com.company.day039;

class Hello extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Cnt10 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread002_Ex1_Hello_Cnt10 {
	public static void main(String[] args) {
//		Hello h = new Hello();
//		Cnt10 c = new Cnt10();
//		h.start();
//		c.start();
		
		Thread todo1 = new Hello();
		todo1.start();
		Thread todo2 = new Cnt10();
		todo2.start();
	}
}
