package com.wsx.demo.jdbc;

import java.util.List;

public class ItemDAOTest {
	// �߼�������
	public static void main(String[] args) {
		ItemDAOImp dao = new ItemDAOImp();
		List<Item> items = dao.list();
		System.out.println("���ݿ��й���" + items.size() + "������");
		Item item = new Item("�µ���Ʒ");
		System.out.println("���һ������");
		dao.add(item);
		items = dao.list();
		System.out.println("���ݿ��й���" + items.size() + "������");
		System.out.println("ȡ��id=9�����ݣ�����name�ǣ�");
		item = dao.get(9);
		System.out.println(item.name);
		System.out.println("�����ָ�Ϊ ��Ʒx�����Ҹ��µ����ݿ�");
		item.name = "��Ʒx";
		dao.update(item);
		System.out.println("ȡ��id=9�����ݣ�����name�ǣ�");
		item = dao.get(9);
		System.out.println(item.name);
		System.out.println("ɾ��id=4������");
		dao.delete(9);
		items = dao.list();
		System.out.println("���ݿ��й���" + items.size() + "������");
	}
}
