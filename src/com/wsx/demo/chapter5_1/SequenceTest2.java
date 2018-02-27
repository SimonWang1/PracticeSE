package com.wsx.demo.chapter5_1;

public class SequenceTest2 {
	// ִ��˳��
	static int a = 1;
	static {
		a = 10;
		System.out.println("parent static code");
	}

	public static void main(String[] args) {
		// ���ϵ�������ִ�о�̬�����
		System.out.println("***************");
		// ����ִ���޲ι�����
		SequenceTest2 parent = new Child();
		// ��ӡ�������ã���ջ�ڴ��д洢���ڴ��ַ������δ�����쳣
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
		a = 20;
		System.out.println("child static code");
	}

	public Child() {
		System.out.println("child constrator");
		System.out.println("Child a = " + a);
	}
}
