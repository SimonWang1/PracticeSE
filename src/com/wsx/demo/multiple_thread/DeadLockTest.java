package com.wsx.demo.multiple_thread;

public class DeadLockTest {
	// ��������
	public static void main(String[] args) {
		final Hero ahri = new Hero("����");
		final Hero annie = new Hero("����");
		
		Thread thread1 = new Thread() {
			public void run() {
				// ռ�а���
				synchronized(ahri) {
					System.out.println("thread1 �Ѿ�ռ�а���");
					try {
						// thread1��ͣ1000ms������һ���߳����㹻ʱ��ռ�а���
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("thread1 ��ͼռ�а���");
					System.out.println("thread1 �ȴ��С�����");
					synchronized(annie) {
						System.out.println("do something");
					}
				}
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread() {
			public void run() {
				// ռ�а���
				synchronized(annie) {
					System.out.println("thread2 �Ѿ�ռ�а���");
					try {
						// thread2��ͣ1000ms������һ���߳����㹻ʱ��ռ�а���
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("thread2 ��ͼռ�а���");
					System.out.println("thread2 �ȴ��С�����");
					synchronized(ahri) {
						System.out.println("do something");
					}
				}
			}
		};
		thread2.start();
	}
}
