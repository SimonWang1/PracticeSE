package com.wsx.demo.chapter5_1;

public class ConstructorOverload {
	// ��������д
	public String name;
	public int count;

	public static void main(String[] args) {
		// ͨ���޲ι�������������
		ConstructorOverload co1 = new ConstructorOverload();
		ConstructorOverload co2 = new ConstructorOverload("�������������ӵ�", 233);
		System.out.println(co1.name + "  " + co1.count);
		System.out.println(co2.name + "  " + co2.count);
	}

	// �ṩ�������ι����������ж����ʼ��
	public ConstructorOverload(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public ConstructorOverload() {
	}
}
