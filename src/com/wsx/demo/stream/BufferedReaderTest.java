package com.wsx.demo.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderTest {
	// BufferedReader��ȡ���ݣ�һ�ζ�ȡһ��
	public static void main(String[] args) {
		// File�ҵ�ָ���ļ�
		File file = new File("D:/StreamFolder/read many line.txt");
		// �����ļ��ַ���
		try(Reader reader = new FileReader(file);
			// ������������IO��ȡ����
			BufferedReader bufferedReader = new BufferedReader(reader)) {
			while(true) {
				String lines = bufferedReader.readLine();
				if(lines == null) {
					return;
				}
				System.out.println(lines);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
