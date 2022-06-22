package com.company.day037;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class File002 {
	public static void main(String[] args) {
		//Calendar cal = Calendar.getInstance();
		// long time = System.currentTimeMillis();
		// filePath = "write1_" + cal.get(1) + (today.get(2)+1) + today.get(5) + ".txt";
		
		long time = System.currentTimeMillis();
		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMdd");
		String date = fm.format(time);
		System.out.println(date);
		
//		String folderPath = "c:\\file\\file001\\";
//		String filePath = "write1_" + date + ".txt";
//		
//		File folder = new File(folderPath);
//		
//		if(!folder.exists()) {
//			folder.mkdir();
//			System.out.println("폴더 생성 완료!");
//		}
//		
//		File file = new File(folderPath + filePath);
//		
//		if(!file.exists()) {
//			try {
//				file.createNewFile();
//				System.out.println("파일 생성 완료!");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
