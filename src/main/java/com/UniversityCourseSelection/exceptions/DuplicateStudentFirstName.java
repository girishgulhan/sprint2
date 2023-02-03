package com.UniversityCourseSelection.exceptions;


public class DuplicateStudentFirstName extends Exception{
	private String msg;

	public DuplicateStudentFirstName(String msg) {
		super();
		this.msg = msg;
	}
	
	public DuplicateStudentFirstName() {
		super();
	}

}
