package com.wsx.chapterdemo5_1;

public class Apple1 {
	public String name;
	public String color;
	public double weight;
	public Apple1() {
	}
	//���������Ĺ�����
	public Apple1(String name, String color) {
		this.name = name;
		this.color = color;
	}
	//���������Ĺ�����
	public Apple1(String name, String color, double weight) {
		//ͨ��this������һ�����صĹ�������ʼ������
		this(name, color);
		//����this��ʾ��������ʼ����Java����
		this.weight = weight;
	}
}
