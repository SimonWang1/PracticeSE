package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {
	// throws�׳��쳣
	public static void main(String[] args) {
		// ����������
		method1();
	}
	
	private static void method1() {
		try {
			method2();
			// method1�����쳣����
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// method2�׳��ļ�δ�ҵ��쳣
	@SuppressWarnings("resource")
	private static void method2() throws FileNotFoundException{
		File f = new File("d:\\stream.txt");
		System.out.println("��ͼ�� d:\\stream.txt");
		new FileInputStream(f);
		System.out.println("�ɹ���");
	}
}
