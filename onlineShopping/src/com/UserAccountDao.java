package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.UserAccount;
import source.ConnectionFactory;

public class UserAccountDao {

	public int insert(String email, String password) throws SQLException {
		String query = "insert into USER_ACCOUNT values(?,?)";
	    Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(1, email);
		pStatement.setString(2, password);
		int output = pStatement.executeUpdate();
		return output;
		}
	
	public   int validate(String email, String password) throws SQLException {
		int i=0;
		String query="select COUNT(*) from USER_ACCOUNT where email= ? and password=?";
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, email);
		pStatement.setString(2, password);
		ResultSet count=pStatement.executeQuery();
		while(count.next()) {
			i=count.getInt(1);
		}
		return i;
		
		
		
	}
	
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(new UserAccountDao().insert(new UserAccount("rohit","rohit")));
//			System.out.println(new UserAccountDao().read("rohit"));
//		}
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//}
}
