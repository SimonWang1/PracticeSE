package com.wsx.demo.method_dt1;

public class APHero extends Hero implements Mortal{
	// ħ��Ӣ��
	public void die() {
		System.out.println("APHero " + this.heroName + " has been killed");
	}
}
