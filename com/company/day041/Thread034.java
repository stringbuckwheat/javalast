package com.company.day041;

import javax.swing.JOptionPane;

class CntRed2 implements Runnable {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("TIME COUNT : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("##2. 카운트가 종료되었습니다.");
				break; ///////////////////////////////////////////////////////////////////////////
			}
		}
	}
}// end class

public class Thread034 {
	public static void main(String[] args) {
		CntRed2 redcnt = new CntRed2(); // 둘 다 쓰레드일 필요가 없음...
		Thread timer = new Thread(redcnt);
		timer.start();
		System.out.println(redcnt.getClass().getSimpleName());


//		while (true) {
//			if (JOptionPane.showInputDialog("Q. 빨강의 알파벳은 >>").toLowerCase().equals("red")) {
//				System.out.println("정답입니다.");
//				// timer.stop(); -- deprecated
//				timer.interrupt();
//				// interrupt()는 쓰레드를 강제로 종료시키지는 못한다. 단지 작업을 멈추라고 요청할 뿐 - false로
//				System.out.println("##1. 방해처리 " + timer.isInterrupted());
//				break; //////////////////////////////////////////////////////////////////
//				// isInterrupted: 현재 쓰레드의 interrupted() 상태를 알려주고 false로 초기화
//				// InterruptedException 발생하기도전에 26번째 줄 읽어버림.
//			} else {
//				System.out.println("오답입니다.");
//			}

			/*
			 * 값을 입력했음에도 불구하고 카운트가 진행된다. 
			 * 이는 쓰레드가 잠시 멈추어있을 때 interrupt()를 발생하면
			 * InterruptedException이 발생하여 
			 * 쓰레드의 interrupt 상태를 false로 초기화하기 때문이다.
			 * 
			 * @Override public void run() { int i = 10;
			 * 
			 * while (i != 0 && !isInterrupted()){ 
			 * System.out.println(i--); 
			 * try {
			 * Thread.sleep(1000); 
			 * } catch (InterruptedException e) { 
			 * interrupt(); 
			 * } 
			 * }
			 * System.out.println("카운트가 종료되었습니다."); }
			 */
		}
	}
//}