package com.company.day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Writer003 {
	public static void main(String[] args) {
		String folderPath = "C:\\file\\";
		String filePath = "write2.txt";
		
		File folder = new File(folderPath);
		File file = new File(folderPath + filePath);
		
		Path path = Paths.get(folderPath, filePath);

		try {
			if (!folder.exists()) {
				folder.mkdir();
			}
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}


		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ㅁ 우유 이름 입력: ");
			String milk = sc.nextLine();
			System.out.println("ㅁ 우유 이름 가격: ");
			int price = sc.nextInt();
			System.out.println("입력이 다 끝났습니까? (y/n)");
			String answer = sc.next();
			
			// 객체 생성
			milks.add(new MilkDtoF1(milk, price));
			
			// 파일에 넣기
			try {				
				BufferedWriter milkPen = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
				
				MilkDtoF1 tmp = milks.get(milks.size()-1);
				milkPen.write(tmp.getmNo() + "\t" + tmp.getName() + "\t" + tmp.getmPrice());
				milkPen.newLine();

				milkPen.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if (answer.equals("y"))
				break;
		}
		
		System.out.println(milks);
	}
}
