package com.wsx.algorithm;

public class SumArray {
	public static void main(String[] args) {
		// �������
		int[] intArray= {1, 2, 3, 4, 5};
		System.out.println(sumArray1(intArray));
		System.out.println(sumArray2(intArray, intArray.length));
	}
	
	// ��ͨʵ��
	public static int sumArray1(int[] intArray) {
		int total = 0;
		for(int j : intArray) {
			total += j;
		}
		return total;
	}
	
	// �ݹ�ʵ��
	public static int sumArray2(int[] intArray, int len) {
		// ��������
		if(len == 1) {
			return intArray[0];
		}
		// �ݹ�����
		else {
			return intArray[len - 1] + sumArray2(intArray, --len);
		}
	}
}
