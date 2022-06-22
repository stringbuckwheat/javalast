package com.company.day039;

import java.text.SimpleDateFormat;

// 시, 분, 초를 1초에 한 번씩 콘솔창에 출력되게 만들기
class GetTime extends Thread {

	@Override
	public void run() {
		// 꺼야 멈춤
		while(true) {
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
}

public class Thread_Challenge {
	public static void main(String[] args) {
		GetTime gt = new GetTime();
		gt.start();
	}
}
