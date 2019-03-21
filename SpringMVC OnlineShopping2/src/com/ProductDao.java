package com;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.Product;
import source.ConnectionFactory;

public class ProductDao {
	
	
	public Product read() throws SQLException 
	{
		Connection conn = ConnectionFactory.getConnection();
		String query="select * from Product";
		Product p=null;
		
		PreparedStatement pStatement= conn.prepareStatement(query);
		
		ResultSet count=pStatement.executeQuery();
		 
		while(count.next())
		{
			p=new Product();
			p.setCode(count.getString("code"));
			p.setName(count.getString("name"));
			p.setPrice(count.getDouble("Price"));
		}
		return p;
	}
		public static void main(String[] args) {
			  try {
			   //System.out.println(new EmployeeDAO().insert(new Employee(1000, "Sachin", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			   System.out.println(new ProductDao().read());
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }

}
}
