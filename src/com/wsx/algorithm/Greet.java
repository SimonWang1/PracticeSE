package com.wsx.algorithm;

public class Greet {
	// ����ջ�����ڴ洢��������ı���
	public static void main(String[] args) {
		// ���ú���greet����վ�ڴ����ռ�
		greet("jackson");
	}

	public static void greet(String name) {
		// ���պ���˳��ִ��
		System.out.println("hello, " + name + "!");
		// ����greet2��������ʱgreet���ڹ���״̬
		greet2(name);
		// �ص�greet����ӡ���
		System.out.println("getting ready to say bye...");
		// ����bye����������greet
		bye();
		// �޺������ã��Ӻ�������
	}

	public static void greet2(String name) {
		System.out.println("how are you, " + name + "?");
	}

	public static void bye() {
		System.out.println("ok, bye! ");
	}
}
