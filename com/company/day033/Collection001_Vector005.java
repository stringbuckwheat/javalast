package com.company.day033;

import java.util.Vector;

class ColorInfo{
	// private으로
	static int cnt;
	int no;
	String name;
	int price;
	
	public ColorInfo() {
		super();
		no = ++cnt;
	}
	
	public ColorInfo(String name, int price) {
		this();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}

class Collection001_Vector005{
	public static void main(String[] args) {
		Vector<ColorInfo> myColor = new Vector<>();
		myColor.add(new ColorInfo("RED", 1000));
		myColor.add(new ColorInfo("Yellow", 1200));
		myColor.add(new ColorInfo("Green", 1500));
		
		for(int i = 0; i < myColor.size(); i++) {
			System.out.println(myColor.get(i).no + "\t" + myColor.get(i).name + "\t" + myColor.get(i).price);
		}
	}
}