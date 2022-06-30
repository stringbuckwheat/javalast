package com.company.day043;

import java.sql.Connection; // ★★★★★★★★★★
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC001_connect {
	public static void main(String[] args) {
		// 1. 드라이버 연동
		try {
			Class.forName("com.mysql.jdbc.Driver"); // ★★★★★★★★★★
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2. mysql 접속
		Connection conn = null;
		
		try {
			// naver?query=apple 같은 주소를 봤을텐데, 이런 걸 query string이라고 한다.
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?useSSL=false", "root", "1234");
			
			if(conn != null) {
				System.out.println("DB 접속 완료");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	} // end for main
}
