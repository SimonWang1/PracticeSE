package com.wsx.demo.chapter5_1;

class Fruit {
	// ����
	public double weight;

	public void info() {
		System.out.println("I'm a fruit! my weight is " + weight + "g");
	}
}

public class Apple extends Fruit {
	// ����ͨ��extends�ؼ��ֵ��ø�������Ժͷ���
	public static void main(String[] args) {
		Apple a = new Apple();
		a.weight = 45;
		a.info();
	}
}
