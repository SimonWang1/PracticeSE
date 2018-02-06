package com.wsx.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaTest {
	// ʹ��Lambda���ʽ�������Ͻ��бȽ�
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			heros.add(new Hero("Hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		System.out.println("��ʼ���󼯺ϣ�");
		System.out.println(heros);
		System.out.println("ʹ��Lambda���ʽ��ɸѡ��hp > 100, damage < 50��Ӣ��");
		filter(heros, h -> h.hp > 100 && h.damage < 50);
	}
	
	private static void filter(List<Hero> heros, HeroChecker checker) {
		for(Hero hero : heros) {
			if(checker.test(hero)) {
				System.out.print(hero);
			}
		}
	}
}
