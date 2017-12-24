package com.wsx.chapterdemo5_1;

class Creature{
	public Creature() {
		System.out.println("Creature non construtor");
	}
}

class Animal extends Creature{
	public Animal(String name) {
		System.out.println("Animal's one constructor, this name: " + name);
	}
	
	public Animal(String name, int age) {
		//ʹ��this����ͬһ�����ع�����
		this(name);
		System.out.println("Animal two construtor, age: " + age);
	}
}

public class Wolf extends Animal{
	public static void main(String[] args) {
		new Wolf();
	}
	
	public Wolf() {
		//��ʾ�������ι�����
		super("Taro Grey", 3);
		System.out.println("Wolf non constructor");
	}
}
