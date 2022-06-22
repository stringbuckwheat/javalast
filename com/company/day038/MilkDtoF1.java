package com.company.day038;

import java.util.ArrayList;

class MilkDtoF1 {
	static int cnt;
	private int mNo;
	private String name;
	private int mPrice;

	public MilkDtoF1() {
		super();
	}

	public MilkDtoF1(int mNo, String name, int mPrice) {
		super();
		this.mNo = mNo;
		this.name = name;
		this.mPrice = mPrice;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	@Override
	public String toString() {
		return "MilkDtoF1 [mNo=" + mNo + ", name=" + name + ", mPrice=" + mPrice + "]";
	}
}