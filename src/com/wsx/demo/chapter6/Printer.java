package com.wsx.demo.chapter6;

//����Product�ӿ�
interface Product{
	int getProduceTime();
}
//��Printer��ʵ��Output��Product�ӿ�
public class Printer implements Output, Product{
	private String[] printData = new String[MAX_CACHE_LINE];
	//��¼��ǰ��ӡ����ҵ��
	private int dataNum = 0;
	public static void main(String[] args) {
		//����һ��Printer���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("Java���˼��");
		o.getData("���Java����");
		o.out();
		o.getData("�㷨����");
		o.getData("�㷨ͼ��");
		o.out();
		//����Output�ӿ��ж����Ĭ�Ϸ���
		o.print("Robin", "Jack", "Pony");
		o.test();
		//����Printer���󣬵���Productʹ��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//���нӿ����͵����ñ���������ֱ�Ӹ���Object���͵ı���
		Object obj = p;
		//��ӡ��ַ����δ������ʾ
		System.out.println(obj);
	}
	
	@Override
	public int getProduceTime() {
		return 45;
	}

	@Override
	public void out() {
		//ֻҪ������ҵ���ͼ�����ӡ
		while(dataNum > 0) {
			System.out.println("��ӡ����ӡ: " + printData[0]);
			//����ҵ��������ǰ��һλ������ʣ�µ���ҵ����1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void getData(String msg) {
		if(dataNum >= MAX_CACHE_LINE) {
			System.out.println("����������������ʧ��");
		}
		else {
			//�Ѵ�ӡ������ӵ�������Ա������ݵ�������1
			printData[dataNum++] = msg;
		}
	}
}
