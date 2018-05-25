package com.wsx.demo.chapter6;

public interface InterfaceStandard {
	// �ӿڹ淶
	// �ӿڶ���ĳ�Ա����ֻ���ǳ���
	int MAX_CACHE_LINE = 50;

	// ��ͨ���󷽷�
	public void out();

	public void getData(String msg);

	// Java8������
	// �ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}

	// �ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void test() {
		System.out.println("Ĭ�ϵ�test()����");
	}

	// �ڽӿ��ж����෽������Ҫʹstatic����
	public static String staticTest() {
		return "�ӿ���ķ���";
	}
}
