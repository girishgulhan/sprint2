package com.UniversityCourseSelection.exceptions;

public class CourseAlreadyExists extends Exception {
	private String msg;

	public CourseAlreadyExists(String msg) {
		super();
		this.msg = msg;
	}
	
	public CourseAlreadyExists() {
		super();
	}

}
