package com.wsx.demo.method_dt1;

public class Hero {
	public String heroName;
	public float HP;

	// �β�ע��ӿڣ�ʵ�ֶ�̬
	public void kill(Mortal m) {
		System.out.println(heroName + " used skill 'R'");
		m.die();
	}
}
