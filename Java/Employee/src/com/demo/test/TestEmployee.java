package com.demo.test;
import java.util.Scanner;
import com.service.service.*;
public class TestEmployee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Choice");
	EmployeeService eservice = new EmployeeServiceImpl();
	int choice=0;
	
	do {
		System.out.println("1)Add Employee\n 2)Display Employee\n 3)Update by id\n 4)Sort by Id");
		System.out.println("5)Sort by Name\n 6)update by name \n");
		 choice=sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status =eservice.addNewEmployee();
			if(status) {
				System.out.println("Added Successfully");
			}else {
				System.out.println("wrong choice");
			}
			
		}
		}
		
	}while(choice!=7);
}
}
