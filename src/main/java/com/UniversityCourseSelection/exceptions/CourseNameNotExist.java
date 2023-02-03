package com.UniversityCourseSelection.exceptions;

public class CourseNameNotExist extends Exception {
     private String msg;

	public CourseNameNotExist(String msg) {
		super();
		this.msg = msg;
	}

	public CourseNameNotExist() {
		super();
	}
     
     
}
