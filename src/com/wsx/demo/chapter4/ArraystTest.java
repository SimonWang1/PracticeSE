package com.wsx.demo.chapter4;

import java.util.Arrays;

public class ArraystTest {
	public static void main(String[] args){
		//����һ������
		int[] a = {3, 4, 5, 6};
		int[] a2 = {3, 4, 5, 6};
		//�ж�Ԫ���Ƿ����
		System.out.println("a�����a2�����Ƿ���ȣ�" + Arrays.equals(a, a2));
		//��������a����������b
		int[] b = Arrays.copyOf(a, 6);
		System.out.println("a�����b�����Ƿ���ȣ�" + Arrays.equals(a, b));
		//�������b��Ԫ��
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
		//��b����ĵ�[2,4)��ֵΪ1
		Arrays.fill(b, 2, 4, 1);
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
	}
}
