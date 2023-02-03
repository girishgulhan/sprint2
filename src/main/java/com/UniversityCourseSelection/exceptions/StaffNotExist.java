package com.UniversityCourseSelection.exceptions;

public class StaffNotExist extends Exception{
	private String msg;

	public StaffNotExist(String msg) {
		super();
		this.msg = msg;
	}
	
	public StaffNotExist() {
		super();
	}

}
