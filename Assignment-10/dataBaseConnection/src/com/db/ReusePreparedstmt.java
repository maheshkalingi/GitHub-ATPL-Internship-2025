package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReusePreparedstmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://192.168.71.15/intern","intern2025","intern2025");
		System.out.println("connection Establised");
		String sql="insert into users_mahesh values(?,?,?);";
		PreparedStatement pst= con.prepareStatement(sql);
		int[] id= {1,2,3,4,5,6};
		String[] names= {"mahesh","Kumar","Raju","mohit","siddarth","jashwanth"};
		String[] emails= {"mahesh@gmail.com","kumar@gmail.com","raju@gmail.com","mohit@gmail.com","siddarth@gmail.com","jashwanth@gmail.com"};
		for(int i=0;i<id.length;i++) {
			pst.setInt(1, id[i]);
			pst.setString(2,names[i]);
			pst.setString(3, emails[i]);
			pst.executeUpdate();
		}
		ResultSet rs= pst.executeQuery("select * from users_mahesh");
		while(rs.next()) {
			System.out.print(rs.getInt("user_id")+" ");
			System.out.print(rs.getString("user_name")+" ");
			System.out.println(rs.getString("user_email"));
		}
		rs.close();
		pst.close();
		con.close();
		System.out.println("connection closed");

	}

}
