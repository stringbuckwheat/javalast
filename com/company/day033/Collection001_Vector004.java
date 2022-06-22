package com.company.day033;

import java.util.Vector;

public class Collection001_Vector004 {
	public static void main(String[] args) {
		Vector fruit = new Vector();

		fruit.add("apple");
		fruit.add("coconut");
		fruit.add("banana");
		
		// fruit.remove(fruit.size()-1);
		fruit.remove("banana");
		
		for(int i = 0; i < fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
	}
}