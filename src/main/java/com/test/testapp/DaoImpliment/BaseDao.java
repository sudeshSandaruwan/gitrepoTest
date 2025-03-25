package com.test.testapp.DaoImpliment;

import java.sql.Connection;

import com.test.testapp.Data.MySqlConnection;

public class BaseDao {

	public Connection getCon() {
	 return	MySqlConnection.MANAGER.connectin();
	}
}
