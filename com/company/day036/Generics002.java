package com.company.day036;

import java.util.ArrayList;
import java.util.Iterator;

class GUserInfo{
	private String name;
	private int age;
	
	public GUserInfo() {
		super();
	}
	
	public GUserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public String toString() {
		return "GUserInfo [name=" + name + ", age=" + age + "]";
	}
}

public class Generics002 {
	public static void main(String[] args) {
		ArrayList<GUserInfo> list = new ArrayList<>();
		GUserInfo[] datas = {new GUserInfo("아이언맨", 50), new GUserInfo("헐크", 40), new GUserInfo("캡틴", 120)};
		
		for(GUserInfo g : datas) {
			list.add(g);
		}
		
		Iterator<GUserInfo> it = list.iterator();
		int sum = 0;
		
		while(it.hasNext()) {
			sum += it.next().getAge();
		}
		
		System.out.println("어벤져스 총 나이 합: " + sum);
		System.out.println("어벤져스 평균 나이: " + sum / list.size());
	}
}
