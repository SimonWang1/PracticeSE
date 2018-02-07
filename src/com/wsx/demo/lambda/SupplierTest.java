package com.wsx.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
	// Supplier��������
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		// Supplier�ӿڷ����������˳��󷽷�
		Supplier<List> s = new Supplier<List>() {
			@Override
			public List get() {
				// TODO Auto-generated method stub
				return new ArrayList<>();
			}
		};
		// ������ʵ��
		List list1 = getList(s);
		// Lambda���ʽ
		List list2 = getList(() -> new ArrayList<>());
		// ���ù�����
		List list3 = getList(ArrayList :: new);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<Hero> getList(Supplier<List> s){
		return s.get();
	}
}
