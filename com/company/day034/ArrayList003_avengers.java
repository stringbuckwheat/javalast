package com.company.day034;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList003_avengers {
	public static void main(String[] args) {
		ArrayList<String> avengers = new ArrayList<>();
		String[] name = {"IRON", "HULK", "CAPTAIN"};
		
		for(String n : name) {
			avengers.add(n);
		}
		
		////////////////////////////////////iterator
		System.out.println("iterator");
		Iterator it = avengers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		for(;;) {
			String[] tmp = {"부자 남자", "초록색 남자", "항상 대장"};
			
			Scanner sc = new Scanner(System.in);
			System.out.println("[1)IRON 2)HULK 3)CAPTAIN]  4) 종료");
			System.out.println("당신의 영웅의 번호를 입력해주세요 > ");
			int input = sc.nextInt();
			
			if(input == 4) break;
			
			System.out.println(tmp[input-1] + "  " + avengers.get(input-1));
		}
		
//		Iterator iter = avengers.iterator();
//		
//		while(iter.hasNext()) {
//			String[] tmp = {"부자 남자", "초록색 남자", "항상 대장"};
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("[1)IRON 2)HULK 3)CAPTAIN]  4) 종료");
//			System.out.println("당신의 영웅의 번호를 입력해주세요 > ");
//			int input = sc.nextInt();
//			
//			if(input == 4) break;
//			
//			System.out.println(tmp[input-1] + "  " + avengers.get(input-1));
//		}
	}
}
