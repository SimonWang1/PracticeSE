package com.wsx.demo.collection;

import java.util.*;

public class CollectionCompare {
	// List��Set�������
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(3);
		numList.add(9);
		numList.add(6);
		System.out.println("List�����˳��");
		System.out.println(numList);
		numList.add(9);
		System.out.println("List��������ظ�ֵ��");
		System.out.println(numList);
		Set<Integer> numSet = new HashSet<>();
		numSet.add(3);
		numSet.add(9);
		numSet.add(6);
		System.out.println("Set�����˳��");
		System.out.println(numSet);
		numSet.add(6);
		System.out.println("Set��������ظ�ֵ��");
		System.out.println(numSet);
	}
}
