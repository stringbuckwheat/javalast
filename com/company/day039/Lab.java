package com.company.day039;

import java.text.SimpleDateFormat;

public class Lab {
	public static void main(String[] args) {
		long milliSecond = System.currentTimeMillis();
		System.out.println(milliSecond);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(milliSecond);
		System.out.println(time);
	}
}
