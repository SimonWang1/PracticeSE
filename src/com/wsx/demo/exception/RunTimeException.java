package com.wsx.demo.exception;

public class RunTimeException {
	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		// ����ʱ�쳣�����������������账����쳣�������쳣���ڿ���̨��ӡ�쳣��Ϣ
		// ArithmeticException: ��������Ϊ��
		int j = 5 / 0;
		// ArrayIndexOutOfBoundsException: �±�Խ���쳣
		int[] k = new int[5];
		k[10] = 10;
		// NullPointerException: ��ָ���쳣
		String str = null;
		str.length();
	}
}
