package com.wsx.demo.chapter5_1;

public class StaticInitTest {
	// ��̬�����
	static {
		// ��̬���������ִ�н�a��̬��Ա������ֵΪ6
		a = 6;
	}
	// �ٽ�a��̬��Ա������ֵΪ9
	static int a = 9;

	public static void main(String[] args) {
		System.out.println(StaticInitTest.a);
	}
}
