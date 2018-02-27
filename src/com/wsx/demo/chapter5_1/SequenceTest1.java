package com.wsx.demo.chapter5_1;

class Root {
	// ��Ӹ���
	static {
		System.out.println("Root�ľ�̬��ʼ����");
	}
	
	{
		System.out.println("Root����ͨ��ʼ����");
	}

	public Root() {
		System.out.println("Root���޲ι�����");
	}
}

class Mid extends Root {
	// ����
	static {
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	
	{
		System.out.println("Mid����ͨ��ʼ����");
	}

	public Mid(String msg) {
		// �������ع�����
		this();
		System.out.println("Mid�Ĵ��ι�����������ֵΪ��" + msg);
	}

	public Mid() {
		System.out.println("Mid���޲ι�����");
	}
}

class Leaf extends Mid {
	// ����
	static {
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}

	public Leaf() {
		// ���ø�����ι�����
		super("Java���˼��");
		System.out.println("Leaf���޲ι�����");
	}
}

public class SequenceTest1 {
	// ִ��˳��
	public static void main(String[] args) {
		// ִ��˳����ϵ�������ִ�о�̬����飬������ִ����ͨ��ʼ���飬�޲ι����������ι�����
		new Leaf();
		System.out.println("********************");
		// ��̬������ִ��һ��
		new Leaf();
	}
}
