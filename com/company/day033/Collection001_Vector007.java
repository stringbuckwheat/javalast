package com.company.day033;

import java.util.Scanner;
import java.util.Vector;

class CoffeeInfo {
	private String name;
	private int price;
	private int num;
	private int total;

	public CoffeeInfo() {
		super();
	}

	public CoffeeInfo(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
		mCalc();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	void mCalc() {
		total = price * num;
	}

	@Override
	public String toString() {
		return name + "\t" + price + "\t" + num + "\t" + total;
	}
}

public class Collection001_Vector007 {
	public static void main(String[] args) {
		// Vector<CoffeeInfo> coffees = new Vector<>();
		Vector coffees = new Vector();
		coffees.add(new CoffeeInfo("카페라떼", 1800, 2));
		coffees.add(new CoffeeInfo("아메리카노", 1500, 3));
		coffees.add(new CoffeeInfo("에스프레소", 2000, 1));
		
		System.out.println("======================================");
		System.out.println("\t NAME \t PRICE \t NUM \t TOTAL");
		System.out.println("======================================");
		
		// 전체 출력
		for(int i = 0; i < coffees.size(); i++) {
			// 지네릭스 코드 주석 해제하면 형변환 생략 가능
			System.out.println("ORDER" + (i+1) + ": " + ((CoffeeInfo)coffees.get(i)).getName() + "\t" + ((CoffeeInfo)coffees.get(i)).getPrice() + "\t" +((CoffeeInfo)coffees.get(i)).getNum() + "\t" + ((CoffeeInfo)coffees.get(i)).getTotal());
		}

		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("주문 이름을 적어주세요 > ");
		String order = sc.next();
		// 인덱스만 받아오기
		int find = -1;
	
		for(Object c : coffees) {
			if(order.equals(((CoffeeInfo)c).getName())) {
				
				System.out.println("======================================");
				System.out.println("NAME \t PRICE \t NUM \t TOTAL");
				System.out.println("======================================");
				System.out.println(((CoffeeInfo)c).getName() + "\t" + ((CoffeeInfo)c).getPrice() + "\t" +((CoffeeInfo)c).getNum() + "\t" +((CoffeeInfo)c).getTotal());
				break;
			}
		}
		
		for(int i = 0; i < coffees.size(); i++) {
			if(order.equals(((CoffeeInfo)coffees.get(i)).getName())) {
				find = i;
			}
		}
	}
}
