package com.wsx.demo.chapter5_1;

public class StaticInitTest {
	// ��̬�����
	static {
		// ����ִ��
		a = 6;
	}
	
	// ��ȫ�ֱ���a��ֵΪ9
	static int a = 9;

	public static void main(String[] args) {
		System.out.println(StaticInitTest.a);
	}
}
