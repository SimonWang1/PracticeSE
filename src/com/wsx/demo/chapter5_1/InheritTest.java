package com.wsx.demo.chapter5_1;

class Animal1 {
	// ����
	private void beat() {
		System.out.println("��������");
	}

	public void breath() {
		// �����ڲ����÷�װ����
		beat();
		System.out.println("����������������...");
	}
}

class Bird1 extends Animal1 {
	// �̳�Animal��ֱ�Ӹ��ø����breath()����
	public void fly() {
		System.out.println("����������ɷ���...");
	}
}

class Wolf1 extends Animal1 {
	// �̳�Animal��ֱ�Ӹ��ø����breath()����
	public void run() {
		System.out.println("����½���Ͽ��ٱ���...");
	}
}

public class InheritTest {
	// ʹ�ü̳�������ͬʱӵ�и����breath������ʵ�ִ��븴�õ���Ҫ�ֶ�
	public static void main(String[] args) {
		// ��������ָ���������ʱ������̬�����ܷ����������еķ���
		Animal1 bee = new Bird1();
		bee.breath();
		System.out.println("---------------------");
		// ��������ָ���������ʱû�ж�̬�����Է����������з���
		Bird1 bird = new Bird1();
		bird.breath();
		bird.fly();
		Wolf1 grey = new Wolf1();
		grey.breath();
		grey.run();
	}
}
