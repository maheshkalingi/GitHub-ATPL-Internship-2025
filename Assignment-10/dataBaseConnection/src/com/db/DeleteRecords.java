package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
		System.out.println("--Connection Established successfully--");
		String sql="delete from students_mahesh where student_id < 9;";
		Statement pst= con.createStatement();
		int rs= pst.executeUpdate(sql);
       System.out.println("deleted Successfully");
        pst.close();
        con.close();
	}

}
