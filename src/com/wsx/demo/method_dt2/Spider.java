package com.wsx.demo.method_dt2;

public class Spider extends Animal {
	// Spider����
	public static void main(String[] args) {
		Spider spider = new Spider();
		System.out.println("Spider legs: " + spider.legs);
		spider.eat();
	}
	
	// ���󷽷��е�eat����
	public void eat() {
		System.out.println("Spider eat fly");
	}

	public Spider() {
		// �������еĹ��������β�Ϊ����
		super(8);
	}
}
