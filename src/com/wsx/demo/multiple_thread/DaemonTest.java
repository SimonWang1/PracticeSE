package com.wsx.demo.multiple_thread;

public class DaemonTest {
	// �ػ��̲߳���
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				int seconds = 0;
				System.out.println("��ʱ��ʼ��");
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("��" + seconds++ + "��");
				}
			}
		};
		// ���ô��߳�Ϊ�ػ��̣߳��������̶߳����ػ��߳�ʱ���߳̽���
		thread.setDaemon(true);
		thread.start();
	}
}
