package com.company.day044;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Worker {
	private String name;
	private int age;
	private String gender;

	public Worker(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}

public class StreamCollect {
	public static void main(String[] args) {
		List<Worker> totalList = Arrays.asList(new Worker("강성현", 30, "male"), new Worker("여자강성현", 25, "female"),
				new Worker("깡냉", 20, "male"), new Worker("까랭", 50, "female"));

		// 남직원만 모아서 list로 생성
		List<Worker> maleList = totalList.stream()
				.filter(s -> s.getGender().equals("male"))
				.collect(Collectors.toList());
		
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		// 여직원만 모아서 HashSet으로 생성
		Set<Worker> femaleSet = totalList.stream()
				.filter(s -> s.getGender().equals("female"))
				.collect(Collectors.toSet());
		
		femaleSet.stream().forEach(s -> System.out.println(s.getName()));
	}
}
