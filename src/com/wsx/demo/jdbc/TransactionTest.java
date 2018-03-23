package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	// �������
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");
				Statement statement = connection.createStatement();) {
			// �����������ʱ��Ҫô���ɹ���Ҫô��ʧ��
			connection.setAutoCommit(false);
			
			String sql1 = "update hero set hp = hp + 1 where id = 5";
			statement.execute(sql1);
			
			// SQL���ƴд����
			String sql2 = "updata hero set hp = hp + 1 where id = 6";
			statement.execute(sql2);
			
			// �ֶ��ύ
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
