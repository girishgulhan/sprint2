package com.UniversityCourseSelection.exceptions;

public class DuplicateUniversity extends Exception{
     private String msg;

	public DuplicateUniversity(String msg) {
		super();
		this.msg = msg;
	}
     
	public DuplicateUniversity() {
		super();
	}
}
