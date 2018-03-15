package com.wsx.demo.multiple_thread;

import java.util.LinkedList;

public class CustomThreadPool {
	// 自定义线程池
	// 线程池大小
	int threadPoolSize;
	
	// 任务容器
	LinkedList<Runnable> tasks = new LinkedList<>();
	
	// 试图消费任务的线程
	public CustomThreadPool() {
		threadPoolSize = 10;
		
		// 启动10个任务消费者进程
		synchronized(tasks) {
			for(int i = 0; i < threadPoolSize; i++) {
				new TaskConsumeThread("任务消费者线程 " + i).start();
			}
		}
	}
	
	public void add(Runnable runnable) {
		synchronized(tasks) {
			tasks.add(runnable);
			// 唤醒等待的任务消费者线程
			tasks.notifyAll();
		}
	}
	
	private class TaskConsumeThread extends Thread {
		Runnable task;
		
		public void run() {
			System.out.println("启动：" + this.getName());
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
					// 允许添加任务的线程可以继续添加任务
					tasks.notifyAll();
				}
				System.out.println(this.getName() + " 获取到任务，并执行");
				task.run();
			}
		}
		
		public TaskConsumeThread(String name) {
			super(name);
		}
	}
}
