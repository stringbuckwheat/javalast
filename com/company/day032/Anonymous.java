package com.company.day032;

interface Fish{
	String COMPANY = "(주) 피쉬"; // public static final
	
	public String fishType();
	public void breath();
}

class FlatFish implements Fish{

	@Override
	public String fishType() {
		return "광어";
	}

	@Override
	public void breath() {
		System.out.println(fishType() + "는 모래바닥...");
	}
	
}


public class Anonymous {
	public static void main(String[] args) {
		// 1. 인터페이스를 구현해 테스트하려면 자손 클래스에서 테스트해야함
		Fish myFish = new FlatFish();
		myFish.breath();
		
		// 2. 인터페이스를 구현해 테스트 시 익명클래스를 이용하면 자손 클래스 안 만들어도 됨.
		Fish myFish2 = new Fish() {
			@Override
			public String fishType() {
				return "붕어";
			}

			@Override
			public void breath() {
				System.out.println(fishType() + " good!");
			}
			
		};
		
		myFish2.breath();
	}
}
