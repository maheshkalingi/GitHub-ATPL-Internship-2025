package com.db;

import java.sql.*;

public class BatchClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
		String sql="insert into departments_mahesh values(?,?);";
		PreparedStatement pst= con.prepareStatement(sql);
		pst.setInt(1, 11);
		pst.setString(2, "HR");
		pst.addBatch();
		pst.setInt(1, 22);
		pst.setString(2, "TESTER");
		pst.addBatch();
		pst.setInt(1, 33);
		pst.setString(2, "DEVELOPER");
		pst.addBatch();
		pst.executeBatch();
		ResultSet rs=pst.executeQuery("select * from departments_mahesh");
		while(rs.next()) {
			System.out.print(rs.getInt("dept_id")+" ");
			System.out.println(rs.getString("dept_name"));
		}
		rs.close();
		pst.close();
		con.close();
		
	}

}
