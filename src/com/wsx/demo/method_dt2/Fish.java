package com.wsx.demo.method_dt2;

public class Fish extends Animal implements Pet{
	// Fishʵ����
	private String name;
	public static void main(String[] args) {
		Fish gf = new Fish();
		gf.setName("Golden fish");
		System.out.printf("Fish name: " + gf.getName()
				+ "%nFish leg: " + gf.legs + "%n");
		gf.eat();
		gf.play();
		// ����������ͨ����
		gf.walk();
	}
	
	// �ӿ��е�set��get����
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void walk() {
		System.out.println("Fish swimming, no legs");
	}
	
	// ���󷽷��е�eat����
	public void eat() {
		System.out.println("Eat fish food");
	}
	
	// �ӿ��е�play����
	public void play() {
		System.out.println("Free swimming");
	}
	
	public Fish() {
		// �������еĹ��������β�Ϊ����
		super(0);
	}
}
