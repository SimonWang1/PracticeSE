package com.wsx.demo.chapter5_1;

class Base {
	// ����
	public String name;
	public double size;

	// �������ι�����
	public Base(String name, double size) {
		this.name = name;
		this.size = size;
	}
}

public class Sub extends Base {
	// super���ø��๹����
	public String color;

	public static void main(String[] args) {
		// �������󲢴�ӡ
		Sub sub = new Sub("mary", 14, "red");
		System.out.println(sub.name + "------" + sub.size + "------" + sub.color);
	}

	// ʹ��super��ʽ���ø��๹����������²�����Ϊ���ι�����
	public Sub(String name, double size, String color) {
		super(name, size);
		this.color = color;
	}
}
