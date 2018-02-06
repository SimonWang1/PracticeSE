package com.wsx.demo.collection;

import java.util.LinkedList;

public class HeroStack {
	// ��������ע�����ͣ�ͨ��LinkedListʵ��ջЧ��
	LinkedList<Hero> heros = new LinkedList<>();
	public static void main(String[] args) {
		HeroStack heroStack = new HeroStack();
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
	
	public void push(Hero h) {
		heros.addLast(h);
	}
	
	public Hero pull() {
		return heros.removeLast();
	}
	
	public Hero peek() {
		return heros.getLast();
	}
}
