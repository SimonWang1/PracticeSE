package com.wsx.demo.chapter6;

public abstract class SpeedMeter {
	// ת��
	private double turnRate;
	public SpeedMeter() {
		
	}
	// �ѷ��س��ְ뾶�ķ�������ɳ��󷽷�
	public abstract double getRadius();
	public void setTurnTate(double turnRate) {
		this.turnRate = turnRate;
	}
	// ��������ٶȵ�ͨ���㷨
	public double getSpeed() {
		//�ٶȵ��� ���ְ뾶 * 2 * PI * ת��
		return Math.PI * 2 * getRadius() * turnRate;
	}
	
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
	
	public double getTrunRate() {
		return this.turnRate;
	}
}
