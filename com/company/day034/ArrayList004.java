package com.company.day034;

import java.util.ArrayList;
import java.util.List;

class Coffee{
	static int cnt;
	private int no;
	private String menu;
	private int price;
	private int order;
	private int total;
	private boolean state;
	
	public Coffee() {
		super();
	}
	
	public Coffee(String menu, int price, int order, int total, boolean state) {
		super();
		no = ++cnt;
		this.menu = menu;
		this.price = price;
		this.order = order;
		this.total = total;
		this.state = state;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}

public class ArrayList004 {
	public static void main(String[] args) {
		List<Coffee> coffeeList = new ArrayList<Coffee>();
		coffeeList.add(new Coffee("아메리카노", 1500, 3, 4500, true));
		coffeeList.add(new Coffee("카페라떼", 2500, 1, 2500, false));
		coffeeList.add(new Coffee("아메리카노", 1500, 3, 4500, true));
		
		System.out.println("==================================");
		System.out.println("NAME\t가격\tORDER\tTOTAL\t상태t");
		
	}
}
