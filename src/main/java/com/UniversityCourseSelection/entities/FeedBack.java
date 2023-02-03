package com.UniversityCourseSelection.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class FeedBack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long feedBackId;
	@NotNull
	private String univFeedBack;
	@NotNull
	private String courseFeedBack;
	@NotNull
	private String staffFeedBack;
	public Long getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(Long feedBackId) {
		this.feedBackId = feedBackId;
	}
	public String getUnivFeedBack() {
		return univFeedBack;
	}
	public void setUnivFeedBack(String univFeedBack) {
		this.univFeedBack = univFeedBack;
	}
	public String getCourseFeedBack() {
		return courseFeedBack;
	}
	public void setCourseFeedBack(String courseFeedBack) {
		this.courseFeedBack = courseFeedBack;
	}
	public String getStaffFeedBack() {
		return staffFeedBack;
	}
	public void setStaffFeedBack(String staffFeedBack) {
		this.staffFeedBack = staffFeedBack;
	}
    
	
}
