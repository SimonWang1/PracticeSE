package com.wsx.demo.chapter5_1;

public class ConstructorTest {
	// ���ι�����
	public String name;
	public int count;

	public static void main(String[] args) {
		// ʹ���Զ��幹������������
		ConstructorTest tc = new ConstructorTest("�����������ԭ��", 3999);
		System.out.println(tc.name);
		System.out.println(tc.count);
	}

	// �ṩ���������Ĺ�����
	public ConstructorTest(String name, int count) {
		// �������е�this�����ʼ������
		this.name = name;
		this.count = count;
	}
}
