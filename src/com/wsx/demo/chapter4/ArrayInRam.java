package com.wsx.demo.chapter4;

public class ArrayInRam {
	// ��������
	public static void main(String[] args) {
		int[] a = { 5, 2, 7, 9 };
		int[] b = new int[5];
		System.out.println("b�����鳤��:" + b.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		b = a;
		// ��ֵ����������a�ĵ�ַ�洢������b�����ã�δ���ÿ�����b�ȴ�GC����
		System.out.println("���¸�ֵ֮������鳤�ȣ�" + b.length);
	}
}
