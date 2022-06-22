package com.company.day039;

class Gugudan extends Thread{
	@Override
	public void run() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Sum65 extends Thread{
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(sum);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread003_Ex1_GuguDan_Sum65 {
	public static void main(String[] args) {
		new Gugudan().start();
		new Sum65().start();
	}
}
