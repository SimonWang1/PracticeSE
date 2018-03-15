package com.wsx.demo.multiple_thread;

import java.util.LinkedList;

public class CustomThreadPool {
	// �Զ����̳߳�
	// �̳߳ش�С
	int threadPoolSize;
	
	// ��������
	LinkedList<Runnable> tasks = new LinkedList<>();
	
	// ��ͼ����������߳�
	public CustomThreadPool() {
		threadPoolSize = 10;
		
		// ����10�����������߽���
		synchronized(tasks) {
			for(int i = 0; i < threadPoolSize; i++) {
				new TaskConsumeThread("�����������߳� " + i).start();
			}
		}
	}
	
	public void add(Runnable runnable) {
		synchronized(tasks) {
			tasks.add(runnable);
			// ���ѵȴ��������������߳�
			tasks.notifyAll();
		}
	}
	
	private class TaskConsumeThread extends Thread {
		Runnable task;
		
		public void run() {
			System.out.println("������" + this.getName());
			while(true) {
				synchronized(tasks) {
					while(tasks.isEmpty()) {
						try {
							tasks.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					task = tasks.removeLast();
					// �������������߳̿��Լ����������
					tasks.notifyAll();
				}
				System.out.println(this.getName() + " ��ȡ�����񣬲�ִ��");
				task.run();
			}
		}
		
		public TaskConsumeThread(String name) {
			super(name);
		}
	}
}
