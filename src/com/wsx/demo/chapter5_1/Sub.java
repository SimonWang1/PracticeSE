package com.wsx.demo.chapter5_1;

class Base{
	// super���ø��๹����
	public String name;
	public double size;
	//�������ι�����
	public Base(String name, double size) {
		this.name = name;
		this.size = size;
	}
}

public class Sub extends Base{
	public static void main(String[] args) {
		//�������󲢴�ӡ
		Sub sub = new Sub("mary", 14, "red");
		System.out.println(sub.name + "------" + sub.size + "------" + sub.color);
	}
	
	public String color;
	//ʹ��super��ʾ���ø��๹��������������Գ�Ϊ���ι�����
	public Sub(String name, double size, String color) {
		super(name, size);
		this.color = color;
	}
}
