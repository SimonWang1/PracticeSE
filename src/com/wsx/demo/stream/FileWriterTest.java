package com.wsx.demo.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {
	// FileWriterд���ַ��ı�
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/stream3.txt");
		try(Writer writer = new FileWriter(file)){
			String sentence = "Ok. That's right! ";
			char[] c = sentence.toCharArray();
			writer.write(c);
			System.out.println("д���ɹ�");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
