package com.wsx.demo.multiple_thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	// JDK�Դ��̳߳ز���
	public static void main(String[] args) {
		// ��������ֱ��ʾ��
		// corePoolSize: ��ʼ���߳���
		// maximumPoolSize: ����ʼ���̲߳����ã��Զ���������߳���
		// keepAliveTime: ���ն����߳������������̳߳�������δ��ʹ�ã������߳�ֵ��ʼ������
		// unit: ͬ��
		// workQueue: �����������ļ���
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, 
				new LinkedBlockingQueue<Runnable>());
		// execute(): �����������
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("task1");
			}
		});
	}
}
