package com.UniversityCourseSelection.exceptions;

public class UniversityIdNotExist extends Exception{
    private String msg;
	public UniversityIdNotExist(String msg) {
		super(msg);
	}
	
	public UniversityIdNotExist() {
		super();
	}

}
