package com.wsx.demo.chapter5;

public class ThisInConstructor {
	// �������е�this
	// ����ȫ�ֱ���
	public int foo;

	public ThisInConstructor() {
		// �ڹ������и�ֵ��this��ʾ��ǰ��
		this.foo = 6;
	}

	public static void main(String[] args) {
		System.out.println(new ThisInConstructor().foo);
	}
}
