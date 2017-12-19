package com.wsx.singleton;

//Simple
public class Singleton_1 {
	public static void main(String[] args) {
		Singleton_1 s1, s2;
		s1 = Singleton_1.getSingleton1();
		s2 = Singleton_1.getSingleton1();
		System.out.println(s1 == s2);
	}
	//˽�о�̬�������洢Ψһʵ��
	private static Singleton_1 singleton_1 = null;
	//���о�̬����������Ψһʵ��
	public static Singleton_1 getSingleton1() {
		if (singleton_1 == null)
			singleton_1 = new Singleton_1();
		return singleton_1;
	}
	//˽�й�����
	private Singleton_1() {
	}	
}
