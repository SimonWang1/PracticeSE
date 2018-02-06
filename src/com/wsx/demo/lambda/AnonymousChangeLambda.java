package com.wsx.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnonymousChangeLambda {
	// ������ת����Lambda���ʽ����
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			heros.add(new Hero("Hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(heros);
		System.out.println("ʹ��������ķ�ʽ��ɸѡ��hp > 100, damage < 50��Ӣ�ۣ�");
		// ����������д��
		System.out.println("Function1: ");
		HeroChecker c1 = new HeroChecker() {
			@Override
			public boolean test(Hero h) {
				return (h.hp > 100 && h.damage < 50);
			}
		};
		filter(heros, c1);
		// ʡ�Դ���������̺���д��Ȩ�����η��������������͡�������
		// �������������壬�ڲ������ͺ���ӷ��� "->"
		System.out.println("Function2: ");
		HeroChecker c2 = (Hero h) -> {
			return h.hp > 100 && h.damage < 50;
		};
		filter(heros, c2);
		// ȥ�� "{}" �� return 
		System.out.println("Function3: ");
		HeroChecker c3 = (Hero h) -> h.hp > 100 && h.damage < 50;
		filter(heros, c3);
		// ȥ���������������� "()" ��ֻ����һ������ʱ����ȥ����
		System.out.println("Function4: ");
		HeroChecker c4 = h -> h.hp > 100 && h.damage < 50;
		filter(heros, c4);
		// ���÷���ʱֱ��ʹ��Lambda���ʽ��������
		System.out.println("Function5: ");
		filter(heros, h -> h.hp > 100 && h.damage < 50);
	}
	
	private static void filter(List<Hero> heros, HeroChecker checker) {
		for(Hero hero : heros) {
			if(checker.test(hero))
				System.out.print(hero);
		}
	}
}
