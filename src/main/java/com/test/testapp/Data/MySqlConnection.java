package com.test.testapp.Data;

import java.sql.Connection;
import java.sql.DriverManager;

public enum MySqlConnection {

	MANAGER;

	public Connection connectin() {
		Connection con = null;
		try {
			Class.forName(DatabaseConnection.JDBC_DRIVER);
			con = DriverManager.getConnection(DatabaseConnection.URL, DatabaseConnection.USER, DatabaseConnection.PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}
