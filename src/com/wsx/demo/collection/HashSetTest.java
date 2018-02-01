package com.wsx.demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		// ������ɢ�б�ļ����������ظ������û��˳���̲߳���ȫ
		Set<String> names = new HashSet<>();
		names.add("gareen");
		System.out.println(names);
		// Set��Ԫ�ز����ظ���ֻ�ᱣ��һ��
		names.add("gareen");
		System.out.println(names);
		// Set��Ԫ�صĲ���˳���������
		Set<Integer> numbers = new HashSet<>();
		numbers.add(4);
		numbers.add(1);
		numbers.add(9);
		System.out.println(numbers);
		// ��������ʹ����ǿforѭ���������
		Set<Integer> nums = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			nums.add(i);
		}
		for(int i : nums) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		Iterator<Integer> iterator = nums.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
