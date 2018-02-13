package com.wsx.demo.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	// BufferedReader��ȡ����
	public static void main(String[] args) {
		// File�ҵ�ָ���ļ�
		File file = new File("D:/StreamFolder/ReadManyLine.txt");
		// �����ļ��ַ���
		try(FileReader fileReader = new FileReader(file);
			// ������������IO��ȡ����
			BufferedReader bufferedReader = new BufferedReader(fileReader)) {
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
