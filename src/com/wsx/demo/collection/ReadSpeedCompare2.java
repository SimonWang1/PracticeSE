package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadSpeedCompare2 {
	// ArrayList��LinkedList�ٶȱȽ�
	public static void main(String[] args) {
		List<Integer> list;
		list = new ArrayList<>();
		insertFirst(list, "ArrayList");
		modify(list, "ArrayList");
		System.out.println("-----------------------------------------------");
		list = new LinkedList<>();
		insertFirst(list, "LinkedList");
		modify(list, "LinkedList");
	}
	
	private static void insertFirst(List<Integer> l, String type) {
		int total = 1000 * 100;
		final int number = 5;
		long start = System.currentTimeMillis();
		for(int i = 0; i < total; i++) {
			l.add(0, number);
		}
		long end = System.currentTimeMillis();
		System.out.format("��%s ͬһ��������%d �����ݣ���ʱ%d ����%n", type, total, end - start);
	}
	
	private static void modify(List<Integer> l, String type) {
		int total = 1000* 100;
		int index = total / 2;
		final int number = 5;
		// ��ʼ������
		for(int i = 0; i < total; i++) {
			l.add(number);
		}
		long start = System.currentTimeMillis();
		for(int i = 0; i < total; i++) {
			int n = l.get(index);
			n++;
			l.set(index, n);
		}
		long end = System.currentTimeMillis();
		System.out.format("%s �ܳ�����%d����λ����%d �����ݣ�ȡ����+1�ٷŻ�ȥ%n"
				+ "�ظ�%d �飬�ܹ���ʱ%d ����%n", type, total, index, total, end - start);
	}
}
