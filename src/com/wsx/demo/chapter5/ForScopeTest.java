package com.wsx.demo.chapter5;

public class ForScopeTest {
	// Forѭ��������Χ
	// ����ȫ�ֱ���i
	static int i;

	public static void main(String[] args) {
		for (i = 0; i < 1; i++) {
			System.out.println("���Ա����Ϊȫ�ֱ������ڶ��ж��壬GC���գ�Ӱ������");
		}
		// ���������ֲ�����j
		int j;
		for (j = 0; j < 2; j++) {
			System.out.println("�����ֲ�������ջ�ж��壬������������գ����ܽϺ�");
		}
		// ���������ֲ�����k
		for (int k = 0; k < 3; k++) {
			System.out.println("�����ֲ�������ջ�ж��壬����k��ѭ��������Ч�����Ͽ����淶");
		}
	}
}
