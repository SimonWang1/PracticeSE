package com.wsx.demo.chapter4;

public class DoWhileTest {
	// Do whileѭ��
	public static void main(String[] args) {
		int count = 0;
		do {
			count++;
			System.out.println("dowhileѭ��:" + count);
		} while (count < 5);
		System.out.println("ѭ������");
		int count2 = 15;
		do {
			count2--;
			System.out.println("dowhileѭ��2��" + count2);
		} while (count2 > 10);
		System.out.println("ѭ��2����");
	}
}
