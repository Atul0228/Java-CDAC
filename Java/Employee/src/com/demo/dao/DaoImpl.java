package com.demo.dao;
import java.util.Set;

import com.demo.beans.*;
import java.util.*;
public class DaoImpl implements DaoInterface{
	static Set<Employee> eset;
	static {eset=new HashSet<>();
	eset.add(new Employee(101,"Atul",35000));
		
	}

	@Override
	public boolean addEmployee(Employee e) {
		
		return eset.add(e);
	}

	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

}
