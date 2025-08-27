package com.db;

import java.sql.*;

public class Vulnerable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
		System.out.println("--Connection Established successfully--");
		Statement st=con.createStatement();
		String studentId="' ' or true";
		String sql="select * from students_mahesh where student_id="+studentId;
		ResultSet rs= st.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt("student_id")+" ");
			System.out.println(rs.getString("student_name"));
		}
		rs.close();
		st.close();
		con.close();
		System.out.println("connection closed");
	}

}