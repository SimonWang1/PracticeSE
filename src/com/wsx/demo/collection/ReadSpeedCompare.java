package com.wsx.demo.collection;

import java.util.*;

public class ReadSpeedCompare {
	public static void main(String[] args) {
		List<Hero> hs = new ArrayList<>();
		System.out.println("��ʼ����ʼ����");
		for(int i = 0; i < 3000000; i++) {
			Hero h = new Hero("Hero-" + random());
			hs.add(h);
		}
		// ����Map��Hero name��ͬʱ���½�ArrayList�洢��value�����ڼ�¼����
		Map<String, List<Hero>> heroMap = new HashMap<>();
		for(Hero h : hs) {
			List<Hero> list = heroMap.get(h.name);
			if(list == null) {
				list = new ArrayList<>();
				heroMap.put(h.name, list);
			}
			list.add(h);
		}
		System.out.format("��ʼ������%n��ʼ����%n");
		findByArrayList(hs);
		System.out.println();
		findByLinkedList(hs);
		System.out.println();
		findByMap(heroMap);
	}
	
	private static List<Hero> findByMap(Map<String, List<Hero>> m){
		long start = System.currentTimeMillis();
		List<Hero> result = m.get("Hero-5555");
		long end = System.currentTimeMillis();
		System.out.format("ͨ��map���ң�һ���ҵ�%d ��Ӣ�ۣ���ʱ%d ����", result.size(), end - start);
		return result;
	}
	
	private static List<Hero> findByArrayList(List<Hero> hs){
		long start = System.currentTimeMillis();
		List<Hero> result = new ArrayList<>();
		for(Hero h : hs) {
			if(h.name.equals("Hero-5555")) {
				result.add(h);	
			}
		}
		long end = System.currentTimeMillis();
		System.out.format("ͨ��ArrayList���ң�һ���ҵ�%d ��Ӣ�ۣ���ʱ%d ����", result.size(), end - start);
		return result;
	}
	
	private static List<Hero> findByLinkedList(List<Hero> hs){
		long start = System.currentTimeMillis();
		List<Hero> result = new LinkedList<>();
		for(Hero h : hs) {
			if(h.name.equals("Hero-5555")) {
				result.add(h);
			}
		}
		long end = System.currentTimeMillis();
		System.out.format("ͨ��LinkedList���ң�һ���ҵ�%d ��Ӣ�ۣ���ʱ%d ����", result.size(),end - start);
		return result;
	}
	
	private static int random() {
		int random = (int) (Math.random() * 9000) + 1000;
		return random;
	}
}
