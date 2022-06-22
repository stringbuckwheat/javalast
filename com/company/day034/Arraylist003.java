package com.company.day034;

import java.util.ArrayList;
import java.util.Iterator;

class UserInfo{
	private String name;
	private int age;
	
	public UserInfo() {
		super();
	}
	
	public UserInfo(String name, int age) {
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
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}
}

public class Arraylist003 {
	public static void main(String[] args) {
		ArrayList users = new ArrayList();
		
		users.add(new UserInfo("IRON", 50));
		users.add(new UserInfo("HULK", 40));
		users.add(new UserInfo("CAPTAIN", 120));
		
		System.out.println("=================");
		System.out.println("NAME\tAGE");
		System.out.println("=================");
		
		// for - size로 출력
		for(int i = 0; i < users.size(); i++) {
			UserInfo tmp = (UserInfo)users.get(i);
			System.out.println(tmp.getName() + "\t" + tmp.getAge());
		}
		
		System.out.println();
		System.out.println("=================");
		System.out.println("NAME\tAGE");
		System.out.println("=================");
		
		// 향상된 for문
		for(Object u : users) {
			UserInfo tmp = (UserInfo)u;
			System.out.println(tmp.getName() + "\t" + tmp.getAge());
		}
		
		/////// iterator
		System.out.println();
		System.out.println("============= iterator");
		Iterator it = users.iterator();
		while(it.hasNext()) {
			UserInfo tmp = (UserInfo)it.next();
			System.out.println(tmp.getName() + "\t" + tmp.getAge());
		}
	}
}
