package com.wsx.demo.chapter6;

public abstract class Shape {
	// ��״������
	{
		System.out.println("����Shape�ĳ�ʼ����");
	}

	private String color;

	// �ܳ����󷽷�
	public abstract double calPerimeter();

	// ��״���󷽷�
	public abstract String getType();
	
	// color set��get����
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	// ���ι�����
	public Shape(String color) {
		System.out.println("ִ��Shape������...");
		this.color = color;
	}

	public Shape() {
		
	}
}
