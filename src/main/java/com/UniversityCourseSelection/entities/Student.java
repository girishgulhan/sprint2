package com.UniversityCourseSelection.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Length;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	@Length(max=10)
	private String studentFirstName;
	@Length(max=15)
	private String studentLastName;
	@Length(max=20)
	private String studentAddress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="feedbackId")
	private FeedBack studentFeedBack;

	// onetomany mapping
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
	private List<Course> course;
	
	public FeedBack getStudentFeedBack() {
		return studentFeedBack;
	}

	public void setStudentFeedBack(FeedBack studentFeedBack) {
		this.studentFeedBack = studentFeedBack;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Course> getCourse() {
		return course;
	}
	
	public void setCourse(List<Course> course) {
		this.course = course;
	}

}
