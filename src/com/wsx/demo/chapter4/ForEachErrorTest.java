package com.wsx.demo.chapter4;

public class ForEachErrorTest {
	// �±�Խ���쳣
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		for (int A : a) {
			System.out.println(A);
		}
		System.out.println(a[10]);
	}
}
