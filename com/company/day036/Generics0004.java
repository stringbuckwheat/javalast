package com.company.day036;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.company.day035.MilkDto1;

import java.util.Objects;
import java.util.Set;

class MilkDto{
	private int mNo;
	private String mName;
	private int mPrice;
	
	public MilkDto() {
		super();
	}
	
	public MilkDto(int mNo, String mName, int mPrice) {
		super();
		this.mNo = mNo;
		this.mName = mName;
		this.mPrice = mPrice;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
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
		return "MilkDto [mNo=" + mNo + ", mName=" + mName + ", mPrice=" + mPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mName, mNo, mPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MilkDto other = (MilkDto) obj;
		return Objects.equals(mName, other.mName) && mNo == other.mNo && mPrice == other.mPrice;
	}
}

class WildPrint<E>{
	E t;
	
	public WildPrint() {
		super();
	}

	public WildPrint(E t) {
		super();
		this.t = t;
	}

	@Override
	public String toString() {
		return "WildPrint [t=" + t + "]";
	}

	void show() {
		System.out.println("====================");
		System.out.println("no\tname\tprice");
		System.out.println("====================");

		if(t instanceof Collection) {
			
			Iterator<MilkDto> it = ((Collection<MilkDto>) t).iterator();
			
			while(it.hasNext()) {
				MilkDto m = it.next();
				System.out.println(m.getmNo() + "\t" + m.getmName() + "\t" + m.getmPrice());
			}
			
		} else if (t instanceof Map) {
			Iterator<Entry<Integer, MilkDto>> it = ((Map<Integer, MilkDto>)t).entrySet().iterator();
			
			while(it.hasNext()) {
				Entry<Integer, MilkDto> e = it.next();
				MilkDto m = (MilkDto)e.getValue();
				System.out.println(e.getKey() + "\t" + e.getValue().getmName() + "\t" + e.getValue().getmPrice());
			}
		}
	}
}

public class Generics0004 {
	public static void main(String[] args) {
		System.out.println("### 001) ArrayList");
		ArrayList<MilkDto> list = new ArrayList<MilkDto>();
		list.add(new MilkDto(1, "white", 1000));
		list.add(new MilkDto(2, "choco", 1200));

		System.out.println("### 002) HashSet");
		Set<MilkDto> set = new HashSet<MilkDto>();
		set.add(new MilkDto(1, "white", 1000));
		set.add(new MilkDto(2, "choco", 1200));
		
		System.out.println("### 003) HashMap");
		Map<Integer, MilkDto> map = new HashMap<Integer, MilkDto>();
		map.put(1, new MilkDto(1, "white", 1000));
		map.put(2, new MilkDto(2, "choco", 1200));
		
		// 와일드카드 사용 시
		WildPrint<?> print = new WildPrint<ArrayList<MilkDto>>(list);
		print.show();
		print = new WildPrint<Set<MilkDto>>(set);
		print.show();
		print = new WildPrint<Map<Integer, MilkDto>>(map);
		print.show();
		
	}	
}
