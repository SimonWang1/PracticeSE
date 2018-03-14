package com.wsx.demo.multiple_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SynchronizedTest2 {
	// synchronized����
	public static void main(String[] args) {
		final Object someObject = new Object();
		
		Thread thread1 = new Thread() {
			public void run() {
				try {
					System.out.println(now() + " thread1 �߳�������");
					System.out.println(now() + this.getName() + " ��ͼռ�ж���someObject");
					// thread1��ռsomeObject����5000ms���ͷ�
					synchronized (someObject) {
						System.out.println(now() + this.getName() + " ռ�ж���someObject");
						Thread.sleep(5000);
						System.out.println(now() + this.getName() + " �ͷŶ���someObject"); 
					}
					System.out.println(now() + " thread1 �߳̽���");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread1.setName(" thread1");
		thread1.start();
		
		Thread thread2 = new Thread() {
			public void run() {
				try {
					System.out.println(now() + " thread2 �߳�������");
					System.out.println(now() + this.getName() + " ��ͼռ�ж���someObject");
					// thread2��ռsomeObject����5000ms���ͷ�
					synchronized(someObject) {
						System.out.println(now() + this.getName() + " ռ�ж���someObject");
						Thread.sleep(5000);
						System.out.println(now() + this.getName() + " �ͷŶ���someObject");
					}
					System.out.println(now() + " thread2 �߳̽���");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread2.setName(" thread2");
		thread2.start();
	}
	
	// ��ǰʱ���ʽ����HH��ʾ24Сʱ��
	public static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
}
