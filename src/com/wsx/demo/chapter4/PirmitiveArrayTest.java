package com.wsx.demo.chapter4;

public class PirmitiveArrayTest {
	// ��̬��ʼ��
	public static void main(String[] args) {
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
			System.out.println(intArray[i]);
		}
	}
}
