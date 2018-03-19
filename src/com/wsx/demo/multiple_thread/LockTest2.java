package com.wsx.demo.multiple_thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest2 {
	// ʹ��Lock����ʵ���߳̽���
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		// ͨ��lock����õ�condition���󣬵���condition��await��signal��signalAll����
		// ��Ӧsynchronized�е�wait��notify��notifyAll����
		// ʹ��lock���Թ��������Ҫ��finally��unlock
		Condition condition = lock.newCondition();

		Thread thread1 = new Thread() {
			public void run() {
				try {
					log("�߳�����");
					log("��ͼռ�ж���lock");
					lock.lock();
					log("ռ�ж���lock");
					log("����5��ҵ�����");
					Thread.sleep(5000);
					log("��ʱ�ͷŶ��� lock�����ȴ�");
					condition.await();
					log("����ռ�ж��� lock��������5���ӵ�ҵ�����");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					log("�ͷŶ���lock");
					lock.unlock();
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
				try {
					log("�߳�����");
					log("��ͼռ�ж���lock");
					lock.lock();
					log("ռ�ж���lock");
					log("����5��ҵ�����");
					Thread.sleep(5000);
					log("���ѵȴ��е��߳�");
					condition.signal();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					log("�ͷŶ���lock");
					lock.unlock();
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
