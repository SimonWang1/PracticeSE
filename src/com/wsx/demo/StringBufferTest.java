package com.wsx.demo;

public class StringBufferTest {
	// ��������ָ���ڴ�
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Iphone");
		StringBuffer sb2 = new StringBuffer("Iphone");
		foo(sb);
		foo2(sb2);
		System.out.println(sb);
		System.out.println(sb2);
	}

	public static void foo(StringBuffer sb) {
		// ����ջ�ڴ洢��ͬһ�����ڴ��ַ��ָ��ͬһ�����ڴ棬ƴ�Ӳ���
		sb.append(10);
	}

	public static void foo2(StringBuffer sb) {
		// �����µĶ��ڴ棬����ջ�ڴ��ַָ��ͬλ�ã�ԭ�ж��ڴ治��
		// δ���õĶ��ڴ��Ϊ������GC����
		sb = new StringBuffer("Ipad");
	}
}
