package com.wsx.demo;

public class ObjectTest extends Object {
	public String name;
	public int price;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ObjectTest ot1 = new ObjectTest("Java���˼��", 86);
		System.out.println(ot1.toString());
		System.out.println(ot1.equals(100));
		ot1.finalize();
	}

	public ObjectTest(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public ObjectTest() {

	}

	// ��дObject��toString����
	public String toString() {
		return "���� ��" + this.price + " ����" + this.name;
	}

	// ��дObject��finalize����
	public void finalize() {
		// �շ���ֵ��������return null
		System.out.println("�����������ʵ������" + this.name + "Ҳ�Ǵ����ŵ�����...");
	}

	// ��дObject��equals����
	public boolean equals(Object o) {
		// �ж�������������Ƿ����ڱ���
		if (o instanceof ObjectTest) {
			// ������ڱ�ת���ɱ���
			ObjectTest ot = (ObjectTest) o;
			// ��ͬ����true
			if (ot.price == this.price) {
				return true;
			}
			// ��ͬ����false
			else {
				return false;
			}
		}
		// �����ڷ���false
		return false;
	}
}
