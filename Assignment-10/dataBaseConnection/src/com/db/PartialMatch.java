package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartialMatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
		System.out.println("--Connection Established successfully--");
		String sql="select * from departments_mahesh where dept_name like ? ;";
		PreparedStatement pst= con.prepareStatement(sql);
		pst.setString(1, "A%");
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString("dept_name")+" ");
			System.out.println();
		}
	    rs.close();
		pst.close();
		con.close();
		System.out.println("--connection closed--");
	}
	}

