package com.wsx.demo.chapter6;

public class ShapeTest {
	public static void main(String[] args) {
		Shape triangle = new ShapeTriangle("Black", 3, 4, 5);
		Shape circle = new ShapeCircle("Yellow", 3);
		System.out.println("�����Σ�" + triangle.getType());
		System.out.println("�ܳ�ȡ����" + Math.round(triangle.calPerimeter()));
		System.out.println("Բ�Σ�" + circle.getType());
		System.out.println("�ܳ�ȡ����" + Math.round(circle.calPerimeter()));
	}
}
