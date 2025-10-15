package com.demo.beans;

public class Employee {

	 private int empid;
	  private String ename;
	  private int sal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int empid, String ename, int sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	public Employee(int id, String nm, String sal2) {
		// TODO Auto-generated constructor stub
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	  

}
