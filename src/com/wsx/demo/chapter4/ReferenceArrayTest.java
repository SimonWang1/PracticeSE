package com.wsx.demo.chapter4;

public class ReferenceArrayTest {
	// ���ô洢���ڴ��ַ
	public static void main(String[] args){
		// �����������Ͷ���
		Person[] students = new Person[2];
		Person zhang = new Person();
		zhang.age = 17;
		zhang.height = 177;
		Person lee = new Person();
		lee.age = 19;
		lee.height = 173;
		// ���������ô洢������
		students[0] = zhang;
		students[1] = lee;
		zhang.info();
		//	��������students[1]�Ͷ�������lee��ջ�ڴ�洢��ͬ�Ķ��ڴ��ַ����ʾ��ͬ����
		lee.info();
		students[1].info();
	}
}
