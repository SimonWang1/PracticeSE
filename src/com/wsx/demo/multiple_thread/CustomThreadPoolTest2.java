package com.wsx.demo.multiple_thread;

public class CustomThreadPoolTest2 {
	// �Զ����̳߳ز���2
	public static void main(String[] args) {
		CustomThreadPool pool = new CustomThreadPool();
		int sleep = 1000;
		while(true) {
			pool.add(new Runnable() {
				@Override
				// ������������Խ��Խ�࣬�̳߳��е������̱߳�����ִ������
				public void run() {
					// TODO Auto-generated method stub
					// ��ִ�е�����
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			try {
				Thread.sleep(sleep);
				// sleep�𲽼�����100
				sleep = sleep > 100 ? sleep - 100 : sleep;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
