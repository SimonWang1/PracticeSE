package com.wsx.demo.chapter5;

public class Overload {
	// �������أ�������ͬ���βθ�����ͬ
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.test();
		ol.test("Hey, guys");
	}
	
	public void test() {
		System.out.println("�޲�test����");
	} 
	
	public void test(String msg) {
		System.out.println("���ص�test������" + msg);
	}
}
