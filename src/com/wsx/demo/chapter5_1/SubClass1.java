package com.wsx.demo.chapter5_1;

class BaseClass1{
	public int book = 6;
	public void base() {
		System.out.println("�������ͨ����");
	}
	
	public void test() {
		System.out.println("���౻���ǵķ���");
	}
}

public class SubClass1 extends BaseClass1{
	public static void main(String[] args) {
		//�����൥������ʵ��û�ж�̬
		BaseClass1 bc = new BaseClass1();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		SubClass1 sc = new SubClass1();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		//����ʱ����Ϊ���࣬����ʱ����Ϊ���࣬���ܳ��ֶ�̬
		BaseClass1 ploymophicBc = new SubClass1();
		//���ʸ���ʵ������
		System.out.println(ploymophicBc.book);
		//ִ�и���base()����
		ploymophicBc.base();
		//�����඼�еķ���ִ�������test()����
		ploymophicBc.test();
		//����ִ�и���û�еķ���
//		ploymophicBc.sub();
	}

	public String book = "Java���˼��";
	public void test() {
		System.out.println("���า�Ǹ���ķ���");
	}
	
	public void sub() {
		System.out.println("�������ͨ����");
	}
}
