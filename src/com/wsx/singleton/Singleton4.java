package com.wsx.singleton;

//Initialization Demand Holder
//IoDH
public class Singleton4 {
	public static void main(String[] args) {
		Singleton4 s1, s2;
		s1 = Singleton4.getSingleton4();
		s2 = Singleton4.getSingleton4();
		System.out.println(s1==s2);
	}
	//˽�о�̬�ڲ���
	private static class Holder {
		private static Singleton4 singleton4 = new Singleton4();
	}
	//���о�̬������ͨ�����������Ψһʵ������֤�̰߳�ȫ�����߳�������û��Ӱ��
	public static Singleton4 getSingleton4() {
		return Holder.singleton4;
	}
	//˽�й�����
	private Singleton4() {
	}
}
