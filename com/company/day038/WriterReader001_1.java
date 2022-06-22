package com.company.day038;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

class MilkDtoIO1 {
	private int mno;
	private String mname;
	private int mprice;

	public MilkDtoIO1() {
		super();
	}

	public MilkDtoIO1(int mno, String mname, int mprice) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mprice = mprice;
	}

	@Override
	public String toString() {
		return "MilkDtoIO1 [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
}

public class WriterReader001_1 {
	public static void main(String[] args) {
		// 1. 변수
		String folderPath = "C:\\file\\";
		String filePath = "writeReader1.txt";
		File folder = new File(folderPath);
		File file = new File(folderPath + filePath);
		Path path = Paths.get(folderPath + filePath);
		BufferedReader reader = null;
		BufferedWriter writer = null;
		ArrayList<MilkDtoIO1> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean first = false;

		try {
			if (!folder.exists()) {
				folder.mkdir();
			}
			if (!file.exists()) {
				file.createNewFile();
				first = true;
			} // 맨처음 한번만.
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (first) {
			try {
				writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
				writer.write("======================\r\n" + "NO\tNAME\tPRICE\r\n" + "====================== \n");
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//////////////////////////////////////////////////////
		// 2. 입력 : 콘솔창에서 입력받아서 list에 넣기
		// 사용자에게 입력을받는다
		// no가 걸림.

		/////////////////////////////////////////////////////////

		int max = 0;
		try {
			reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			String line = "";
			int cnt = 0;
			StringBuilder header = new StringBuilder();
			StringBuilder total = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				cnt++; // 1
				total.append(line + "\n"); // 2
				if (cnt < 4) {
					header.append(line);
				} else {
					String[] arr = line.split("\t");
					list.add(new MilkDtoIO1(list.size() + 1, arr[1], Integer.parseInt(arr[2])));
				}
			}
			reader.close();
			max = list.size();
			// System.out.println(total.toString());
		} catch (Exception e) {
		}

		while (true) {
			System.out.print("ㅁ 우유이름입력  > ");
			String mname = scanner.next();
			System.out.print("ㅁ 우유가격입력  > ");
			int mprice = scanner.nextInt();
			list.add(new MilkDtoIO1(list.size() + 1, mname, mprice)); // 기존에 데이터3 >> 4
			System.out.print("입력이 다 끝났습니까?(y) >> ");
			if (scanner.next().trim().toLowerCase().equals("y")) {
				break;
			}
		}

		/////////////////////////////////////////////
		// 3. 처리 : list에 들어 가있는 데이터 txt파일에 쓰기
		try {
			writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
			for (MilkDtoIO1 dto : list) {
				if (dto.getMno() > max) {
					writer.write(dto.getMno() + "\t" + dto.getMname() + "\t" + dto.getMprice() + "\n");
				}
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/////////////////////////////////////////////
		// 4. 출력 : txt파일 읽어들이기
		try {
			int next = 0;
			reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			String line = "";
			int cnt = 0;
			StringBuilder header = new StringBuilder();
			StringBuilder total = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				total.append(line + "\n");
				cnt++;
				if (cnt < 4) {
					header.append(line);
				} else {
					String[] arr = line.split("\t");
					list.add(new MilkDtoIO1(list.size() + 1, arr[1], Integer.parseInt(arr[2])));
				}
			}
			reader.close();
			System.out.println(total.toString());
		} catch (Exception e) {
		}

	}

}
