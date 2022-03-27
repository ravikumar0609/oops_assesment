package com.gl.OopsAssesment.Model;

/**
 * @author psairavikumar
 * @date 26th March 2022
 * @version 1.0
 * 
 * @implNote this is Super Department class which will be extended by Admin,
 *           HumanResource and Technical class
 *
 */

public class SuperDepartment {

	public String departmentName() {
		return "Super Department";
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nill";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

	@Override
	public String toString() {
		return "SuperDepartment [departmentName()=" + departmentName() + ", getTodaysWork()=" + getTodaysWork()
				+ ", getWorkDeadline()=" + getWorkDeadline() + ", isTodayAHoliday()=" + isTodayAHoliday() + "]";
	}

}
