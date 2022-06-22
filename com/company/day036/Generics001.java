package com.company.day036;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics001 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		
		while(it.hasNext()) {
			sum += it.next();
		}
		
		System.out.println(sum / list.size());

	}
}
