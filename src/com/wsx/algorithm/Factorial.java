package com.wsx.algorithm;

import java.util.Scanner;

public class Factorial {
	// �ݹ����ջ
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("������һ����������");
			int i3 = scan.nextInt();
			System.out.println("��ͨ�׳�ֵΪ��" + mul(i3));
			System.out.println("�ݹ�׳�ֵΪ��" + mul(i3));
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
