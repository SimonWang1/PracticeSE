package com.wsx.demo.chapter6;

public class CarSpeedMeter extends CarSpeedMeterAbs{
	// ʵ�ֳ����࣬��д���󷽷�ʵ�ֹ���
	public static void main(String[] args) {
		CarSpeedMeter csm = new CarSpeedMeter();
		// ת�ٸ�ֵ
		csm.setTurnRate(15);
		// ����ٶ�
		System.out.println(Math.round(csm.getSpeed()));
	}
	
	// ��д�뾶����
	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0.26;
	}
}
