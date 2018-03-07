package com.wsx.demo.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	// ���У���ͷ��ȡ��β�壬�Ƚ��ȳ�������˫����������������ʶ���Ԫ�أ��ڶ�ͷ��β���в���
	public static void main(String[] args) {
		// LinkedList����˫������ʵ����˫�˶��нӿ�Deque��Deque�̳ж��нӿ�Queue������ʵ����Queue�ӿ�
		Queue<Hero> q = new LinkedList<>();
		// offer(Object): �ڶ���ĩβ���Ԫ��
		System.out.format("��ʼ������: %n");
		q.offer(new Hero("hero1"));
		q.offer(new Hero("hero2"));
		q.offer(new Hero("hero3"));
		q.offer(new Hero("hero4"));
		// ˫������ǰ��洢��һ��Ԫ�صĵ�ַ
		System.out.println(q);
		// poll(): ȡ��������Ԫ�أ��Ƚ��ȳ�
		System.out.format("ȡ��������Ԫ��: %n");
		Hero h = q.poll();
		System.out.println(h);
		System.out.format("ȡ����Ԫ�غ�Ķ���: %n");
		System.out.println(q);
		// peek(): �鿴������Ԫ��
		System.out.format("�鿴������Ԫ��: %n");
		System.out.println(q.peek());
		System.out.format("peek��������Ӱ���������: %n");
		System.out.println(q);
	}
}
