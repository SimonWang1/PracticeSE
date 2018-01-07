package com.wsx.demo.chapter6;

public interface Output {
	//�ӿڶ���ĳ�Ա����ֻ���ǳ���
	int MAX_CACHE_LINE = 50;
	//�ӿڶ������ͨ����ֻ����public���󷽷�
	void out();
	void getData(String msg);
	//�ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void print(String...  msgs) {
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}
	//�ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void test() {
		System.out.println("Ĭ�ϵ�test()����");
	}
	//�ڽӿ��ж����෽������Ҫʹstatic����
	static String staticTest() {
		return "�ӿ���ķ���";
	}
}
