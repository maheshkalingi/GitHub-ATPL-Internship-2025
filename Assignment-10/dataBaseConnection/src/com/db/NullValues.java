package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import java.sql.*;

public class NullValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://192.168.71.15/intern","intern2025","intern2025");
		String sql="insert into products_mahesh values(?,?,?);";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,105);
		pst.setString(2,"Water Bottles");
		pst.setNull(3,Types.INTEGER);
		pst.executeUpdate();
		ResultSet rs= pst.executeQuery("select * from products_mahesh");
		while(rs.next()) {
			System.out.print(rs.getInt("product_id")+" ");
			System.out.print(rs.getString("product_name")+" ");
			System.out.println(rs.getInt("product_price")+" ");
		}
		rs.close();
		pst.close();
		con.close();
		
		
		
		
	}

}
