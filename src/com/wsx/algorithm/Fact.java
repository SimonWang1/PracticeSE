package com.wsx.algorithm;

public class Fact {
	// �ݹ����ջ���׳�
	public static void main(String[] args) {
	// ջ���ڵ�������������ֵΪ1������1��ʼ�Թ���Ĳ������ν��еݹ��������������
		System.out.println(fact(5));
	}
	
	public static int fact(int x) {
		// ��������
		if(x == 1) {
			return 1;
		}
		// �ݹ�����
		else {
			return x * fact(x - 1);
		}
	}
}
