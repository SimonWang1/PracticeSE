package com.wsx.demo.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	// HashSet, TreeSet, LinkedHashSet���˳��Ƚ�
	public static void main(String[] args) {
		// HashSet�����˳��
		Set<Integer> numSet1 = new HashSet<>();
		numSet1.add(888);
		numSet1.add(8);
		numSet1.add(8888);
		numSet1.add(88);
		System.out.println(numSet1);
		// TestSet�Զ���������
		Set<Integer> numSet2 = new TreeSet<>();
		numSet2.add(888);
		numSet2.add(8);
		numSet2.add(8888);
		numSet2.add(88);
		System.out.println(numSet2);
		// LinkedHashSet����˳�����
		Set<Integer> numSet3 = new LinkedHashSet<>();
		numSet3.add(888);
		numSet3.add(8);
		numSet3.add(8888);
		numSet3.add(88);
		System.out.println(numSet3);
	}
}
