package com.UniversityCourseSelection.exceptions;

public class StudentIdNotExist extends Exception {
	private String msg;

	public StudentIdNotExist(String msg) {
		super();
		this.msg = msg;
	}
	
	public StudentIdNotExist() {
		super();
	}
}
