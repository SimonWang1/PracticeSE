package com.wsx.demo.stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	// FileReader��ȡ�ļ��ַ���
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/stream.txt");
		try(FileReader fr = new FileReader(file)){
			// �����������ļ���С���ַ�����
			char[] all = new char [(char)file.length()];
			fr.read(all);
			for(char c : all) {
				System.out.print(c);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
