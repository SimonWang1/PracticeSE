package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ComparableTest {
	public static void main(String[] args) {
		Random r = new Random();
		List<HeroB> heros = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			heros.add(new HeroB("Hero " + i, r.nextInt(100), r.nextInt(100)));
		}
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(heros);
		// HeroB��ʵ����Comparable�Ƚ���Ϣ��ʹ��Collections���򼴿�ʶ��
		Collections.sort(heros);
		System.out.println("�����˺������ļ��ϣ�");
		System.out.println(heros);
	}
}
