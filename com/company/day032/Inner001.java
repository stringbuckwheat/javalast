package com.company.day032;

class Out001{
	// 멤버변수 (클래스변수, 인스턴스 변수)
	static int oi = 10; // 클래스변수
	int oa;				// 인스턴스 변수
	
	// 멤버함수 (클래스 메서드, 인스턴스 메서드)
	static void show() {
		System.out.println("method area(공용)");
	}
	
	void show1() {
		System.out.println(oi + " - " + this.oa);
	}
	
	// 중첩 클래스
	class In001{
		int i = 20;
		// static final int j = 100; -- final은 또 왜 됨..?
		
		public void show2() {
			System.out.println(i);
		}
	}
}

public class Inner001 {
	public static void main(String[] args) {
		///// 사용방법 1
		Out001 o1 = new Out001();
		System.out.println("1. Out001 객체: " + o1);
		System.out.println("2. 멤버변수 - 클래스 변수: " + Out001.oi);
		System.out.println("3. 멤버변수 - 인스턴스 변수: " + o1.oa);
		System.out.println("4. Out001 안의 클래스 In001 접근: Out001.In001");
		Out001.In001 i1 = new Out001().new In001();
		// Out001.In001 - 이 만큼이 타입명임
		// 재밌다
		System.out.println(i1);
		i1.show2();
		
		
		///// 사용방법 2
		Out001 o2 = new Out001();
		Out001.In001 i2 = o2.new In001();
		
	}
}
