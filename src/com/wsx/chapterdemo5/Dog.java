package com.wsx.chapterdemo5;

public class Dog {
	//����jump()����
	public void jump() {
		System.out.println("����ִ��jump����");
	}
	//����run()������run()��������jump()����
	public void run() {
//		Dog d = new Dog();
//		d.jump();
		//ʹ��this���õ���run()�����Ķ���
//		this.jump();
		//ֱ��д��
		jump();
		System.out.println("����ִ��run����");
	}
}
