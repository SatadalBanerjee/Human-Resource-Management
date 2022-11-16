package com.masai.usecases;
import com.masai.dao.AdminDaoImpl;
import com.masai.validating.Verify;

public class FireEmployee {

public void fireEmployee() {
		
		AdminDaoImpl adi = new AdminDaoImpl();
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Employee ID ");
		
		String id = Verify.checkEmpId();
			
	}
}
