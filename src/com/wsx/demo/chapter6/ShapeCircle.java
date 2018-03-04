package com.wsx.demo.chapter6;

public class ShapeCircle extends Shape {
	// Բ���ܳ�
	// ��װ�뾶
	private double radius;

	// �뾶��ֵ
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// �����ܳ�
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	// ��״
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getColor() + " Circle";
	}
	
	// ���ε���
	public ShapeCircle(String color, double radius) {
		super(color);
		this.setRadius(radius);
	}
}
