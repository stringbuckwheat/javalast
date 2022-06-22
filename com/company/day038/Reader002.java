package com.company.day038;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader002 {
	public static void main(String[] args) {
		String folderPath = "C:\\file\\";
		String filePath = "write1.txt";
		
		File folder = new File(folderPath);
		File file = new File(filePath);
		
		Path path = Paths.get(folderPath + filePath);
		
		try {
			if(!folder.exists())
				folder.mkdir();
			if(!file.exists())
				file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			StringBuilder builder = new StringBuilder();
					
			while(true) {
				String line = reader.readLine();
				if(line == null) break;
				builder.append(line + "\n");
			}
			
			reader.close();
			System.out.println(builder.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
