package com.wsx.algorithm;

public class CutDown {
	// �򵥵ݹ�
	public static void main(String[] args) {
		cutDown(3);
	}

	public static int cutDown(int i) {
		System.out.println(i);
		// ��������
		if (i <= 0) {
			return i;
		}
		// �ݹ�����
		else {
			cutDown(i - 1);
			return i;
		}
	}
}
