package com.masai.validating;

import java.util.Scanner;

public class Verify {
public static String passwordCredentials(String s) {
		
		String  message = null;
		
		if(s.length() < 4) {
			
			message = "Password Length Must Be Greater Or Equal To 4";
		}
		else if(s.contains("@") || s.contains("#") || s.contains("$") || s.contains("%") || s.contains("&")) {
			
			message = "Strong Password";
			
		}
		else {
			message = "Password Must Contain At Least One Character From -->  @,#,$,%,& ";
		}
		
		
		return message;
		
	}
	
//						CHECKING PASSWORD 

	public static String checkPassword() {
		
		boolean flag1 = true;
		Scanner sc = new Scanner(System.in);
		String password=null;
		
		while(flag1) {
			
			System.out.println("Give Employee Default Password");
			
			String pass = sc.nextLine();
			password = pass;
			String res = Verify.passwordCredentials(pass);
			
			if(res.equals("Strong Password")) {
				
				flag1 = false;
			}
			else {
				
			System.out.println(res);
			System.out.println("------------------------------");
			}
		}
		
		return password;
		
	}
		//	CHECK SALARY DETAILS
			
		public static String checkSalary() {
		
			Scanner s = new Scanner(System.in);
			boolean flag3 = true;
			String salary=null;
		
		while(flag3) {
		
			System.out.println("Enter Employee Salary");
			String sal = s.nextLine();
		
			try {
			Double x = Double.parseDouble(sal);
			salary = x+"";
			flag3 = false;
		
			}
			catch(Exception e) {
			System.out.println("Please Enter Number Only");
			System.out.println("--------------------------");
			}
			}
		
			return salary;
		}
	
//					CHECKING EMAIL CREDENTIALS
	
	public static String emailCredentials(String e) {
		
		String message = "Correct Email";
		
			if(e.length() < 10) {
			message = "Length Of Email Must Be Greater Than 9 Including ->  @gmail.com";
			}
			else {
			
			if(e.contains("@gmail.com")) {
				
				message = "Correct Email";
			}
			else {
				message = "Email Must Contain -> @gmail.com";
			}
	
			}
		
		return message;
	}
	
//						CHECK EMAIL
	
	
	public static String checkEmail() {
		
		boolean flag2 = true;
		Scanner sc = new Scanner(System.in);
		String email=null;
		
		while(flag2) {
			
			System.out.println("Enter Employee Email");
			String e = sc.nextLine();
			email = e;
			
			String res = Verify.emailCredentials(e);
			
			if(res.equals("Correct Email")) {
				
				flag2 = false;
			}
			else {
				
			System.out.println(res);
			System.out.println("---------------------------------");
			}
		}
		
		return email;
		
	}
	
//					CHECK DEPARTMENT ID	
	
	public static String checkDeptid() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		
		while(flag) {
			
		System.out.println("Enter Department ID");
		String did = s.nextLine();
		
			try {
				
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}
			catch(Exception e) {
				
					System.out.println("Please Enter Number Only");
					System.out.println("--------------------------");
				}
		}
		
		return deptid;
	}
	
		//	CHECK EMP CHOICE
			
			
		public static String checkChoicesForEmp() {
		
				Scanner s = new Scanner(System.in);
				boolean flag = true;
				String deptid=null;
		
		while(flag) {
		
			System.out.println("Press\n 1.) View Your Profile \n 2.) Update Your Profile \n 3.) Apply For Leave \n 4.) Leave Response From Admin \n 5.) Back To Home Screen ");
			System.out.println("-------------------------------------------------------------");
			String did = s.nextLine();
		
		try {
		
			int x = Integer.parseInt(did);
			deptid = x+"";
			flag = false;
			}
		catch(Exception e) {
			System.out.println("Please Enter Number Only");
			System.out.println("-----------------------");
			}
		}
		
			return deptid;
		}
	
//					CHECKING EMPLOYEE ID
	
	public static String checkEmpId() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		
		while(flag) {
			
		System.out.println("Enter Employee ID");
		String did = s.nextLine();
		
			try {
				
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}
			catch(Exception e) {
				
					System.out.println("Please Enter Number Only");
					System.out.println("------------------------");
				}
		}
		
		return deptid;
	}

//								CHECKING DRATION TIME
	
	public static String checkLeaveDur() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		
		while(flag) {
			
		System.out.println("Enter Leave Duration In Days");
		String did = s.nextLine();
		
			try {
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}
			catch(Exception e) {
					System.out.println("Please Enter Number Only");
					System.out.println("-------------------------");
				}
		}
		
		return deptid;
	}
	

//					CHECKING LOGIN EMAIL
	
	
			public static String checkemail() {
			
				boolean flag2 = true;
				Scanner sc = new Scanner(System.in);
				String email=null;
			
			while(flag2) {
			
			   System.out.println("Enter Email");
			   String e = sc.nextLine();
			   email = e;
			   String res = Verify.emailCredentials(e);
			
			if(res.equals("Correct Email")) {
				flag2 = false;
			}
			else {
			
				System.out.println(res);
				System.out.println("-----------------------------------------------");
				}
			}
			
				return email;	
			}

					
//							CHECKING ADMIN CHOICE
	
	public static String checkChoicesForAdmin() {
		
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		String deptid=null;
		
		while(flag) {
		System.out.println("Press\n 1.) Update Your Profile \n 2.) Add New Employee \n 3.) Transfer Employee from One Department To Another \n 4.) Get All The Employees Details \n 5.) Add New Department \n 6.) Update Department Name \n 7.) Get All Departments Details \n 8.) Get All Employees Leave Details \n 9.) Respond To Employee Leave \n 10.) Back to Home screen \n");
		System.out.println("--------------------------------------------------------------");
		String did = s.nextLine();
		
			try {
				
				int x = Integer.parseInt(did);
				deptid = x+"";
				flag = false;
				}
			catch(Exception e) {
					System.out.println("Please Enter Number Only");
					System.out.println("------------------------");
				}
		}
		
		return deptid;
	}
	
	
//						VALIDATE LOGIN PASSWORD
	
	
	public static String checkPass() {
	
		boolean flag1 = true;
		Scanner sc = new Scanner(System.in);
		String password=null;
		
		while(flag1) {
			
			System.out.println("Enter Password");
			String pass = sc.nextLine();
			password = pass;
			String res = Verify.passwordCredentials(pass);
			
			if(res.equals("Strong Password")) {
				flag1 = false;
			}
			else {
				
			System.out.println(res);
			System.out.println("----------------------------------------------------");
			}
		}
		
		return password;
		
	}
	


}
