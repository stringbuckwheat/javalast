package com.company.day043;

import java.util.Arrays;

public class StreamArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		solution(arr);
		System.out.println(solution(arr));
	}
	
	static double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}
}
