package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	// ���²��ԣ��޸�����
	public static void main(String[] args) {
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
			String sql = "update hero set hp = 400 where name = " + "'teemo'";
			statement.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
