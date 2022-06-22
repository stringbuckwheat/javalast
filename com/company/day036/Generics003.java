package com.company.day036;

class Wild001<Integer>{
	private Integer a;
	
	public Wild001() {
		super();
	}

	public Wild001(Integer a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "Wild001 [a=" + a + "]";
	}

	public Integer getA() {
		return a;
	}
} // end class

class Wild002<String>{
	private String a;

	public Wild002() {
		super();
	}

	public Wild002(String a) {
		super();
		this.a = a;
	}
	
	public String getA() {
		return a;
	}

	@Override
	public java.lang.String toString() {
		// java.lang 패키지 - 지역변수인지 멤버변수인지
		// 내가 넣어준 값이 아니고 자바팀이 만들어놓은 String
		return "Wild002 [a=" + a + "]";
	}
}


class Wild003<T>{
	private T o;

	public Wild003() {
		super();
	}

	public Wild003(T o) {
		super();
		this.o = o;
	}

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}
}

public class Generics003 {
	public static void main(String[] args) {
		System.out.println("\n\n[ver-2] 제네릭");
		Wild003_1<?> q1 = w;
		System.out.println("Wild Card를 사용 > " + q1.getE());
		Wild003_1<?> w11 = new Wild003_1<>();
		Wild003_1<?> w21 = new Wild003_1<>();
		Wild003_1<?> w31 = new Wild003_1<>();
		
		// ? -> 아무거나 다, 어떤 클래스
		
		/////////////////////
		// ArrayList(Collection<? extends E> c)
		Wild002<Object> w20 = new Wild002<>(100);
		Wild002<? extends Number> ten = w20;
		// Number클래스를 상속받았는가?
		Wild002<Object> w41 = new Wild002<>(100);
		
		Wild002<? super Number> ten2;
		// 자식 super 부모
		// ? super Number
		// 어떤 클래스 위에 Number
		
		
	}
}
