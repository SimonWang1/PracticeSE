package com.wsx.demo.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	// BufferedWriterд�����ݣ�һ��д��һ��
	public static void main(String[] args) {
		// �����ļ�����·�����ļ���
		File file = new File("D:/StreamFolder/hot game.txt");
		// �����ļ��ַ���
		try(FileWriter fileWriter = new FileWriter(file);
			// ������������IOд������
			PrintWriter printWriter = new PrintWriter(fileWriter)){
			printWriter.println("Player Unknowns Battle Ground");
			printWriter.println("Final Fantacy XIV");
			printWriter.println("World Of Warcraft");
			// ǿ��д�����������ۻ����Ƿ�д��
			printWriter.flush();
			printWriter.println("Edit: Anonymous");
			System.out.println("�������");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
