package com.UniversityCourseSelection.exceptions;

public class CourseIdNotExist extends Exception{
	private String msg;

	public CourseIdNotExist(String msg) {
		super();
		this.msg = msg;
	}
	
	public CourseIdNotExist() {
		super();
	}
}
