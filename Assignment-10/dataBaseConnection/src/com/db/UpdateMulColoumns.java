package com.db;

import java.sql.*;

public class UpdateMulColoumns {
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
			System.out.println("--Connection Established successfully--");
			String sql="update students_mahesh set student_name=?,student_age=? where student_id=?;";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,"deelip");
			pst.setInt(2, 23);
			pst.setInt(3, 71);
			pst.executeUpdate();
			System.out.println("updated Successfully");
			ResultSet rs= pst.executeQuery("select* from students_mahesh");
			while(rs.next()) {
				System.out.print(rs.getInt("student_id")+" ");
				System.out.print(rs.getString("student_name")+" ");
				System.out.println(rs.getInt("student_age"));
			}
			rs.close();
			pst.close();
			con.close();
			System.out.println("--connection closed--");
}	
}
