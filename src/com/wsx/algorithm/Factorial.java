package com.wsx.algorithm;

import java.util.Scanner;

// �ݹ����ջ
public class Factorial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("������һ����������");
			int num = scan.nextInt();
			System.out.println("��ͨ�׳�ֵΪ��" + mul(num));
			System.out.println("�ݹ�׳�ֵΪ��" + mul(num));
			/*
				��������5��ջ�ڴ�ݹ���ù���
				5 * mul1(4)
				4 * mul1(3)
				3 * mul1(2)
				2 * mul1(1)
				2 * 1 = 2	-->	���������������ʱջ��ֵΪ1
				3 * 2 = 6
				4 * 6 = 24
				5 * 24 = 120
			*/
		}
	}
	
	// ��ͨ�׳�
	public static int mul(int i) {
		int mul = 1;
		for(int j = 1; j <= i; j++) {
			mul *= j;
		}
		return mul;
	}
	
	// �ݹ�׳�
	public static int mul1(int i) {
		// ��������
		if(i == 1) {
			return 1;
		}
		// �ݹ�����
		else {
			// ջ���ڵ�������������ֵΪ1������1��ʼ��ջ�й���Ĳ������ν׳�
			return i * mul1(i - 1);
		}
	}
}
