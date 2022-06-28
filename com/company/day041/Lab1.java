package com.company.day041;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;


public class Lab1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		int index = -1;
		
		ListIterator<String> it = al.listIterator();

		while (it.hasNext()) {
			if (Objects.equals("c", it.next())) {
				index = it.nextIndex() - 1;
				break;
			}
		}
		
		System.out.println(index);
	}

}
