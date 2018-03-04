package com.wsx.demo.chapter6;

public class ShapeTriangle extends Shape {
	// �������ܳ�
	// ��װ�߳�
	private double a;
	private double b;
	private double c;

	// �߳���ֵ
	public void setSides(double a, double b, double c) {
		if (a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// �����ܳ�
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

	// ��״
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getColor() + " Triangle";
	}
	
	// ���ε���
	public ShapeTriangle(String color, double a, double b, double c) {
		super(color);
		this.setSides(a, b, c);
	}
}

