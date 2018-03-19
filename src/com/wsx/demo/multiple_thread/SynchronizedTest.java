package com.wsx.demo.multiple_thread;

public class SynchronizedTest {
	// ���߳�ͬ������
	public static void main(String[] args) {
		final S_Hero garen = new S_Hero();
		garen.name = "����";
		garen.hp = 10000;
		System.out.printf("���׵ĳ�ʼѪ���� %.0f%n", garen.hp);
		
		int n = 10000;
		
		Thread[] addThreads = new Thread[n];
		Thread[] reduceThreads = new Thread[n];
		
		// n���߳�����hp
		for(int i = 0; i < n; i++) {
			Thread thread = new Thread() {
				public void run() {
					garen.recover();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			thread.start();
			addThreads[i] = thread;
		}
		
		// n���̼߳���hp
		for(int i = 0; i < n; i++) {
			Thread thread = new Thread() {
				public void run() {
					garen.hurt();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			thread.start();
			reduceThreads[i] = thread;
		}
		
		// �ȴ���������hp�߳̽���
		for(Thread thread : addThreads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// �ȴ����м���hp�߳̽���
		for(Thread thread : reduceThreads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%d �������̺߳� %d �������߳̽�����%n���׵�Ѫ������� %.0f%n", n, n, garen.hp);
	}
}
