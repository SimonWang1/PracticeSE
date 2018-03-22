package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementTest {
	// PreparedStatement����
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ʹ��PreparedStatement�����sql���ɶ��Ը�ǿ�����ܸ��ã����Է�ֹע�빥��
		String sql = "insert into hero values(null, ?, ?, ?)";
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");
				// ����sql��䴴��PreparedStatement
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			
			// ���ò���
			preparedStatement.setString(1, "teemo");
			preparedStatement.setFloat(2, 313.0f);
			preparedStatement.setInt(3, 50);
			// ִ��
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
