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
		// ��׼ֵ
		int pivot = a[low];
		// ���������ҵ�pivotλ��
		while(end > start) {
			// ������ĩβ��ǰ�Ƚϣ�endԪ��ֵ����pivot��end����
			while(end > start && a[end] >= pivot)
				end--;
			// ��endԪ��ֵС��pivot
			if(a[end] <= pivot) {
				// ��������ʱstartԪ��ֵ����pivot
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// �����鿪ͷ���Ƚϣ�startԪ��ֵС��pivot��start����
			while(end > start && a[start] <= pivot)
				start++;
			// ��startԪ��ֵ����pivot
			if(a[start] >= pivot) {
				// ��������ʱendԪ��ֵ����pivot
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// ѭ������ʱstart, end����pivot index��pivot���ΪСֵ���Ҳ�Ϊ��ֵ
		}
		// ���ݹ���ã���������Ϊstart�����������
		if(start > low) 
			// �ݹ���������Χ��[0, pivot index - 1]
			sort(a, low, start - 1);
		// �Ҳ�ݹ���ã���������Ϊend���������Ҳ�
		if(end < high) 
			// �ݹ���������Χ��[pivot index + 1, array.length - 1]
			sort(a, end + 1, high);
	}
}
