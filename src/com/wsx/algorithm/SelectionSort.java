package com.wsx.algorithm;

// ѡ������
public class SelectionSort {
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		System.out.println("����ǰ������: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		// ���α�������
		for (int i = 0; i < intArray.length; i++) {
			// ������ʱ�����洢��ѭ��Ԫ�ص�������Ԫ��ֵ
			int index = i;
			int element = intArray[i];
			// ���α�����ѭ��Ԫ��֮���Ԫ��
			for (int j = i + 1; j < intArray.length; j++) {
				// ��������Ԫ�رȽ�С
				if (intArray[j] < element) {
					// ����ӦԪ�ص�������ֵ�洢����ʱ������
					index = j;
					element = intArray[j];
				}
			}
			// ������СԪ�أ��Ƚ���һ��
			int temp = intArray[i];
			intArray[i] = intArray[index];
			intArray[index] = temp;
		}
		System.out.println("����������: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
