package com.db;
import java.sql.*;
public class Preparesstmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
		System.out.println("--Connection Established successfully--");
		String sql="insert into departments_mahesh values(?,?);";
		PreparedStatement pst= con.prepareStatement(sql);
		pst.setInt(1, 71);
		pst.setString(2, "Aaslin");
		pst.executeUpdate();
		ResultSet rs=pst.executeQuery("select * from departments_mahesh" );
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.println();
		}
	    rs.close();
		pst.close();
		con.close();
		System.out.println("--connection closed--");
	}

}
