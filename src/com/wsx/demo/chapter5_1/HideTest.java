package com.wsx.demo.chapter5_1;

class Parent {
	// ����
	public String tag = "Talk is cheap";
}

class Derived extends Parent {
	// private String tag = "Show me your code";
}

public class HideTest {
	// ��װ���ԣ��ⲿ������Ҫ���set��get����
	public static void main(String[] args) {
		Derived d = new Derived();
		// ���ܷ��������װ����
		// System.out.println(d.tag);
		// ����ת������������Ա���
		System.out.println(((Parent) d).tag);
	}
}
