package com.wsx.demo.chapter4;

public class BreakTest {
	// break����ѭ��
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i��ֵΪ��" + i);
			// �ж�����
			if (i == 5) {
				break;
			}
		}
	}
}
