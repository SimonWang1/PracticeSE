package com.wsx.algorithm;

public class Greet {
	// ����ջ��ջ��Ҫ�������ջ֡����ջ֡��ѹ��͵���������Ϊ����ջ
	public static void main(String[] args) {
		// ���ú���greet����ջ֡�洢��ַ
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
		// �޺������ã��Ӻ������أ�����return null
	}

	public static void greet2(String name) {
		System.out.println("how are you, " + name + "?");
	}

	public static void bye() {
		System.out.println("ok, bye! ");
	}
}
