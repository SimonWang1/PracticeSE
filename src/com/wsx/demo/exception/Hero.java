package com.wsx.demo.exception;

public class Hero {
	// ����ʵ����
	public String name;
	protected float hp;
	
	public void attackHero(Hero h) throws DefinedException{
		if(h.hp == 0) {
			throw new DefinedException(h.name + "Ӣ�۱���ɱ�������ͷż���");
		}
	}
	
	public String toString() {
		return this.name;
	}
}
