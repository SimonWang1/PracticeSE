package com.wsx.demo.chapter5;

public class VariableOverrideTest {
	// ��������
	// ��ֵȫ�ֱ���
	private String name = "Wangsx";
	// ��ֵȫ�־�̬����
	private static double price = 54.8;

	public static void main(String[] args) {
		// �����ֲ��������ǳ�Ա����
		int price = 68;
		System.out.println(price);
		System.out.println(VariableOverrideTest.price);
		new VariableOverrideTest().info();
	}

	public void info() {
		// �����ֲ��������ǳ�Ա����
		String name = "Simon";
		System.out.println(name);
		// ʹ��this����nameȫ�ֱ�����ֵ
		System.out.println(this.name);
	}
}
