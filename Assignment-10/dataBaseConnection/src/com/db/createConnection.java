package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
		System.out.println("--Connection Established successfully--");
		Statement st=con.createStatement();
		String sql="select student_name from students_mahesh";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("student_name"));
		}
	    rs.close();
		st.close();
		con.close();
		System.out.println("--connection closed--");
	}

}