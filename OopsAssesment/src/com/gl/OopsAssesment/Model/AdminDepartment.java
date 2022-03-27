package com.gl.OopsAssesment.Model;

/**
 * @author psairavikumar
 * @date 26th March 2022
 * @version 1.0
 * 
 * @implNote Child class-1 extending parent class Super Department. This class
 *           will inherit isTodayHoliday method from parent class. Method
 *           override is used to achieve runtime Polymorphism.
 */

public class AdminDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your document submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * 
	 * displayHrDetail method is used to print all the details of Admin department.
	 * this method will be called in Driver class.
	 * 
	 */

	public void displayAdminDetail() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday() + "\n");
	}

	@Override
	public String toString() {
		return "AdminDepartment [departmentName()=" + departmentName() + ", getTodaysWork()=" + getTodaysWork()
				+ ", getWorkDeadline()=" + getWorkDeadline() + ", isTodayAHoliday()=" + isTodayAHoliday() + "]";
	}

}
