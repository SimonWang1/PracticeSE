package com.wsx.singleton;

// �����̰߳�ȫ
public class Singleton2 {
	public static void main(String[] args) {
		Singleton2 s1, s2;
		s2 = Singleton2.getSingleton2();
		s1 = Singleton2.getSingleton2();
		System.out.println(s1 == s2);
	}

	// ʹ��volatile�ؼ���˽�о�̬������֤Ψһ�ԣ�����Ӱ������
	private static volatile Singleton2 singleton2 = null;

	public static Singleton2 getSingleton2() {
		synchronized (Singleton2.class) {
			if (singleton2 == null) {
				singleton2 = new Singleton2();
			}
		}
		return singleton2;
	}

	private Singleton2() {
	}
}
