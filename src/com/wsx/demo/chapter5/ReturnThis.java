package com.wsx.demo.chapter5;

public class ReturnThis {
	// return this���ص��ø÷����Ķ���
	// ����ȫ�ֱ���age���Զ���ֵ
	public int age;

	public static void main(String[] args) {
		ReturnThis rt = new ReturnThis();
		// ���ε�������
		rt.grow().grow().grow();
		System.out.println("rt��age��Ա����ֵ�ǣ�" + rt.age);
	}

	public ReturnThis grow() {
		age++;
		// ʹ��this�����ô����࣬���������ʵ�������ģ��
		return this;
	}
}
