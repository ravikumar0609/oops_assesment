package com.gl.OopsAssesment.Model;

/**
 * @author psairavikumar
 * @date 26th March 2022
 * @version 1.0
 * 
 * @implNote Child class-3 extending parent class Super Department. This class
 *           will inherit isTodayHoliday method from parent class. Method
 *           override is used to achieve runtime Polymorphism.
 */

public class TechnicalDepartment extends SuperDepartment {

//	This constructor is used to decorate the output of Technical Department details
	public TechnicalDepartment() {
		System.out.println("*****************  Technical Department  *********************\n");
	}

	@Override
	public String departmentName() {
		return "Welcome to Technical Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of Module-1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by End of the Day";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

	/**
	 * 
	 * displayHrDetail method is used to print all the details of Technical
	 * department. this method will be called in Driver class.
	 * 
	 */

	public void displayTechnicalDetail() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(super.isTodayAHoliday() + "\n");
	}

	@Override
	public String toString() {
		return "TechnicalDepartment [departmentName()=" + departmentName() + ", getTodaysWork()=" + getTodaysWork()
				+ ", getWorkDeadline()=" + getWorkDeadline() + ", getTechStackInformation()="
				+ getTechStackInformation() + ", isTodayAHoliday()=" + isTodayAHoliday() + "]";
	}

}
