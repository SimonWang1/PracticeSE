package com.wsx.chapterdemo5_1;

public class ConstructorTest {
	public static void main(String[] args) {
		//ʹ���Զ��幹������������
		ConstructorTest tc = new ConstructorTest("�����������ԭ��", 3999);
		System.out.println(tc.name);
		System.out.println(tc.count);
	}
	
	public String name;
	public int count;
	
	//�ṩ���������Ĺ�����
	public ConstructorTest(String name, int count) {
		//�������е�this�����ʼ������
		this.name = name;
		this.count = count;
	}
}
