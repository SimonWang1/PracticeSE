package com.wsx.demo.multiple_thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	// ʹ��Lock����ʵ��ͬ��Ч��
	public static void main(String[] args) {
		// Lock�ӿ�����ָ��ʵ���๹����������ʵ�������
		Lock lock = new ReentrantLock();
		Thread thread1 = new Thread() {
			public void run() {
				boolean locked = false;
				try {
					log("�߳�����");
					log("��ͼռ�ж���lock");
					// trylock����ռ�ã���ʧ�ܣ�����ռ��
					locked = lock.tryLock(1, TimeUnit.SECONDS);
					if(locked) {
						log("ռ�ж���lock");
						log("����5��ҵ�����");
						Thread.sleep(5000);
					} else {
						log("����1����Ŭ������û��ռ�ж��󣬷���ռ��");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					// �ж��Ƿ�ռ�óɹ�
					if(locked) {
						// lockʵ�ֶ���ͬ��Ч��Ҫ��finally�������unlock
						log("�ͷŶ���lock");
						lock.unlock();
					}
				}
				log("�߳̽���");
			}
		};
		thread1.setName("thread1");
		thread1.start();
		
		try {
			// thread1����2���ٿ���thread2
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread thread2 = new Thread() {
			public void run() {
				boolean locked = false;
				try {
					log("�߳�����");
					log("��ͼռ�ж���lock");
					locked = lock.tryLock(1, TimeUnit.SECONDS);
					if(locked) {
					lock.lock();
						log("ռ�ж���lock");
						log("����5��ҵ�����");
						Thread.sleep(5000);
					} else {
						log("����1����Ŭ������û��ռ�ж��󣬷���ռ��");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if(locked) {
						log("�ͷŶ���lock");
						lock.unlock();
					}
				}
				log("�߳̽���");
			}
		};
		thread2.setName("thread2");
		thread2.start();
	}
	
	private static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	private static void log(String message) {
		System.out.printf("%s %s %s %n", now(), Thread.currentThread().getName(), message);
	}
}
