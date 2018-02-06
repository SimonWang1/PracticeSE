package com.wsx.singleton;

public class Singleton4 {
	// Initialization Demand Holder
	// IoDH
	public static void main(String[] args) {
		// ��ջ�ڴ��д���Singleton���ñ���s1, s2����ʱ����Ϊ��
		Singleton4 s1, s2;
		// ͨ����������getSingleton��̬�����ڶ��ڴ��д���Singleton����
		// ʹ�á�=�������ñ���ָ����󣬼���ջ�ڴ��д洢���ڴ��ַ
		s1 = Singleton4.getSingleton4();
		s2 = Singleton4.getSingleton4();
		// ���ñ���s1, s2�洢��ַ��ͬ������true
		System.out.println(s1 == s2);
	}

	// ˽�о�̬�ڲ���
	private static class Holder {
		private static Singleton4 singleton4 = new Singleton4();
	}

	// ���о�̬������ͨ�����������Ψһʵ������֤�̰߳�ȫ�����߳�������û��Ӱ��
	public static Singleton4 getSingleton4() {
		return Holder.singleton4;
	}

	// ˽�й�����
	private Singleton4() {
	}
}
