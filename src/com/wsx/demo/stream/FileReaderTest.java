package com.wsx.demo.stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {
	// FileReader��ȡ�ļ��ַ���
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/stream.txt");
		try(Reader reader = new FileReader(file)){
			// �����������ļ���С���ַ�����
			char[] all = new char [(char)file.length()];
			reader.read(all);
			for(char c : all) {
				System.out.print(c);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
