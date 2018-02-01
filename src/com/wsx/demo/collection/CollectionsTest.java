package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
		// Collections�Ǽ��ϵĹ����࣬����Arrays������Ĺ�����
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			nums.add(i);
		}
		System.out.println("�����е�Ԫ�أ�");
		System.out.println(nums);
		// reverse(list): ��ת
		Collections.reverse(nums);;
		System.out.println("��ת���Ԫ�أ�");
		System.out.println(nums);
		// shuffle(list): ����
		Collections.shuffle(nums);
		System.out.println("�������Ԫ�أ�");
		System.out.println(nums);
		// sort(list): ����
		Collections.sort(nums);
		System.out.println("������Ԫ�أ�");
		System.out.println(nums);
		// swap(list, index, index): ����
		Collections.swap(nums, 0, 5);
		System.out.println("�������Ԫ�أ�");
		System.out.println(nums);
		// rotate(list, distance): ����
		Collections.rotate(nums, 2);
		System.out.println("�������Ԫ�أ�");
		System.out.println(nums);
		// synchronizedList(list): �̰߳�ȫ��
		System.out.println("�����̰߳�ȫ��Listת�����̰߳�ȫ��List��");
		List<Integer> synchronizedNums = Collections.synchronizedList(nums);
		System.out.println(synchronizedNums);
	}
}
