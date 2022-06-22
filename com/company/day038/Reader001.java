package com.company.day038;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader001 {
	public static void main(String[] args) {
		String folderPath = "C:\\file\\";
		String filePath = "write0.txt";
		
		File folder = new File(folderPath);
		File file = new File(filePath);
		Path path = Paths.get(folderPath + filePath);
		
		// 있는지 없는지 확인
		try {
			if(!folder.exists())
				folder.mkdir();
			if(!file.exists())
				file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		// 
		try {
			BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			StringBuilder builder = new StringBuilder();
			
			String line = "";
			
			while((line = reader.readLine()) != null) {
				builder.append(line + "\n");
			}
			
			reader.close();
			System.out.println(builder.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
