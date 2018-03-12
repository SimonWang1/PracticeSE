package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				// ����������
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
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
