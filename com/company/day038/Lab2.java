package com.company.day038;

public class Lab2 {
	public static void main(String[] args) {
		try {
			System.out.println(0/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
		System.out.println("1");
	}
}
