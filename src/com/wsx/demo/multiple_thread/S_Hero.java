package com.wsx.demo.multiple_thread;

public class S_Hero {
	// �߳�ͬ��ʵ����
	public String name;
	public float hp;
	public int damage;
	
	// �����߳�ͬ����ʽʵ��Ч����ͬ
	// ��Ѫ
	public synchronized void recover() {
		hp = hp + 1;
	}
	
	// ��Ѫ
	public void hurt() {
		synchronized (this) {
			hp = hp - 1;
		}
	}
	
	public void attrackHero(Hero hero) {
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
