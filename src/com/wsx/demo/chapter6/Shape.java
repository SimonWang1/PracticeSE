package com.wsx.demo.chapter6;

public abstract class Shape {
	{
			System.out.println("����Shape�ĳ�ʼ����");
	}
	
	private String color;
	//��������ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
	//���巵����״�ĳ��󷽷�
	public abstract String getType();
	//����Shape���������ù������������ڴ���Shape����������ڱ��������
	public Shape() {
		
	}
	
	public Shape(String color) {
		System.out.println("ִ��Shape������...");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
