package com.SpringJDBC.pojo;

import java.sql.Date;

public class Employee {
	
	
	private int empno;
	private String eName;
	private String job;
	private String MGR; 
	private Date hiredate;
	private long sal;    private double comm;
	private int deptno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMGR() {
		return MGR;
	}
	public void setMGR(String mGR) {
		MGR = mGR;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", eName=" + eName + ", job=" + job + ", MGR=" + MGR + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	
}
