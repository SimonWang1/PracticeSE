package com.wsx.demo.multiple_thread;

public class KillTest {
	// �̳�Thread��ʵ�ֶ��̲߳���
	public static void main(String[] args) {
		Hero garen = new Hero("����", 616, 50);
		Hero teemo = new Hero("��Ī", 300, 30);
		Hero leesin = new Hero("����", 455, 40);
		Hero ashe = new Hero("��ϣ", 320, 70);
		Kill kill1 = new Kill(garen, teemo);
		// �߳�startͬʱ�����߳�����run()
		kill1.start();
		// ��ʹ������
		new Kill(ashe, leesin).start();
	}
}
