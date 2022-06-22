package com.company.day037;

import java.io.File;
import java.io.IOException;

public class File001 {
	public static void main(String[] args) {
		String folderPath = "c:\\file\\file001\\";
		String filePath = "write0.txt";
		
		File folder = new File(folderPath);
		File file = new File(folderPath + filePath);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
