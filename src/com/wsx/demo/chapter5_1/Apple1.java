package com.wsx.demo.chapter5_1;

public class Apple1 {
	// this����
	public String name;
	public String color;
	public double weight;

	// ���������Ĺ�����
	public Apple1(String name, String color) {
		this.name = name;
		this.color = color;
	}

	// ���������Ĺ�����
	public Apple1(String name, String color, double weight) {
		// ͨ��this�������ع�������ʼ������
		this(name, color);
		// ����this��ʾ��ǰ����
		this.weight = weight;
	}

	public Apple1() {
	}
}
