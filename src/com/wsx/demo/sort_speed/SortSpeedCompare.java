package com.wsx.demo.sort_speed;

import java.util.Arrays;

public class SortSpeedCompare {
	public static void main(String[] args) {
		// ��ʼ�������
		int total = 40000;
		System.out.println("��ʼ��һ������Ϊ" + total + "������");
		int[] originalNums = new int[total];
		for(int i = 0; i < originalNums.length; i++) {
			originalNums[i] = (int)(Math.random() * total);
		}
		System.out.format("��ʼ�����%n��ʼ�㷨��������...%n");
		// �ӳ�ʼ���������и��Ƴ�������֤�����㷨���������鶼����ͬ��
		int[] useSort;
		useSort = Arrays.copyOf(originalNums, originalNums.length);
		int[] sortedNumbersByBubbleSort = performance(new BubbleSort(useSort), "ð��");
		useSort = Arrays.copyOf(originalNums, originalNums.length);
		int[] sortedNumbersBySelectionSort = performance(new SelectionSort(useSort), "ѡ��");
		useSort = Arrays.copyOf(originalNums, originalNums.length);
		int[] sortedNumbersByQuickSort = performance(new QuickSort(useSort), "����");
		System.out.println("�鿴���������Ƿ�Ϊ��ͬ����");
		System.out.println(sortedNumbersByBubbleSort);
		System.out.println(sortedNumbersBySelectionSort);
		System.out.println(sortedNumbersByQuickSort);
		System.out.println("�鿴�����������Ƿ���ͬ");
		System.out.println("�Ƚ� ð������ �� ѡ������ �Ľ����");
		System.out.println(Arrays.equals(sortedNumbersByBubbleSort, sortedNumbersBySelectionSort));
		System.out.println("�Ƚ� ѡ������ �� �������� �Ľ����");
		System.out.println(Arrays.equals(sortedNumbersBySelectionSort, sortedNumbersByQuickSort));
	}
	
	private static int[] performance(Sort algorithm, String type) {
		long start = System.currentTimeMillis();
		algorithm.sort();
		int sortNumbers[] = algorithm.values();
		long end = System.currentTimeMillis();
		System.out.format("%s����һ����ʱ %d ����%n", type, end - start);
		return sortNumbers;
	}
}
