package com.wsx.demo.chapter5_1;

class BaseClass1{
	// ��̬����
	public String book = "�������ѧ����";
	public void base() {
		System.out.println("�������ͨ����");
	}
	
	public void test() {
		System.out.println("���౻��д�ķ���");
	}
}

public class SubClass1 extends BaseClass1{
	public static void main(String[] args) {
		// �����൥������ʵ��û�ж�̬
		BaseClass1 bc = new BaseClass1();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		System.out.println("------------------");
		SubClass1 sc = new SubClass1();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		System.out.println("------------------");
		// ��������ָ�����๹����ʱ���ܳ��ֶ�̬
		BaseClass1 ploymophicBc = new SubClass1();
		// �����඼�е����Ը�����ָ����
		System.out.println(ploymophicBc.book);
		// ִ�и���base()����
		ploymophicBc.base();
		// �����඼�еķ���ִ�������test()����
		ploymophicBc.test();
		// ����ִ�и���û�еķ���
		//	ploymophicBc.sub();
	}

	public String book = "Java���˼��";
	public void test() {
		System.out.println("������д����ķ���");
	}
	
	public void sub() {
		System.out.println("�������ͨ����");
	}
}
