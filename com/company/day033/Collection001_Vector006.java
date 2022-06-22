package com.company.day033;

import java.util.Vector;

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
		return name + " / " + age;
	}
}

public class Collection001_Vector006 {
	public static void main(String[] args) {
		// Vector<UserInfo> user = new Vector<>();
		Vector user = new Vector();
		user.add(new UserInfo("아이언맨", 50));
		user.add(new UserInfo("헐크", 40));
		user.add(new UserInfo("캡틴", 120));
		
		for(int i = 0; i < user.size(); i++) {
			System.out.println("USER" + (i+1) + ": " + ((UserInfo)user.get(i)).getName() + " / "+ ((UserInfo)user.get(i)).getAge());
		}
	}
}