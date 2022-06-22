package com.company.day037;

public class Test2 {
	public static void main(String[] args) {
		Wild2<? extends Number> q4 = new Wild2<Float>(3.14f);
		q4 = Wild2<Long>(10L);
		q4 = Wild2<Number>(10L);
		q4 = Wild2<String>("abc"); // 오류 - Number 클래스 상속받지 않음
	}
}
