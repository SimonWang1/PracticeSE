package com.wsx.algorithm;

// �򵥵ݹ�
public class CutDown {
	public static void main(String[] args) {
		System.out.println("���շ��أ�" + cutDown(5));
	}

	public static int cutDown(int i) {
		// ��������
		if (i <= 1) {
			return 1;
		}
		// �ݹ�����
		else {
			System.out.println(cutDown(i - 1));
			return i;
		}
	}
}
