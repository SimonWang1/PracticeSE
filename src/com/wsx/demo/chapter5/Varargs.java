package com.wsx.demo.chapter5;

public class Varargs {
	// �����βθ����ɱ�ķ���
	public static void main(String[] args) {
		// ����test����
		test(3, "�㷨ͼ��", "��С˵һ����Ȥ���㷨������", "Turing");
	}

	public static void test(int a, String... books) {
		// books�������鴦��
		for (String book : books) {
			System.out.println(book);
		}
		// �������a
		System.out.println(a);
	}
}
