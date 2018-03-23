package com.wsx.demo.jdbc;

public class Item implements Comparable<Item>{
	// �����߼���ORMʵ����
	public int id;
	public String name;
	public int price;
	
	// Ч������
	public void effect() {
		System.out.println("ʹ����Ʒ�Ժ󣬲�����ӦЧ��");
	}
	
	// �ṩ����false����
	public boolean disposable() {
		return false;
	}
	
	// ��д�ȽϷ���
	@Override
	public int compareTo(Item o) {
		return o.price - price;
	}

	// ��дtoString���������ӡ�����
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]\r\n";
	}
	
	public Item(String name) {
		this.name = name;
	}
	
	public Item() {
		
	}
}
