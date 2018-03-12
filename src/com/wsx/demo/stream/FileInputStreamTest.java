package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	// FileInputStream��ȡ�ֽ����ı�
	public static void main(String[] args) {
		try {
			// File���ҵ�ָ���ļ�
			File file = new File("D:/StreamFolder/stream.txt");
			// ����ע��ָ���ļ����ļ�������
			FileInputStream fis = new FileInputStream(file);
			// �����������ļ���С���ֽ�����
			byte[] all = new byte[(int)file.length()];
			// ���ֽ����ķ�ʽ��ȡ�ļ�����
			fis.read(all);
			for(byte b : all) {
				// ��ӡ�ļ�����
				System.out.println(b);
			}
			// �ر���������ʡ��Դ
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
