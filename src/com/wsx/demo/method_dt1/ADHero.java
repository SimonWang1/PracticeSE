package com.wsx.demo.method_dt1;

public class ADHero extends Hero implements Mortal {
	// ����Ӣ��
	public void die() {
		System.out.println("ADHero " + this.heroName + " has been killed");
	}
}
