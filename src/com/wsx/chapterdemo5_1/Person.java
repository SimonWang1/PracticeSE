package com.wsx.chapterdemo5_1;

public class Person {
	//ʹ��private���Σ����Ա����
	private String name;
	private int age;
	//�ṩ��������name��Ա����
	public void setName(String name) {
		//�û�����2~6֮��У��
		if(name.length() > 6 || name.length() < 2) {
			System.out.println("���������������Ҫ��");
			return;
		}
		else {
			this.name = name;
		}
	}
	
	public String getName() {
		return this.name;
	}
	//�ṩ��������age��Ա����
	public void setAge(int age) {
		//�û�������0~100֮��У��
		if(age > 100 || age < 0) {
			System.out.println("��������䲻�Ϸ�");
			return;
		}
		else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
}
