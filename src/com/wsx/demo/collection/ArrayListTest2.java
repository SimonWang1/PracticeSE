package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		// ��ArrayList�����5��Ԫ��
		for(int i = 0; i < 5; i++) {
			heros.add(new Hero("Hero name " + i));
		}
		// forѭ������
		System.out.println("--------forѭ��--------");
		for(int i = 0; i < heros.size(); i++) {
			System.out.println(heros.get(i));
		}
		// for eachѭ������
		System.out.println("--------foreach-------");
		for(Hero hero : heros) {
			System.out.println(hero);
		}
		// ������ѭ������
		System.out.println("--------������--------");
		Iterator<Hero> it = heros.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
