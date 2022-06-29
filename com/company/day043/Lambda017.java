package com.company.day043;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda017 {
	public static void main(String[] args) {
		// 1. 콜렉션
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i < 5; i++) {
			list.add(i);
		}
		
		// 1-1. stream
		Stream<Integer> stream = list.stream();
		// 1-2. 중간연산/최종연산
		stream.forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		// 2. 배열
		String[] arr = {"a", "b", "c", "b"};
		// Stream.of(arr);로도 스트림 생성 가능
		Arrays.stream(arr).distinct().forEach(System.out::print);
		System.out.println();
		
		// 3. 중간연산 / 최종연산
		int[] intArr2 = {1, 2, 3, 4, 5};
		// 3-1. 배열을 스트림으로 만들기
		// 3-2. 스트림의 평균값 구하기
		double answer = Arrays.stream(intArr2).average().getAsDouble();
		// OptionalDouble 리턴하므로 double로 형변환
		System.out.println(answer);
		
		// 스트림의 중복 빼고 갯수 3개만
		String[] strArr2 = {"aaa", "aaa", "bbb", "cc", "d", "dd", "ddd", "bbb"};
		Stream.of(strArr2).distinct().limit(3).sorted().forEach(System.out::print);
		System.out.println();
		
		// cf) 리스트에 담기
		List<String> list1 = Stream.of(strArr2).distinct().limit(3).sorted().collect(Collectors.toList());
		// Collectors.toList() 대신에 toSet(), toMap() 등도 가능
		System.out.println(list1);
	}
}
