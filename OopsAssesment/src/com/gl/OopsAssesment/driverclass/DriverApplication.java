package com.gl.OopsAssesment.driverclass;

import com.gl.OopsAssesment.Model.AdminDepartment;
import com.gl.OopsAssesment.Model.HumanResourceDepartment;
import com.gl.OopsAssesment.Model.TechnicalDepartment;

/**
 * @author psairavikumar
 * @Date 26th March 2022
 * @version 1.0
 * 
 * @category Hierarchical inheritance , Method Overriding(run-time Polymorphism)
 * 
 * @implNote This is Driver/Main class which will have objects of Admin, Hr and
 *           tech
 * @result Details of all department will be displayed
 */

public class DriverApplication {

	public static void main(String[] args) {

		// object of Admin Department
		AdminDepartment admin = new AdminDepartment();
		admin.displayAdminDetail();

		// Object of Human Resource Department
		HumanResourceDepartment hr = new HumanResourceDepartment();
		hr.displayHrDetail();

		// Object of Technical Department
		TechnicalDepartment Tech = new TechnicalDepartment();
		Tech.displayTechnicalDetail();

	}

}
