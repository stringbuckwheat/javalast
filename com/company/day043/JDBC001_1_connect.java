package com.company.day043;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC001_1_connect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic?useSSL=false", "root", "1234");

			if (conn != null) {
				System.out.println("DB 접속 완료");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {

			if (conn != null) {
				try {
					conn.close();
					System.out.println("conn.close()");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
