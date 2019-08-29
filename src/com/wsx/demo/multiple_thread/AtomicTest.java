package com.wsx.demo.multiple_thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
	// ���߳�ԭ����
	private static int value = 0;
	private static AtomicInteger atomicValue = new AtomicInteger();
	public static void main(String[] args) {
		int number = 100000;
		// ��ͨ����
		Thread[] threads1 = new Thread[number];
		for(int i = 0; i < number; i++) {
			Thread thread = new Thread() {
				public void run() {
					value++;
				}
			};
			thread.start();
			threads1[i] = thread;
		}
		
		// �ȴ��߳̽���
		for(Thread thread : threads1) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("%d���߳̽���value++��value��ֵ��ɣ�%d%n", number, value);
		
		// ԭ������
		Thread[] threads2 = new Thread[number];
		for(int i = 0; i < number; i++) {
			Thread thread = new Thread() {
				public void run() {
					atomicValue.incrementAndGet();
				}
			};
			thread.start();
			threads2[i] = thread;
		}
		
		// �ȴ��߳̽���
		for(Thread thread : threads2) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("%d���߳̽���atomicValue.incrementAndGet();��value��ֵ��ɣ�%d%n", 
				number, atomicValue.intValue());
	}
}
