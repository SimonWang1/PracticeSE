package com.wsx.demo.chapter5_1;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		//age��Ա���������أ����������ִ���
//		p.age = 1000;
		//�������������ʾ�����Ҳ��ḳֵ
		p.setAge(1000);
		//���0
		System.out.println("δ�ܸ�ֵage��Ա����ʱ��" + p.getAge());
		//�ɹ��޸�
		p.setAge(24);
		//���24
		System.out.println("�ɹ���ֵage��Ա������" + p.getAge());
		//��ֵ��Ա����name����ӡ
		p.setName("Wangsx");
		System.out.println("�ɹ���ֵname��Ա������" + p.getName());
	}
}
