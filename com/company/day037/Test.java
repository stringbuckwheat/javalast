package com.company.day037;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Color {
	private int no;
	private String name;
	private int num;

	public Color() {
		super();
	}

	public Color(int no, String name, int num) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, no, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		return Objects.equals(name, other.name) && no == other.no && num == other.num;
	}

	@Override
	public String toString() {
		return "Color [no=" + no + ", name=" + name + ", num=" + num + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		List<Color> list = new ArrayList<>();
		Color[] colors = { new Color(1, "RED", 2), new Color(2, "GREEN", 5), new Color(3, "BLUE", 3) };

		// 대입
		for (Color c : colors) {
			list.add(c);
		}

		// 출력
		Iterator<Color> it = list.iterator();

		System.out.println("========================");
		System.out.println("NO\tNAME\tNUM");
		System.out.println("========================");

		while (it.hasNext()) {
			Color tmp = it.next();
			System.out.println(tmp.getNo() + " \t " + tmp.getName() + " \t " + tmp.getNum());
		}

		//////////////////////////////////////////
		Set<Color> set = new HashSet<>();
		for (Color c : colors) {
			set.add(c);
		}

		// 출력
		System.out.println();
		System.out.println("=====================================HashSet");
		System.out.println("========================");
		System.out.println("NO\tNAME\tNUM");
		System.out.println("========================");

		for (Color c : set) {
			System.out.println(c.getNo() + " \t " + c.getName() + " \t " + c.getNum());
		}
		
		System.out.println("////////////////////////////// TreeSet");
		Set<Integer> set1 = new TreeSet<>();
		
		set1.add(1);
		set1.add(5);
		set1.add(3);

		System.out.println(set1);
		// Set에서 따로 순서 정렬하는 방법: 1) TreeSet 2) Comparable 3) Collections.sort

		//////////////////////////////////////////
		Map<Integer, Color> map = new HashMap<>();

		for (Color c : colors) {
			map.put(c.getNo(), c);
		}

		// keySet
		System.out.println();
		System.out.println("=====================================HashMap - keySet");
		System.out.println("========================");
		System.out.println("NO\tNAME\tNUM");
		System.out.println("========================");

		Iterator<Integer> ks = map.keySet().iterator();

		while (ks.hasNext()) {
			Color tmp = map.get(ks.next());
			System.out.println(tmp.getNo() + " \t " + tmp.getName() + " \t " + tmp.getNum());
		}

		// entrySet
		System.out.println();
		System.out.println("=====================================HashMap - entrySet");
		System.out.println("========================");
		System.out.println("NO\tNAME\tNUM");
		System.out.println("========================");

		Set<Entry<Integer, Color>> entry = map.entrySet();

		for (Entry<Integer, Color> e : entry) {
			System.out.println(e.getKey() + " \t " + e.getValue().getName() + " \t " + e.getValue().getNum());
		}

		System.out.println("\n======================== 실험");

		for (Entry<Integer, Color> a : map.entrySet()) {
			System.out.println(a.getKey() + " \t " + a.getValue().getName() + " \t " + a.getValue().getNum());
		}
		
		System.out.println("\n======================== 실험2");

		for (Color a : map.values()) {
			System.out.println(a.getNo() + " \t " + a.getName() + " \t " + a.getNum());
		}
	}
}
