package com.wsx.demo.method_dt1;

public class ADAPHero extends Hero implements Mortal{
	// ���ϵӢ��
	public void die() {
		System.out.println("ADAPHero " + this.heroName + " has been killed");
	}
}
