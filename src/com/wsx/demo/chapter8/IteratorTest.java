package com.wsx.demo.chapter8;

import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		Collection<String> books = new HashSet<String>();
		books.add("�㷨����");
		books.add("Java���˼��");
		// ��ȡbooks���϶�Ӧ�ĵ�����
		Iterator<String> it = books.iterator();
		while(it.hasNext()) {
			// it.next()�������ص�����������Object���ͣ������Ҫǿ������ת��
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("�㷨����")) {
				// �Ӽ�����ɾ����һ��next()�������ص�Ԫ��
				it.remove();
			}
			// ��book������ֵ������ı伯��Ԫ������
			book = "�����ַ���";
		}
		System.out.println(books);
	}
}
