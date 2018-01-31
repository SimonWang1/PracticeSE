package com.wsx.demo.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		// HashMap: ɢ�б��ֵ����ʽ����Ψһ����ѯ���ɾ���ٶȿ죬�̲߳���ȫ
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("adc", "physical hero");
		dictionary.put("apc", "magic hero");
		dictionary.put("t", "tank");
		System.out.println(dictionary.get("t"));
		Map<String, Hero> heroMap = new HashMap<>();
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
		// �洢����ͬ�����ݣ�ֵ�ᱻ����
		heroMap.put("gareen", new Hero("gareen2"));
		System.out.println(heroMap);
		// clear(): ���map
		heroMap.clear();
		Hero heroGareen = new Hero("gareen");
		// ֻҪ����ͬ�����Դ洢��ֵͬ���洢��˳��
		heroMap.put("hero1", heroGareen);
		heroMap.put("hero2", heroGareen);
		System.out.println(heroMap);
	}
}
