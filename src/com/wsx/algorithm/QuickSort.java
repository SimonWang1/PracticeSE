package com.wsx.algorithm;

public class QuickSort {
	// ��������
	public static void main(String[] args) {
		int[] array = { 54, 6, 78, 34, 12, 45 };
		quickSort(array);
	}
	
	public static void quickSort(int[] a) {
		sort(a, 0, a.length - 1);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void sort(int[] a, int low, int high) {
		// ��ʼԪ������
		int start = low;
		// ����Ԫ������
		int end = high;
		// ��׼ֵ����
		int pivot = a[low];
		// �������飬�ҵ���׼ֵλ��
		while(end > start) {
			// ������ĩβ��ǰ�Ƚϣ�Ԫ��ֵ���ڻ�׼ֵ������Ԫ����������
			while(end > start && a[end] >= pivot)
				end--;
			// ���Ԫ��ֵ�Ȼ�׼ֵС������Ԫ��ֵ��˳��ִ��ѭ����
			if(a[end] <= pivot) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// �����鿪ͷ���Ƚϣ�Ԫ��ֵС�ڻ�׼ֵ����ʼԪ����������
			while(end > start && a[start] <= pivot)
				start++;
			// ���Ԫ��ֵ�Ȼ�׼ֵ�󣬽���Ԫ��ֵ�����ؿ�ͷִ��ѭ����
			if(a[start] >= pivot) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// ����ʱ��׼ֵ���С�ڻ�׼ֵ���Ҳ���ڻ�׼ֵ
		}
		// ǰ�벿�ֵݹ����
		if(start > low) 
			// ������ʼԪ����������׼ֵǰһ��Ԫ������
			sort(a, low, start - 1);
		// ��벿�ֵݹ����
		if(end < high) 
			// ��׼ֵ��һ��Ԫ���������������Ԫ������
			sort(a, end + 1, high);
	}
}
