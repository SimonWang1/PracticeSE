package com.wsx.demo.multiple_thread;

public class SleepTest {
	// sleep()��������
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				int seconds = 0;
				System.out.println("��ʱ��ʼ��");
				while(true) {
					try {
						// ��ʾ��ǰ�߳���ͣ1000ms
						Thread.sleep(1000);
						// �׳��ж��쳣
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("��" + seconds++ + "��");
				}
			}
		};
		thread.start();
	}
}
