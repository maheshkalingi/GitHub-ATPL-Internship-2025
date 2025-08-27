package com.db;

import java.sql.*;

public class Range {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
	System.out.println("--Connection Established successfully--");
	String sql="select * from products_mahesh where product_price between ? and ?; ";
	PreparedStatement pst= con.prepareStatement(sql);	
	pst.setDouble(1,500);
	pst.setDouble(2, 4000);
	ResultSet rs=pst.executeQuery();
	while(rs.next()) {
		System.out.print(rs.getInt("product_id")+" ");
		System.out.print(rs.getString("product_name")+" ");
		System.out.println(rs.getDouble("product_price"));
	}
	rs.close();
	pst.close();
	con.close();
	System.out.println("--Connection closed Successfully!");
	
   }
}

