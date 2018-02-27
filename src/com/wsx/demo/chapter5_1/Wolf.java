package com.wsx.demo.chapter5_1;

class Creature {
	// ��Ӹ���
	public Creature() {
		System.out.println("Creature non constructor");
	}
}

class Animal extends Creature {
	// ����
	public Animal(String name) {
		System.out.println("Animal's one constructor, this name: " + name);
	}

	public Animal(String name, int age) {
		// ���ô��ι�������������ͬ����
		this(name);
		System.out.println("Animal's two constructor, age: " + age);
	}
}

public class Wolf extends Animal {
	// ����̳е���
	public static void main(String[] args) {
		// �����������ʱĬ�ϴ��ϵ������ε������и������Ӹ���Ĺ�����
		new Wolf();
	}

	public Wolf() {
		// �����๹��������ʽ���ø������ι�����
		super("Taro Grey", 3);
		System.out.println("Wolf non constructor");
	}
}