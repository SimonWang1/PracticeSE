package com.wsx.demo.chapter4;

public class ContinueTest2 {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i��ֵ��" + i + "j��ֵ" + j);
				if (i == 3) {
					// ����outer��ǩ���ƶ���ѭ���б���ѭ����ʣ�µ����
					continue outer;
				}
			}
		}
	}
}
