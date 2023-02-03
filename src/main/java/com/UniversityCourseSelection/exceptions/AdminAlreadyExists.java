package com.UniversityCourseSelection.exceptions;

public class AdminAlreadyExists extends Exception{
	private String msg;

	public AdminAlreadyExists(String msg) {
		super();
		this.msg = msg;
	}
	
	public AdminAlreadyExists() {
		super();
	}

}
