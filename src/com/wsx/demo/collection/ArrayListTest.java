package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	// ArrayList: ���ڿ��������飬��ѯ�죬���ɾ�������̲߳���ȫ��
	public static void main(String[] args) {
		// ʹ��������������ڴ��˷Ѻͳ�������
		Hero[] heros = new Hero[5];
		heros[0] = new Hero("teemo");
		// �����������鳤�Ȼᱨ��
		// heros[20] = new Hero("gareen");
		for (Hero hero : heros) {
			System.out.println(hero);
		}
		// ����������ArrayList�����ڴ�Ŷ���
		List<String> hero = new ArrayList<>();
		hero.add("garen");
		System.out.println(hero.size());
		// ArrayList��Ԫ�ظ���������������
		hero.add("teemo");
		System.out.println(hero.size());
	}
}
