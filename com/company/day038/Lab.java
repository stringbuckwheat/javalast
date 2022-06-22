package com.company.day038;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 펜 뚜껑 안 닫기 실험

public class Lab {
	public static void main(String[] args) {
		String folderPath = "c:\\file\\";
		String filePath = "write0.txt";
		Path path = Paths.get(folderPath + filePath);
		
		// 패스 못 만들 수도 있으니까 try - catch
		try {
			BufferedWriter pen = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
					
			// 3. 글쓰기
			pen.write("apple\n");
			pen.write("banana");
			pen.newLine();
			pen.write("coconut\n");
			
			// 4. 뚜껑 안 닫기
			//pen.close();
			System.out.println(">> 글쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/////////////////////////////////////////////////////////
		String folderPath2 = "c:\\file\\";
		String filePath2 = "write1.txt";
		Path path2 = Paths.get(folderPath2 + filePath2);
		
		try {
			BufferedWriter pen = Files.newBufferedWriter(path2, StandardCharsets.UTF_8);
			
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
	}
}
