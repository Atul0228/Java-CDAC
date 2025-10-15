package com.service.service;

import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.DaoImpl;
import com.demo.dao.DaoInterface;

public class EmployeeServiceImpl implements EmployeeService{
	private DaoInterface edao;

	public EmployeeServiceImpl() {
		
		super ();
	
				this.edao = new DaoImpl();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public boolean addNewEmployee() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id");
		 int id=sc.nextInt();
		 System.out.println("Enter name");
		 String nm=sc.next();
		 System.out.println("Enter Salary");
		 String sal=sc.next();
		 Employee e=new Employee(id,nm,sal);
		return edao.addEmployee(e);
	}

}
