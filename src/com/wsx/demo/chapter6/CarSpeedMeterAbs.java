package com.wsx.demo.chapter6;

public abstract class CarSpeedMeterAbs {
	// �ٶȳ�����
	// ��װת��
	private double turnRate;

	// �뾶���󷽷�
	public abstract double getRadius();

	// ת��set��get����
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
	
	public double getTrunRate() {
		return this.turnRate;
	}

	// ��������ٶȵ�ͨ���㷨
	public double getSpeed() {
		// �ٶȵ��� 2 * PI * ���ְ뾶 * ת��
		return 2 * Math.PI  * getRadius()* turnRate;
	}

	public CarSpeedMeterAbs() {

	}
}
