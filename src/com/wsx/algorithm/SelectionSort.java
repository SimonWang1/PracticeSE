package com.wsx.algorithm;

public class SelectionSort {
	// ѡ������
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		System.out.println("����ǰ������: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		// ��������
		for (int i = 0; i < intArray.length; i++) {
			// ������ʱ�����洢ѡ��������Ԫ��ֵ
			int index = i;
			int element = intArray[i];
			// �Ƚ�ѡ��Ԫ��֮���Ԫ��ֵ
			for (int j = i + 1; j < intArray.length; j++) {
				// ���ѡ��Ԫ��С�ں���
				if (intArray[j] < element) {
					// ����ӦԪ�ص�������ֵ�洢����ʱ������
					index = j;
					element = intArray[j];
				}
			}
			// ����Ԫ�أ��Ƚ���һ��
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
