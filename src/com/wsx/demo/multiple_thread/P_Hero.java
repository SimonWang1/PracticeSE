package com.wsx.demo.multiple_thread;

public class P_Hero {
	// �߳����ȼ�ʵ����
	public String name;
	public float hp;
	public int damage;

	public void attackHero(P_Hero hero) {
		// Ϊʵ���߳����ȼ�Ч����ע���߳���ͣ����
		/*try {
			// ��ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000ms
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
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
