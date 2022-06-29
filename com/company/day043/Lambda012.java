package com.company.day043;

import java.util.function.*;

public class Lambda012 {
	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
//		c.accept(null);
		
		// 2. 람다식 표현
		// 1) 표준 Consumer
		Consumer<String> c1 = t -> System.out.println(t);
		c1.accept("Consumer<T> 함수형 인터페이스");
		
		// 2) 확장형 Consumer
		// void java.util.function.IntConsumer.accept(int value)
		IntConsumer c2 = value -> System.out.println("int 값: " + value);
		c2.accept(5);
		
		LongConsumer c3 = value -> System.out.println("long 값: " + value);
		c3.accept(5);
		
		DoubleConsumer c4 = value -> System.out.println("double 값: " + value);
		c4.accept(7.8);
		
		BiConsumer<String, Integer> c5 = (name, age) -> System.out.println("이름: " + name + "\t나이: " + age);
		c5.accept("홍길동", 16);

	}
}
