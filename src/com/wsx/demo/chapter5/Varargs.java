package com.wsx.demo.chapter5;

public class Varargs {
	public static void main(String[] args) {
		//����test����
		test(4, "�㷨ͼ��", "��Ҫһ��Python�������������ջ�����ż��㷨��");
	}
	//�����βθ����ɱ�ķ���
	public static void test(int a, String...  books) {
		//books�������鴦��
		for(String book : books) {
			System.out.println(book);
		}
		//�������a
		System.out.println(a);
	}
}
