package com.wsx.demo.method_dt2;

public class Cat extends Animal implements Pet{
	// Catʵ����
	private String name;
	public static void main(String[] args) {
		Cat xh = new Cat();
		xh.setName("Mimi");
		System.out.printf("Cat name: " + xh.getName()
				+ "%nCat legs: " + xh.legs + "%n");
		xh.eat();
		xh.play();
		// ����������ͨ����
		xh.walk();
	}
	
	// �ӿ��е�set��get����
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// ���󷽷��е�eat����
	public void eat() {
		System.out.println("Cat eat fish");
	}

	// �ӿ��е�play����
	public void play() {
		System.out.println("Cat teaser stick");
	}
	
	public Cat() {
		// �������еĹ��������β�Ϊ����
		super(4);
	}
}
