package com.wsx.demo.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		// LinkedListʵ����List�ӿڣ�����ʹ��List�����������ͣ�����List����
		List<Hero> ll = new LinkedList<>();
		ll.add(new Hero("hero1"));
		// LinkedListͬʱʵ����Deque˫����У�����ʵ����Queue�ӿڣ������Ƚ��ȳ�
		Queue<Hero> q = new LinkedList<>();
		// offer(Object): �ڶ���ĩβ���Ԫ��
		System.out.format("��ʼ������: %n");
		q.offer(new Hero("hero1"));
		q.offer(new Hero("hero2"));
		q.offer(new Hero("hero3"));
		q.offer(new Hero("hero4"));
		System.out.println(q);
		System.out.format("ȡ��������Ԫ��: %n");
		// poll: ȡ����һ��Hero���Ƚ��ȳ�
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
