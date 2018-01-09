package com.wsx.demo;

public abstract class Animal {
	protected int legs;
	public abstract void eat();
	
	public void walk() {
		System.out.println("ʹ��" + this.legs + "������");
	}
	
	protected Animal(int legs) {
		this.legs = legs;
	}
}
