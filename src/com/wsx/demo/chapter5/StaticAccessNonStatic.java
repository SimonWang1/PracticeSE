package com.wsx.demo.chapter5;

public class StaticAccessNonStatic {
	// ��̬���ʷǾ�̬����
	public void info() {
		System.out.println("�򵥵�info����");
	}

	public static void main(String[] args) {
		// ͨ��new�ؼ��ֵ��ù������������󣬷��ʾ�̬����
		new StaticAccessNonStatic().info();
	}
}
