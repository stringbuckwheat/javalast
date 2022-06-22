package com.company.day036;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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



public class Generics004_1 {
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
		WildPrint1<?> print = new WildPrint1<ArrayList<MilkDto>>(list);
		print.show();
		print = new WildPrint1<Set<MilkDto>>(set);
		print.show();
		print = new WildPrint1<Map<Integer, MilkDto>>(map);
		print.show();
	}	
}

class WildPrint1<E>{
	E t;
	
	public WildPrint1() {
		super();
	}

	public WildPrint1(E t) {
		super();
		this.t = t;
	}

	@Override
	public String toString() {
		return "WildPrint [t=" + t + "]";
	}
	
	void menu() {
		System.out.println();
		System.out.println("====================");
		System.out.println("no\tname\tprice");
		System.out.println("====================");
	}
	
	void print(MilkDto m) {
		System.out.println(m.getmNo() + "\t" + m.getmName() + "\t" + m.getmPrice());
	}

	@SuppressWarnings("unchecked")
	void show() {
		menu();

		if(t instanceof Collection) {
			Collection<MilkDto> milks = (Collection<MilkDto>)t;
			Iterator<MilkDto> it = milks.iterator();
			
			while(it.hasNext()) {
				print(it.next());
			}
			
			// 향상된 for문
			System.out.println();
			System.out.println("향상된 for문");
			menu();
			
			for(MilkDto m : milks) {
				print(m);
			}
			
		} else if (t instanceof Map) {
			Map<Integer, MilkDto> map = (Map<Integer, MilkDto>)t;
			Set<Entry<Integer, MilkDto>> entry = map.entrySet();
			Iterator<Entry<Integer, MilkDto>> it = entry.iterator();
			
			while(it.hasNext()) {
				print(it.next().getValue());
			}
			
			// ((HashMap<Integer, MilkDto1>)a).values()
			// iterator가 사이트에서 넘길 때 좀 더 나음
			
			// 향상된 for문
			System.out.println();
			System.out.println("향상된 for문");
			menu();
			
			for (Entry<Integer, MilkDto> e : entry) {
				print(e.getValue());
			}
		}
	}
}