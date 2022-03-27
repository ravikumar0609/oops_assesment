package com.gl.OopsAssesment.Model;

/**
 * @author psairavikumar
 * @date 26th March 2022
 * @version 1.0
 * 
 * @implNote Child class-2 extending parent class Super Department. This class
 *           will inherit isTodayHoliday method from parent class. Method
 *           override is used to achieve runtime Polymorphism.
 */

public class HumanResourceDepartment extends SuperDepartment {

//	This constructor is used to decorate the output of HR Department details.
	public HumanResourceDepartment() {
		System.out.println("*****************  Human Resource  Department  *********************\n");
	}

	@Override
	public String departmentName() {
		return "Welcome to Human Resource Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by End of the Day";
	}

	public String doActivity() {
		return "Team Lunch";
	}

	/**
	 * 
	 * displayHrDetail method is used to print all the details of Hr department.
	 * this method will be called in Driver class.
	 * 
	 */

	public void displayHrDetail() {
		System.out.println(departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday() + "\n");
	}

	@Override
	public String toString() {
		return "HumanResourceDepartment [departmentName()=" + departmentName() + ", getTodaysWork()=" + getTodaysWork()
				+ ", getWorkDeadline()=" + getWorkDeadline() + ", doActivity()=" + doActivity() + ", isTodayAHoliday()="
				+ isTodayAHoliday() + "]";
	}

}
