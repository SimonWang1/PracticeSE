package com.wsx.chapterdemo5_1;

class Parent{
	public String tag = "Talk is cheap";
}

class Derived extends Parent{
	private String tag = "Show me your code";
}

public class HideTest {
	public static void main(String[] args) {
		Derived d = new Derived();
		//���ܷ���˽��
//		System.out.println(d.tag);
		//����ת���������
		System.out.println(((Parent)d).tag);
	}
}
