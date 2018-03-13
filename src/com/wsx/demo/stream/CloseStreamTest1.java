package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CloseStreamTest1 {
	// ��try���Զ��ر���
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/Stream.txt");
		// JDK1.7��ʼ֧��try-with-resources
		try (InputStream inputStream = new FileInputStream(file)){
			byte[] all = new byte[(int)file.length()];
			inputStream.read(all);
			for(byte b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
