package com.company.day038;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Writer002 {
	public static void main(String[] args) {
		String folderPath = "c:\\file\\";
		String filePath = "write1.txt";
		Path path = Paths.get(folderPath + filePath);

		Scanner sc = new Scanner(System.in);
		System.out.println("ㅁ 우유 이름 입력: ");
		String milk = sc.next();
		System.out.println("ㅁ 우유 이름 가격: ");
		int price = sc.nextInt();

		try {
			BufferedWriter milkPen = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
			
			milkPen.newLine();
			milkPen.write(milk);
			milkPen.newLine();
			milkPen.write(String.valueOf(price));

			milkPen.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
