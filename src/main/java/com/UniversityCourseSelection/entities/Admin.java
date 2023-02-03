package com.UniversityCourseSelection.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Admin {
	@Id
	private long admin_Id;
	@Column(name = "admin_Password", length = 10)
	private String admin_Password;

	public long getAdmin_Id() {
		return admin_Id;
	}

	public void setAdmin_Id(long admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getAdmin_Password() {
		return admin_Password;
	}

	public void setAdmin_Password(String admin_Password) {
		this.admin_Password = admin_Password;
	}

	public Admin(long admin_Id, @NotNull String admin_Password) {
		super();
		this.admin_Id = admin_Id;
		this.admin_Password = admin_Password;
	}

	public Admin() {
		super();
	}

}
