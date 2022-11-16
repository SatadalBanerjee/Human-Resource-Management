package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.validating.Verify;
import com.masai.dao.AdminDaoImpl;

public class Addemployee {

	public void addemp() {
		
		AdminDaoImpl adi = new AdminDaoImpl();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Name ");
		
		String name = s.nextLine();
		String salary = Verify.checkSalary();
		System.out.println("Enter Employee Role");
		
		String role = s.nextLine();
		String deptid = Verify.checkDeptid();
		String email =  Verify.checkEmail();
		String password = Verify.checkPassword();
		
		Employee emp = new Employee(name, salary, role, password, email,deptid);
		String res = adi.addEmployee(emp);
		
		System.out.println(res);
		System.out.println("----------------------------------------------");
			
	}
	
}
