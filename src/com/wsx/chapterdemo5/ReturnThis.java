package com.wsx.chapterdemo5;

public class ReturnThis {
	public int age;
	public ReturnThis grow() {
		age ++;
		//return this���ص��ø÷����Ķ���
		//ʹ��this�����ô����࣬���������ʵ�������ģ��
		return this;
	}
	public static void main(String[] args) {
		ReturnThis rt = new ReturnThis();
		rt.grow().grow().grow();
		System.out.println("rt��age��Ա����ֵ�ǣ�" + rt.age);
	}
}
