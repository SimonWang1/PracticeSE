package com.wsx.algorithm;

public class BubbleSort {
	// ð������
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		// ����ѡȡ����Ԫ��
		for (int i = 0; i < intArray.length; i++) {
			// �Ƚ�ѡ��Ԫ��֮���Ԫ��ֵ
			for (int j = i + 1; j < intArray.length; j++) {
				// ���ѡ��Ԫ�ش��ں���
				if (intArray[i] > intArray[j]) {
					// ����Ԫ�أ��Ƚ���һ��
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		// ѭ������ð�ݺ������
		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}
}
