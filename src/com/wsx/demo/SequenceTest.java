package com.wsx.demo;

public class SequenceTest {
	// ִ��˳��
	static {
		SequenceTest.getName("��̬���뻯��");
	}

	public String name = SequenceTest.getName("��������");
	
	{
		SequenceTest.getName("��ͨ��ʼ����");
	}

	public static void main(String[] args) {
		// ִ��˳������Ϊ��̬����飬������������ͨ��ʼ���飬������
		new SequenceTest();
	}

	public SequenceTest() {
		SequenceTest.getName("������");
	}

	private static String getName(String pos) {
		String result = "name: " + pos;
		System.out.println(result);
		return result;
	}
}
