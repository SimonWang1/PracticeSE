package com.wsx.singleton;

// Double Checked Locking
public class Singleton3 {
	public static void main(String[] args) {
		Singleton3 s1, s2;
		s1 = Singleton3.getSingleton3();
		s2 = Singleton3.getSingleton3();
		System.out.println(s1 == s2);
	}

	// DCL��Ҫʹ��volatile�ؼ���˽�о�̬������֤Ψһ�ԣ�����Ӱ������
	private static volatile Singleton3 singleton3 = null;

	public static Singleton3 getSingleton3() {
		// ����һ����ʱ�������� Singleton3 ��Ϊ�յ�ʱ�����Ǿ��󲿷ֵ��������
		// ֻҪ�ڿ�ʼ����һ�� volatile ���������ص�����ʱ���������û�д���ʱ������
		// ����Ҫ�������Σ���������Ч�ʡ�
		Singleton3 singleton = singleton3;
		// һ���ж�
		if (singleton == null) {
			// ���������
			synchronized (Singleton3.class) {
				singleton = singleton3;
				// �����ж�
				if (singleton == null) {
					singleton = new Singleton3();
					singleton3 = singleton;
				}
			}
		}
		return singleton3;
	}

	private Singleton3() {
	}
}
