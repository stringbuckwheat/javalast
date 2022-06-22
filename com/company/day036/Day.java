package com.company.day036;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Objects;

class Hero{
	private int no;
	private String name;
	private int age;
	
	public Hero() {
		super();
	}
	
	public Hero(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public Hero(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	
	@Override
	public String toString() {
		return "Hero [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
}

public class Day {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(new Hero(1, "iron", 50));
		al.add(new Hero(2, "hulk", 40));
		al.add(new Hero(3, "captain", 120));
		
		Iterator it = al.iterator();
		
		System.out.println("======================");
		System.out.println("NO\tNAME\tAGE");
		System.out.println("======================");

		while(it.hasNext()) {
			Hero tmp = (Hero)it.next();
			System.out.println(tmp.getNo() + "\t" + tmp.getName() + "\t" + tmp.getAge());
		}

		///////////////////////////////////////////
		Set set = new HashSet();
		
		set.add(new Hero(1, "iron", 50));
		set.add(new Hero(2, "hulk", 40));
		set.add(new Hero(3, "captain", 120));
		
		System.out.println();
		System.out.println("======================");
		System.out.println("NO\tNAME\tAGE");
		System.out.println("======================");
		
		it = set.iterator();
		
		while(it.hasNext()) {
			Hero tmp = (Hero)it.next();
			System.out.println(tmp.getNo() + "\t" + tmp.getName() + "\t" + tmp.getAge());
		}
		
		////////////////////////////////////////////
		Map map = new HashMap();
		
		map.put(1, new Hero("iron", 50));
		map.put(2, new Hero("hulk", 40));
		map.put(3, new Hero("captain", 120));
		
		// arr[i].getName(), arr[i]
		
		// keySet
		it = map.keySet().iterator();
		
		System.out.println();
		System.out.println("======================");
		System.out.println("NO\tNAME\tAGE");
		System.out.println("======================");
		
		while(it.hasNext()) {
			Object no = it.next();
			Hero tmp = (Hero)map.get(no);
			System.out.println(no + "\t" + tmp.getName() + "\t" + tmp.getAge());
		}
		
		// entrySet
		System.out.println();
		System.out.println("======================");
		System.out.println("NO\tNAME\tAGE");
		System.out.println("======================");
		
		it = map.entrySet().iterator();

		while(it.hasNext()) {
			Entry hero = (Entry)it.next();
			System.out.println(hero.getKey() + "\t" + ((Hero)hero.getValue()).getName() + "\t" + ((Hero)hero.getValue()).getAge());
		}
	}
}
