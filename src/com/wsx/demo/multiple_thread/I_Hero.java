package com.wsx.demo.multiple_thread;

public class I_Hero {
	// �߳̽���ʵ����
	public String name;
	public float hp;
	public int damage;
	
	public synchronized void recover() {
		while(hp >= 1000) {
			try {
				// �ͷ�ͬ������thisռ�е��̲߳��ȴ�
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		hp = hp + 1;
		System.out.printf("%s ��Ѫ1�㣬����Ѫ��%s ��Ѫ���� %.0f%n", name, name, hp);
		// ���ͬ������this�ĵȴ�����
		this.notify();
	}
	
	public synchronized void hurt() {
		while(hp <= 1) {
			try {
				// �ͷ�ͬ������thisռ�е��̲߳��ȴ�
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		hp = hp - 1;
		System.out.printf("%s ��Ѫ1�㣬����Ѫ��%s ��Ѫ���� %.0f%n", name, name, hp);
		// ���ͬ������this�ĵȴ�����
		this.notify();
	}
	
	public void attrackHero(I_Hero hero) {
		hero.hp -= damage;
		System.out.printf("%s ���ڹ��� %s��%s ��Ѫ������� %.0f%n", name, hero.name, hero.name, hero.hp);
		if(hero.isDead()) {
			System.out.println(hero.name + "����ɱ��");
		}
	}
	
	public boolean isDead() {
		return hp <= 0 ? true : false;
	}
}
