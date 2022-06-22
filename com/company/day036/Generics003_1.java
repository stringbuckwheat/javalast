package com.company.day036;

class Wild003_1<E> {
	private E t;

	public Wild003_1() {
		super();
	}

	public Wild003_1(E t) {
		super();
		this.t = t;
	}

	public E getE() {
		return t;
	}
}

public class Generics003_1 {
	public static void main(String[] args) {
		Wild003_1<?> w = new Wild003_1<Integer>(100);
		System.out.println(w.getE());
		
		w = new Wild003_1<String>("abc");
		System.out.println(w.getE());

		w = new Wild003_1<Double>(3.14);
		System.out.println(w.getE());
	}
}
