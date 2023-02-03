package com.UniversityCourseSelection.services;

import java.util.List;
import com.UniversityCourseSelection.entities.Admin;
import com.UniversityCourseSelection.entities.Student;
import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.AdminAlreadyExists;
import com.UniversityCourseSelection.exceptions.DuplicateUniversity;

public interface AdminService {

	Admin saveAdmin(Admin ad) throws AdminAlreadyExists;

	List<Admin> getAdmin();

	String loginAdmin(Admin ad);

	List<Student> getAllStudents();

	University saveUniversity(University s) throws DuplicateUniversity;


}
