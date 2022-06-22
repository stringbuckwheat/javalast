package com.company.day038;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader000 {
	public static void main(String[] args) {
		String folderPath = "C:\\file\\";
		String filePath = "write0.txt";
		Path path = Paths.get(folderPath + filePath);
		BufferedReader reader = null;

		try {
			// 1. 전화오면 상대방이 말하는 거 읽어들이기
			reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			
			// 2. 한 줄 한 줄 읽고
			StringBuilder builder = new StringBuilder();
			
			// 문자열: (1000)"abc" + "d" -- (1001)"abcd" 새로운 문자열, 주소가 바뀜
//			String line = "";
//			
//			while((line = reader.readLine()) != null) {
//				builder.append(line + "\n");
//			}
			
			while(true) {
				String line = reader.readLine();
				if(line == null) break;

				builder.append(line + "\n");
			}
			
			// 3. 전화기 끊고
			reader.close();
			System.out.println(builder.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
