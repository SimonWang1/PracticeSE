package com.wsx.demo.chapter5_1;

class Bird {
	// ����
	public void fly() {
		System.out.println("I can fly in the sky...");
	}
}

public class Ostrich extends Bird {
	// ������д
	public static void main(String[] args) {
		Ostrich os = new Ostrich();
		// ִ�����෽��
		os.fly();
	}

	public void fly() {
		System.out.println("I can only run on the ground...");
	}
}
