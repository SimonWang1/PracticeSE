package com.wsx.demo.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	// FileOutputStreamʹ��ASCll��д���ı�
	public static void main(String[] args) {
		try {
			// �����ı�����·�����ļ���
			File file = new File("D:/StreamFolder/Stream2.txt");
			// ����������2���ֽ����飬���X, Y��ASCll��
			byte[] data = {88, 89};
			// ����ע��ָ���ļ����ļ������
			FileOutputStream fos = new FileOutputStream(file);
			// ���ֽ�����д�������
			fos.write(data);
			// �ر��������ʡ��Դ
			fos.close();
			System.out.println("�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
