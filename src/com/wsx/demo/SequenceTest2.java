package com.wsx.demo;

public class SequenceTest2 {
	 static int a = 1;
	 {
		a =  10;
		System.out.println("parent static code");
	}
	
	public static void main(String[] args) {
		System.out.println("***************");
		//���ڶ�̬ʱ�ȵ������ྲ̬����飬��˳��ִ������������
		//����������������ʱ�ȵ��ø��ྲ̬����飬��ִ�����๹����
		SequenceTest2 parent = new Child();
		//ͨ��toString������ӡ�������ã�ָ�����๹����������δ�����쳣
		System.out.println(parent.toString());
	}
	
	public SequenceTest2(){
		System.out.println("parent constractor");
		System.out.println("Parent a = " + a);
	}
}
	
class Child extends SequenceTest2{
	 static int a = 2;
	 static {
		a = 20;
		System.out.println("child static code");
	}
	
	public Child(){
		System.out.println("child constrator");
		System.out.println("Child a = " + a);
	}
}
