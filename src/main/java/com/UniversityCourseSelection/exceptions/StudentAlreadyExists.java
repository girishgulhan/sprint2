package com.UniversityCourseSelection.exceptions;

public class StudentAlreadyExists extends Exception{
        String msg;

		public StudentAlreadyExists(String msg) {
			super();
			this.msg = msg;
		}
		public StudentAlreadyExists() {
			super();
		}
}
