package com.wsx.demo.chapter8;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		// ���Ԫ��
		c.add("�����");
		// ��ӷ��ͣ�����add����
//		c.add(4);
//		c.remove(4);
		System.out.println("c���ϵ�Ԫ�صĸ���Ϊ: " + c.size());
		// �ж��Ƿ����ָ���ַ���
		System.out.println("c�����Ƿ����\"�����\"�ַ���: "
				+ c.contains("�����"));
		c.add("�㷨����");
		System.out.println("c���ϵ�Ԫ��: " + c);
		Collection<String> books = new HashSet<String>();
		books.add("�㷨����");
		books.add("Java���˼��");
		System.out.println("c�����Ƿ���ȫ����books����: "
				+ c.containsAll(books));	// ����false
		// ��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ��: " + c);
		// ɾ��c�����������Ԫ��
		c.clear();
		System.out.println("c�������Ԫ��: " + c);
		// ����books������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ��: " + books);
	}
}
