package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		Hero[] heros = new Hero[5];
		// ʹ��������������ڴ��˷Ѻͳ������ƣ������������鳤�Ȼᱨ��
		heros[0] = new Hero("teemo");
//		heros[20] = new Hero("gareen");
		for(Hero hero : heros) {
			System.out.println(hero);
		}
		// ����������ArrayList�����ڴ�Ŷ���
		List<String> hero = new ArrayList<>();
		hero.add("garren");
		System.out.println(hero.size());
		// ArrayList��Ԫ�ظ���������������
		hero.add("teemo");
		System.out.println(hero.size());
	}
}
