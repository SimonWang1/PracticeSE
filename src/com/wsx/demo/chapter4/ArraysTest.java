package com.wsx.demo.chapter4;

import java.util.Arrays;

public class ArraysTest {
	// Arrays����API
	public static void main(String[] args) {
		// ����һ������
		int[] a = { 3, 4, 5, 6 };
		int[] a2 = { 3, 4, 5, 6 };
		// static equals(Array1, Array2): �ж�Ԫ���Ƿ����
		System.out.println("a�����a2�����Ƿ���ȣ�" + Arrays.equals(a, a2));
		// static copyOf(Array, length): ��������a����������b
		int[] b = Arrays.copyOf(a, 6);
		System.out.println("a�����b�����Ƿ���ȣ�" + Arrays.equals(a, b));
		// static toString(Array): �������b��Ԫ��
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
		// static fill(Array, start, end, element): ��b����ĵ�[2,4)��ֵΪ1
		Arrays.fill(b, 2, 4, 1);
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
		// static sort(Array): ����
		Arrays.sort(b);
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
	}
}
