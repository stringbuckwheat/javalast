package com.company.day034;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Milk extends Object{
	private String mName;
	private int mPrice;
	
	public Milk() {
		super();
	}
	
	public Milk(String mName, int mPrice) {
		super();
		this.mName = mName;
		this.mPrice = mPrice;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmPrice() {
		return mPrice;
	}

	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}

	@Override
	public String toString() {
		return "Milk [mName=" + mName + ", mPrice=" + mPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mName, mPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Milk other = (Milk) obj;
		return Objects.equals(mName, other.mName) && mPrice == other.mPrice;
	}
	
	// 1. 리턴값이 같으면
	// 2. equals의 리턴값 > mName, mPrice가 같다면 같은 객체
	
	// #1. hashCode() 리턴값 같음 -> equals() 리턴값 같음 -> 같은 객체, 동등 객체
	// 다름							다름
	// #2. 
}

public class HashSet003 {
	public static void main(String[] args) {
		Set<Milk> set = new HashSet<Milk>();
		Milk[] milks = new Milk[] {
				new Milk("바나나우유", 1300), 
				new Milk("메론맛우유", 1800), 
				new Milk("커피우유", 1500), 
				new Milk("커피우유", 1500)
				};
		
		for(Milk m : milks) {
			// (Milk m이 아니라)Object s로 받았으면 Milk milk = (Milk)s;
			// 다운캐스팅
			set.add(m);
		}
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Milk tmp = (Milk)it.next();
			System.out.println(tmp.getmName() + "\t" + tmp.getmPrice());
		}
	}
}
