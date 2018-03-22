package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LimitTest {
	// ��ҳ��ѯ����
	public static void main(String[] args) {
		limit(1, 3);
	}
	
	private static void limit(int start, int count) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// try-with-resource�Զ��ر�
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");
				Statement statement = connection.createStatement();) {
			String sql = "select * from hero limit " + start + "," + count;
			
			// Statement�ر�ʱ�Զ��ر�ResultSet
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				// ʹ���ֶ���
				int id = resultSet.getInt("id");
				// ʹ���ֶ�˳��
				String name = resultSet.getString(2);
				float hp = resultSet.getFloat("hp");
				int damage = resultSet.getInt("damage");
				System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
