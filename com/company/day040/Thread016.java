package com.company.day040;

///// 데몬스레드

class AutoSaveThread extends Thread{
	void save() {
		System.out.println("작업 내용을 저장함");
	}

	@Override
	public void run() {
		while(true) {
			save();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread016 {
	public static void main(String[] args) {
		// 문제점: 메인스레드가 종료되었는데 작업 저장은 계속됨
		// -> daemon 스레드
		
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true); // 기본값: false
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");
	}
}
