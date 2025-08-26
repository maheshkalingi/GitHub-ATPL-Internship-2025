package com.db;
import java.sql.*;
public class UpdateDataS{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.71.15:3306/intern","intern2025","intern2025");
		System.out.println("--Connection Established successfully--");
		String sql="update students_mahesh set student_id=? where student_id=?";
		PreparedStatement pst= con.prepareStatement(sql);
		pst.setInt(1, 571);
		pst.setInt(2, 22);
		pst.executeUpdate();
		ResultSet rs=pst.executeQuery("select student_id from students_mahesh" );
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.println();
		}
	    rs.close();
		pst.close();
		con.close();
		System.out.println("--connection closed--");
	}

}
