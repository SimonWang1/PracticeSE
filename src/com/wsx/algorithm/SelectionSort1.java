package com.wsx.algorithm;

public class SelectionSort1 {
	//ѡ������
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		System.out.println("����ǰ������: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		//������������ѡȡ����Ԫ��
		for (int i = 0; i < intArray.length; i++) {
			//������������Ԫ�ص�������Ԫ��ֵ
			int index = i;
			int element = intArray[i];
			//��������������ѡ��֮���Ԫ��ֵ���бȽ�
			for (int j = i + 1; j < intArray.length; j++) {
				//�ҵ�����Ԫ�ص���Сֵ������ӦԪ�ص�������ֵ�洢����ѭ��������
				if (intArray[j] < element) {
					index = j;
					element = intArray[j];
				}
			}
			//��������˳�򽻻�������Сֵ
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
