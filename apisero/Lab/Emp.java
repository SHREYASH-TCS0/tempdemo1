package com.apisero.Lab;


public class Emp /*extends Object*/{
	private int empno;
	private String ename;
	private double salary;
	
	@Override
	public String toString() {
		return "[Emp , empno = " +  empno + ", ename = " + ename + ", salary = " + salary + "]";
	}

	public int getEmpno() {
		return empno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
}
