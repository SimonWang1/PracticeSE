package com.wsx.demo.method_dt2;

public abstract class Animal {
	// ���������
	// ����protected���������ڱ�������д
	protected int legs;

	// ���󷽷����ڱ���д
	public abstract void eat();

	public void walk() {
		System.out.println("used " + this.legs + " legs walking");
	}

	// ����protected�Ĺ��������ڱ����������д
	protected Animal(int legs) {
		this.legs = legs;
	}
}
