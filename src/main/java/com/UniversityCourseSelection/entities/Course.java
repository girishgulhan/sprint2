package com.UniversityCourseSelection.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
	@NotNull
	private String courseName;
	@NotNull
	private int courseDurationInMonths;
	@NotNull
	private double courseFees;

	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDurationInMonths() {
		return courseDurationInMonths;
	}
	public void setCourseDurationInMonths(int courseDurationInMonths) {
		this.courseDurationInMonths = courseDurationInMonths;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	
}
