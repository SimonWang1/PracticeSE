package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersonStreamTest {
	// ʵ�������л�
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Wangsx";
		person.height = 171;
		// ���ڱ��������ļ�
		File file = new File("D:/StreamFolder/person.txt");
		try (
				// ���������
				OutputStream outputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
				// ����������
				InputStream inputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);) {
			objectOutputStream.writeObject(person);
			Person person2 = (Person) objectInputStream.readObject();
			System.out.println(person2.name);
			System.out.println(person2.height);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
