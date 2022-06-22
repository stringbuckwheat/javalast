package com.company.day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer000 {
	public static void main(String[] args) {
		String folderPath = "c:\\file\\";
		String filePath = "write0.txt";

		File folder = new File(folderPath);
		File file = new File(folderPath + filePath);

		try {
			if (!folder.exists()) {
				folder.mkdir();
			}
			if (!file.exists()) {
				file.createNewFile();
			} else {
				System.out.println("file 존재함");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		///////////////// 2. 펜 뚜껑 열기
		// 웹 표준 방법
		// Files.newBufferedWriter(path, StandardCharsets.UTF_8, options)
		Path path = Paths.get(folderPath + filePath);
		
		// 패스 못 만들 수도 있으니까 try - catch
		try {
			BufferedWriter pen = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			
			// 3. 글쓰기
			pen.write("apple\n");
			pen.write("banana");
			pen.newLine();
			pen.write("coconut\n");
			
			// 4. 뚜껑 닫기
			pen.close();
			System.out.println(">> 글쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}


	} // end for main
}
