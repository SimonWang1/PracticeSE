package com.wsx.singleton;

public class Singleton2 {
	// �����̰߳�ȫ
	public static void main(String[] args) {
		Singleton2 s1 = Singleton2.getSingleton2();
		Singleton2 s2 = Singleton2.getSingleton2();
		System.out.println(s1 == s2);
	}

	// ʹ��volatile�ؼ���˽�о�̬���ñ�֤Ψһ�ԣ�����Ӱ������
	private static volatile Singleton2 singleton2 = null;

	public static Singleton2 getSingleton2() {
		synchronized (Singleton2.class) {
			if (singleton2 == null) {
				singleton2 = new Singleton2();
			}
		}
		return singleton2;
	}

	private Singleton2() {}
}
