package com.wsx.demo.collection;

import java.util.ArrayList;

public class ArrayListTest1 {
	// ArrayList���÷���
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		// ArrayList: �������飬�Ա����鳤�ȿɱ䣬��ѯ�죬���ɾ�������̲߳���ȫ
		ArrayList heros = new ArrayList();
		// add(element): ��ArrayList���������5��Ԫ��
		for(int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		System.out.println(heros.toString());
		// add(index, element): ��ָ���������Ԫ��
		Hero specialHero = new Hero("special hero");
		heros.add(1, specialHero);
		System.out.println(heros.toString());
		// contains(element): �ж�һ�������Ƿ��������У���׼Ϊ�����Ƿ�ָ��ͬһ����ڴ棬���ǶԱ�����
		System.out.println(heros.contains(new Hero("special hero")));
		System.out.println(heros.contains(specialHero));
		// get(index): ��ȡָ��������Ԫ��
		System.out.println(heros.get(2));
		// ����Խ�籨��
//		System.out.println(heros.get(7));
		// indexOf(element): ��ȡԪ������
		System.out.println("Special hero's index: " + heros.indexOf(specialHero));
		// remove(index): ɾ������Ϊ0�Ͷ�������Ԫ��
		heros.remove(0);
		heros.remove(specialHero);
		System.out.println(heros.toString());
		// set(index, element): �޸�ָ��������Ԫ��
		heros.set(3, "last hero");
		System.out.println(heros.toString());
		// size(): ��ȡ��������
		System.out.println(heros.size());
		// clear(): �������
		heros.clear();
		System.out.println(heros.toString());
	}
}
