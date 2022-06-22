package com.company.day032;

interface Animal{
	public void eat();
	public void sleep();
	public void poo();
}

class Monkey implements Animal{

	@Override
	public void eat() {
		System.out.println("바나나 냠냠!");
	}

	@Override
	public void sleep() {
		System.out.println("HOUSE에서 자요");
	}

	@Override
	public void poo() {
		System.out.println("시원해요");
	}
	
}

public class Anonymous002 {
	public static void main(String[] args) {
		// 인터페이스 사용방법 1: 자손 클래스 만들어서 체크
		Animal ani = new Monkey();
		ani.eat();
		ani.sleep();
		ani.poo();
		
		System.out.println();

		// 인터페이스 사용방법 2: 자손 클래스 만들어서 체크
		Animal ani2 = new Animal() {
			@Override
			public void eat() {
				System.out.println("바나나 냠냠!");
			}

			@Override
			public void sleep() {
				System.out.println("HOUSE에서 자요");
			}

			@Override
			public void poo() {
				System.out.println("시원해요");
			}
		}; // new 인터페이스() {};
		
		ani2.eat();
		ani2.sleep();
		ani2.poo();
	}
}
