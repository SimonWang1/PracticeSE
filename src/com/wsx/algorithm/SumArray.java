package com.wsx.algorithm;

// ����Ԫ�����
public class SumArray {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		System.out.println(sumArray1(intArray));
		System.out.println(sumArray2(intArray, intArray.length));
	}
	
	// ��ͨʵ��
	public static int sumArray1(int[] intArray) {
		int total = 0;
		for (int j : intArray) {
			total += j;
		}
		return total;
	}
	
	/**
		ջ�ڴ�ݹ���ù���
		5 + sumArray2(intArray, 4)
		4 + sumArray2(intArray, 3)
		3 + sumArray2(intArray, 2)
		2 + sumArray2(intArray, 1)
		1 + sumArray2(intArray, 0)	-- �������������ջ��ֵΪ0���������أ����ε��ù��𷽷�
		1 + 0 = 1
		2 + 1 = 3
		3 + 3 = 6
		4 + 6 = 10
		5 + 10 = 15
	 */
	// �ݹ�ʵ��
	public static int sumArray2(int[] intArray, int len) {
		// ��������
		if (len == 0) {
			return 0;
		}
		// �ݹ�����
		else {
			return intArray[len - 1] + sumArray2(intArray, len - 1);
		}
	}
}
