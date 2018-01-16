package com.wsx.singleton;

// Simple
public class Singleton1 {
	public static void main(String[] args) {
		Singleton1 s1, s2;
		s1 = Singleton1.getSingleton1();
		s2 = Singleton1.getSingleton1();
		System.out.println(s1 == s2);
	}

	// ˽�о�̬�������洢Ψһʵ��
	private static Singleton1 singleton1 = null;

	// ���о�̬����������Ψһʵ��
	public static Singleton1 getSingleton1() {
		if (singleton1 == null)
			singleton1 = new Singleton1();
		return singleton1;
	}

	// ˽�й�����
	private Singleton1() {
	}
}
