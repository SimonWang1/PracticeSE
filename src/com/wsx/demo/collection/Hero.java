package com.wsx.demo.collection;

public class Hero {
	// ʵ����
	public String name;
	public float hp;
	public int damage;
	// ��дtoString����
	public String toString() {
		return this.name;
	}
	
	// ���ӳ�ʼ��name�Ĺ��췽��
	public Hero(String name) {
		this.name = name;
	}
	
	public Hero() {
		
	}
}
