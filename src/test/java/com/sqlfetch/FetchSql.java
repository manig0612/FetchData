package com.sqlfetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchSql {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "mani@sql9176");
		Statement st = con.createStatement();
		ResultSet exquery = st.executeQuery("select * from staffdeatails");
		
		while (exquery.next()) {
			
			String myfirst = exquery.getString(1);
			String stu = exquery.getString(2);
			String str = exquery.getString(3);
			System.out.println(myfirst + stu + str);
		}
		
		
	}

}
