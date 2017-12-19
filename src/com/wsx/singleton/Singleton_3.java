package com.wsx.singleton;

//Double Checked Locking
public class Singleton_3 {
	public static void main(String[] args) {
		Singleton_3 s1, s2;
		s1 = Singleton_3.getSingleton3();
		s2 = Singleton_3.getSingleton3();
		System.out.println(s1==s2);
	}
	
	private static volatile Singleton_3 singleton_3 = null;

	public static Singleton_3 getSingleton3() {
		// ����һ����ʱ�������� Singleton3 ��Ϊ�յ�ʱ�����Ǿ��󲿷ֵ��������
		// ֻҪ�ڿ�ʼ����һ�� volatile ���������ص�����ʱ���������û�д���ʱ������
		// ����Ҫ�������Σ���������Ч�ʡ�
		Singleton_3 singleton = singleton_3;
		if (singleton == null) {
			synchronized (Singleton_3.class) {
				singleton = singleton_3;
				if (singleton == null) {
					singleton = new Singleton_3();
					singleton_3 = singleton;
				}
			}
		}
		return singleton_3;
	}
	
	private Singleton_3() {
	}
}
