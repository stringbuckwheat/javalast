package com.company.day034;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet004_Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for(int i = 1; i < lotto.length+1; i++) {
			lotto[i-1] = i;
		}
			
		HashSet<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			int idx = (int)(Math.random() * 45);
			set.add(lotto[idx]);
		}
		
		System.out.println(set);
	}
}
