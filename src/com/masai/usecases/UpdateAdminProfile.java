package com.masai.usecases;

import java.util.Scanner;

import com.masai.HRMS.AdminOperations;
import com.masai.HRMS.AdminOrEmployee;
import com.masai.bean.Admin;
import com.masai.validating.*;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.AdminException;
import java.util.Scanner;

import com.masai.validating.*;

public class UpdateAdminProfile {

	String password;
	String email;
	
	public UpdateAdminProfile() {
		
	}
	
	public UpdateAdminProfile(String pass,String email) {
		super();
		this.password = pass;
		this.email = email;
	}
	
	public void updateProfile() {
		
		
		Scanner s = new Scanner(System.in);
		
		AdminDaoImpl adi = new AdminDaoImpl(password,email);
		
		System.out.println("Enter The New Name");
		String name =  s.nextLine();
		String email = Verify.checkemail();
		String pass = Verify.checkPass();
		
		Admin admin = new Admin(name, pass, email);
		
		String res;
		
		try {
			res = adi.updateProfile(admin);
			System.out.println(res);
			
			System.out.println("=========================================");
			AdminOrEmployee.choice();
		}  
		catch (AdminException e) {
			
			System.out.println(e.getMessage());
			System.out.println("=========================================");
			
			AdminOperations ao = new AdminOperations();
			ao.adminOper();
		}
	}

}
