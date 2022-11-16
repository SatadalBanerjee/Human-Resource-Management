package com.masai.usecases;

import java.util.Scanner;
import com.masai.dao.AdminDaoImpl;
import com.masai.validating.Verify;

public class AddDepartment {
	
	public void addDepartment() {
		
		Scanner s = new Scanner( System.in);
		
		String deptid = Verify.checkDeptid();
		System.out.println("Enter Department Name");
		String deptName = s.nextLine();
		
		AdminDaoImpl adi = new AdminDaoImpl();
		String res = adi.addDepartment(deptid,deptName);
		System.out.println(res);
		System.out.println("-----------------------------------------");
		
	}
}
