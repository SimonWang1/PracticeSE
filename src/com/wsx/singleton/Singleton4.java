package com.wsx.singleton;

public class Singleton4 {
	// Initialization Demand Holder ��ʼ������� IoDH
	public static void main(String[] args) {
		Singleton4 s1 = Singleton4.getSingleton4();
		Singleton4 s2 = Singleton4.getSingleton4();
		System.out.println(s1 == s2);
	}

	// ���о�̬�����������û�ȡΨһ�����
	public static Singleton4 getSingleton4() {
		return Holder.singleton;
	}

	// ˽�о�̬�ڲ��࣬����ʱͨ�����������Ψһ���󲢱�֤�̰߳�ȫ�����߳�������û��Ӱ��
	private static class Holder {
		private static Singleton4 singleton = new Singleton4();
	}

	// ˽�й�����
	private Singleton4() {}
}
