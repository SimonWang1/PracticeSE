package com.wsx.algorithm;

public class CutDown {
	// �򵥵ݹ�
	public static void main(String[] args) {
		cutDown(5);
	}

	public static int cutDown(int i) {
		// ��������
		if(i <= 1) {
			return 1;
		}
		// �ݹ�����
		else {
			System.out.println(cutDown(i - 1));
			return i;
		}
	}
}
