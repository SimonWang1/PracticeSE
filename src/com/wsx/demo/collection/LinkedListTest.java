package com.wsx.demo.collection;

import java.util.LinkedList;

public class LinkedListTest {
	// LinkedList: ����˫������Deque����ѯ�������ɾ���죬�̲߳���ȫ
	public static void main(String[] args) {
		LinkedList<Hero> heros = new LinkedList<>();
		// ���Է������ͷ����β����������
		// β����������
		heros.addLast(new Hero("hero1"));
		heros.addLast(new Hero("hero2"));
		heros.addLast(new Hero("hero3"));
		System.out.println(heros);
		// ͷ����������
		heros.addFirst(new Hero("hero0"));
		// ˫������ǰ��洢��һ��Ԫ�صĵ�ַ
		System.out.println(heros);
		// �鿴��ǰ����
		System.out.println(heros.getFirst());
		// �鿴�������
		System.out.println(heros.getLast());
		// �Ƴ���ǰ����
		heros.removeFirst();
		// �Ƴ��������
		heros.removeLast();
		System.out.println(heros);
	}
}
