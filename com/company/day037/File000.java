package com.company.day037;

import java.io.File;
import java.io.IOException;

public class File000 {
	public static void main(String[] args) {
		///// 파일입출력 패키지 java.io
		
		// 1. folder 확인
		File folder = new File("c:\\file");
		folder.exists(); // boolean java.io.File.exists(): 폴더가 있는지 없는지 리턴
		System.out.println("001. folder exists: " + folder.exists());

		// 2. folder 만들기
		if(!folder.exists()) {
			folder.mkdir(); // 폴더가 존재하지 않으면 - 만들기
		}
		
		System.out.println("002. mkdir 이용해서 폴더 만든 후: " + folder.exists());
		System.out.println();
		
		// 3. file 확인
		File file = new File("c:\\file\\" + "file000.txt");
		System.out.println("003. file exists: " + file.exists());
		
		// 4. file 만들기
		if(!file.exists()) { // 파일이 존재하지 않으면
			try {
				file.createNewFile(); // 파일을 만들어주세요
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("004. createNewFile() 이용해서 파일 만든 후: " + file.exists());
	}
}
