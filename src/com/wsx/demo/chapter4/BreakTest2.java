package com.wsx.demo.chapter4;

public class BreakTest2 {
	// break������ѭ��
	public static void main(String[] args) {
		// ������ѭ��Ϊouter
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i��ֵ��" + i + " j��ֵ��" + j);
				// �ж�����
				if (i == 2) {
					break outer;
				}
			}
		}
	}
}
