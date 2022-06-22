package com.company.day033;

import java.util.Vector;

public class Collection001_Vector003 {

	public static void main(String[] args) {
		Vector milk = new Vector();
		milk.add("white");
		milk.add("choco");
		milk.add("banana");
		
		for(int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
	}

}
