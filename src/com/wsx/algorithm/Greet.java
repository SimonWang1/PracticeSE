package com.wsx.algorithm;

// ����ջ
public class Greet {
	public static void main(String[] args) {
		// ����greet��������ջ֡�洢�ֲ�����
		greet("jackson");
	}

	public static void greet(String name) {
		// ˳��ִ��
		System.out.println("hello, " + name + "!");
		// ����greet2��������ʱgreet���ڹ���״̬
		greet2(name);
		// �ص�greet����ӡ���
		System.out.println("getting ready to say bye...");
		// ����bye����������greet
		bye();
		// return null
	}

	public static void greet2(String name) {
		System.out.println("how are you, " + name + "?");
	}

	public static void bye() {
		System.out.println("ok, bye! ");
	}
}
