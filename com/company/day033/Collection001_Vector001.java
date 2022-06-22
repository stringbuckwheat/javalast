package com.company.day033;

import java.util.Arrays;
import java.util.Vector;

public class Collection001_Vector001 {
	public static void main(String[] args) {
		// Vector와 ArrayList의 사용방법은 동일
		
		// 배열 vs 컬렉션 프레임워크
		// 1) RED, GREEN, BLUE 문자열 담을 배열 만들기
		// 2) BLACK 추가하기 위해 배열 개수 1개 증가
		// 3) 배열 담기
		String[] arr = {"RED", "GREEN", "BLUE"};
		String[] temp = new String[arr.length+1];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		temp[3] = "BLACK";
		System.out.println(Arrays.toString(temp));

		// 배열: 매번 사용할 때마다 배열의 개수 고려해야함
		// 콜렉션 프레임워크: 클래스들을 담아서 처리
		// 도라에몽 요술주머니: add, get, size, remove
		
		Vector vect = new Vector();
		vect.add(1); // 오토박싱
		vect.add(2);
		vect.add(3);
		vect.add(3.14);
		vect.add(new String("hi"));
		boolean put100 = vect.add(new Integer(100));
		System.out.println("1. 요술주머니: " + vect);
		System.out.println("2. 데이터 삽입: add");
		System.out.println("3. get을 이용해서 꺼내오기: " + vect.get(vect.size()-1));
		System.out.println("4. size는 개수: " + vect.size());
		System.out.println("5. remove는 삭제: " + vect.remove(1) + " / " + vect.remove("hi"));
		System.out.println(vect);
		
		
		////////////////// 문제
		System.out.println("////////////////// 문제\r\n");
		Vector v = new Vector();
		String[] arr2 = new String[] {"RED", "GREEN", "BLUE", "BLACK"};
		
		for(String a : arr2) {
			v.add(a);
		}
		
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + ", ");
		}
		System.out.println();
		
		for(Object a : v) {
			System.out.print(a + ", ");
		}
	}
}
