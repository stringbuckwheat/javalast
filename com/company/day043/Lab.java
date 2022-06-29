package com.company.day043;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.*;

public class Lab {
	public static void main(String[] args) {
		 String[] strArr = {"aaa", "bbb", "ccc"};
		 Stream<String> strStream = Arrays.stream(strArr);
		 // void forEach(Consumer<? super T> action);
		 strStream.forEach(System.out::println);
		 
		 int[] intArr = new int[100];
		 Arrays.setAll(intArr, i -> ++i);
		 IntStream intStream = Arrays.stream(intArr);
		 intStream.distinct().filter(i -> i%2==0).forEach(System.out::println);
	}
}
