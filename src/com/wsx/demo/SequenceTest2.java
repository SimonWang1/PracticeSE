package com.wsx.demo;

public class SequenceTest2 {
	// ִ��˳��
	static int a = 1;
	static {
		// ���¸�ֵ����ȫ�ֱ���
		a = 10;
		System.out.println("parent static code");
	}

	public static void main(String[] args) {
		System.out.println("***************");
		// �ڼ̳и���������д�����������ִ�и����ྲ̬�������ִ������������
		// ���������ִ��˳������Ϊ����������ࣩ��̬����飬�޲ι�����
		SequenceTest2 parent = new Child();
		// ͨ��toString������ӡ�������ã�������ջ�ڴ��д����ַ������δ�����쳣
		System.out.println(parent.toString());
	}

	public SequenceTest2() {
		System.out.println("parent constractor");
		System.out.println("Parent a = " + a);
	}
}

class Child extends SequenceTest2 {
	static int a = 2;
	static {
		// ���¸�ֵ����ȫ�ֱ�����ֵ
		a = 20;
		System.out.println("child static code");
	}

	public Child() {
		System.out.println("child constrator");
		System.out.println("Child a = " + a);
	}
}
