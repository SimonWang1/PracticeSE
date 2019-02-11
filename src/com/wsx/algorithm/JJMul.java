package com.wsx.algorithm;

// �˷���ݹ�ʵ��
public class JJMul {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		JJMulDG(9);
	}
	
	public static void JJMulDG(int i) {
		// ��������
		if(i == 1) {
			System.out.println("1*1=1");
		}
		// �ݹ�����
		else {
			JJMulDG(i - 1);
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
