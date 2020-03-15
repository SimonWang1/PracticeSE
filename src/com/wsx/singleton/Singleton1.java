package com.wsx.singleton;

public class Singleton1 {
	// ��̬����ʵ�ֵ���
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getSingleton1();
		Singleton1 s2 = Singleton1.getSingleton1();
		System.out.println(s1 == s2);
	}

	// ˽�о�̬�����ã�����ָ��Ψһ�����
	private static Singleton1 singleton = null;

	// ���о�̬�����������û�ȡΨһ�����
	public static Singleton1 getSingleton1() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}

	// ˽�й�����
	private Singleton1() {}
}
