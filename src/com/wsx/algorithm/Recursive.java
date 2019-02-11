package com.wsx.algorithm;

// �ݹ��㷨
public class Recursive {
	public static void main(String[] args) {
		System.out.println(func(10));
		System.out.println(func2(10));
	}

	// ��֪��ʼֵ��������
	// f(0) = 1, f(1) = 4, f(n + 2) = 2 * f(n + 1) + f(n)����f(10)
	public static int func(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 4;
		} else {
			return 2 * func(n - 1) + func(n - 2);
		}
	}

	// ��֪ĩβֵ������
	// f(20) = 1, f(21) = 4, f(n + 2) = 2 * f(n + 1�� + f(n)����f(10)
	// ת���ɣ�f(n) = f(n + 2) - 2 * f(n + 1)
	public static int func2(int n) {
		if (n == 20) {
			return 1;
		} else if (n == 21) {
			return 4;
		} else {
			return func2(n + 2) - 2 * func2(n + 1);
		}
	}
}
