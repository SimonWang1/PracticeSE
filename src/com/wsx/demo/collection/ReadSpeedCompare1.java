package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadSpeedCompare1 {
	// �Ƚ�List��Map��ѯ�ٶ�
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		System.out.println("List��ʼ����ʼ...");
		for(int i = 0; i < 2000000; i++) {
			heros.add(new Hero("Hero " + i));
		}
		System.out.println("List��ʼ������");
		for(int i = 0; i < 5; i++) {
			Collections.shuffle(heros);
			String target = "Hero 1000000";
			long start = System.currentTimeMillis();
			for(Hero hero : heros) {
				if(hero.name.equals(target)) {
					System.out.format("�ҵ���%s��%n", target);
					break;
				}
			}
			long end = System.currentTimeMillis();
			System.out.format("Listʹ��%d ���� %n", end - start);		
		}
		System.out.println("------------------");
		Map<String, Hero> heroMap = new HashMap<>();
		System.out.println("Map��ʼ����ʼ...");
		for(int i = 0; i < 2000000; i++) {
			Hero h = new Hero("Hero " + i);
			heroMap.put(h.name, h);
		}
		System.out.println("Map��ʼ������");
		for(int i = 0; i < 5; i++) {
			long start = System.currentTimeMillis();
			Hero target = heroMap.get("Hero 1000000");
			System.out.format("�ҵ���%s��%n", target.name);
			long end = System.currentTimeMillis();
			System.out.format("Mapʹ��%d ����%n", end - start);
		}
	}
}
