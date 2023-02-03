package com.UniversityCourseSelection.exceptions;

public class NoFeedBacks extends Exception{
	private String msg;

	public NoFeedBacks(String msg) {
		super();
		this.msg = msg;
	}
	public NoFeedBacks() {
		super();
	}
	
}
