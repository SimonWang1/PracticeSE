package com.wsx.demo.chapter5_1;

class Animal1{
	private void beat() {
		System.out.println("��������");
	}
	
	public void breath() {
		beat();
		System.out.println("����������������...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath()����
class Bird1 extends Animal1{
	public void fly() {
		System.out.println("����������ɷ���...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath()����
class Wolf1 extends Animal1{
	public void run() {
		System.out.println("����½���Ͽ��ٱ���...");
	}
}

public class InheritTest {
	public static void main(String[] args) {
		//ʹ�ü̳����������ͬʱӵ�и����breath������ʵ�ִ��븴�õ���Ҫ�ֶ�
		Bird1 b = new Bird1();
		b.breath();
		b.fly();
		Wolf1 w = new Wolf1();
		w.breath();
		w.run();
	}
}
