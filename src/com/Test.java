package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password");
				DatabaseMetaData dbmd=con.getMetaData();
				System.out.println(dbmd.supportsResultSetConcurrency(1003,1007));
				System.out.println(dbmd.supportsResultSetConcurrency(1003,1008));
				System.out.println(dbmd.supportsResultSetType(1003));
				System.out.println(dbmd.supportsResultSetType(1004));
				System.out.println(dbmd.supportsResultSetType(1005));

	}

}
