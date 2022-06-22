package com.company.day034;

import java.util.ArrayList;
import java.util.Iterator;

class BeerInfo {
	private int bNo;
	private String bName;
	private int bPrice;

	public BeerInfo() {
		super();
	}

	public BeerInfo(int bNo, String bName, int bPrice) {
		super();
		this.bNo = bNo;
		this.bName = bName;
		this.bPrice = bPrice;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getbPrice() {
		return bPrice;
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
}

public class ArrayList005 {
	public static void main(String[] args) {
		ArrayList<BeerInfo> blist = new ArrayList<>();
		
		blist.add(new BeerInfo(1, "카스", 2500));
		blist.add(new BeerInfo(2, "호가든", 3500));
		blist.add(new BeerInfo(3, "맥스", 2700));

		Iterator<BeerInfo> it = blist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getbNo() + "\t" + it.next().getbName());
		}
	}
}
