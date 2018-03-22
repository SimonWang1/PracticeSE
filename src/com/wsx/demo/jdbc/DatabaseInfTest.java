package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseInfTest {
	// ���ݿ���Ϣ����
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");){
			DatabaseMetaData data = connection.getMetaData();
			System.out.println("���ݿ��Ʒ���ƣ�" + data.getDatabaseProductName());
			System.out.println("���ݿ�汾�ţ�" + data.getDatabaseProductVersion());
			System.out.println("���ݿ�ͱ�ָ���" + data.getCatalogSeparator());
			System.out.println("�����汾��" + data.getDriverVersion());
			System.out.println("���õ����ݿ��б�");
			// ��ȡ���ݿ�����
			ResultSet resultSet = data.getCatalogs();
			while(resultSet.next()) {
				System.out.println("���ݿ����ƣ�" + resultSet.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
