package com.wsx.demo.collection;

import java.util.LinkedList;

public class StackTest {
	// ͨ��LinkedListʵ��ջ�Ƚ����
	LinkedList<Hero> heros = new LinkedList<>();
	public static void main(String[] args) {
		StackTest heroStack = new StackTest();
		for(int i = 0; i < 5; i++) {
			Hero h = new Hero("Hero name " + i);
			System.out.println("ѹ��Hero: " + h.name);
			heroStack.push(h);
		}
		Hero hs = heroStack.peek();
		System.out.println("�鿴ջ��Hero: " + hs.name);
		for(int i = 0; i < 5; i++) {
			Hero h = heroStack.pull();
			System.out.println("����Hero: " + h.name);
		}
	}
	
	// ѹջ
	public void push(Hero h) {
		// ��β��������
		heros.addLast(h);
	}
	
	// ��ջ
	public Hero pull() {
		// �Ƴ���β����
		return heros.removeLast();
	}
	
	// �鿴ջ��Ԫ��
	public Hero peek() {
		// ��ȡ��β����
		return heros.getLast();
	}
}
