package com.company.day038;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class WriterReader001 {
	public static void main(String[] args) {
		String folderPath = "C:\\file\\";
		String filePath = "write2.txt";
		Path path = Paths.get(folderPath, filePath);
		File folder = new File(folderPath);
		File file = new File(folderPath + filePath);
		ArrayList<MilkDtoF1> milks = new ArrayList<>();
		int line = 0;

		// 디렉토리, 파일 생성
		try {
			if (!folder.exists())
				folder.mkdir();
			if (!file.exists()) {
				file.createNewFile();
				try {
					BufferedWriter milkPen = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
							StandardOpenOption.APPEND);

					milkPen.write("No\tMilk\tPrice\n");

					milkPen.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 빈 파일 확인 or cnt 추출
		try {
			BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);

			while (true) {
				line++;
				if (br.readLine() == null)
					break;
			}

			System.out.println(line);
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 데이터 입력
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ㅁ 우유 이름 입력: ");
			String milk = sc.nextLine();
			System.out.println("ㅁ 우유 이름 가격: ");
			int price = sc.nextInt();
			System.out.println("입력이 다 끝났습니까? (y/n)");
			String answer = sc.next();

			// 객체 생성
			milks.add(new MilkDtoF1(line - 1, milk, price));
			line++;

			if (answer.equals("y"))
				break;
		}

		// 파일 입력
		try {
			BufferedWriter milkPen = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND);

			for (MilkDtoF1 tmp : milks) {
				milkPen.write(tmp.getmNo() + "\t" + tmp.getName() + "\t" + tmp.getmPrice() + "\n");
			}

			milkPen.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 파일 출력
		try {
			BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			StringBuilder sb = new StringBuilder();

			String line1 = "";

			while (true) {
				line1 = br.readLine();
				if (line1 == null)
					break;
				sb.append(line1 + "\n");
			}

			br.close();
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
