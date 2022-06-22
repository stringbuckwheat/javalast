package com.company.day034;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList002 {
	public static void main(String[] args) {
		// List: 순서가 있고(index), 중복 허용
		ArrayList numbers = new ArrayList();
		
		numbers.add("ONE");
		numbers.add("TWO");
		numbers.add("THREE");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1, 2, 3 중에 입력해주세요");
		int num = sc.nextInt();
		System.out.println(numbers.get(num-1));
		
		// iterator
		System.out.println();
		System.out.println("iterator");
		Iterator it = numbers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
