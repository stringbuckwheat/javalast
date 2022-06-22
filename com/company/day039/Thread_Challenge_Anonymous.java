package com.company.day039;

import java.text.SimpleDateFormat;

public class Thread_Challenge_Anonymous {
	public static void main(String[] args) {

		Thread todo1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					long milliSecond = System.currentTimeMillis();
					// 현재시각을 밀리세컨드(천 분의 1초) 단위로 반환
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					String time = sdf.format(milliSecond);
					System.out.println(time);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		todo1.start();
	}
}
