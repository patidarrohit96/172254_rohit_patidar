package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import pojo.Employee;
import source.ConnectionFactory;

public class EmployeeDao {
	
	public int insert(Employee emp) throws SQLException {
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		System.out.println(ConnectionFactory.getInstance().hashCode());
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, emp.getEmpNo());
		pStatement.setString(2, emp.getEname());
		pStatement.setString(3, emp.getJob());
		pStatement.setInt(4, emp.getMgr());
		pStatement.setDate(5, emp.getHiredate());
		pStatement.setDouble(6, emp.getSal());
		pStatement.setDouble(7, emp.getComm());
		pStatement.setInt(8, emp.getDeptNo());
		int output=pStatement.executeUpdate();
		return output;
		
	}
	
	public Employee read(int empNo) throws SQLException {
		String query="select * from emp where empNo= ?";
		Employee emp=null;
		Connection conn = ConnectionFactory.getConnection();
		System.out.println(ConnectionFactory.getInstance().hashCode());
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			emp=new Employee();
			emp.setEname(resultSet.getString("ename"));
		}
		return emp;
	
	}
	
	public int update(int empNo) throws SQLException {
		String query="update emp set ENAME='sehwag' where empNo= ?";
		Employee emp=null;
		Connection conn = ConnectionFactory.getConnection();
		System.out.println(ConnectionFactory.getInstance().hashCode());
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		int output=pStatement.executeUpdate();
		return output;
		}
		
		public int delete(int empNo) throws SQLException {
			String query="delete from emp where empNo= ?";
			Employee emp=null;
			Connection conn = ConnectionFactory.getConnection();
			System.out.println(ConnectionFactory.getInstance().hashCode());
			PreparedStatement pStatement= conn.prepareStatement(query);
			pStatement.setInt(1, empNo);
			int output=pStatement.executeUpdate();
			return output;
			}
		
		
		
	
	public static void main(String[] args) {
		try {
			//System.out.println(new EmployeeDao().insert(new Employee(1000, "Sachin", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			System.out.println(new EmployeeDao().read(1000));
			//System.out.println(new EmployeeDao().update(1000));
			System.out.println(new EmployeeDao().delete(1000));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		


